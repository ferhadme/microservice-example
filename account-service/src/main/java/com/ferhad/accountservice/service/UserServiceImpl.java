package com.ferhad.accountservice.service;

import com.ferhad.accountservice.repository.AccountRepository;
import com.ferhad.accountservice.repository.RoleRepository;
import com.ferhad.common.*;
import com.ferhad.common.Void;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import nu.studer.sample.tables.pojos.Account;
import nu.studer.sample.tables.pojos.Roles;
import nu.studer.sample.tables.records.AccountRecord;

import java.util.ArrayList;
import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    private final AccountRepository accountRepository;
    private final RoleRepository roleRepository;
    private final PublisherService publisherService;

    @Override
    public void saveUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        accountRepository.save(request);

        UserResponse userResponse = UserResponse.newBuilder()
                .setUsername(request.getUsername())
                .setPassword(request.getPassword())
                .addAllRoles(new ArrayList<>())
                .build();
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
        publisherService.sendMessage("user_registration",
                "User (" + request.getUsername() + ") has been registered");
    }

    @Override
    public void saveRole(Role request, StreamObserver<Role> responseObserver) {
        roleRepository.save(request);
        Role roleResponse = Role.newBuilder()
                .setRoleName(request.getRoleName())
                .build();
        responseObserver.onNext(roleResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void addRoleToUser(RoleToUser request, StreamObserver<Void> responseObserver) {
        accountRepository.saveRole(request.getUsername(), request.getRoleName());

        Void v = Void.newBuilder()
                .build();
        responseObserver.onNext(v);
        responseObserver.onCompleted();
    }

    @Override
    public void getUser(UserName request, StreamObserver<UserResponse> responseObserver) {
        AccountRecord accountRecord = accountRepository.findByUsername(request.getUsername());
        List<Roles> roles = roleRepository.getRolesOfUser(accountRecord.getAccountId());
        List<Role> rolesResponse = new ArrayList<>();
        for (Roles role : roles) {
            rolesResponse.add(Role.newBuilder().setRoleName(role.getRoleName()).build());
        }

        UserResponse userResponse = UserResponse.newBuilder()
                .setUsername(accountRecord.getUsername())
                .setPassword(accountRecord.getPassword())
                .addAllRoles(rolesResponse)
                .build();
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(Void request, StreamObserver<AllUsers> responseObserver) {
        List<Account> accounts = accountRepository.findAll();
        List<UserResponse> userResponses = new ArrayList<>();
        for (Account account : accounts) {
            List<Role> rolesResponse = new ArrayList<>();
            roleRepository.getRolesOfUser(account.getAccountId()).forEach(role -> {
                rolesResponse.add(
                        Role.newBuilder()
                                .setRoleName(role.getRoleName())
                                .build()
                );
            });

            userResponses.add(
                    UserResponse.newBuilder()
                            .setUsername(account.getUsername())
                            .setPassword(account.getPassword())
                            .addAllRoles(rolesResponse)
                            .build()
            );
        }
        responseObserver.onNext(AllUsers.newBuilder().addAllUsers(userResponses).build());
        responseObserver.onCompleted();
    }
}
