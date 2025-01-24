package com.git_commit_therapy.emergency.service;

import com.git_commit_therapy.emergency.dao.EmergencyWardDao;
import com.git_commit_therapy.emergency.transformer.EmergencyWardPanelsTransformer;
import com.git_commit_therapy.proto.emergency.EmergencyWardPanelsServiceGrpc;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import static com.git_commit_therapy.employeeService.security.GrpcUtils.GrpcInterceptor;

@GrpcService
public class PanelsService extends EmergencyWardPanelsServiceGrpc.EmergencyWardPanelsServiceImplBase {

    private final EmergencyWardDao emergencyWardDao;

    @Autowired
    public PanelsService(EmergencyWardDao emergencyWardDao) {
        this.emergencyWardDao = emergencyWardDao;
    }

    @Override
    public void retrieveNeedToBeVisitedStatus(Empty request, StreamObserver<EmergencyWardServicesOuterClass.QueueStatusResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            return EmergencyWardPanelsTransformer.toProto(emergencyWardDao.getNeedToBeVisitedStatus());
        });
    }

    @Override
    public void retrieveInVisitingStatus(Empty request, StreamObserver<EmergencyWardServicesOuterClass.QueueStatusResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            return EmergencyWardPanelsTransformer.toProto(emergencyWardDao.getInVisitingStatus());
        });
    }

    @Override
    public void retrieveLastPatientsCalled(Empty request, StreamObserver<EmergencyWardServicesOuterClass.LastPatientsCalledResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            return EmergencyWardPanelsTransformer.toProto(emergencyWardDao.getCalledPatients());
        });
    }
}
