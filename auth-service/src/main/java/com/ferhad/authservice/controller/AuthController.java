package com.ferhad.authservice.controller;

import com.ferhad.authservice.model.AuthRequest;
import com.ferhad.authservice.model.AuthResponse;
import com.ferhad.authservice.model.User;
import com.ferhad.authservice.security.JwtUserDetailService;
import com.ferhad.authservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final JwtUserDetailService userDetailService;
    private final UserService userService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) throws Exception {
        return userDetailService.createJwtToken(request);
    }

    @PostMapping("/register")
    public User registerNewUser(@RequestBody User user) {
        return userService.createNewUser(user);
    }
}
