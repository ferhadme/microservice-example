package com.ferhad.common;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.ferhad.common.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ferhad.common.UserRequest,
      com.ferhad.common.UserResponse> getSaveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUser",
      requestType = com.ferhad.common.UserRequest.class,
      responseType = com.ferhad.common.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ferhad.common.UserRequest,
      com.ferhad.common.UserResponse> getSaveUserMethod() {
    io.grpc.MethodDescriptor<com.ferhad.common.UserRequest, com.ferhad.common.UserResponse> getSaveUserMethod;
    if ((getSaveUserMethod = UserServiceGrpc.getSaveUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSaveUserMethod = UserServiceGrpc.getSaveUserMethod) == null) {
          UserServiceGrpc.getSaveUserMethod = getSaveUserMethod =
              io.grpc.MethodDescriptor.<com.ferhad.common.UserRequest, com.ferhad.common.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("saveUser"))
              .build();
        }
      }
    }
    return getSaveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ferhad.common.Role,
      com.ferhad.common.Role> getSaveRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveRole",
      requestType = com.ferhad.common.Role.class,
      responseType = com.ferhad.common.Role.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ferhad.common.Role,
      com.ferhad.common.Role> getSaveRoleMethod() {
    io.grpc.MethodDescriptor<com.ferhad.common.Role, com.ferhad.common.Role> getSaveRoleMethod;
    if ((getSaveRoleMethod = UserServiceGrpc.getSaveRoleMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSaveRoleMethod = UserServiceGrpc.getSaveRoleMethod) == null) {
          UserServiceGrpc.getSaveRoleMethod = getSaveRoleMethod =
              io.grpc.MethodDescriptor.<com.ferhad.common.Role, com.ferhad.common.Role>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.Role.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.Role.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("saveRole"))
              .build();
        }
      }
    }
    return getSaveRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ferhad.common.RoleToUser,
      com.ferhad.common.Void> getAddRoleToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRoleToUser",
      requestType = com.ferhad.common.RoleToUser.class,
      responseType = com.ferhad.common.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ferhad.common.RoleToUser,
      com.ferhad.common.Void> getAddRoleToUserMethod() {
    io.grpc.MethodDescriptor<com.ferhad.common.RoleToUser, com.ferhad.common.Void> getAddRoleToUserMethod;
    if ((getAddRoleToUserMethod = UserServiceGrpc.getAddRoleToUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddRoleToUserMethod = UserServiceGrpc.getAddRoleToUserMethod) == null) {
          UserServiceGrpc.getAddRoleToUserMethod = getAddRoleToUserMethod =
              io.grpc.MethodDescriptor.<com.ferhad.common.RoleToUser, com.ferhad.common.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRoleToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.RoleToUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.Void.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addRoleToUser"))
              .build();
        }
      }
    }
    return getAddRoleToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ferhad.common.UserName,
      com.ferhad.common.UserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUser",
      requestType = com.ferhad.common.UserName.class,
      responseType = com.ferhad.common.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ferhad.common.UserName,
      com.ferhad.common.UserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.ferhad.common.UserName, com.ferhad.common.UserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.ferhad.common.UserName, com.ferhad.common.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.UserName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ferhad.common.Void,
      com.ferhad.common.AllUsers> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUsers",
      requestType = com.ferhad.common.Void.class,
      responseType = com.ferhad.common.AllUsers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ferhad.common.Void,
      com.ferhad.common.AllUsers> getGetUsersMethod() {
    io.grpc.MethodDescriptor<com.ferhad.common.Void, com.ferhad.common.AllUsers> getGetUsersMethod;
    if ((getGetUsersMethod = UserServiceGrpc.getGetUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUsersMethod = UserServiceGrpc.getGetUsersMethod) == null) {
          UserServiceGrpc.getGetUsersMethod = getGetUsersMethod =
              io.grpc.MethodDescriptor.<com.ferhad.common.Void, com.ferhad.common.AllUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ferhad.common.AllUsers.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUsers"))
              .build();
        }
      }
    }
    return getGetUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveUser(com.ferhad.common.UserRequest request,
        io.grpc.stub.StreamObserver<com.ferhad.common.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveUserMethod(), responseObserver);
    }

    /**
     */
    public void saveRole(com.ferhad.common.Role request,
        io.grpc.stub.StreamObserver<com.ferhad.common.Role> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveRoleMethod(), responseObserver);
    }

    /**
     */
    public void addRoleToUser(com.ferhad.common.RoleToUser request,
        io.grpc.stub.StreamObserver<com.ferhad.common.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRoleToUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(com.ferhad.common.UserName request,
        io.grpc.stub.StreamObserver<com.ferhad.common.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void getUsers(com.ferhad.common.Void request,
        io.grpc.stub.StreamObserver<com.ferhad.common.AllUsers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ferhad.common.UserRequest,
                com.ferhad.common.UserResponse>(
                  this, METHODID_SAVE_USER)))
          .addMethod(
            getSaveRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ferhad.common.Role,
                com.ferhad.common.Role>(
                  this, METHODID_SAVE_ROLE)))
          .addMethod(
            getAddRoleToUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ferhad.common.RoleToUser,
                com.ferhad.common.Void>(
                  this, METHODID_ADD_ROLE_TO_USER)))
          .addMethod(
            getGetUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ferhad.common.UserName,
                com.ferhad.common.UserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ferhad.common.Void,
                com.ferhad.common.AllUsers>(
                  this, METHODID_GET_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveUser(com.ferhad.common.UserRequest request,
        io.grpc.stub.StreamObserver<com.ferhad.common.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveRole(com.ferhad.common.Role request,
        io.grpc.stub.StreamObserver<com.ferhad.common.Role> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRoleToUser(com.ferhad.common.RoleToUser request,
        io.grpc.stub.StreamObserver<com.ferhad.common.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRoleToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(com.ferhad.common.UserName request,
        io.grpc.stub.StreamObserver<com.ferhad.common.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsers(com.ferhad.common.Void request,
        io.grpc.stub.StreamObserver<com.ferhad.common.AllUsers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ferhad.common.UserResponse saveUser(com.ferhad.common.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ferhad.common.Role saveRole(com.ferhad.common.Role request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ferhad.common.Void addRoleToUser(com.ferhad.common.RoleToUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRoleToUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ferhad.common.UserResponse getUser(com.ferhad.common.UserName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ferhad.common.AllUsers getUsers(com.ferhad.common.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ferhad.common.UserResponse> saveUser(
        com.ferhad.common.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ferhad.common.Role> saveRole(
        com.ferhad.common.Role request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ferhad.common.Void> addRoleToUser(
        com.ferhad.common.RoleToUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRoleToUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ferhad.common.UserResponse> getUser(
        com.ferhad.common.UserName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ferhad.common.AllUsers> getUsers(
        com.ferhad.common.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_USER = 0;
  private static final int METHODID_SAVE_ROLE = 1;
  private static final int METHODID_ADD_ROLE_TO_USER = 2;
  private static final int METHODID_GET_USER = 3;
  private static final int METHODID_GET_USERS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_USER:
          serviceImpl.saveUser((com.ferhad.common.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.ferhad.common.UserResponse>) responseObserver);
          break;
        case METHODID_SAVE_ROLE:
          serviceImpl.saveRole((com.ferhad.common.Role) request,
              (io.grpc.stub.StreamObserver<com.ferhad.common.Role>) responseObserver);
          break;
        case METHODID_ADD_ROLE_TO_USER:
          serviceImpl.addRoleToUser((com.ferhad.common.RoleToUser) request,
              (io.grpc.stub.StreamObserver<com.ferhad.common.Void>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.ferhad.common.UserName) request,
              (io.grpc.stub.StreamObserver<com.ferhad.common.UserResponse>) responseObserver);
          break;
        case METHODID_GET_USERS:
          serviceImpl.getUsers((com.ferhad.common.Void) request,
              (io.grpc.stub.StreamObserver<com.ferhad.common.AllUsers>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ferhad.common.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getSaveUserMethod())
              .addMethod(getSaveRoleMethod())
              .addMethod(getAddRoleToUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
