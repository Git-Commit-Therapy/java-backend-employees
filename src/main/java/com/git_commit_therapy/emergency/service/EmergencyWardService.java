package com.git_commit_therapy.emergency.service;

import com.git_commit_therapy.employeeService.service.EmployeeService;
import com.git_commit_therapy.proto.EmployeeServicesGrpc;
import com.git_commit_therapy.proto.EmployeeServicesOuterClass;
import com.git_commit_therapy.proto.MedicalEventOuterClass;
import com.git_commit_therapy.proto.UserOuterClass;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesGrpc;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.java.Log;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import static com.git_commit_therapy.employeeService.security.GrpcUtils.GrpcInterceptor;

@Log
@GrpcService
public class EmergencyWardService extends EmergencyWardServicesGrpc.EmergencyWardServicesImplBase {

    @Autowired
    private EmployeeService employeeService;
    //private final EmployeeServicesGrpc.EmployeeServicesBlockingStub stub;

    @Override
    public void addPatient(EmergencyWardServicesOuterClass.AddPatientRequest request, StreamObserver<EmergencyWardServicesOuterClass.AddPatientResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request, null, () -> {
            EmergencyWardServicesOuterClass.AddPatientResponse.Builder builder = EmergencyWardServicesOuterClass.AddPatientResponse.newBuilder();

            // 1 - Crea il patient se non esiste in database
            UserOuterClass.Patient patientRequest = UserOuterClass.Patient.newBuilder()
                    .setUser(request.getPatient().getUser())
                    .build();
            EmployeeServicesOuterClass.CreatePatientResponse response = null;//employeeService.createPatient(patientRequest);
            if (response.getSuccess()) {
                // 2 - Aggiungi un nuovo medical event
                MedicalEventOuterClass.MedicalEvent medicalEventRequest = MedicalEventOuterClass.MedicalEvent.newBuilder()
                        .setPatient(request.getPatient())
                        .setWard(request.getDoctor().getWard())
                        //.setEventId()
                        //.setMedicalExamIds()
                        .setSeverityCode(request.getSeverityCode())
                        //.setDischargeLetter(null)
                        .setFromDateTime(Timestamp.newBuilder().build())
                        //.setToDateTime()
                        .build();

                //stub.getMedicalEventDetails()
                EmployeeServicesOuterClass.CreateMedicalEventResponse response1 = null;//stub.createMedicalEvent(medicalEventRequest);
                if (response1.getSuccess()) {
                    return builder.setPatient(request.getPatient())
                            .setMedicalEventId(0)
                            .setEmergencyPatientId(request.getPatient().getUser().getId())
                            .build();
                }
            }
            else {
                return builder.setPatient(request.getPatient())
                        .setMedicalEventId(0)
                        .setEmergencyPatientId(request.getPatient().getUser().getId())
                        .build();
            }
            return null;
        });
    }

    @Override
    public void transferPatient(EmergencyWardServicesOuterClass.TransferPatientRequest request, StreamObserver<Empty> responseObserver) {
        super.transferPatient(request, responseObserver);

        //update medical event precedente (quello aperto) e lo chiude
        //create medical event nuovo con un ward diverso da emergency ward
    }

    @Override
    public void removePatient(EmergencyWardServicesOuterClass.RemovePatientRequest request, StreamObserver<Empty> responseObserver) {
        super.removePatient(request, responseObserver);

        //update campo dischargeLetter di Patient e quindi chiude il medical event aperto
    }

    @Override
    public void callPatientForVisit(EmergencyWardServicesOuterClass.CallPatientRequest request, StreamObserver<Empty> responseObserver) {
        super.callPatientForVisit(request, responseObserver);
        //crea un appuntamento e un medicalExam
    }
}
