package com.git_commit_therapy.proto.emergency;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: emergency_ward_services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmergencyWardPanelsServiceGrpc {

  private EmergencyWardPanelsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.git_commit_therapy.proto.emergency.EmergencyWardPanelsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> getRetrieveNeedToBeVisitedStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveNeedToBeVisitedStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> getRetrieveNeedToBeVisitedStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> getRetrieveNeedToBeVisitedStatusMethod;
    if ((getRetrieveNeedToBeVisitedStatusMethod = EmergencyWardPanelsServiceGrpc.getRetrieveNeedToBeVisitedStatusMethod) == null) {
      synchronized (EmergencyWardPanelsServiceGrpc.class) {
        if ((getRetrieveNeedToBeVisitedStatusMethod = EmergencyWardPanelsServiceGrpc.getRetrieveNeedToBeVisitedStatusMethod) == null) {
          EmergencyWardPanelsServiceGrpc.getRetrieveNeedToBeVisitedStatusMethod = getRetrieveNeedToBeVisitedStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveNeedToBeVisitedStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyWardPanelsServiceMethodDescriptorSupplier("RetrieveNeedToBeVisitedStatus"))
              .build();
        }
      }
    }
    return getRetrieveNeedToBeVisitedStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> getRetrieveInVisitingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveInVisitingStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> getRetrieveInVisitingStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> getRetrieveInVisitingStatusMethod;
    if ((getRetrieveInVisitingStatusMethod = EmergencyWardPanelsServiceGrpc.getRetrieveInVisitingStatusMethod) == null) {
      synchronized (EmergencyWardPanelsServiceGrpc.class) {
        if ((getRetrieveInVisitingStatusMethod = EmergencyWardPanelsServiceGrpc.getRetrieveInVisitingStatusMethod) == null) {
          EmergencyWardPanelsServiceGrpc.getRetrieveInVisitingStatusMethod = getRetrieveInVisitingStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveInVisitingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyWardPanelsServiceMethodDescriptorSupplier("RetrieveInVisitingStatus"))
              .build();
        }
      }
    }
    return getRetrieveInVisitingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse> getRetrieveLastPatientsCalledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveLastPatientsCalled",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse> getRetrieveLastPatientsCalledMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse> getRetrieveLastPatientsCalledMethod;
    if ((getRetrieveLastPatientsCalledMethod = EmergencyWardPanelsServiceGrpc.getRetrieveLastPatientsCalledMethod) == null) {
      synchronized (EmergencyWardPanelsServiceGrpc.class) {
        if ((getRetrieveLastPatientsCalledMethod = EmergencyWardPanelsServiceGrpc.getRetrieveLastPatientsCalledMethod) == null) {
          EmergencyWardPanelsServiceGrpc.getRetrieveLastPatientsCalledMethod = getRetrieveLastPatientsCalledMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveLastPatientsCalled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyWardPanelsServiceMethodDescriptorSupplier("RetrieveLastPatientsCalled"))
              .build();
        }
      }
    }
    return getRetrieveLastPatientsCalledMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmergencyWardPanelsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyWardPanelsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyWardPanelsServiceStub>() {
        @java.lang.Override
        public EmergencyWardPanelsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyWardPanelsServiceStub(channel, callOptions);
        }
      };
    return EmergencyWardPanelsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmergencyWardPanelsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyWardPanelsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyWardPanelsServiceBlockingStub>() {
        @java.lang.Override
        public EmergencyWardPanelsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyWardPanelsServiceBlockingStub(channel, callOptions);
        }
      };
    return EmergencyWardPanelsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmergencyWardPanelsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyWardPanelsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyWardPanelsServiceFutureStub>() {
        @java.lang.Override
        public EmergencyWardPanelsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyWardPanelsServiceFutureStub(channel, callOptions);
        }
      };
    return EmergencyWardPanelsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Retrieve the status of the "needToBeVisited" queue.
     * </pre>
     */
    default void retrieveNeedToBeVisitedStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveNeedToBeVisitedStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the status of the "inVisiting" queue.
     * </pre>
     */
    default void retrieveInVisitingStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveInVisitingStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a list of the last patients called.
     * </pre>
     */
    default void retrieveLastPatientsCalled(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveLastPatientsCalledMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmergencyWardPanelsService.
   */
  public static abstract class EmergencyWardPanelsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmergencyWardPanelsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmergencyWardPanelsService.
   */
  public static final class EmergencyWardPanelsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmergencyWardPanelsServiceStub> {
    private EmergencyWardPanelsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyWardPanelsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyWardPanelsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve the status of the "needToBeVisited" queue.
     * </pre>
     */
    public void retrieveNeedToBeVisitedStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveNeedToBeVisitedStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the status of the "inVisiting" queue.
     * </pre>
     */
    public void retrieveInVisitingStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveInVisitingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a list of the last patients called.
     * </pre>
     */
    public void retrieveLastPatientsCalled(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveLastPatientsCalledMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmergencyWardPanelsService.
   */
  public static final class EmergencyWardPanelsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmergencyWardPanelsServiceBlockingStub> {
    private EmergencyWardPanelsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyWardPanelsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyWardPanelsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve the status of the "needToBeVisited" queue.
     * </pre>
     */
    public com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse retrieveNeedToBeVisitedStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveNeedToBeVisitedStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the status of the "inVisiting" queue.
     * </pre>
     */
    public com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse retrieveInVisitingStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveInVisitingStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a list of the last patients called.
     * </pre>
     */
    public com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse retrieveLastPatientsCalled(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveLastPatientsCalledMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmergencyWardPanelsService.
   */
  public static final class EmergencyWardPanelsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmergencyWardPanelsServiceFutureStub> {
    private EmergencyWardPanelsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyWardPanelsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyWardPanelsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve the status of the "needToBeVisited" queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> retrieveNeedToBeVisitedStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveNeedToBeVisitedStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the status of the "inVisiting" queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse> retrieveInVisitingStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveInVisitingStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a list of the last patients called.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse> retrieveLastPatientsCalled(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveLastPatientsCalledMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE_NEED_TO_BE_VISITED_STATUS = 0;
  private static final int METHODID_RETRIEVE_IN_VISITING_STATUS = 1;
  private static final int METHODID_RETRIEVE_LAST_PATIENTS_CALLED = 2;

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
        case METHODID_RETRIEVE_NEED_TO_BE_VISITED_STATUS:
          serviceImpl.retrieveNeedToBeVisitedStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_IN_VISITING_STATUS:
          serviceImpl.retrieveInVisitingStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_LAST_PATIENTS_CALLED:
          serviceImpl.retrieveLastPatientsCalled((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse>) responseObserver);
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
          getRetrieveNeedToBeVisitedStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse>(
                service, METHODID_RETRIEVE_NEED_TO_BE_VISITED_STATUS)))
        .addMethod(
          getRetrieveInVisitingStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.QueueStatusResponse>(
                service, METHODID_RETRIEVE_IN_VISITING_STATUS)))
        .addMethod(
          getRetrieveLastPatientsCalledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.LastPatientsCalledResponse>(
                service, METHODID_RETRIEVE_LAST_PATIENTS_CALLED)))
        .build();
  }

  private static abstract class EmergencyWardPanelsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmergencyWardPanelsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmergencyWardPanelsService");
    }
  }

  private static final class EmergencyWardPanelsServiceFileDescriptorSupplier
      extends EmergencyWardPanelsServiceBaseDescriptorSupplier {
    EmergencyWardPanelsServiceFileDescriptorSupplier() {}
  }

  private static final class EmergencyWardPanelsServiceMethodDescriptorSupplier
      extends EmergencyWardPanelsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmergencyWardPanelsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmergencyWardPanelsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmergencyWardPanelsServiceFileDescriptorSupplier())
              .addMethod(getRetrieveNeedToBeVisitedStatusMethod())
              .addMethod(getRetrieveInVisitingStatusMethod())
              .addMethod(getRetrieveLastPatientsCalledMethod())
              .build();
        }
      }
    }
    return result;
  }
}
