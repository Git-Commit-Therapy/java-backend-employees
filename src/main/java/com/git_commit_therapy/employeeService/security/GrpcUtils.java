package com.git_commit_therapy.employeeService.security;

import com.google.protobuf.GeneratedMessage;
import io.grpc.stub.StreamObserver;
import lombok.extern.java.Log;

import java.util.function.Supplier;


@Log
public class GrpcUtils {
    public static <T> void GrpcInterceptor(StreamObserver<T> responseObserver, GeneratedMessage request, Long pollRefresh, Supplier<T> businessLogic) {
        try {
            while (true) {
                // Get date from the function
                T data = businessLogic.get();
                if (data != null) {
                    // Send data to client
                    responseObserver.onNext(data);
                }
                //In case if the grpc service is not a stream
                if (pollRefresh == null) {
                    break;
                    // Wait if pollRefresh is greater then 0
                } else if (pollRefresh > 0) {
                    Thread.sleep(pollRefresh);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            responseObserver.onError(e);
        } catch (Exception e) {
            log.warning("Exception occurred in a grpc call. Exception: " + e);
            responseObserver.onError(e);
        } finally {
            log.fine("Completed grpc call");
            responseObserver.onCompleted();
        }
    }

}
