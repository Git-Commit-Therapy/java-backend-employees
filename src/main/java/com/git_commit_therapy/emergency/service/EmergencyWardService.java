package com.git_commit_therapy.emergency.service;

import com.git_commit_therapy.proto.emergency.EmergencyWardServicesGrpc;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EmergencyWardService extends EmergencyWardServicesGrpc.EmergencyWardServicesImplBase {
    @Override
    public void addPatient(EmergencyWardServicesOuterClass.AddPatientRequest request, StreamObserver<EmergencyWardServicesOuterClass.AddPatientResponse> responseObserver) {
        super.addPatient(request, responseObserver);
    }

    @Override
    public void transferPatient(EmergencyWardServicesOuterClass.TransferPatientRequest request, StreamObserver<Empty> responseObserver) {
        super.transferPatient(request, responseObserver);
    }

    @Override
    public void removePatient(EmergencyWardServicesOuterClass.RemovePatientRequest request, StreamObserver<Empty> responseObserver) {
        super.removePatient(request, responseObserver);
    }

    @Override
    public void callPatientForVisit(EmergencyWardServicesOuterClass.CallPatientRequest request, StreamObserver<Empty> responseObserver) {
        super.callPatientForVisit(request, responseObserver);
    }
}
