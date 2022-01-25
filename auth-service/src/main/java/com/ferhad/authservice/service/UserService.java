package com.ferhad.authservice.service;

import com.ferhad.authservice.model.RoleDto;
import com.ferhad.authservice.model.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    RoleDto saveRole(RoleDto roleDto);
    void addRoleToUser(String username, String roleName);
    UserDto getUser(String username);
    List<UserDto> getUsers();
}
