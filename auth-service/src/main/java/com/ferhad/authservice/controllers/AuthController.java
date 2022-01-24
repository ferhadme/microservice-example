package com.ferhad.authservice.controllers;

import com.ferhad.common.UserName;
import com.ferhad.common.UserResponse;
import com.ferhad.common.UserServiceGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @GrpcClient("account-service")
    private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        UserResponse response = userServiceBlockingStub.getUser(UserName.newBuilder()
                .setUsername("ferhad")
                .build());

        System.out.println("---\nRESPONSE " + response.getUsername() + "\n---");

        return ResponseEntity
                .ok(response.getUsername());
    }

    @GetMapping("/test2")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok("Test Successful");
    }
}
