package com.ferhad.accountservice.service;

import com.ferhad.common.*;
import com.ferhad.common.Void;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void saveUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        System.out.println("User has been saved");
    }

    @Override
    public void saveRole(Role request, StreamObserver<Role> responseObserver) {
        super.saveRole(request, responseObserver);
    }

    @Override
    public void addRoleToUser(RoleToUser request, StreamObserver<Void> responseObserver) {
        super.addRoleToUser(request, responseObserver);
    }

    @Override
    public void getUser(UserName request, StreamObserver<UserResponse> responseObserver) {
        String successMsg = request.getUsername().equals("ferhad") ? "SUCCESS" : "FAILURE";
        responseObserver.onNext(UserResponse.newBuilder().setUsername(successMsg).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(Void request, StreamObserver<AllUsers> responseObserver) {
        super.getUsers(request, responseObserver);
    }
}
