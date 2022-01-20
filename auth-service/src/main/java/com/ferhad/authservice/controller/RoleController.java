package com.ferhad.authservice.controller;

import com.ferhad.authservice.model.Role;
import com.ferhad.authservice.repository.RoleRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostMapping
    public Role createNewRole(@RequestBody Role role) {
        return roleRepository.save(role);
    }
}
