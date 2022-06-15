package com.docker.java.grpc.add;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *添加一个服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: Add.proto")
public final class AddServiceGrpc {

  private AddServiceGrpc() {}

  public static final String SERVICE_NAME = "mygrpc.AddService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.docker.grpc.add.AddRequest,
      com.docker.grpc.add.AddReply> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = com.docker.grpc.add.AddRequest.class,
      responseType = com.docker.grpc.add.AddReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.docker.grpc.add.AddRequest,
      com.docker.grpc.add.AddReply> getAddMethod() {
    io.grpc.MethodDescriptor<com.docker.grpc.add.AddRequest, com.docker.grpc.add.AddReply> getAddMethod;
    if ((getAddMethod = AddServiceGrpc.getAddMethod) == null) {
      synchronized (AddServiceGrpc.class) {
        if ((getAddMethod = AddServiceGrpc.getAddMethod) == null) {
          AddServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.docker.grpc.add.AddRequest, com.docker.grpc.add.AddReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.docker.grpc.add.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.docker.grpc.add.AddReply.getDefaultInstance()))
              .setSchemaDescriptor(new AddServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddServiceStub>() {
        @Override
        public AddServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddServiceStub(channel, callOptions);
        }
      };
    return AddServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddServiceBlockingStub>() {
        @Override
        public AddServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddServiceBlockingStub(channel, callOptions);
        }
      };
    return AddServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddServiceFutureStub>() {
        @Override
        public AddServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddServiceFutureStub(channel, callOptions);
        }
      };
    return AddServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *添加一个服务
   * </pre>
   */
  public static abstract class AddServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *入参 和 出参
     * </pre>
     */
    public void add(com.docker.grpc.add.AddRequest request,
        io.grpc.stub.StreamObserver<com.docker.grpc.add.AddReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.docker.grpc.add.AddRequest,
                com.docker.grpc.add.AddReply>(
                  this, METHODID_ADD)))
          .build();
    }
  }

  /**
   * <pre>
   *添加一个服务
   * </pre>
   */
  public static final class AddServiceStub extends io.grpc.stub.AbstractAsyncStub<AddServiceStub> {
    private AddServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AddServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *入参 和 出参
     * </pre>
     */
    public void add(com.docker.grpc.add.AddRequest request,
        io.grpc.stub.StreamObserver<com.docker.grpc.add.AddReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *添加一个服务
   * </pre>
   */
  public static final class AddServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddServiceBlockingStub> {
    private AddServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AddServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *入参 和 出参
     * </pre>
     */
    public com.docker.grpc.add.AddReply add(com.docker.grpc.add.AddRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *添加一个服务
   * </pre>
   */
  public static final class AddServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AddServiceFutureStub> {
    private AddServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AddServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *入参 和 出参
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.docker.grpc.add.AddReply> add(
        com.docker.grpc.add.AddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.docker.grpc.add.AddRequest) request,
              (io.grpc.stub.StreamObserver<com.docker.grpc.add.AddReply>) responseObserver);
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

  private static abstract class AddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.docker.grpc.add.AddServiceProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddService");
    }
  }

  private static final class AddServiceFileDescriptorSupplier
      extends AddServiceBaseDescriptorSupplier {
    AddServiceFileDescriptorSupplier() {}
  }

  private static final class AddServiceMethodDescriptorSupplier
      extends AddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AddServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
