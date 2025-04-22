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
      EmployeeServicesOuterClass.GetAllDoctorsResponse> getGetAllDoctorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllDoctors",
      requestType = com.google.protobuf.Empty.class,
      responseType = EmployeeServicesOuterClass.GetAllDoctorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      EmployeeServicesOuterClass.GetAllDoctorsResponse> getGetAllDoctorsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllDoctorsResponse> getGetAllDoctorsMethod;
    if ((getGetAllDoctorsMethod = EmployeeServicesGrpc.getGetAllDoctorsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllDoctorsMethod = EmployeeServicesGrpc.getGetAllDoctorsMethod) == null) {
          EmployeeServicesGrpc.getGetAllDoctorsMethod = getGetAllDoctorsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllDoctorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllDoctors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllDoctorsResponse.getDefaultInstance()))
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
      EmployeeServicesOuterClass.GetAllStaffsResponse> getGetAllStaffsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStaffs",
      requestType = com.google.protobuf.Empty.class,
      responseType = EmployeeServicesOuterClass.GetAllStaffsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      EmployeeServicesOuterClass.GetAllStaffsResponse> getGetAllStaffsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllStaffsResponse> getGetAllStaffsMethod;
    if ((getGetAllStaffsMethod = EmployeeServicesGrpc.getGetAllStaffsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllStaffsMethod = EmployeeServicesGrpc.getGetAllStaffsMethod) == null) {
          EmployeeServicesGrpc.getGetAllStaffsMethod = getGetAllStaffsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllStaffsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStaffs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllStaffsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllStaffs"))
              .build();
        }
      }
    }
    return getGetAllStaffsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Patient> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatient",
      requestType = com.google.protobuf.Empty.class,
      responseType = UserOuterClass.Patient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Patient> getGetPatientMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, UserOuterClass.Patient> getGetPatientMethod;
    if ((getGetPatientMethod = EmployeeServicesGrpc.getGetPatientMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetPatientMethod = EmployeeServicesGrpc.getGetPatientMethod) == null) {
          EmployeeServicesGrpc.getGetPatientMethod = getGetPatientMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, UserOuterClass.Patient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Patient.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetPatient"))
              .build();
        }
      }
    }
    return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      EmployeeServicesOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPatients",
      requestType = com.google.protobuf.Empty.class,
      responseType = EmployeeServicesOuterClass.GetAllPatientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      EmployeeServicesOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod;
    if ((getGetAllPatientsMethod = EmployeeServicesGrpc.getGetAllPatientsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllPatientsMethod = EmployeeServicesGrpc.getGetAllPatientsMethod) == null) {
          EmployeeServicesGrpc.getGetAllPatientsMethod = getGetAllPatientsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllPatientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllPatientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllPatients"))
              .build();
        }
      }
    }
    return getGetAllPatientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAppointmentsRequest,
      EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointments",
      requestType = EmployeeServicesOuterClass.GetAppointmentsRequest.class,
      responseType = EmployeeServicesOuterClass.GetAppointmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAppointmentsRequest,
      EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod() {
    io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAppointmentsRequest, EmployeeServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod;
    if ((getGetAppointmentsMethod = EmployeeServicesGrpc.getGetAppointmentsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAppointmentsMethod = EmployeeServicesGrpc.getGetAppointmentsMethod) == null) {
          EmployeeServicesGrpc.getGetAppointmentsMethod = getGetAppointmentsMethod =
              io.grpc.MethodDescriptor.<EmployeeServicesOuterClass.GetAppointmentsRequest, EmployeeServicesOuterClass.GetAppointmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAppointmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAppointmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAppointments"))
              .build();
        }
      }
    }
    return getGetAppointmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest,
      EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getGetAppointmentsFromDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentsFromDoctor",
      requestType = EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest.class,
      responseType = EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest,
      EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getGetAppointmentsFromDoctorMethod() {
    io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest, EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getGetAppointmentsFromDoctorMethod;
    if ((getGetAppointmentsFromDoctorMethod = EmployeeServicesGrpc.getGetAppointmentsFromDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAppointmentsFromDoctorMethod = EmployeeServicesGrpc.getGetAppointmentsFromDoctorMethod) == null) {
          EmployeeServicesGrpc.getGetAppointmentsFromDoctorMethod = getGetAppointmentsFromDoctorMethod =
              io.grpc.MethodDescriptor.<EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest, EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentsFromDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAppointmentsFromDoctor"))
              .build();
        }
      }
    }
    return getGetAppointmentsFromDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getGetAppointmentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentDetails",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = EmployeeServicesOuterClass.GetAppointmentDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getGetAppointmentDetailsMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getGetAppointmentDetailsMethod;
    if ((getGetAppointmentDetailsMethod = EmployeeServicesGrpc.getGetAppointmentDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAppointmentDetailsMethod = EmployeeServicesGrpc.getGetAppointmentDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetAppointmentDetailsMethod = getGetAppointmentDetailsMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, EmployeeServicesOuterClass.GetAppointmentDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAppointmentDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAppointmentDetails"))
              .build();
        }
      }
    }
    return getGetAppointmentDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAllMedicalExamRequest,
      EmployeeServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMedicalExam",
      requestType = EmployeeServicesOuterClass.GetAllMedicalExamRequest.class,
      responseType = EmployeeServicesOuterClass.GetAllMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAllMedicalExamRequest,
      EmployeeServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod() {
    io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAllMedicalExamRequest, EmployeeServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod;
    if ((getGetAllMedicalExamMethod = EmployeeServicesGrpc.getGetAllMedicalExamMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllMedicalExamMethod = EmployeeServicesGrpc.getGetAllMedicalExamMethod) == null) {
          EmployeeServicesGrpc.getGetAllMedicalExamMethod = getGetAllMedicalExamMethod =
              io.grpc.MethodDescriptor.<EmployeeServicesOuterClass.GetAllMedicalExamRequest, EmployeeServicesOuterClass.GetAllMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllMedicalExamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllMedicalExam"))
              .build();
        }
      }
    }
    return getGetAllMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMedicalExamDetails",
      requestType = MedicalExamOuterClass.MedicalExam.class,
      responseType = EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod() {
    io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam, EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;
    if ((getGetMedicalExamDetailsMethod = EmployeeServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetMedicalExamDetailsMethod = EmployeeServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetMedicalExamDetailsMethod = getGetMedicalExamDetailsMethod =
              io.grpc.MethodDescriptor.<MedicalExamOuterClass.MedicalExam, EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMedicalExamDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetMedicalExamDetails"))
              .build();
        }
      }
    }
    return getGetMedicalExamDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAllMedicalEventRequest,
      EmployeeServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMedicalEvent",
      requestType = EmployeeServicesOuterClass.GetAllMedicalEventRequest.class,
      responseType = EmployeeServicesOuterClass.GetAllMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAllMedicalEventRequest,
      EmployeeServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod() {
    io.grpc.MethodDescriptor<EmployeeServicesOuterClass.GetAllMedicalEventRequest, EmployeeServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod;
    if ((getGetAllMedicalEventMethod = EmployeeServicesGrpc.getGetAllMedicalEventMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllMedicalEventMethod = EmployeeServicesGrpc.getGetAllMedicalEventMethod) == null) {
          EmployeeServicesGrpc.getGetAllMedicalEventMethod = getGetAllMedicalEventMethod =
              io.grpc.MethodDescriptor.<EmployeeServicesOuterClass.GetAllMedicalEventRequest, EmployeeServicesOuterClass.GetAllMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllMedicalEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllMedicalEvent"))
              .build();
        }
      }
    }
    return getGetAllMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getGetMedicalEventDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMedicalEventDetails",
      requestType = MedicalEventOuterClass.MedicalEvent.class,
      responseType = EmployeeServicesOuterClass.GetMedicalEventDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getGetMedicalEventDetailsMethod() {
    io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent, EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getGetMedicalEventDetailsMethod;
    if ((getGetMedicalEventDetailsMethod = EmployeeServicesGrpc.getGetMedicalEventDetailsMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetMedicalEventDetailsMethod = EmployeeServicesGrpc.getGetMedicalEventDetailsMethod) == null) {
          EmployeeServicesGrpc.getGetMedicalEventDetailsMethod = getGetMedicalEventDetailsMethod =
              io.grpc.MethodDescriptor.<MedicalEventOuterClass.MedicalEvent, EmployeeServicesOuterClass.GetMedicalEventDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMedicalEventDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalEventOuterClass.MedicalEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetMedicalEventDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetMedicalEventDetails"))
              .build();
        }
      }
    }
    return getGetMedicalEventDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      EmployeeServicesOuterClass.GetAllWardResponse> getGetAllWardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllWard",
      requestType = com.google.protobuf.Empty.class,
      responseType = EmployeeServicesOuterClass.GetAllWardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      EmployeeServicesOuterClass.GetAllWardResponse> getGetAllWardMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllWardResponse> getGetAllWardMethod;
    if ((getGetAllWardMethod = EmployeeServicesGrpc.getGetAllWardMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllWardMethod = EmployeeServicesGrpc.getGetAllWardMethod) == null) {
          EmployeeServicesGrpc.getGetAllWardMethod = getGetAllWardMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, EmployeeServicesOuterClass.GetAllWardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllWard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.GetAllWardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("GetAllWard"))
              .build();
        }
      }
    }
    return getGetAllWardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalExam",
      requestType = MedicalExamOuterClass.MedicalExam.class,
      responseType = EmployeeServicesOuterClass.CreateMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod() {
    io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam, EmployeeServicesOuterClass.CreateMedicalExamResponse> getCreateMedicalExamMethod;
    if ((getCreateMedicalExamMethod = EmployeeServicesGrpc.getCreateMedicalExamMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalExamMethod = EmployeeServicesGrpc.getCreateMedicalExamMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalExamMethod = getCreateMedicalExamMethod =
              io.grpc.MethodDescriptor.<MedicalExamOuterClass.MedicalExam, EmployeeServicesOuterClass.CreateMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreateMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalExam"))
              .build();
        }
      }
    }
    return getCreateMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalEvent",
      requestType = MedicalEventOuterClass.MedicalEvent.class,
      responseType = EmployeeServicesOuterClass.CreateMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod() {
    io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent, EmployeeServicesOuterClass.CreateMedicalEventResponse> getCreateMedicalEventMethod;
    if ((getCreateMedicalEventMethod = EmployeeServicesGrpc.getCreateMedicalEventMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalEventMethod = EmployeeServicesGrpc.getCreateMedicalEventMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalEventMethod = getCreateMedicalEventMethod =
              io.grpc.MethodDescriptor.<MedicalEventOuterClass.MedicalEvent, EmployeeServicesOuterClass.CreateMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalEventOuterClass.MedicalEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreateMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalEvent"))
              .build();
        }
      }
    }
    return getCreateMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo,
      EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMedicalInfo",
      requestType = MedicalInfoOuterClass.MedicalInfo.class,
      responseType = EmployeeServicesOuterClass.CreateMedicalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo,
      EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod() {
    io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo, EmployeeServicesOuterClass.CreateMedicalInfoResponse> getCreateMedicalInfoMethod;
    if ((getCreateMedicalInfoMethod = EmployeeServicesGrpc.getCreateMedicalInfoMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateMedicalInfoMethod = EmployeeServicesGrpc.getCreateMedicalInfoMethod) == null) {
          EmployeeServicesGrpc.getCreateMedicalInfoMethod = getCreateMedicalInfoMethod =
              io.grpc.MethodDescriptor.<MedicalInfoOuterClass.MedicalInfo, EmployeeServicesOuterClass.CreateMedicalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMedicalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalInfoOuterClass.MedicalInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreateMedicalInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateMedicalInfo"))
              .build();
        }
      }
    }
    return getCreateMedicalInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAppointment",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = EmployeeServicesOuterClass.CreateAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, EmployeeServicesOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;
    if ((getCreateAppointmentMethod = EmployeeServicesGrpc.getCreateAppointmentMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateAppointmentMethod = EmployeeServicesGrpc.getCreateAppointmentMethod) == null) {
          EmployeeServicesGrpc.getCreateAppointmentMethod = getCreateAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, EmployeeServicesOuterClass.CreateAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreateAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateAppointment"))
              .build();
        }
      }
    }
    return getCreateAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserOuterClass.Patient,
      EmployeeServicesOuterClass.CreatePatientResponse> getCreatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatient",
      requestType = UserOuterClass.Patient.class,
      responseType = EmployeeServicesOuterClass.CreatePatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserOuterClass.Patient,
      EmployeeServicesOuterClass.CreatePatientResponse> getCreatePatientMethod() {
    io.grpc.MethodDescriptor<UserOuterClass.Patient, EmployeeServicesOuterClass.CreatePatientResponse> getCreatePatientMethod;
    if ((getCreatePatientMethod = EmployeeServicesGrpc.getCreatePatientMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreatePatientMethod = EmployeeServicesGrpc.getCreatePatientMethod) == null) {
          EmployeeServicesGrpc.getCreatePatientMethod = getCreatePatientMethod =
              io.grpc.MethodDescriptor.<UserOuterClass.Patient, EmployeeServicesOuterClass.CreatePatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Patient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreatePatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreatePatient"))
              .build();
        }
      }
    }
    return getCreatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserOuterClass.Doctor,
      EmployeeServicesOuterClass.CreateDoctorResponse> getCreateDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDoctor",
      requestType = UserOuterClass.Doctor.class,
      responseType = EmployeeServicesOuterClass.CreateDoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserOuterClass.Doctor,
      EmployeeServicesOuterClass.CreateDoctorResponse> getCreateDoctorMethod() {
    io.grpc.MethodDescriptor<UserOuterClass.Doctor, EmployeeServicesOuterClass.CreateDoctorResponse> getCreateDoctorMethod;
    if ((getCreateDoctorMethod = EmployeeServicesGrpc.getCreateDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateDoctorMethod = EmployeeServicesGrpc.getCreateDoctorMethod) == null) {
          EmployeeServicesGrpc.getCreateDoctorMethod = getCreateDoctorMethod =
              io.grpc.MethodDescriptor.<UserOuterClass.Doctor, EmployeeServicesOuterClass.CreateDoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Doctor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreateDoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateDoctor"))
              .build();
        }
      }
    }
    return getCreateDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserOuterClass.Staff,
      EmployeeServicesOuterClass.CreateStaffResponse> getCreateStaffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStaff",
      requestType = UserOuterClass.Staff.class,
      responseType = EmployeeServicesOuterClass.CreateStaffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserOuterClass.Staff,
      EmployeeServicesOuterClass.CreateStaffResponse> getCreateStaffMethod() {
    io.grpc.MethodDescriptor<UserOuterClass.Staff, EmployeeServicesOuterClass.CreateStaffResponse> getCreateStaffMethod;
    if ((getCreateStaffMethod = EmployeeServicesGrpc.getCreateStaffMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateStaffMethod = EmployeeServicesGrpc.getCreateStaffMethod) == null) {
          EmployeeServicesGrpc.getCreateStaffMethod = getCreateStaffMethod =
              io.grpc.MethodDescriptor.<UserOuterClass.Staff, EmployeeServicesOuterClass.CreateStaffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStaff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Staff.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreateStaffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateStaff"))
              .build();
        }
      }
    }
    return getCreateStaffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<WardOuterClass.Ward,
      EmployeeServicesOuterClass.CreateWardResponse> getCreateWardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWard",
      requestType = WardOuterClass.Ward.class,
      responseType = EmployeeServicesOuterClass.CreateWardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WardOuterClass.Ward,
      EmployeeServicesOuterClass.CreateWardResponse> getCreateWardMethod() {
    io.grpc.MethodDescriptor<WardOuterClass.Ward, EmployeeServicesOuterClass.CreateWardResponse> getCreateWardMethod;
    if ((getCreateWardMethod = EmployeeServicesGrpc.getCreateWardMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getCreateWardMethod = EmployeeServicesGrpc.getCreateWardMethod) == null) {
          EmployeeServicesGrpc.getCreateWardMethod = getCreateWardMethod =
              io.grpc.MethodDescriptor.<WardOuterClass.Ward, EmployeeServicesOuterClass.CreateWardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WardOuterClass.Ward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.CreateWardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("CreateWard"))
              .build();
        }
      }
    }
    return getCreateWardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyAppointment",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = EmployeeServicesOuterClass.ModifyAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, EmployeeServicesOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;
    if ((getModifyAppointmentMethod = EmployeeServicesGrpc.getModifyAppointmentMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyAppointmentMethod = EmployeeServicesGrpc.getModifyAppointmentMethod) == null) {
          EmployeeServicesGrpc.getModifyAppointmentMethod = getModifyAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, EmployeeServicesOuterClass.ModifyAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.ModifyAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyAppointment"))
              .build();
        }
      }
    }
    return getModifyAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserOuterClass.Patient,
      EmployeeServicesOuterClass.ModifyPatientResponse> getModifyPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyPatient",
      requestType = UserOuterClass.Patient.class,
      responseType = EmployeeServicesOuterClass.ModifyPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserOuterClass.Patient,
      EmployeeServicesOuterClass.ModifyPatientResponse> getModifyPatientMethod() {
    io.grpc.MethodDescriptor<UserOuterClass.Patient, EmployeeServicesOuterClass.ModifyPatientResponse> getModifyPatientMethod;
    if ((getModifyPatientMethod = EmployeeServicesGrpc.getModifyPatientMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyPatientMethod = EmployeeServicesGrpc.getModifyPatientMethod) == null) {
          EmployeeServicesGrpc.getModifyPatientMethod = getModifyPatientMethod =
              io.grpc.MethodDescriptor.<UserOuterClass.Patient, EmployeeServicesOuterClass.ModifyPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Patient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.ModifyPatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyPatient"))
              .build();
        }
      }
    }
    return getModifyPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserOuterClass.Doctor,
      EmployeeServicesOuterClass.ModifyDoctorResponse> getModifyDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyDoctor",
      requestType = UserOuterClass.Doctor.class,
      responseType = EmployeeServicesOuterClass.ModifyDoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserOuterClass.Doctor,
      EmployeeServicesOuterClass.ModifyDoctorResponse> getModifyDoctorMethod() {
    io.grpc.MethodDescriptor<UserOuterClass.Doctor, EmployeeServicesOuterClass.ModifyDoctorResponse> getModifyDoctorMethod;
    if ((getModifyDoctorMethod = EmployeeServicesGrpc.getModifyDoctorMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyDoctorMethod = EmployeeServicesGrpc.getModifyDoctorMethod) == null) {
          EmployeeServicesGrpc.getModifyDoctorMethod = getModifyDoctorMethod =
              io.grpc.MethodDescriptor.<UserOuterClass.Doctor, EmployeeServicesOuterClass.ModifyDoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Doctor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.ModifyDoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyDoctor"))
              .build();
        }
      }
    }
    return getModifyDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserOuterClass.Staff,
      EmployeeServicesOuterClass.ModifyStaffResponse> getModifyStaffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyStaff",
      requestType = UserOuterClass.Staff.class,
      responseType = EmployeeServicesOuterClass.ModifyStaffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserOuterClass.Staff,
      EmployeeServicesOuterClass.ModifyStaffResponse> getModifyStaffMethod() {
    io.grpc.MethodDescriptor<UserOuterClass.Staff, EmployeeServicesOuterClass.ModifyStaffResponse> getModifyStaffMethod;
    if ((getModifyStaffMethod = EmployeeServicesGrpc.getModifyStaffMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyStaffMethod = EmployeeServicesGrpc.getModifyStaffMethod) == null) {
          EmployeeServicesGrpc.getModifyStaffMethod = getModifyStaffMethod =
              io.grpc.MethodDescriptor.<UserOuterClass.Staff, EmployeeServicesOuterClass.ModifyStaffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyStaff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Staff.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.ModifyStaffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyStaff"))
              .build();
        }
      }
    }
    return getModifyStaffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      EmployeeServicesOuterClass.ModifyMedicalEventResponse> getModifyMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyMedicalEvent",
      requestType = MedicalEventOuterClass.MedicalEvent.class,
      responseType = EmployeeServicesOuterClass.ModifyMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent,
      EmployeeServicesOuterClass.ModifyMedicalEventResponse> getModifyMedicalEventMethod() {
    io.grpc.MethodDescriptor<MedicalEventOuterClass.MedicalEvent, EmployeeServicesOuterClass.ModifyMedicalEventResponse> getModifyMedicalEventMethod;
    if ((getModifyMedicalEventMethod = EmployeeServicesGrpc.getModifyMedicalEventMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyMedicalEventMethod = EmployeeServicesGrpc.getModifyMedicalEventMethod) == null) {
          EmployeeServicesGrpc.getModifyMedicalEventMethod = getModifyMedicalEventMethod =
              io.grpc.MethodDescriptor.<MedicalEventOuterClass.MedicalEvent, EmployeeServicesOuterClass.ModifyMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalEventOuterClass.MedicalEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.ModifyMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyMedicalEvent"))
              .build();
        }
      }
    }
    return getModifyMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      EmployeeServicesOuterClass.ModifyMedicalExamResponse> getModifyMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyMedicalExam",
      requestType = MedicalExamOuterClass.MedicalExam.class,
      responseType = EmployeeServicesOuterClass.ModifyMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      EmployeeServicesOuterClass.ModifyMedicalExamResponse> getModifyMedicalExamMethod() {
    io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam, EmployeeServicesOuterClass.ModifyMedicalExamResponse> getModifyMedicalExamMethod;
    if ((getModifyMedicalExamMethod = EmployeeServicesGrpc.getModifyMedicalExamMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyMedicalExamMethod = EmployeeServicesGrpc.getModifyMedicalExamMethod) == null) {
          EmployeeServicesGrpc.getModifyMedicalExamMethod = getModifyMedicalExamMethod =
              io.grpc.MethodDescriptor.<MedicalExamOuterClass.MedicalExam, EmployeeServicesOuterClass.ModifyMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.ModifyMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("ModifyMedicalExam"))
              .build();
        }
      }
    }
    return getModifyMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo,
      EmployeeServicesOuterClass.ModifyMedicalInfoResponse> getModifyMedicalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyMedicalInfo",
      requestType = MedicalInfoOuterClass.MedicalInfo.class,
      responseType = EmployeeServicesOuterClass.ModifyMedicalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo,
      EmployeeServicesOuterClass.ModifyMedicalInfoResponse> getModifyMedicalInfoMethod() {
    io.grpc.MethodDescriptor<MedicalInfoOuterClass.MedicalInfo, EmployeeServicesOuterClass.ModifyMedicalInfoResponse> getModifyMedicalInfoMethod;
    if ((getModifyMedicalInfoMethod = EmployeeServicesGrpc.getModifyMedicalInfoMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getModifyMedicalInfoMethod = EmployeeServicesGrpc.getModifyMedicalInfoMethod) == null) {
          EmployeeServicesGrpc.getModifyMedicalInfoMethod = getModifyMedicalInfoMethod =
              io.grpc.MethodDescriptor.<MedicalInfoOuterClass.MedicalInfo, EmployeeServicesOuterClass.ModifyMedicalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyMedicalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalInfoOuterClass.MedicalInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmployeeServicesOuterClass.ModifyMedicalInfoResponse.getDefaultInstance()))
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
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllDoctorsResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllStaffsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStaffsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    default void getPatient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Patient> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    default void getAllPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllPatientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPatientsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    default void getAppointments(EmployeeServicesOuterClass.GetAppointmentsRequest request,
                                 io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    default void getAppointmentsFromDoctor(EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request,
                                           io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentsFromDoctorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    default void getAppointmentDetails(AppointmentOuterClass.Appointment request,
                                       io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    default void getAllMedicalExam(EmployeeServicesOuterClass.GetAllMedicalExamRequest request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    default void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request,
                                       io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicalExamDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    default void getAllMedicalEvent(EmployeeServicesOuterClass.GetAllMedicalEventRequest request,
                                    io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    default void getMedicalEventDetails(MedicalEventOuterClass.MedicalEvent request,
                                        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicalEventDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    default void getAllWard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllWardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllWardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    default void createMedicalExam(MedicalExamOuterClass.MedicalExam request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    default void createMedicalEvent(MedicalEventOuterClass.MedicalEvent request,
                                    io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    default void createMedicalInfo(MedicalInfoOuterClass.MedicalInfo request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMedicalInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    default void createAppointment(AppointmentOuterClass.Appointment request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    default void createPatient(UserOuterClass.Patient request,
                               io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreatePatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    default void createDoctor(UserOuterClass.Doctor request,
                              io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateDoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDoctorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    default void createStaff(UserOuterClass.Staff request,
                             io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateStaffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStaffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    default void createWard(WardOuterClass.Ward request,
                            io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateWardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    default void modifyAppointment(AppointmentOuterClass.Appointment request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    default void modifyPatient(UserOuterClass.Patient request,
                               io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyPatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    default void modifyDoctor(UserOuterClass.Doctor request,
                              io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyDoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyDoctorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    default void modifyStaff(UserOuterClass.Staff request,
                             io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyStaffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyStaffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    default void modifyMedicalEvent(MedicalEventOuterClass.MedicalEvent request,
                                    io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    default void modifyMedicalExam(MedicalExamOuterClass.MedicalExam request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    default void modifyMedicalInfo(MedicalInfoOuterClass.MedicalInfo request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyMedicalInfoMethod(), responseObserver);
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
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllDoctorsResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllStaffsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStaffsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    public void getPatient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Patient> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    public void getAllPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllPatientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public void getAppointments(EmployeeServicesOuterClass.GetAppointmentsRequest request,
                                io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public void getAppointmentsFromDoctor(EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request,
                                          io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentsFromDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public void getAppointmentDetails(AppointmentOuterClass.Appointment request,
                                      io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public void getAllMedicalExam(EmployeeServicesOuterClass.GetAllMedicalExamRequest request,
                                  io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request,
                                      io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public void getAllMedicalEvent(EmployeeServicesOuterClass.GetAllMedicalEventRequest request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public void getMedicalEventDetails(MedicalEventOuterClass.MedicalEvent request,
                                       io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicalEventDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    public void getAllWard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllWardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllWardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public void createMedicalExam(MedicalExamOuterClass.MedicalExam request,
                                  io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public void createMedicalEvent(MedicalEventOuterClass.MedicalEvent request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public void createMedicalInfo(MedicalInfoOuterClass.MedicalInfo request,
                                  io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMedicalInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public void createAppointment(AppointmentOuterClass.Appointment request,
                                  io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public void createPatient(UserOuterClass.Patient request,
                              io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreatePatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public void createDoctor(UserOuterClass.Doctor request,
                             io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateDoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    public void createStaff(UserOuterClass.Staff request,
                            io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateStaffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStaffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public void createWard(WardOuterClass.Ward request,
                           io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateWardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public void modifyAppointment(AppointmentOuterClass.Appointment request,
                                  io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    public void modifyPatient(UserOuterClass.Patient request,
                              io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyPatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    public void modifyDoctor(UserOuterClass.Doctor request,
                             io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyDoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    public void modifyStaff(UserOuterClass.Staff request,
                            io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyStaffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyStaffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    public void modifyMedicalEvent(MedicalEventOuterClass.MedicalEvent request,
                                   io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public void modifyMedicalExam(MedicalExamOuterClass.MedicalExam request,
                                  io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public void modifyMedicalInfo(MedicalInfoOuterClass.MedicalInfo request,
                                  io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalInfoResponse> responseObserver) {
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
    public EmployeeServicesOuterClass.GetAllDoctorsResponse getAllDoctors(com.google.protobuf.Empty request) {
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
    public EmployeeServicesOuterClass.GetAllStaffsResponse getAllStaffs(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStaffsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    public UserOuterClass.Patient getPatient(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    public EmployeeServicesOuterClass.GetAllPatientsResponse getAllPatients(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPatientsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public EmployeeServicesOuterClass.GetAppointmentsResponse getAppointments(EmployeeServicesOuterClass.GetAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse getAppointmentsFromDoctor(EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentsFromDoctorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public EmployeeServicesOuterClass.GetAppointmentDetailsResponse getAppointmentDetails(AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public EmployeeServicesOuterClass.GetAllMedicalExamResponse getAllMedicalExam(EmployeeServicesOuterClass.GetAllMedicalExamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public EmployeeServicesOuterClass.GetMedicalExamDetailsResponse getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicalExamDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public EmployeeServicesOuterClass.GetAllMedicalEventResponse getAllMedicalEvent(EmployeeServicesOuterClass.GetAllMedicalEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public EmployeeServicesOuterClass.GetMedicalEventDetailsResponse getMedicalEventDetails(MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicalEventDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    public EmployeeServicesOuterClass.GetAllWardResponse getAllWard(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllWardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public EmployeeServicesOuterClass.CreateMedicalExamResponse createMedicalExam(MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public EmployeeServicesOuterClass.CreateMedicalEventResponse createMedicalEvent(MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public EmployeeServicesOuterClass.CreateMedicalInfoResponse createMedicalInfo(MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMedicalInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public EmployeeServicesOuterClass.CreateAppointmentResponse createAppointment(AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public EmployeeServicesOuterClass.CreatePatientResponse createPatient(UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public EmployeeServicesOuterClass.CreateDoctorResponse createDoctor(UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDoctorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    public EmployeeServicesOuterClass.CreateStaffResponse createStaff(UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStaffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public EmployeeServicesOuterClass.CreateWardResponse createWard(WardOuterClass.Ward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public EmployeeServicesOuterClass.ModifyAppointmentResponse modifyAppointment(AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    public EmployeeServicesOuterClass.ModifyPatientResponse modifyPatient(UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    public EmployeeServicesOuterClass.ModifyDoctorResponse modifyDoctor(UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyDoctorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    public EmployeeServicesOuterClass.ModifyStaffResponse modifyStaff(UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyStaffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    public EmployeeServicesOuterClass.ModifyMedicalEventResponse modifyMedicalEvent(MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public EmployeeServicesOuterClass.ModifyMedicalExamResponse modifyMedicalExam(MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public EmployeeServicesOuterClass.ModifyMedicalInfoResponse modifyMedicalInfo(MedicalInfoOuterClass.MedicalInfo request) {
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
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAllDoctorsResponse> getAllDoctors(
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
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAllStaffsResponse> getAllStaffs(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStaffsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserOuterClass.Patient> getPatient(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get all Patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAllPatientsResponse> getAllPatients(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAppointmentsResponse> getAppointments(
        EmployeeServicesOuterClass.GetAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse> getAppointmentsFromDoctor(
        EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentsFromDoctorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAppointmentDetailsResponse> getAppointmentDetails(
        AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAllMedicalExamResponse> getAllMedicalExam(
        EmployeeServicesOuterClass.GetAllMedicalExamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> getMedicalExamDetails(
        MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAllMedicalEventResponse> getAllMedicalEvent(
        EmployeeServicesOuterClass.GetAllMedicalEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> getMedicalEventDetails(
        MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicalEventDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get all ward
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.GetAllWardResponse> getAllWard(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllWardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreateMedicalExamResponse> createMedicalExam(
        MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreateMedicalEventResponse> createMedicalEvent(
        MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a medical info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreateMedicalInfoResponse> createMedicalInfo(
        MedicalInfoOuterClass.MedicalInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMedicalInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreateAppointmentResponse> createAppointment(
        AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreatePatientResponse> createPatient(
        UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreateDoctorResponse> createDoctor(
        UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDoctorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a staff
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreateStaffResponse> createStaff(
        UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStaffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.CreateWardResponse> createWard(
        WardOuterClass.Ward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a specific appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.ModifyAppointmentResponse> modifyAppointment(
        AppointmentOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.ModifyPatientResponse> modifyPatient(
        UserOuterClass.Patient request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a doctor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.ModifyDoctorResponse> modifyDoctor(
        UserOuterClass.Doctor request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyDoctorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a staff
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.ModifyStaffResponse> modifyStaff(
        UserOuterClass.Staff request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyStaffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a medical event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.ModifyMedicalEventResponse> modifyMedicalEvent(
        MedicalEventOuterClass.MedicalEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.ModifyMedicalExamResponse> modifyMedicalExam(
        MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<EmployeeServicesOuterClass.ModifyMedicalInfoResponse> modifyMedicalInfo(
        MedicalInfoOuterClass.MedicalInfo request) {
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
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllDoctorsResponse>) responseObserver);
          break;
        case METHODID_GET_STAFF:
          serviceImpl.getStaff((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<UserOuterClass.Staff>) responseObserver);
          break;
        case METHODID_GET_ALL_STAFFS:
          serviceImpl.getAllStaffs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllStaffsResponse>) responseObserver);
          break;
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<UserOuterClass.Patient>) responseObserver);
          break;
        case METHODID_GET_ALL_PATIENTS:
          serviceImpl.getAllPatients((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllPatientsResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS:
          serviceImpl.getAppointments((EmployeeServicesOuterClass.GetAppointmentsRequest) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentsResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS_FROM_DOCTOR:
          serviceImpl.getAppointmentsFromDoctor((EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENT_DETAILS:
          serviceImpl.getAppointmentDetails((AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAppointmentDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_EXAM:
          serviceImpl.getAllMedicalExam((EmployeeServicesOuterClass.GetAllMedicalExamRequest) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllMedicalExamResponse>) responseObserver);
          break;
        case METHODID_GET_MEDICAL_EXAM_DETAILS:
          serviceImpl.getMedicalExamDetails((MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_EVENT:
          serviceImpl.getAllMedicalEvent((EmployeeServicesOuterClass.GetAllMedicalEventRequest) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllMedicalEventResponse>) responseObserver);
          break;
        case METHODID_GET_MEDICAL_EVENT_DETAILS:
          serviceImpl.getMedicalEventDetails((MedicalEventOuterClass.MedicalEvent) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetMedicalEventDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_WARD:
          serviceImpl.getAllWard((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.GetAllWardResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_EXAM:
          serviceImpl.createMedicalExam((MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalExamResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_EVENT:
          serviceImpl.createMedicalEvent((MedicalEventOuterClass.MedicalEvent) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalEventResponse>) responseObserver);
          break;
        case METHODID_CREATE_MEDICAL_INFO:
          serviceImpl.createMedicalInfo((MedicalInfoOuterClass.MedicalInfo) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateMedicalInfoResponse>) responseObserver);
          break;
        case METHODID_CREATE_APPOINTMENT:
          serviceImpl.createAppointment((AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateAppointmentResponse>) responseObserver);
          break;
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((UserOuterClass.Patient) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreatePatientResponse>) responseObserver);
          break;
        case METHODID_CREATE_DOCTOR:
          serviceImpl.createDoctor((UserOuterClass.Doctor) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateDoctorResponse>) responseObserver);
          break;
        case METHODID_CREATE_STAFF:
          serviceImpl.createStaff((UserOuterClass.Staff) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateStaffResponse>) responseObserver);
          break;
        case METHODID_CREATE_WARD:
          serviceImpl.createWard((WardOuterClass.Ward) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.CreateWardResponse>) responseObserver);
          break;
        case METHODID_MODIFY_APPOINTMENT:
          serviceImpl.modifyAppointment((AppointmentOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyAppointmentResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PATIENT:
          serviceImpl.modifyPatient((UserOuterClass.Patient) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyPatientResponse>) responseObserver);
          break;
        case METHODID_MODIFY_DOCTOR:
          serviceImpl.modifyDoctor((UserOuterClass.Doctor) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyDoctorResponse>) responseObserver);
          break;
        case METHODID_MODIFY_STAFF:
          serviceImpl.modifyStaff((UserOuterClass.Staff) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyStaffResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MEDICAL_EVENT:
          serviceImpl.modifyMedicalEvent((MedicalEventOuterClass.MedicalEvent) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalEventResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MEDICAL_EXAM:
          serviceImpl.modifyMedicalExam((MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalExamResponse>) responseObserver);
          break;
        case METHODID_MODIFY_MEDICAL_INFO:
          serviceImpl.modifyMedicalInfo((MedicalInfoOuterClass.MedicalInfo) request,
              (io.grpc.stub.StreamObserver<EmployeeServicesOuterClass.ModifyMedicalInfoResponse>) responseObserver);
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
              EmployeeServicesOuterClass.GetAllDoctorsResponse>(
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
              EmployeeServicesOuterClass.GetAllStaffsResponse>(
                service, METHODID_GET_ALL_STAFFS)))
        .addMethod(
          getGetPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              UserOuterClass.Patient>(
                service, METHODID_GET_PATIENT)))
        .addMethod(
          getGetAllPatientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              EmployeeServicesOuterClass.GetAllPatientsResponse>(
                service, METHODID_GET_ALL_PATIENTS)))
        .addMethod(
          getGetAppointmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              EmployeeServicesOuterClass.GetAppointmentsRequest,
              EmployeeServicesOuterClass.GetAppointmentsResponse>(
                service, METHODID_GET_APPOINTMENTS)))
        .addMethod(
          getGetAppointmentsFromDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              EmployeeServicesOuterClass.GetAppointmentsFromDoctorRequest,
              EmployeeServicesOuterClass.GetAppointmentsFromDoctorResponse>(
                service, METHODID_GET_APPOINTMENTS_FROM_DOCTOR)))
        .addMethod(
          getGetAppointmentDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              EmployeeServicesOuterClass.GetAppointmentDetailsResponse>(
                service, METHODID_GET_APPOINTMENT_DETAILS)))
        .addMethod(
          getGetAllMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              EmployeeServicesOuterClass.GetAllMedicalExamRequest,
              EmployeeServicesOuterClass.GetAllMedicalExamResponse>(
                service, METHODID_GET_ALL_MEDICAL_EXAM)))
        .addMethod(
          getGetMedicalExamDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalExamOuterClass.MedicalExam,
              EmployeeServicesOuterClass.GetMedicalExamDetailsResponse>(
                service, METHODID_GET_MEDICAL_EXAM_DETAILS)))
        .addMethod(
          getGetAllMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              EmployeeServicesOuterClass.GetAllMedicalEventRequest,
              EmployeeServicesOuterClass.GetAllMedicalEventResponse>(
                service, METHODID_GET_ALL_MEDICAL_EVENT)))
        .addMethod(
          getGetMedicalEventDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalEventOuterClass.MedicalEvent,
              EmployeeServicesOuterClass.GetMedicalEventDetailsResponse>(
                service, METHODID_GET_MEDICAL_EVENT_DETAILS)))
        .addMethod(
          getGetAllWardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              EmployeeServicesOuterClass.GetAllWardResponse>(
                service, METHODID_GET_ALL_WARD)))
        .addMethod(
          getCreateMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalExamOuterClass.MedicalExam,
              EmployeeServicesOuterClass.CreateMedicalExamResponse>(
                service, METHODID_CREATE_MEDICAL_EXAM)))
        .addMethod(
          getCreateMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalEventOuterClass.MedicalEvent,
              EmployeeServicesOuterClass.CreateMedicalEventResponse>(
                service, METHODID_CREATE_MEDICAL_EVENT)))
        .addMethod(
          getCreateMedicalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalInfoOuterClass.MedicalInfo,
              EmployeeServicesOuterClass.CreateMedicalInfoResponse>(
                service, METHODID_CREATE_MEDICAL_INFO)))
        .addMethod(
          getCreateAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              EmployeeServicesOuterClass.CreateAppointmentResponse>(
                service, METHODID_CREATE_APPOINTMENT)))
        .addMethod(
          getCreatePatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              UserOuterClass.Patient,
              EmployeeServicesOuterClass.CreatePatientResponse>(
                service, METHODID_CREATE_PATIENT)))
        .addMethod(
          getCreateDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              UserOuterClass.Doctor,
              EmployeeServicesOuterClass.CreateDoctorResponse>(
                service, METHODID_CREATE_DOCTOR)))
        .addMethod(
          getCreateStaffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              UserOuterClass.Staff,
              EmployeeServicesOuterClass.CreateStaffResponse>(
                service, METHODID_CREATE_STAFF)))
        .addMethod(
          getCreateWardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              WardOuterClass.Ward,
              EmployeeServicesOuterClass.CreateWardResponse>(
                service, METHODID_CREATE_WARD)))
        .addMethod(
          getModifyAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              EmployeeServicesOuterClass.ModifyAppointmentResponse>(
                service, METHODID_MODIFY_APPOINTMENT)))
        .addMethod(
          getModifyPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              UserOuterClass.Patient,
              EmployeeServicesOuterClass.ModifyPatientResponse>(
                service, METHODID_MODIFY_PATIENT)))
        .addMethod(
          getModifyDoctorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              UserOuterClass.Doctor,
              EmployeeServicesOuterClass.ModifyDoctorResponse>(
                service, METHODID_MODIFY_DOCTOR)))
        .addMethod(
          getModifyStaffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              UserOuterClass.Staff,
              EmployeeServicesOuterClass.ModifyStaffResponse>(
                service, METHODID_MODIFY_STAFF)))
        .addMethod(
          getModifyMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalEventOuterClass.MedicalEvent,
              EmployeeServicesOuterClass.ModifyMedicalEventResponse>(
                service, METHODID_MODIFY_MEDICAL_EVENT)))
        .addMethod(
          getModifyMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalExamOuterClass.MedicalExam,
              EmployeeServicesOuterClass.ModifyMedicalExamResponse>(
                service, METHODID_MODIFY_MEDICAL_EXAM)))
        .addMethod(
          getModifyMedicalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalInfoOuterClass.MedicalInfo,
              EmployeeServicesOuterClass.ModifyMedicalInfoResponse>(
                service, METHODID_MODIFY_MEDICAL_INFO)))
        .build();
  }

  private static abstract class EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServicesBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return EmployeeServicesOuterClass.getDescriptor();
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
