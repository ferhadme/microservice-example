package com.ferhad.authservice.service;

import com.ferhad.authservice.model.RoleDto;
import com.ferhad.authservice.model.UserDto;
import com.ferhad.common.*;
import com.ferhad.common.Void;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {
    @GrpcClient("account-service")
    private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDto saveUser(UserDto userDto) {
        System.out.println("saveUser from serviceImpl called");
        UserRequest userRequest = UserRequest.newBuilder()
                .setUsername(userDto.getUsername())
                .setPassword(passwordEncoder.encode(userDto.getPassword()))
                .build();

        UserResponse userResponse = userServiceBlockingStub.saveUser(userRequest);
        Set<Role> roles = new HashSet<>(userResponse.getRolesList());
        Set<RoleDto> roleDtos = new HashSet<>();
        roles.forEach(role -> {
            roleDtos.add(new RoleDto(role.getRoleName()));
        });
        return new UserDto(userResponse.getUsername(), userResponse.getPassword(), roleDtos);
    }

    @Override
    public RoleDto saveRole(RoleDto roleDto) {
        Role roleRequest = Role.newBuilder()
                .setRoleName(roleDto.getName())
                .build();

        Role roleResponse = userServiceBlockingStub.saveRole(roleRequest);
        return new RoleDto(roleResponse.getRoleName());
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        RoleToUser roleToUser = RoleToUser.newBuilder()
                .setUsername(username)
                .setRoleName(roleName)
                .build();
        userServiceBlockingStub.addRoleToUser(roleToUser);
    }

    @Override
    public UserDto getUser(String username) {
        UserName userName = UserName.newBuilder()
                .setUsername(username)
                .build();

        UserResponse userResponse = userServiceBlockingStub.getUser(userName);
        Set<RoleDto> roleDtos =
                userResponse.getRolesList().stream().map(role -> new RoleDto(role.getRoleName())).collect(Collectors.toSet());
        return new UserDto(userResponse.getUsername(), userResponse.getPassword(), roleDtos);
    }

    @Override
    public List<UserDto> getUsers() {
        Void v = Void.newBuilder()
                .build();
        List<UserResponse> users = userServiceBlockingStub.getUsers(v).getUsersList();
        List<UserDto> userDtos = new ArrayList<>();

        users.forEach(user -> {
            List<RoleDto> roleDtos = new ArrayList<>();
            user.getRolesList().forEach(role -> {
                roleDtos.add(new RoleDto(role.getRoleName()));
            });
            userDtos.add(new UserDto(user.getUsername(), user.getPassword(), new HashSet<>(roleDtos)));
        });

        return userDtos;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = getUser(username);
        if (userDto == null) {
            throw new UsernameNotFoundException("Username with " + username + " not found");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        userDto.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });
        return new org.springframework.security.core.userdetails.User(
                userDto.getUsername(), userDto.getPassword(), authorities
        );
    }
}
