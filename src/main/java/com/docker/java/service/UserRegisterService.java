package com.docker.java.service;

import com.docker.grpc.register.RegisterReply;
import com.docker.grpc.register.RegisterRequest;
import com.docker.grpc.register.RegisterServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author alpaca
 */
@GrpcService
public class UserRegisterService extends RegisterServiceGrpc.RegisterServiceImplBase {
    @Autowired
    private SendMailService sendMailService;

    @Override
    public void register(RegisterRequest request, StreamObserver<RegisterReply> responseObserver) {
        String text = request.getText();
        String subject = request.getSubject();
        String to = request.getTo();
        // responseObserver.onNext(RegisterReply.newBuilder().setReply(bool).build());
        responseObserver.onNext(RegisterReply.newBuilder().setRes(sendMailService.sendMail(text, subject, to)).build());
        responseObserver.onCompleted();
    }
}

