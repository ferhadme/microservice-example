// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.ferhad.common;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ferhad_common_AllUsers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ferhad_common_AllUsers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ferhad_common_Void_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ferhad_common_Void_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ferhad_common_Role_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ferhad_common_Role_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ferhad_common_UserName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ferhad_common_UserName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ferhad_common_RoleToUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ferhad_common_RoleToUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ferhad_common_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ferhad_common_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ferhad_common_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ferhad_common_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\021com.ferhad.common\":\n\010AllUs" +
      "ers\022.\n\005users\030\001 \003(\0132\037.com.ferhad.common.U" +
      "serResponse\"\006\n\004Void\"\030\n\004Role\022\020\n\010roleName\030" +
      "\001 \001(\t\"\034\n\010UserName\022\020\n\010username\030\001 \001(\t\"0\n\nR" +
      "oleToUser\022\020\n\010username\030\001 \001(\t\022\020\n\010roleName\030" +
      "\002 \001(\t\"1\n\013UserRequest\022\020\n\010username\030\001 \001(\t\022\020" +
      "\n\010password\030\002 \001(\t\"Z\n\014UserResponse\022\020\n\010user" +
      "name\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022&\n\005roles\030\003 " +
      "\003(\0132\027.com.ferhad.common.Role2\354\002\n\013UserSer" +
      "vice\022K\n\010saveUser\022\036.com.ferhad.common.Use" +
      "rRequest\032\037.com.ferhad.common.UserRespons" +
      "e\022<\n\010saveRole\022\027.com.ferhad.common.Role\032\027" +
      ".com.ferhad.common.Role\022G\n\raddRoleToUser" +
      "\022\035.com.ferhad.common.RoleToUser\032\027.com.fe" +
      "rhad.common.Void\022G\n\007getUser\022\033.com.ferhad" +
      ".common.UserName\032\037.com.ferhad.common.Use" +
      "rResponse\022@\n\010getUsers\022\027.com.ferhad.commo" +
      "n.Void\032\033.com.ferhad.common.AllUsersB\025\n\021c" +
      "om.ferhad.commonP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_ferhad_common_AllUsers_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ferhad_common_AllUsers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ferhad_common_AllUsers_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_com_ferhad_common_Void_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ferhad_common_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ferhad_common_Void_descriptor,
        new java.lang.String[] { });
    internal_static_com_ferhad_common_Role_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ferhad_common_Role_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ferhad_common_Role_descriptor,
        new java.lang.String[] { "RoleName", });
    internal_static_com_ferhad_common_UserName_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ferhad_common_UserName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ferhad_common_UserName_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_com_ferhad_common_RoleToUser_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_ferhad_common_RoleToUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ferhad_common_RoleToUser_descriptor,
        new java.lang.String[] { "Username", "RoleName", });
    internal_static_com_ferhad_common_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_ferhad_common_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ferhad_common_UserRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_com_ferhad_common_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_ferhad_common_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ferhad_common_UserResponse_descriptor,
        new java.lang.String[] { "Username", "Password", "Roles", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
