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

  public static final java.lang.String SERVICE_NAME = "com.git_commit_therapy.proto.EmployeeServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.UserOuterClass.Doctor> getGetDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDoctor",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.UserOuterClass.Doctor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.UserOuterClass.Doctor> getGetDoctorMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.UserOuterClass.Doctor> getGetDoctorMethod;
    if ((getGetDoctorMethod = EmployeeServicesGrpc.getGetDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetDoctorMethod = EmployeeServicesGrpc.getGetDoctorMethod) == null) {
          EmployeeServicesGrpc.getGetDoctorMethod = getGetDoctorMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.UserOuterClass.Doctor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Doctor.getDefaultInstance()))
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
      com.git_commit_therapy.proto.UserOuterClass.Staff> getGetStaffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStaff",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.UserOuterClass.Staff.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.UserOuterClass.Staff> getGetStaffMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.UserOuterClass.Staff> getGetStaffMethod;
    if ((getGetStaffMethod = EmployeeServicesGrpc.getGetStaffMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetStaffMethod = EmployeeServicesGrpc.getGetStaffMethod) == null) {
          EmployeeServicesGrpc.getGetStaffMethod = getGetStaffMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.UserOuterClass.Staff>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStaff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Staff.getDefaultInstance()))
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

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.UserOuterClass.Patient> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatient",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.UserOuterClass.Patient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.UserOuterClass.Patient> getGetPatientMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.UserOuterClass.Patient> getGetPatientMethod;
    if ((getGetPatientMethod = EmployeeServicesGrpc.getGetPatientMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetPatientMethod = EmployeeServicesGrpc.getGetPatientMethod) == null) {
          EmployeeServicesGrpc.getGetPatientMethod = getGetPatientMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.UserOuterClass.Patient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Patient.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetPatient"))
              .build();
        }
      }
    }
    return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPatients",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod;
    if ((getGetAllPatientsMethod = EmployeeServicesGrpc.getGetAllPatientsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllPatientsMethod = EmployeeServicesGrpc.getGetAllPatientsMethod) == null) {
          EmployeeServicesGrpc.getGetAllPatientsMethod = getGetAllPatientsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllPatients"))
              .build();
        }
      }
    }
    return getGetAllPatientsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getGetAppointmentsFromDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentsFromDoctor",
      requestType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getGetAppointmentsFromDoctorMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getGetAppointmentsFromDoctorMethod;
    if ((getGetAppointmentsFromDoctorMethod = EmployeeServicesGrpc.getGetAppointmentsFromDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAppointmentsFromDoctorMethod = EmployeeServicesGrpc.getGetAppointmentsFromDoctorMethod) == null) {
          EmployeeServicesGrpc.getGetAppointmentsFromDoctorMethod = getGetAppointmentsFromDoctorMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentsFromDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAppointmentsFromDoctor"))
              .build();
        }
      }
    }
    return getGetAppointmentsFromDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getGetAppointmentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentDetails",
      requestType = com.git_commit_therapy.proto.AppointmentOuterClass.Appointment.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getGetAppointmentDetailsMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getGetAppointmentDetailsMethod;
    if ((getGetAppointmentDetailsMethod = EmployeeServicesGrpc.getGetAppointmentDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAppointmentDetailsMethod = EmployeeServicesGrpc.getGetAppointmentDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetAppointmentDetailsMethod = getGetAppointmentDetailsMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAppointmentDetails"))
              .build();
        }
      }
    }
    return getGetAppointmentDetailsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMedicalExamDetails",
      requestType = com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;
    if ((getGetMedicalExamDetailsMethod = EmployeeServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetMedicalExamDetailsMethod = EmployeeServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetMedicalExamDetailsMethod = getGetMedicalExamDetailsMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMedicalExamDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetMedicalExamDetails"))
              .build();
        }
      }
    }
    return getGetMedicalExamDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMedicalEvent",
      requestType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod;
    if ((getGetAllMedicalEventMethod = EmployeeServicesGrpc.getGetAllMedicalEventMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllMedicalEventMethod = EmployeeServicesGrpc.getGetAllMedicalEventMethod) == null) {
          EmployeeServicesGrpc.getGetAllMedicalEventMethod = getGetAllMedicalEventMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllMedicalEvent"))
              .build();
        }
      }
    }
    return getGetAllMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getGetMedicalEventDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMedicalEventDetails",
      requestType = com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getGetMedicalEventDetailsMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getGetMedicalEventDetailsMethod;
    if ((getGetMedicalEventDetailsMethod = EmployeeServicesGrpc.getGetMedicalEventDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetMedicalEventDetailsMethod = EmployeeServicesGrpc.getGetMedicalEventDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetMedicalEventDetailsMethod = getGetMedicalEventDetailsMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMedicalEventDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetMedicalEventDetails"))
              .build();
        }
      }
    }
    return getGetMedicalEventDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse> getGetAllWardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllWard",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse> getGetAllWardMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse> getGetAllWardMethod;
    if ((getGetAllWardMethod = EmployeeServicesGrpc.getGetAllWardMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllWardMethod = EmployeeServicesGrpc.getGetAllWardMethod) == null) {
          EmployeeServicesGrpc.getGetAllWardMethod = getGetAllWardMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllWard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllWard"))
              .build();
        }
      }
    }
    return getGetAllWardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalExam",
      requestType = com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod;
    if ((getCreateMedicalExamMethod = EmployeeServicesGrpc.getCreateMedicalExamMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalExamMethod = EmployeeServicesGrpc.getCreateMedicalExamMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalExamMethod = getCreateMedicalExamMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalExam"))
              .build();
        }
      }
    }
    return getCreateMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalEvent",
      requestType = com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod;
    if ((getCreateMedicalEventMethod = EmployeeServicesGrpc.getCreateMedicalEventMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalEventMethod = EmployeeServicesGrpc.getCreateMedicalEventMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalEventMethod = getCreateMedicalEventMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalEvent"))
              .build();
        }
      }
    }
    return getCreateMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalInfo",
      requestType = com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod;
    if ((getCreateMedicalInfoMethod = EmployeeServicesGrpc.getCreateMedicalInfoMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalInfoMethod = EmployeeServicesGrpc.getCreateMedicalInfoMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalInfoMethod = getCreateMedicalInfoMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalInfo"))
              .build();
        }
      }
    }
    return getCreateMedicalInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAppointment",
      requestType = com.git_commit_therapy.proto.AppointmentOuterClass.Appointment.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;
    if ((getCreateAppointmentMethod = EmployeeServicesGrpc.getCreateAppointmentMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateAppointmentMethod = EmployeeServicesGrpc.getCreateAppointmentMethod) == null) {
          EmployeeServicesGrpc.getCreateAppointmentMethod = getCreateAppointmentMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateAppointment"))
              .build();
        }
      }
    }
    return getCreateAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Patient,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse> getCreatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatient",
      requestType = com.git_commit_therapy.proto.UserOuterClass.Patient.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Patient,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse> getCreatePatientMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Patient, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse> getCreatePatientMethod;
    if ((getCreatePatientMethod = EmployeeServicesGrpc.getCreatePatientMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreatePatientMethod = EmployeeServicesGrpc.getCreatePatientMethod) == null) {
          EmployeeServicesGrpc.getCreatePatientMethod = getCreatePatientMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.UserOuterClass.Patient, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Patient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreatePatient"))
              .build();
        }
      }
    }
    return getCreatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Doctor,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse> getCreateDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDoctor",
      requestType = com.git_commit_therapy.proto.UserOuterClass.Doctor.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Doctor,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse> getCreateDoctorMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Doctor, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse> getCreateDoctorMethod;
    if ((getCreateDoctorMethod = EmployeeServicesGrpc.getCreateDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateDoctorMethod = EmployeeServicesGrpc.getCreateDoctorMethod) == null) {
          EmployeeServicesGrpc.getCreateDoctorMethod = getCreateDoctorMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.UserOuterClass.Doctor, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Doctor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateDoctor"))
              .build();
        }
      }
    }
    return getCreateDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Staff,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse> getCreateStaffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStaff",
      requestType = com.git_commit_therapy.proto.UserOuterClass.Staff.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Staff,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse> getCreateStaffMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Staff, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse> getCreateStaffMethod;
    if ((getCreateStaffMethod = EmployeeServicesGrpc.getCreateStaffMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateStaffMethod = EmployeeServicesGrpc.getCreateStaffMethod) == null) {
          EmployeeServicesGrpc.getCreateStaffMethod = getCreateStaffMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.UserOuterClass.Staff, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStaff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Staff.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateStaff"))
              .build();
        }
      }
    }
    return getCreateStaffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.WardOuterClass.Ward,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse> getCreateWardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWard",
      requestType = com.git_commit_therapy.proto.WardOuterClass.Ward.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.WardOuterClass.Ward,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse> getCreateWardMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.WardOuterClass.Ward, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse> getCreateWardMethod;
    if ((getCreateWardMethod = EmployeeServicesGrpc.getCreateWardMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateWardMethod = EmployeeServicesGrpc.getCreateWardMethod) == null) {
          EmployeeServicesGrpc.getCreateWardMethod = getCreateWardMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.WardOuterClass.Ward, com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.WardOuterClass.Ward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateWard"))
              .build();
        }
      }
    }
    return getCreateWardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyAppointment",
      requestType = com.git_commit_therapy.proto.AppointmentOuterClass.Appointment.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;
    if ((getModifyAppointmentMethod = EmployeeServicesGrpc.getModifyAppointmentMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyAppointmentMethod = EmployeeServicesGrpc.getModifyAppointmentMethod) == null) {
          EmployeeServicesGrpc.getModifyAppointmentMethod = getModifyAppointmentMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.AppointmentOuterClass.Appointment, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyAppointment"))
              .build();
        }
      }
    }
    return getModifyAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Patient,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse> getModifyPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyPatient",
      requestType = com.git_commit_therapy.proto.UserOuterClass.Patient.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Patient,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse> getModifyPatientMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Patient, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse> getModifyPatientMethod;
    if ((getModifyPatientMethod = EmployeeServicesGrpc.getModifyPatientMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyPatientMethod = EmployeeServicesGrpc.getModifyPatientMethod) == null) {
          EmployeeServicesGrpc.getModifyPatientMethod = getModifyPatientMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.UserOuterClass.Patient, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Patient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyPatient"))
              .build();
        }
      }
    }
    return getModifyPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Doctor,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse> getModifyDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyDoctor",
      requestType = com.git_commit_therapy.proto.UserOuterClass.Doctor.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Doctor,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse> getModifyDoctorMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Doctor, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse> getModifyDoctorMethod;
    if ((getModifyDoctorMethod = EmployeeServicesGrpc.getModifyDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyDoctorMethod = EmployeeServicesGrpc.getModifyDoctorMethod) == null) {
          EmployeeServicesGrpc.getModifyDoctorMethod = getModifyDoctorMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.UserOuterClass.Doctor, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Doctor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyDoctor"))
              .build();
        }
      }
    }
    return getModifyDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Staff,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse> getModifyStaffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyStaff",
      requestType = com.git_commit_therapy.proto.UserOuterClass.Staff.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Staff,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse> getModifyStaffMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.UserOuterClass.Staff, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse> getModifyStaffMethod;
    if ((getModifyStaffMethod = EmployeeServicesGrpc.getModifyStaffMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyStaffMethod = EmployeeServicesGrpc.getModifyStaffMethod) == null) {
          EmployeeServicesGrpc.getModifyStaffMethod = getModifyStaffMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.UserOuterClass.Staff, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyStaff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.UserOuterClass.Staff.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyStaff"))
              .build();
        }
      }
    }
    return getModifyStaffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse> getModifyMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyMedicalEvent",
      requestType = com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse> getModifyMedicalEventMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse> getModifyMedicalEventMethod;
    if ((getModifyMedicalEventMethod = EmployeeServicesGrpc.getModifyMedicalEventMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyMedicalEventMethod = EmployeeServicesGrpc.getModifyMedicalEventMethod) == null) {
          EmployeeServicesGrpc.getModifyMedicalEventMethod = getModifyMedicalEventMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyMedicalEvent"))
              .build();
        }
      }
    }
    return getModifyMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse> getModifyMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyMedicalExam",
      requestType = com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse> getModifyMedicalExamMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse> getModifyMedicalExamMethod;
    if ((getModifyMedicalExamMethod = EmployeeServicesGrpc.getModifyMedicalExamMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyMedicalExamMethod = EmployeeServicesGrpc.getModifyMedicalExamMethod) == null) {
          EmployeeServicesGrpc.getModifyMedicalExamMethod = getModifyMedicalExamMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyMedicalExam"))
              .build();
        }
      }
    }
    return getModifyMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse> getModifyMedicalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyMedicalInfo",
      requestType = com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo.class,
      responseType = com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo,
      com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse> getModifyMedicalInfoMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse> getModifyMedicalInfoMethod;
    if ((getModifyMedicalInfoMethod = EmployeeServicesGrpc.getModifyMedicalInfoMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyMedicalInfoMethod = EmployeeServicesGrpc.getModifyMedicalInfoMethod) == null) {
          EmployeeServicesGrpc.getModifyMedicalInfoMethod = getModifyMedicalInfoMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo, com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyMedicalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyMedicalInfo"))
              .build();
        }
      }
    }
    return getModifyMedicalInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServicesStub>() {
        @java.lang.Override
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
        @java.lang.Override
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
        @java.lang.Override
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
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Doctor> responseObserver) {
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
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Staff> responseObserver) {
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
     *Get Patient data
     * </pre>
     */
    default void getPatient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Patient> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    default void getAllPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPatientsMethod(), responseObserver);
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
     * Get a list of appointments
     * </pre>
     */
    default void getAppointmentsFromDoctor(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentsFromDoctorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    default void getAppointmentDetails(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentDetailsMethod(), responseObserver);
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
     * Get details for a specific medical exam
     * </pre>
     */
    default void getMedicalExamDetails(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicalExamDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    default void getAllMedicalEvent(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    default void getMedicalEventDetails(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicalEventDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    default void getAllWard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllWardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    default void createMedicalExam(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    default void createMedicalEvent(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    default void createMedicalInfo(com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    default void createAppointment(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    default void createPatient(com.git_commit_therapy.proto.UserOuterClass.Patient request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    default void createDoctor(com.git_commit_therapy.proto.UserOuterClass.Doctor request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDoctorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    default void createStaff(com.git_commit_therapy.proto.UserOuterClass.Staff request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStaffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    default void createWard(com.git_commit_therapy.proto.WardOuterClass.Ward request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    default void modifyAppointment(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    default void modifyPatient(com.git_commit_therapy.proto.UserOuterClass.Patient request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    default void modifyDoctor(com.git_commit_therapy.proto.UserOuterClass.Doctor request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyDoctorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    default void modifyStaff(com.git_commit_therapy.proto.UserOuterClass.Staff request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyStaffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    default void modifyMedicalEvent(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    default void modifyMedicalExam(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    default void modifyMedicalInfo(com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyMedicalInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeServices.
   */
  public static abstract class EmployeeServicesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
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

    @java.lang.Override
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
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Doctor> responseObserver) {
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
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Staff> responseObserver) {
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
     *Get Patient data
     * </pre>
     */
    public void getPatient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Patient> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    public void getAllPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request, responseObserver);
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
     * Get a list of appointments
     * </pre>
     */
    public void getAppointmentsFromDoctor(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentsFromDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public void getAppointmentDetails(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentDetailsMethod(), getCallOptions()), request, responseObserver);
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
     * Get details for a specific medical exam
     * </pre>
     */
    public void getMedicalExamDetails(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public void getAllMedicalEvent(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public void getMedicalEventDetails(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicalEventDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    public void getAllWard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllWardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public void createMedicalExam(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public void createMedicalEvent(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public void createMedicalInfo(com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public void createAppointment(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public void createPatient(com.git_commit_therapy.proto.UserOuterClass.Patient request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public void createDoctor(com.git_commit_therapy.proto.UserOuterClass.Doctor request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    public void createStaff(com.git_commit_therapy.proto.UserOuterClass.Staff request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStaffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public void createWard(com.git_commit_therapy.proto.WardOuterClass.Ward request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public void modifyAppointment(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    public void modifyPatient(com.git_commit_therapy.proto.UserOuterClass.Patient request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    public void modifyDoctor(com.git_commit_therapy.proto.UserOuterClass.Doctor request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    public void modifyStaff(com.git_commit_therapy.proto.UserOuterClass.Staff request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyStaffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    public void modifyMedicalEvent(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public void modifyMedicalExam(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public void modifyMedicalInfo(com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyMedicalInfoMethod(), getCallOptions()), request, responseObserver);
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

    @java.lang.Override
    protected EmployeeServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Doctor data
     * </pre>
     */
    public com.git_commit_therapy.proto.UserOuterClass.Doctor getDoctor(com.google.protobuf.Empty request) {
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
    public com.git_commit_therapy.proto.UserOuterClass.Staff getStaff(com.google.protobuf.Empty request) {
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
     *Get Patient data
     * </pre>
     */
    public com.git_commit_therapy.proto.UserOuterClass.Patient getPatient(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse getAllPatients(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPatientsMethod(), getCallOptions(), request);
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
     * Get a list of appointments
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse getAppointmentsFromDoctor(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentsFromDoctorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse getAppointmentDetails(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentDetailsMethod(), getCallOptions(), request);
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
     * Get details for a specific medical exam
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse getMedicalExamDetails(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicalExamDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse getAllMedicalEvent(com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse getMedicalEventDetails(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicalEventDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse getAllWard(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllWardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse createMedicalExam(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse createMedicalEvent(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse createMedicalInfo(com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse createAppointment(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse createPatient(com.git_commit_therapy.proto.UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse createDoctor(com.git_commit_therapy.proto.UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDoctorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse createStaff(com.git_commit_therapy.proto.UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStaffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse createWard(com.git_commit_therapy.proto.WardOuterClass.Ward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse modifyAppointment(com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse modifyPatient(com.git_commit_therapy.proto.UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse modifyDoctor(com.git_commit_therapy.proto.UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyDoctorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse modifyStaff(com.git_commit_therapy.proto.UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyStaffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse modifyMedicalEvent(com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse modifyMedicalExam(com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse modifyMedicalInfo(com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyMedicalInfoMethod(), getCallOptions(), request);
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

    @java.lang.Override
    protected EmployeeServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Doctor data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.UserOuterClass.Doctor> getDoctor(
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
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.UserOuterClass.Staff> getStaff(
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
     *Get Patient data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.UserOuterClass.Patient> getPatient(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse> getAllPatients(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request);
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
     * Get a list of appointments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getAppointmentsFromDoctor(
        com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentsFromDoctorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getAppointmentDetails(
        com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentDetailsMethod(), getCallOptions()), request);
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
     * Get details for a specific medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getMedicalExamDetails(
        com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse> getAllMedicalEvent(
        com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getMedicalEventDetails(
        com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicalEventDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse> getAllWard(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllWardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse> createMedicalExam(
        com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse> createMedicalEvent(
        com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse> createMedicalInfo(
        com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse> createAppointment(
        com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse> createPatient(
        com.git_commit_therapy.proto.UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse> createDoctor(
        com.git_commit_therapy.proto.UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDoctorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse> createStaff(
        com.git_commit_therapy.proto.UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStaffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse> createWard(
        com.git_commit_therapy.proto.WardOuterClass.Ward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse> modifyAppointment(
        com.git_commit_therapy.proto.AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse> modifyPatient(
        com.git_commit_therapy.proto.UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse> modifyDoctor(
        com.git_commit_therapy.proto.UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyDoctorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse> modifyStaff(
        com.git_commit_therapy.proto.UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyStaffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse> modifyMedicalEvent(
        com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse> modifyMedicalExam(
        com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse> modifyMedicalInfo(
        com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyMedicalInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCTOR = 0;
  private static final int METHODID_GET_ALL_DOCTORS = 1;
  private static final int METHODID_GET_STAFF = 2;
  private static final int METHODID_GET_ALL_STAFFS = 3;
  private static final int METHODID_GET_PATIENT = 4;
  private static final int METHODID_GET_ALL_PATIENTS = 5;
  private static final int METHODID_GET_APPOINTMENTS = 6;
  private static final int METHODID_GET_APPOINTMENTS_FROM_DOCTOR = 7;
  private static final int METHODID_GET_APPOINTMENT_DETAILS = 8;
  private static final int METHODID_GET_ALL_MEDICAL_EXAM = 9;
  private static final int METHODID_GET_MEDICAL_EXAM_DETAILS = 10;
  private static final int METHODID_GET_ALL_MEDICAL_EVENT = 11;
  private static final int METHODID_GET_MEDICAL_EVENT_DETAILS = 12;
  private static final int METHODID_GET_ALL_WARD = 13;
  private static final int METHODID_CREATE_MEDICAL_EXAM = 14;
  private static final int METHODID_CREATE_MEDICAL_EVENT = 15;
  private static final int METHODID_CREATE_MEDICAL_INFO = 16;
  private static final int METHODID_CREATE_APPOINTMENT = 17;
  private static final int METHODID_CREATE_PATIENT = 18;
  private static final int METHODID_CREATE_DOCTOR = 19;
  private static final int METHODID_CREATE_STAFF = 20;
  private static final int METHODID_CREATE_WARD = 21;
  private static final int METHODID_MODIFY_APPOINTMENT = 22;
  private static final int METHODID_MODIFY_PATIENT = 23;
  private static final int METHODID_MODIFY_DOCTOR = 24;
  private static final int METHODID_MODIFY_STAFF = 25;
  private static final int METHODID_MODIFY_MEDICAL_EVENT = 26;
  private static final int METHODID_MODIFY_MEDICAL_EXAM = 27;
  private static final int METHODID_MODIFY_MEDICAL_INFO = 28;

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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOCTOR:
          serviceImpl.getDoctor((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Doctor>) responseObserver);
          break;
        case METHODID_GET_ALL_DOCTORS:
          serviceImpl.getAllDoctors((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllDoctorsResponse>) responseObserver);
          break;
        case METHODID_GET_STAFF:
          serviceImpl.getStaff((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Staff>) responseObserver);
          break;
        case METHODID_GET_ALL_STAFFS:
          serviceImpl.getAllStaffs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse>) responseObserver);
          break;
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.UserOuterClass.Patient>) responseObserver);
          break;
        case METHODID_GET_ALL_PATIENTS:
          serviceImpl.getAllPatients((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS:
          serviceImpl.getAppointments((com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS_FROM_DOCTOR:
          serviceImpl.getAppointmentsFromDoctor((com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENT_DETAILS:
          serviceImpl.getAppointmentDetails((com.git_commit_therapy.proto.AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_EXAM:
          serviceImpl.getAllMedicalExam((com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse>) responseObserver);
          break;
        case METHODID_GET_MEDICAL_EXAM_DETAILS:
          serviceImpl.getMedicalExamDetails((com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_EVENT:
          serviceImpl.getAllMedicalEvent((com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse>) responseObserver);
          break;
        case METHODID_GET_MEDICAL_EVENT_DETAILS:
          serviceImpl.getMedicalEventDetails((com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_WARD:
          serviceImpl.getAllWard((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_EXAM:
          serviceImpl.createMedicalExam((com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_EVENT:
          serviceImpl.createMedicalEvent((com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_INFO:
          serviceImpl.createMedicalInfo((com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse>) responseObserver);
          break;
        case METHODID_CREATE_APPOINTMENT:
          serviceImpl.createAppointment((com.git_commit_therapy.proto.AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse>) responseObserver);
          break;
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((com.git_commit_therapy.proto.UserOuterClass.Patient) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse>) responseObserver);
          break;
        case METHODID_CREATE_DOCTOR:
          serviceImpl.createDoctor((com.git_commit_therapy.proto.UserOuterClass.Doctor) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse>) responseObserver);
          break;
        case METHODID_CREATE_STAFF:
          serviceImpl.createStaff((com.git_commit_therapy.proto.UserOuterClass.Staff) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse>) responseObserver);
          break;
        case METHODID_CREATE_WARD:
          serviceImpl.createWard((com.git_commit_therapy.proto.WardOuterClass.Ward) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse>) responseObserver);
          break;
        case METHODID_MODIFY_APPOINTMENT:
          serviceImpl.modifyAppointment((com.git_commit_therapy.proto.AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PATIENT:
          serviceImpl.modifyPatient((com.git_commit_therapy.proto.UserOuterClass.Patient) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse>) responseObserver);
          break;
        case METHODID_MODIFY_DOCTOR:
          serviceImpl.modifyDoctor((com.git_commit_therapy.proto.UserOuterClass.Doctor) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse>) responseObserver);
          break;
        case METHODID_MODIFY_STAFF:
          serviceImpl.modifyStaff((com.git_commit_therapy.proto.UserOuterClass.Staff) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MEDICAL_EVENT:
          serviceImpl.modifyMedicalEvent((com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MEDICAL_EXAM:
          serviceImpl.modifyMedicalExam((com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MEDICAL_INFO:
          serviceImpl.modifyMedicalInfo((com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.UserOuterClass.Doctor>(
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
              com.git_commit_therapy.proto.UserOuterClass.Staff>(
                service, METHODID_GET_STAFF)))
        .addMethod(
          getGetAllStaffsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllStaffsResponse>(
                service, METHODID_GET_ALL_STAFFS)))
        .addMethod(
          getGetPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.UserOuterClass.Patient>(
                service, METHODID_GET_PATIENT)))
        .addMethod(
          getGetAllPatientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllPatientsResponse>(
                service, METHODID_GET_ALL_PATIENTS)))
        .addMethod(
          getGetAppointmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsRequest,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsResponse>(
                service, METHODID_GET_APPOINTMENTS)))
        .addMethod(
          getGetAppointmentsFromDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse>(
                service, METHODID_GET_APPOINTMENTS_FROM_DOCTOR)))
        .addMethod(
          getGetAppointmentDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAppointmentDetailsResponse>(
                service, METHODID_GET_APPOINTMENT_DETAILS)))
        .addMethod(
          getGetAllMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamRequest,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalExamResponse>(
                service, METHODID_GET_ALL_MEDICAL_EXAM)))
        .addMethod(
          getGetMedicalExamDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>(
                service, METHODID_GET_MEDICAL_EXAM_DETAILS)))
        .addMethod(
          getGetAllMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventRequest,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllMedicalEventResponse>(
                service, METHODID_GET_ALL_MEDICAL_EVENT)))
        .addMethod(
          getGetMedicalEventDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetMedicalEventDetailsResponse>(
                service, METHODID_GET_MEDICAL_EVENT_DETAILS)))
        .addMethod(
          getGetAllWardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.GetAllWardResponse>(
                service, METHODID_GET_ALL_WARD)))
        .addMethod(
          getCreateMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalExamResponse>(
                service, METHODID_CREATE_MEDICAL_EXAM)))
        .addMethod(
          getCreateMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalEventResponse>(
                service, METHODID_CREATE_MEDICAL_EVENT)))
        .addMethod(
          getCreateMedicalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateMedicalInfoResponse>(
                service, METHODID_CREATE_MEDICAL_INFO)))
        .addMethod(
          getCreateAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateAppointmentResponse>(
                service, METHODID_CREATE_APPOINTMENT)))
        .addMethod(
          getCreatePatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.UserOuterClass.Patient,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreatePatientResponse>(
                service, METHODID_CREATE_PATIENT)))
        .addMethod(
          getCreateDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.UserOuterClass.Doctor,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateDoctorResponse>(
                service, METHODID_CREATE_DOCTOR)))
        .addMethod(
          getCreateStaffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.UserOuterClass.Staff,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateStaffResponse>(
                service, METHODID_CREATE_STAFF)))
        .addMethod(
          getCreateWardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.WardOuterClass.Ward,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.CreateWardResponse>(
                service, METHODID_CREATE_WARD)))
        .addMethod(
          getModifyAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.AppointmentOuterClass.Appointment,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyAppointmentResponse>(
                service, METHODID_MODIFY_APPOINTMENT)))
        .addMethod(
          getModifyPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.UserOuterClass.Patient,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyPatientResponse>(
                service, METHODID_MODIFY_PATIENT)))
        .addMethod(
          getModifyDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.UserOuterClass.Doctor,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyDoctorResponse>(
                service, METHODID_MODIFY_DOCTOR)))
        .addMethod(
          getModifyStaffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.UserOuterClass.Staff,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyStaffResponse>(
                service, METHODID_MODIFY_STAFF)))
        .addMethod(
          getModifyMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalEventOuterClass.MedicalEvent,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalEventResponse>(
                service, METHODID_MODIFY_MEDICAL_EVENT)))
        .addMethod(
          getModifyMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalExamOuterClass.MedicalExam,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalExamResponse>(
                service, METHODID_MODIFY_MEDICAL_EXAM)))
        .addMethod(
          getModifyMedicalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.MedicalInfoOuterClass.MedicalInfo,
              com.git_commit_therapy.proto.EmployeeServicesOuterClass.ModifyMedicalInfoResponse>(
                service, METHODID_MODIFY_MEDICAL_INFO)))
        .build();
  }

  private static abstract class EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.git_commit_therapy.proto.EmployeeServicesOuterClass.getDescriptor();
    }

    @java.lang.Override
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
    private final java.lang.String methodName;

    EmployeeServicesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmployeeServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServicesFileDescriptorSupplier())
              .addMethod(getGetDoctorMethod())
              .addMethod(getGetAllDoctorsMethod())
              .addMethod(getGetStaffMethod())
              .addMethod(getGetAllStaffsMethod())
              .addMethod(getGetPatientMethod())
              .addMethod(getGetAllPatientsMethod())
              .addMethod(getGetAppointmentsMethod())
              .addMethod(getGetAppointmentsFromDoctorMethod())
              .addMethod(getGetAppointmentDetailsMethod())
              .addMethod(getGetAllMedicalExamMethod())
              .addMethod(getGetMedicalExamDetailsMethod())
              .addMethod(getGetAllMedicalEventMethod())
              .addMethod(getGetMedicalEventDetailsMethod())
              .addMethod(getGetAllWardMethod())
              .addMethod(getCreateMedicalExamMethod())
              .addMethod(getCreateMedicalEventMethod())
              .addMethod(getCreateMedicalInfoMethod())
              .addMethod(getCreateAppointmentMethod())
              .addMethod(getCreatePatientMethod())
              .addMethod(getCreateDoctorMethod())
              .addMethod(getCreateStaffMethod())
              .addMethod(getCreateWardMethod())
              .addMethod(getModifyAppointmentMethod())
              .addMethod(getModifyPatientMethod())
              .addMethod(getModifyDoctorMethod())
              .addMethod(getModifyStaffMethod())
              .addMethod(getModifyMedicalEventMethod())
              .addMethod(getModifyMedicalExamMethod())
              .addMethod(getModifyMedicalInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
