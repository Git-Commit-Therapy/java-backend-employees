package com.git_commit_therapy.proto.emergency;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: emergency_ward_services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmergencyWardServicesGrpc {

  private EmergencyWardServicesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.git_commit_therapy.proto.emergency.EmergencyWardServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse> getAddPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPatient",
      requestType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest.class,
      responseType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse> getAddPatientMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse> getAddPatientMethod;
    if ((getAddPatientMethod = EmergencyWardServicesGrpc.getAddPatientMethod) == null) {
      synchronized (EmergencyWardServicesGrpc.class) {
        if ((getAddPatientMethod = EmergencyWardServicesGrpc.getAddPatientMethod) == null) {
          EmergencyWardServicesGrpc.getAddPatientMethod = getAddPatientMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyWardServicesMethodDescriptorSupplier("AddPatient"))
              .build();
        }
      }
    }
    return getAddPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest,
      com.google.protobuf.Empty> getTransferPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferPatient",
      requestType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest,
      com.google.protobuf.Empty> getTransferPatientMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest, com.google.protobuf.Empty> getTransferPatientMethod;
    if ((getTransferPatientMethod = EmergencyWardServicesGrpc.getTransferPatientMethod) == null) {
      synchronized (EmergencyWardServicesGrpc.class) {
        if ((getTransferPatientMethod = EmergencyWardServicesGrpc.getTransferPatientMethod) == null) {
          EmergencyWardServicesGrpc.getTransferPatientMethod = getTransferPatientMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyWardServicesMethodDescriptorSupplier("TransferPatient"))
              .build();
        }
      }
    }
    return getTransferPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest,
      com.google.protobuf.Empty> getRemovePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePatient",
      requestType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest,
      com.google.protobuf.Empty> getRemovePatientMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest, com.google.protobuf.Empty> getRemovePatientMethod;
    if ((getRemovePatientMethod = EmergencyWardServicesGrpc.getRemovePatientMethod) == null) {
      synchronized (EmergencyWardServicesGrpc.class) {
        if ((getRemovePatientMethod = EmergencyWardServicesGrpc.getRemovePatientMethod) == null) {
          EmergencyWardServicesGrpc.getRemovePatientMethod = getRemovePatientMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyWardServicesMethodDescriptorSupplier("RemovePatient"))
              .build();
        }
      }
    }
    return getRemovePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest,
      com.google.protobuf.Empty> getCallPatientForVisitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallPatientForVisit",
      requestType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest,
      com.google.protobuf.Empty> getCallPatientForVisitMethod() {
    io.grpc.MethodDescriptor<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest, com.google.protobuf.Empty> getCallPatientForVisitMethod;
    if ((getCallPatientForVisitMethod = EmergencyWardServicesGrpc.getCallPatientForVisitMethod) == null) {
      synchronized (EmergencyWardServicesGrpc.class) {
        if ((getCallPatientForVisitMethod = EmergencyWardServicesGrpc.getCallPatientForVisitMethod) == null) {
          EmergencyWardServicesGrpc.getCallPatientForVisitMethod = getCallPatientForVisitMethod =
              io.grpc.MethodDescriptor.<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallPatientForVisit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyWardServicesMethodDescriptorSupplier("CallPatientForVisit"))
              .build();
        }
      }
    }
    return getCallPatientForVisitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmergencyWardServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyWardServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyWardServicesStub>() {
        @java.lang.Override
        public EmergencyWardServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyWardServicesStub(channel, callOptions);
        }
      };
    return EmergencyWardServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmergencyWardServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyWardServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyWardServicesBlockingStub>() {
        @java.lang.Override
        public EmergencyWardServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyWardServicesBlockingStub(channel, callOptions);
        }
      };
    return EmergencyWardServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmergencyWardServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyWardServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyWardServicesFutureStub>() {
        @java.lang.Override
        public EmergencyWardServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyWardServicesFutureStub(channel, callOptions);
        }
      };
    return EmergencyWardServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *Method for adding a patient to the emergency ward. Returns a code to identify the patient in the waiting queue
     * </pre>
     */
    default void addPatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     *Transfers a patient from the emergency ward to a specific ward.
     * </pre>
     */
    default void transferPatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     *Removes a patient from the emergency ward.
     * </pre>
     */
    default void removePatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePatientMethod(), responseObserver);
    }

    /**
     * <pre>
     *Notifies a patient that is called for a visit
     * </pre>
     */
    default void callPatientForVisit(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallPatientForVisitMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmergencyWardServices.
   */
  public static abstract class EmergencyWardServicesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmergencyWardServicesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmergencyWardServices.
   */
  public static final class EmergencyWardServicesStub
      extends io.grpc.stub.AbstractAsyncStub<EmergencyWardServicesStub> {
    private EmergencyWardServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyWardServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyWardServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for adding a patient to the emergency ward. Returns a code to identify the patient in the waiting queue
     * </pre>
     */
    public void addPatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Transfers a patient from the emergency ward to a specific ward.
     * </pre>
     */
    public void transferPatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Removes a patient from the emergency ward.
     * </pre>
     */
    public void removePatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Notifies a patient that is called for a visit
     * </pre>
     */
    public void callPatientForVisit(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallPatientForVisitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmergencyWardServices.
   */
  public static final class EmergencyWardServicesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmergencyWardServicesBlockingStub> {
    private EmergencyWardServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyWardServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyWardServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for adding a patient to the emergency ward. Returns a code to identify the patient in the waiting queue
     * </pre>
     */
    public com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse addPatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Transfers a patient from the emergency ward to a specific ward.
     * </pre>
     */
    public com.google.protobuf.Empty transferPatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Removes a patient from the emergency ward.
     * </pre>
     */
    public com.google.protobuf.Empty removePatient(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Notifies a patient that is called for a visit
     * </pre>
     */
    public com.google.protobuf.Empty callPatientForVisit(com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallPatientForVisitMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmergencyWardServices.
   */
  public static final class EmergencyWardServicesFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmergencyWardServicesFutureStub> {
    private EmergencyWardServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyWardServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyWardServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for adding a patient to the emergency ward. Returns a code to identify the patient in the waiting queue
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse> addPatient(
        com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Transfers a patient from the emergency ward to a specific ward.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> transferPatient(
        com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Removes a patient from the emergency ward.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removePatient(
        com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Notifies a patient that is called for a visit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> callPatientForVisit(
        com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallPatientForVisitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PATIENT = 0;
  private static final int METHODID_TRANSFER_PATIENT = 1;
  private static final int METHODID_REMOVE_PATIENT = 2;
  private static final int METHODID_CALL_PATIENT_FOR_VISIT = 3;

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
        case METHODID_ADD_PATIENT:
          serviceImpl.addPatient((com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_PATIENT:
          serviceImpl.transferPatient((com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_PATIENT:
          serviceImpl.removePatient((com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CALL_PATIENT_FOR_VISIT:
          serviceImpl.callPatientForVisit((com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getAddPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientRequest,
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.AddPatientResponse>(
                service, METHODID_ADD_PATIENT)))
        .addMethod(
          getTransferPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.TransferPatientRequest,
              com.google.protobuf.Empty>(
                service, METHODID_TRANSFER_PATIENT)))
        .addMethod(
          getRemovePatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.RemovePatientRequest,
              com.google.protobuf.Empty>(
                service, METHODID_REMOVE_PATIENT)))
        .addMethod(
          getCallPatientForVisitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.CallPatientRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CALL_PATIENT_FOR_VISIT)))
        .build();
  }

  private static abstract class EmergencyWardServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmergencyWardServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmergencyWardServices");
    }
  }

  private static final class EmergencyWardServicesFileDescriptorSupplier
      extends EmergencyWardServicesBaseDescriptorSupplier {
    EmergencyWardServicesFileDescriptorSupplier() {}
  }

  private static final class EmergencyWardServicesMethodDescriptorSupplier
      extends EmergencyWardServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmergencyWardServicesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmergencyWardServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmergencyWardServicesFileDescriptorSupplier())
              .addMethod(getAddPatientMethod())
              .addMethod(getTransferPatientMethod())
              .addMethod(getRemovePatientMethod())
              .addMethod(getCallPatientForVisitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
