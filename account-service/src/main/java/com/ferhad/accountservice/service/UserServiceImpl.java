package com.ferhad.accountservice.service;

import com.ferhad.accountservice.model.RoleAcc;
import com.ferhad.accountservice.model.UserAcc;
import com.ferhad.accountservice.repository.RoleRepository;
import com.ferhad.accountservice.repository.UserRepository;
import com.ferhad.common.*;
import com.ferhad.common.Void;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PublisherService publisherService;

    @Override
    public void saveUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        UserAcc user = UserAcc.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
        userRepository.save(user);
        List<Role> roles = new ArrayList<>();
        user.getRoles().forEach(role -> {
            roles.add(Role.newBuilder().setRoleName(role.getName()).build());
        });
        UserResponse userResponse = UserResponse.newBuilder()
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .addAllRoles(roles)
                .build();
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
        publisherService.sendMessage("user_registration",
                "User (" + user.getUsername() + ") has been registered");
    }

    @Override
    public void saveRole(Role request, StreamObserver<Role> responseObserver) {
        RoleAcc role = RoleAcc.builder()
                .name(request.getRoleName())
                .build();
        roleRepository.save(role);
        Role roleResponse = Role.newBuilder()
                .setRoleName(role.getName())
                .build();
        responseObserver.onNext(roleResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void addRoleToUser(RoleToUser request, StreamObserver<Void> responseObserver) {
        RoleAcc roleDb = roleRepository.findByName(request.getRoleName());
        UserAcc userDb = userRepository.findByUsername(request.getUsername());
        userDb.getRoles().add(roleDb);
        Void v = Void.newBuilder()
                .build();
        responseObserver.onNext(v);
        responseObserver.onCompleted();
    }

    @Override
    public void getUser(UserName request, StreamObserver<UserResponse> responseObserver) {
        UserAcc userAcc = userRepository.findByUsername(request.getUsername());
        List<Role> roles = new ArrayList<>();
        for (RoleAcc role : userAcc.getRoles()) {
            roles.add(Role.newBuilder().setRoleName(role.getName()).build());
        }
        UserResponse userResponse = UserResponse.newBuilder()
                .setUsername(userAcc.getUsername())
                .setPassword(userAcc.getPassword())
                .addAllRoles(roles)
                .build();
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(Void request, StreamObserver<AllUsers> responseObserver) {
        List<UserAcc> userAccs = userRepository.findAll();
        List<UserResponse> userResponses = new ArrayList<>();
        userAccs.forEach(userAcc -> {
            List<Role> roles = new ArrayList<>();
            userAcc.getRoles().forEach(role -> {
                roles.add(Role.newBuilder().setRoleName(role.getName()).build());
            });
            userResponses.add(
                    UserResponse.newBuilder()
                            .setUsername(userAcc.getUsername())
                            .setPassword(userAcc.getPassword())
                            .addAllRoles(roles)
                            .build()
            );
        });
        AllUsers allUsers = AllUsers.newBuilder()
                .addAllUsers(userResponses)
                .build();
        responseObserver.onNext(allUsers);
        responseObserver.onCompleted();
    }
}
