package com.ferhad.authservice.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ferhad.authservice.model.RoleDto;
import com.ferhad.authservice.model.UserDto;
import com.ferhad.authservice.security.utils.JwtUtils;
import com.ferhad.authservice.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    private final JwtUtils jwtUtils;

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getUsers() {
        return ResponseEntity.ok()
                .body(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/auth/user/save").toUriString());
        return ResponseEntity
                .created(uri)
                .body(userService.saveUser(userDto));
    }

    @PostMapping("/role/save")
    public ResponseEntity<RoleDto> saveRole(@RequestBody RoleDto roleDto) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/auth/role/save").toUriString());
        return ResponseEntity
                .created(uri)
                .body(userService.saveRole(roleDto));
    }

    @PostMapping("/role/addToUser")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserFrom form) {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity
                .ok()
                .build();
    }

    @GetMapping("/token/refresh")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            try {
                String refresh_token = authorizationHeader.substring("Bearer ".length());
                Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
                JWTVerifier verifier = JWT.require(algorithm).build();
                DecodedJWT decodedJWT = verifier.verify(refresh_token);
                String username = decodedJWT.getSubject();
                UserDto user = userService.getUser(username);
                String access_token = jwtUtils.createAccessToken(
                        user.getUsername(), request.getRequestURL().toString(), "roles",
                        user.getRoles().stream().map(RoleDto::getName).collect(Collectors.toList()),
                        algorithm
                );
                response.setContentType(MediaType.APPLICATION_JSON_VALUE);
                response.setHeader("access_token", access_token);
                response.setHeader("refresh_token", refresh_token);
            } catch (Exception e) {
                response.setHeader("error", e.getMessage());
                response.setStatus(HttpStatus.FORBIDDEN.value());
                Map<String, String> error = new HashMap<>();
                error.put("error_message", e.getMessage());
                response.setContentType(MediaType.APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), error);
            }
        } else {
            throw new RuntimeException("Refresh token is missing");
        }
    }
}


@Data
class RoleToUserFrom {
    private String username;
    private String roleName;
}

