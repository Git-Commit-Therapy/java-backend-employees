package com.git_commit_therapy.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: employee_services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServicesGrpc {

  private EmployeeServicesGrpc() {}

  public static final String SERVICE_NAME = "com.git_commit_therapy.proto.EmployeeServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Doctor> getGetDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDoctor",
      requestType = com.google.protobuf.Empty.class,
      responseType = UserOuterClass.Doctor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Doctor> getGetDoctorMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, UserOuterClass.Doctor> getGetDoctorMethod;
    if ((getGetDoctorMethod = EmployeeServicesGrpc.getGetDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetDoctorMethod = EmployeeServicesGrpc.getGetDoctorMethod) == null) {
          EmployeeServicesGrpc.getGetDoctorMethod = getGetDoctorMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, UserOuterClass.Doctor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Doctor.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetDoctor"))
              .build();
        }
      }
    }
    return getGetDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse> getGetAllDoctorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllDoctors",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse> getGetAllDoctorsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse> getGetAllDoctorsMethod;
    if ((getGetAllDoctorsMethod = EmployeeServicesGrpc.getGetAllDoctorsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllDoctorsMethod = EmployeeServicesGrpc.getGetAllDoctorsMethod) == null) {
          EmployeeServicesGrpc.getGetAllDoctorsMethod = getGetAllDoctorsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllDoctors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllDoctors"))
              .build();
        }
      }
    }
    return getGetAllDoctorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Staff> getGetStaffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStaff",
      requestType = com.google.protobuf.Empty.class,
      responseType = UserOuterClass.Staff.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Staff> getGetStaffMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, UserOuterClass.Staff> getGetStaffMethod;
    if ((getGetStaffMethod = EmployeeServicesGrpc.getGetStaffMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetStaffMethod = EmployeeServicesGrpc.getGetStaffMethod) == null) {
          EmployeeServicesGrpc.getGetStaffMethod = getGetStaffMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, UserOuterClass.Staff>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStaff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Staff.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetStaff"))
              .build();
        }
      }
    }
    return getGetStaffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse> getGetAllStaffsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStaffs",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse> getGetAllStaffsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse> getGetAllStaffsMethod;
    if ((getGetAllStaffsMethod = EmployeeServicesGrpc.getGetAllStaffsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllStaffsMethod = EmployeeServicesGrpc.getGetAllStaffsMethod) == null) {
          EmployeeServicesGrpc.getGetAllStaffsMethod = getGetAllStaffsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStaffs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllStaffs"))
              .build();
        }
      }
    }
    return getGetAllStaffsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointments",
      requestType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod;
    if ((getGetAppointmentsMethod = EmployeeServicesGrpc.getGetAppointmentsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAppointmentsMethod = EmployeeServicesGrpc.getGetAppointmentsMethod) == null) {
          EmployeeServicesGrpc.getGetAppointmentsMethod = getGetAppointmentsMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAppointments"))
              .build();
        }
      }
    }
    return getGetAppointmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentDetails",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentDetailsMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentDetailsMethod;
    if ((getGetAppointmentDetailsMethod = EmployeeServicesGrpc.getGetAppointmentDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAppointmentDetailsMethod = EmployeeServicesGrpc.getGetAppointmentDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetAppointmentDetailsMethod = getGetAppointmentDetailsMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAppointmentDetails"))
              .build();
        }
      }
    }
    return getGetAppointmentDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyAppointment",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;
    if ((getModifyAppointmentMethod = EmployeeServicesGrpc.getModifyAppointmentMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyAppointmentMethod = EmployeeServicesGrpc.getModifyAppointmentMethod) == null) {
          EmployeeServicesGrpc.getModifyAppointmentMethod = getModifyAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyAppointment"))
              .build();
        }
      }
    }
    return getModifyAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAppointment",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;
    if ((getCreateAppointmentMethod = EmployeeServicesGrpc.getCreateAppointmentMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateAppointmentMethod = EmployeeServicesGrpc.getCreateAppointmentMethod) == null) {
          EmployeeServicesGrpc.getCreateAppointmentMethod = getCreateAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateAppointment"))
              .build();
        }
      }
    }
    return getCreateAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMedicalExam",
      requestType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod;
    if ((getGetAllMedicalExamMethod = EmployeeServicesGrpc.getGetAllMedicalExamMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllMedicalExamMethod = EmployeeServicesGrpc.getGetAllMedicalExamMethod) == null) {
          EmployeeServicesGrpc.getGetAllMedicalExamMethod = getGetAllMedicalExamMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllMedicalExam"))
              .build();
        }
      }
    }
    return getGetAllMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalExam",
      requestType = MedicalExamOuterClass.MedicalExam.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod() {
    io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod;
    if ((getCreateMedicalExamMethod = EmployeeServicesGrpc.getCreateMedicalExamMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalExamMethod = EmployeeServicesGrpc.getCreateMedicalExamMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalExamMethod = getCreateMedicalExamMethod =
              io.grpc.MethodDescriptor.<MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalExam"))
              .build();
        }
      }
    }
    return getCreateMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalEvent",
      requestType = MedicalEventOuterClass.MedicalEvent.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod() {
    io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod;
    if ((getCreateMedicalEventMethod = EmployeeServicesGrpc.getCreateMedicalEventMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalEventMethod = EmployeeServicesGrpc.getCreateMedicalEventMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalEventMethod = getCreateMedicalEventMethod =
              io.grpc.MethodDescriptor.<MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalEventOuterClass.MedicalEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalEvent"))
              .build();
        }
      }
    }
    return getCreateMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalInfo",
      requestType = MedicalInfoOuterClass.MedicalInfo.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod() {
    io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod;
    if ((getCreateMedicalInfoMethod = EmployeeServicesGrpc.getCreateMedicalInfoMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalInfoMethod = EmployeeServicesGrpc.getCreateMedicalInfoMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalInfoMethod = getCreateMedicalInfoMethod =
              io.grpc.MethodDescriptor.<MedicalInfoOuterClass.MedicalInfo, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalInfoOuterClass.MedicalInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalInfo"))
              .build();
        }
      }
    }
    return getCreateMedicalInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMedicalExamDetails",
      requestType = MedicalExamOuterClass.MedicalExam.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod() {
    io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;
    if ((getGetMedicalExamDetailsMethod = EmployeeServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetMedicalExamDetailsMethod = EmployeeServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetMedicalExamDetailsMethod = getGetMedicalExamDetailsMethod =
              io.grpc.MethodDescriptor.<MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMedicalExamDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetMedicalExamDetails"))
              .build();
        }
      }
    }
    return getGetMedicalExamDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesStub>() {
        @Override
        public EmployeeServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServicesStub(channel, callOptions);
        }
      };
    return EmployeeServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesBlockingStub>() {
        @Override
        public EmployeeServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServicesBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesFutureStub>() {
        @Override
        public EmployeeServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServicesFutureStub(channel, callOptions);
        }
      };
    return EmployeeServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *Get Doctor data
     * </pre>
     */
    default void getDoctor(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Doctor> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoctorMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all Doctors
     * </pre>
     */
    default void getAllDoctors(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllDoctorsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get Staff data
     * </pre>
     */
    default void getStaff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Staff> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStaffMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all Staff
     * </pre>
     */
    default void getAllStaffs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStaffsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    default void getAppointments(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    default void getAppointmentDetails(AppointmentOuterClass.Appointment request,
                                       io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    default void modifyAppointment(AppointmentOuterClass.Appointment request,
                                   io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    default void createAppointment(AppointmentOuterClass.Appointment request,
                                   io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    default void getAllMedicalExam(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    default void createMedicalExam(MedicalExamOuterClass.MedicalExam request,
                                   io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    default void createMedicalEvent(MedicalEventOuterClass.MedicalEvent request,
                                    io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    default void createMedicalInfo(MedicalInfoOuterClass.MedicalInfo request,
                                   io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    default void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request,
                                       io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicalExamDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeServices.
   */
  public static abstract class EmployeeServicesImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmployeeServicesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmployeeServices.
   */
  public static final class EmployeeServicesStub
      extends io.grpc.stub.AbstractAsyncStub<EmployeeServicesStub> {
    private EmployeeServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EmployeeServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Doctor data
     * </pre>
     */
    public void getDoctor(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Doctor> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all Doctors
     * </pre>
     */
    public void getAllDoctors(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllDoctorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get Staff data
     * </pre>
     */
    public void getStaff(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Staff> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStaffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all Staff
     * </pre>
     */
    public void getAllStaffs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStaffsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public void getAppointments(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public void getAppointmentDetails(AppointmentOuterClass.Appointment request,
                                      io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public void modifyAppointment(AppointmentOuterClass.Appointment request,
                                  io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public void createAppointment(AppointmentOuterClass.Appointment request,
                                  io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public void getAllMedicalExam(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public void createMedicalExam(MedicalExamOuterClass.MedicalExam request,
                                  io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public void createMedicalEvent(MedicalEventOuterClass.MedicalEvent request,
                                   io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public void createMedicalInfo(MedicalInfoOuterClass.MedicalInfo request,
                                  io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request,
                                      io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmployeeServices.
   */
  public static final class EmployeeServicesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServicesBlockingStub> {
    private EmployeeServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EmployeeServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Doctor data
     * </pre>
     */
    public UserOuterClass.Doctor getDoctor(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoctorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all Doctors
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse getAllDoctors(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllDoctorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get Staff data
     * </pre>
     */
    public UserOuterClass.Staff getStaff(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStaffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all Staff
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse getAllStaffs(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStaffsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse getAppointments(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse getAppointmentDetails(AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse modifyAppointment(AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse createAppointment(AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse getAllMedicalExam(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse createMedicalExam(MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse createMedicalEvent(MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse createMedicalInfo(MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicalExamDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeServices.
   */
  public static final class EmployeeServicesFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmployeeServicesFutureStub> {
    private EmployeeServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EmployeeServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Doctor data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserOuterClass.Doctor> getDoctor(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoctorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get all Doctors
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse> getAllDoctors(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllDoctorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get Staff data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserOuterClass.Staff> getStaff(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStaffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get all Staff
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse> getAllStaffs(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStaffsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getAppointments(
        com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse> getAppointmentDetails(
        AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> modifyAppointment(
        AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> createAppointment(
        AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse> getAllMedicalExam(
        com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> createMedicalExam(
        MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> createMedicalEvent(
        MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> createMedicalInfo(
        MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getMedicalExamDetails(
        MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCTOR = 0;
  private static final int METHODID_GET_ALL_DOCTORS = 1;
  private static final int METHODID_GET_STAFF = 2;
  private static final int METHODID_GET_ALL_STAFFS = 3;
  private static final int METHODID_GET_APPOINTMENTS = 4;
  private static final int METHODID_GET_APPOINTMENT_DETAILS = 5;
  private static final int METHODID_MODIFY_APPOINTMENT = 6;
  private static final int METHODID_CREATE_APPOINTMENT = 7;
  private static final int METHODID_GET_ALL_MEDICAL_EXAM = 8;
  private static final int METHODID_CREATE_MEDICAL_EXAM = 9;
  private static final int METHODID_CREATE_MEDICAL_EVENT = 10;
  private static final int METHODID_CREATE_MEDICAL_INFO = 11;
  private static final int METHODID_GET_MEDICAL_EXAM_DETAILS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOCTOR:
          serviceImpl.getDoctor((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<UserOuterClass.Doctor>) responseObserver);
          break;
        case METHODID_GET_ALL_DOCTORS:
          serviceImpl.getAllDoctors((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse>) responseObserver);
          break;
        case METHODID_GET_STAFF:
          serviceImpl.getStaff((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<UserOuterClass.Staff>) responseObserver);
          break;
        case METHODID_GET_ALL_STAFFS:
          serviceImpl.getAllStaffs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS:
          serviceImpl.getAppointments((com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENT_DETAILS:
          serviceImpl.getAppointmentDetails((AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>) responseObserver);
          break;
        case METHODID_MODIFY_APPOINTMENT:
          serviceImpl.modifyAppointment((AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse>) responseObserver);
          break;
        case METHODID_CREATE_APPOINTMENT:
          serviceImpl.createAppointment((AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_EXAM:
          serviceImpl.getAllMedicalExam((com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_EXAM:
          serviceImpl.createMedicalExam((MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_EVENT:
          serviceImpl.createMedicalEvent((MedicalEventOuterClass.MedicalEvent) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_INFO:
          serviceImpl.createMedicalInfo((MedicalInfoOuterClass.MedicalInfo) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse>) responseObserver);
          break;
        case METHODID_GET_MEDICAL_EXAM_DETAILS:
          serviceImpl.getMedicalExamDetails((MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              UserOuterClass.Doctor>(
                service, METHODID_GET_DOCTOR)))
        .addMethod(
          getGetAllDoctorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse>(
                service, METHODID_GET_ALL_DOCTORS)))
        .addMethod(
          getGetStaffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              UserOuterClass.Staff>(
                service, METHODID_GET_STAFF)))
        .addMethod(
          getGetAllStaffsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse>(
                service, METHODID_GET_ALL_STAFFS)))
        .addMethod(
          getGetAppointmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>(
                service, METHODID_GET_APPOINTMENTS)))
        .addMethod(
          getGetAppointmentDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>(
                service, METHODID_GET_APPOINTMENT_DETAILS)))
        .addMethod(
          getModifyAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse>(
                service, METHODID_MODIFY_APPOINTMENT)))
        .addMethod(
          getCreateAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse>(
                service, METHODID_CREATE_APPOINTMENT)))
        .addMethod(
          getGetAllMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse>(
                service, METHODID_GET_ALL_MEDICAL_EXAM)))
        .addMethod(
          getCreateMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalExamOuterClass.MedicalExam,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse>(
                service, METHODID_CREATE_MEDICAL_EXAM)))
        .addMethod(
          getCreateMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalEventOuterClass.MedicalEvent,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse>(
                service, METHODID_CREATE_MEDICAL_EVENT)))
        .addMethod(
          getCreateMedicalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalInfoOuterClass.MedicalInfo,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse>(
                service, METHODID_CREATE_MEDICAL_INFO)))
        .addMethod(
          getGetMedicalExamDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalExamOuterClass.MedicalExam,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>(
                service, METHODID_GET_MEDICAL_EXAM_DETAILS)))
        .build();
  }

  private static abstract class EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServicesBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.git_commit_therapy.proto.EmployeeServicesOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeServices");
    }
  }

  private static final class EmployeeServicesFileDescriptorSupplier
      extends EmployeeServicesBaseDescriptorSupplier {
    EmployeeServicesFileDescriptorSupplier() {}
  }

  private static final class EmployeeServicesMethodDescriptorSupplier
      extends EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServicesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmployeeServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServicesFileDescriptorSupplier())
              .addMethod(getGetDoctorMethod())
              .addMethod(getGetAllDoctorsMethod())
              .addMethod(getGetStaffMethod())
              .addMethod(getGetAllStaffsMethod())
              .addMethod(getGetAppointmentsMethod())
              .addMethod(getGetAppointmentDetailsMethod())
              .addMethod(getModifyAppointmentMethod())
              .addMethod(getCreateAppointmentMethod())
              .addMethod(getGetAllMedicalExamMethod())
              .addMethod(getCreateMedicalExamMethod())
              .addMethod(getCreateMedicalEventMethod())
              .addMethod(getCreateMedicalInfoMethod())
              .addMethod(getGetMedicalExamDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
