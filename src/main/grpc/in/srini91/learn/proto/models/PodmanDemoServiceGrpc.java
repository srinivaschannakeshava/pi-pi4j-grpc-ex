package in.srini91.learn.proto.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.1)",
    comments = "Source: gpio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PodmanDemoServiceGrpc {

  private PodmanDemoServiceGrpc() {}

  public static final String SERVICE_NAME = "PodmanDemoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.GpioRequest,
      in.bosch.sdv.proto.models.GpioData> getReadGpioStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readGpioState",
      requestType = in.bosch.sdv.proto.models.GpioRequest.class,
      responseType = in.bosch.sdv.proto.models.GpioData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.GpioRequest,
      in.bosch.sdv.proto.models.GpioData> getReadGpioStateMethod() {
    io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.GpioRequest, in.bosch.sdv.proto.models.GpioData> getReadGpioStateMethod;
    if ((getReadGpioStateMethod = PodmanDemoServiceGrpc.getReadGpioStateMethod) == null) {
      synchronized (PodmanDemoServiceGrpc.class) {
        if ((getReadGpioStateMethod = PodmanDemoServiceGrpc.getReadGpioStateMethod) == null) {
          PodmanDemoServiceGrpc.getReadGpioStateMethod = getReadGpioStateMethod =
              io.grpc.MethodDescriptor.<in.bosch.sdv.proto.models.GpioRequest, in.bosch.sdv.proto.models.GpioData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "readGpioState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.GpioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.GpioData.getDefaultInstance()))
              .setSchemaDescriptor(new PodmanDemoServiceMethodDescriptorSupplier("readGpioState"))
              .build();
        }
      }
    }
    return getReadGpioStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.GpioRequest,
      in.bosch.sdv.proto.models.GpioData> getWriteGpioDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "writeGpioData",
      requestType = in.bosch.sdv.proto.models.GpioRequest.class,
      responseType = in.bosch.sdv.proto.models.GpioData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.GpioRequest,
      in.bosch.sdv.proto.models.GpioData> getWriteGpioDataMethod() {
    io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.GpioRequest, in.bosch.sdv.proto.models.GpioData> getWriteGpioDataMethod;
    if ((getWriteGpioDataMethod = PodmanDemoServiceGrpc.getWriteGpioDataMethod) == null) {
      synchronized (PodmanDemoServiceGrpc.class) {
        if ((getWriteGpioDataMethod = PodmanDemoServiceGrpc.getWriteGpioDataMethod) == null) {
          PodmanDemoServiceGrpc.getWriteGpioDataMethod = getWriteGpioDataMethod =
              io.grpc.MethodDescriptor.<in.bosch.sdv.proto.models.GpioRequest, in.bosch.sdv.proto.models.GpioData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "writeGpioData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.GpioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.GpioData.getDefaultInstance()))
              .setSchemaDescriptor(new PodmanDemoServiceMethodDescriptorSupplier("writeGpioData"))
              .build();
        }
      }
    }
    return getWriteGpioDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.LedStripData,
      in.bosch.sdv.proto.models.LedStripData> getLedStripDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ledStripData",
      requestType = in.bosch.sdv.proto.models.LedStripData.class,
      responseType = in.bosch.sdv.proto.models.LedStripData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.LedStripData,
      in.bosch.sdv.proto.models.LedStripData> getLedStripDataMethod() {
    io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.LedStripData, in.bosch.sdv.proto.models.LedStripData> getLedStripDataMethod;
    if ((getLedStripDataMethod = PodmanDemoServiceGrpc.getLedStripDataMethod) == null) {
      synchronized (PodmanDemoServiceGrpc.class) {
        if ((getLedStripDataMethod = PodmanDemoServiceGrpc.getLedStripDataMethod) == null) {
          PodmanDemoServiceGrpc.getLedStripDataMethod = getLedStripDataMethod =
              io.grpc.MethodDescriptor.<in.bosch.sdv.proto.models.LedStripData, in.bosch.sdv.proto.models.LedStripData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ledStripData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.LedStripData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.LedStripData.getDefaultInstance()))
              .setSchemaDescriptor(new PodmanDemoServiceMethodDescriptorSupplier("ledStripData"))
              .build();
        }
      }
    }
    return getLedStripDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.UartData,
      in.bosch.sdv.proto.models.Status> getUartWriteDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uartWriteData",
      requestType = in.bosch.sdv.proto.models.UartData.class,
      responseType = in.bosch.sdv.proto.models.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.UartData,
      in.bosch.sdv.proto.models.Status> getUartWriteDataMethod() {
    io.grpc.MethodDescriptor<in.bosch.sdv.proto.models.UartData, in.bosch.sdv.proto.models.Status> getUartWriteDataMethod;
    if ((getUartWriteDataMethod = PodmanDemoServiceGrpc.getUartWriteDataMethod) == null) {
      synchronized (PodmanDemoServiceGrpc.class) {
        if ((getUartWriteDataMethod = PodmanDemoServiceGrpc.getUartWriteDataMethod) == null) {
          PodmanDemoServiceGrpc.getUartWriteDataMethod = getUartWriteDataMethod =
              io.grpc.MethodDescriptor.<in.bosch.sdv.proto.models.UartData, in.bosch.sdv.proto.models.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uartWriteData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.UartData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  in.bosch.sdv.proto.models.Status.getDefaultInstance()))
              .setSchemaDescriptor(new PodmanDemoServiceMethodDescriptorSupplier("uartWriteData"))
              .build();
        }
      }
    }
    return getUartWriteDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PodmanDemoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PodmanDemoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PodmanDemoServiceStub>() {
        @java.lang.Override
        public PodmanDemoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PodmanDemoServiceStub(channel, callOptions);
        }
      };
    return PodmanDemoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PodmanDemoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PodmanDemoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PodmanDemoServiceBlockingStub>() {
        @java.lang.Override
        public PodmanDemoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PodmanDemoServiceBlockingStub(channel, callOptions);
        }
      };
    return PodmanDemoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PodmanDemoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PodmanDemoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PodmanDemoServiceFutureStub>() {
        @java.lang.Override
        public PodmanDemoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PodmanDemoServiceFutureStub(channel, callOptions);
        }
      };
    return PodmanDemoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PodmanDemoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void readGpioState(in.bosch.sdv.proto.models.GpioRequest request,
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadGpioStateMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioRequest> writeGpioData(
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioData> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteGpioDataMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.LedStripData> ledStripData(
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.LedStripData> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLedStripDataMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.UartData> uartWriteData(
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.Status> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUartWriteDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadGpioStateMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                in.bosch.sdv.proto.models.GpioRequest,
                in.bosch.sdv.proto.models.GpioData>(
                  this, METHODID_READ_GPIO_STATE)))
          .addMethod(
            getWriteGpioDataMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                in.bosch.sdv.proto.models.GpioRequest,
                in.bosch.sdv.proto.models.GpioData>(
                  this, METHODID_WRITE_GPIO_DATA)))
          .addMethod(
            getLedStripDataMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                in.bosch.sdv.proto.models.LedStripData,
                in.bosch.sdv.proto.models.LedStripData>(
                  this, METHODID_LED_STRIP_DATA)))
          .addMethod(
            getUartWriteDataMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                in.bosch.sdv.proto.models.UartData,
                in.bosch.sdv.proto.models.Status>(
                  this, METHODID_UART_WRITE_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class PodmanDemoServiceStub extends io.grpc.stub.AbstractAsyncStub<PodmanDemoServiceStub> {
    private PodmanDemoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PodmanDemoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PodmanDemoServiceStub(channel, callOptions);
    }

    /**
     */
    public void readGpioState(in.bosch.sdv.proto.models.GpioRequest request,
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadGpioStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioRequest> writeGpioData(
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioData> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteGpioDataMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.LedStripData> ledStripData(
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.LedStripData> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getLedStripDataMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.UartData> uartWriteData(
        io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.Status> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUartWriteDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PodmanDemoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PodmanDemoServiceBlockingStub> {
    private PodmanDemoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PodmanDemoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PodmanDemoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<in.bosch.sdv.proto.models.GpioData> readGpioState(
        in.bosch.sdv.proto.models.GpioRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadGpioStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PodmanDemoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PodmanDemoServiceFutureStub> {
    private PodmanDemoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PodmanDemoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PodmanDemoServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_READ_GPIO_STATE = 0;
  private static final int METHODID_WRITE_GPIO_DATA = 1;
  private static final int METHODID_LED_STRIP_DATA = 2;
  private static final int METHODID_UART_WRITE_DATA = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PodmanDemoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PodmanDemoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_GPIO_STATE:
          serviceImpl.readGpioState((in.bosch.sdv.proto.models.GpioRequest) request,
              (io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioData>) responseObserver);
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
        case METHODID_WRITE_GPIO_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.writeGpioData(
              (io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.GpioData>) responseObserver);
        case METHODID_LED_STRIP_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.ledStripData(
              (io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.LedStripData>) responseObserver);
        case METHODID_UART_WRITE_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uartWriteData(
              (io.grpc.stub.StreamObserver<in.bosch.sdv.proto.models.Status>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PodmanDemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PodmanDemoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return in.bosch.sdv.proto.models.Gpio.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PodmanDemoService");
    }
  }

  private static final class PodmanDemoServiceFileDescriptorSupplier
      extends PodmanDemoServiceBaseDescriptorSupplier {
    PodmanDemoServiceFileDescriptorSupplier() {}
  }

  private static final class PodmanDemoServiceMethodDescriptorSupplier
      extends PodmanDemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PodmanDemoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PodmanDemoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PodmanDemoServiceFileDescriptorSupplier())
              .addMethod(getReadGpioStateMethod())
              .addMethod(getWriteGpioDataMethod())
              .addMethod(getLedStripDataMethod())
              .addMethod(getUartWriteDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
