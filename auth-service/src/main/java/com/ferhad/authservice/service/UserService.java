package com.ferhad.authservice.service;

import com.ferhad.authservice.dto.RoleDto;
import com.ferhad.authservice.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    RoleDto saveRole(RoleDto roleDto);
    void addRoleToUser(String username, String roleName);
    UserDto getUser(String username);
    List<UserDto> getUsers();
}
