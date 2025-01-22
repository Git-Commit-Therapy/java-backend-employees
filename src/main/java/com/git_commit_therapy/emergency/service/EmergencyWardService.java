package com.git_commit_therapy.emergency.service;

import com.git_commit_therapy.employeeService.service.EmployeeService;
import com.git_commit_therapy.proto.EmployeeServicesOuterClass;
import com.git_commit_therapy.proto.MedicalEventOuterClass;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesGrpc;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.java.Log;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@Log
@GrpcService
public class EmergencyWardService extends EmergencyWardServicesGrpc.EmergencyWardServicesImplBase {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void addPatient(EmergencyWardServicesOuterClass.AddPatientRequest request, StreamObserver<EmergencyWardServicesOuterClass.AddPatientResponse> responseObserver) {
        super.addPatient(request, responseObserver);

        // TODO: completare campi mancanti commentati
        // Costruisci la richiesta
        MedicalEventOuterClass.MedicalEvent medicalEventRequest = MedicalEventOuterClass.MedicalEvent.newBuilder()
                .setPatient(request.getPatient())
                .setWard(request.getDoctor().getWard())
                //.setEventId()
                //.setMedicalExamIds()
                .setSeverityCode(request.getSeverityCode())
                //.setDischargeLetter()
                //.setFromDateTime()
                //.setToDateTime()
                .build();

        // Crea un observer personalizzato per catturare la risposta (callback)
        StreamObserver<EmployeeServicesOuterClass.CreateMedicalEventResponse> createMedicalEventObserver =
            new StreamObserver<>() {
                @Override
                public void onNext(EmployeeServicesOuterClass.CreateMedicalEventResponse response) {
                    // Costruisci la risposta del metodo corrente utilizzando i dati ricevuti
                    // TODO: capire valori di ritorno perchè createMedicalEvent() non torna i dati del MedicalEvent appena creato
                    EmergencyWardServicesOuterClass.AddPatientResponse addPatientResponse = EmergencyWardServicesOuterClass.AddPatientResponse.newBuilder()
                            //.setPatient()
                            //.setEmergencyPatientId()
                            //.setMedicalEventId()
                            .build();

                    responseObserver.onNext(addPatientResponse);
                }

                @Override
                public void onError(Throwable t) {
                    // Gestione dell'errore
                    responseObserver.onError(t);
                }

                @Override
                public void onCompleted() {
                    // Completa la chiamata
                    responseObserver.onCompleted();
                }
            };

        // Richiama il metodo createMedicalEvent
        employeeService.createMedicalEvent(medicalEventRequest, createMedicalEventObserver);

        //crea il patient se non esiste in database
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
