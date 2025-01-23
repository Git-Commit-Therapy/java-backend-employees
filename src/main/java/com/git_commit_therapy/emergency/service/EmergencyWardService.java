package com.git_commit_therapy.emergency.service;

import com.git_commit_therapy.emergency.dao.EmergencyWardDao;
import com.git_commit_therapy.employeeService.dao.DoctorDao;
import com.git_commit_therapy.employeeService.dao.MedicalEventDao;
import com.git_commit_therapy.employeeService.dao.PatientDao;
import com.git_commit_therapy.employeeService.entity.*;
import com.git_commit_therapy.employeeService.transformer.EmployeeTransformer;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesGrpc;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.Claims;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


import java.util.Optional;

import static com.git_commit_therapy.employeeService.security.GrpcUtils.GrpcInterceptor;

@GrpcService
public class EmergencyWardService extends EmergencyWardServicesGrpc.EmergencyWardServicesImplBase {

    private final DoctorDao doctorDao;
    private final MedicalEventDao medicalEventDao;
    private final EmergencyWardDao emergencyWardDao;
    private final PatientDao patientDao;

    @Autowired
    public EmergencyWardService(DoctorDao doctorDao, MedicalEventDao medicalEventDao, EmergencyWardDao emergencyWardDao, PatientDao patientDao) {
        this.doctorDao = doctorDao;
        this.medicalEventDao = medicalEventDao;
        this.emergencyWardDao = emergencyWardDao;
        this.patientDao = patientDao;
    }

    private String getSubjectFromContext(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Claims info = (Claims) authentication.getCredentials();
            return info.getSubject();
        } else {
            return null;
        }
    }

    @Override
    public void addPatient(EmergencyWardServicesOuterClass.AddPatientRequest request, StreamObserver<EmergencyWardServicesOuterClass.AddPatientResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmergencyWardServicesOuterClass.AddPatientResponse.Builder builder = EmergencyWardServicesOuterClass.AddPatientResponse.newBuilder();
            // Get Patient from db
            Optional<Patient> patient = patientDao.findPatientById(request.getPatient().getUser().getId());
            if (patient.isPresent()) {
                // Get Doctor from db
                Optional<Doctor> doctor = doctorDao.getDoctorById(request.getDoctor().getUser().getId());
                if (doctor.isPresent()) {
                    // Create the MedicalEvent
                    SeverityCode severityCode = EmployeeTransformer.fromProto(request.getSeverityCode());
                    MedicalEvent medicalEvent = new MedicalEvent(severityCode, patient.get());
                    // Create the medicalExam
                    MedicalExam medicalExam = new MedicalExam(request.getMedicalReport(), request.getExamType(), doctor.get(), patient.get(), medicalEvent);
                    medicalEvent.addExam(medicalExam);
                    // Persist data
                    medicalEvent = medicalEventDao.upsert(medicalEvent);

                    // Add the patient to the emergency ward
                    String emIdentifier = emergencyWardDao.addPatient(patient.get(), severityCode);
                    builder.setPatient(request.getPatient());
                    builder.setEmergencyPatientId(emIdentifier);
                    builder.setMedicalEventId(medicalEvent.getId());
                    return builder.build();
                }
                throw Status.NOT_FOUND.withDescription("Doctor not found").asRuntimeException();
            }
            throw Status.NOT_FOUND.withDescription("Patient not found").asRuntimeException();
        });
    }

    @Override
    public void transferPatient(EmergencyWardServicesOuterClass.TransferPatientRequest request, StreamObserver<Empty> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()-> {
            Empty.Builder builder = Empty.newBuilder();

            Optional<Patient> patient = patientDao.findPatientById(request.getPatient().getUser().getId());
            if (patient.isPresent()) {
                // Remove the patient from the emergency ward
                boolean emIdentifier = emergencyWardDao.removePatient(patient.get());
                if (emIdentifier) {
                    // TODO: update medical event precedente (quello aperto) e lo chiude
                    // TODO: create medical event nuovo con un ward diverso da emergency ward
                    request.getWard();

                    return builder.build();
                }
                else {
                    throw Status.INTERNAL.withDescription("Patient not removed").asRuntimeException();
                }
            }
            throw Status.NOT_FOUND.withDescription("Patient not found").asRuntimeException();
        });
    }

    @Override
    public void removePatient(EmergencyWardServicesOuterClass.RemovePatientRequest request, StreamObserver<Empty> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()-> {
            Empty.Builder builder = Empty.newBuilder();

            Optional<Patient> patient = patientDao.findPatientById(request.getPatient().getUser().getId());
            if (patient.isPresent()) {
                // Chiude il medical event
                boolean closed = medicalEventDao.closeMedicalEvent(request.getMedicalEventId(), request.getPatient().getUser().getId());
                if (closed) {
                    // Remove the patient from the emergency ward
                    boolean emIdentifier = emergencyWardDao.removePatient(patient.get());
                    if (emIdentifier) {
                        return builder.build();
                    }
                    else {
                        throw Status.INTERNAL.withDescription("Patient not removed").asRuntimeException();
                    }
                }
                else {
                    throw Status.INTERNAL.withDescription("Medical Event not closed").asRuntimeException();
                }
            }
            throw Status.NOT_FOUND.withDescription("Patient not found").asRuntimeException();
        });
    }

    @Override
    public void callPatientForVisit(EmergencyWardServicesOuterClass.CallPatientRequest request, StreamObserver<Empty> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()-> {
            Empty.Builder builder = Empty.newBuilder();

            Optional<Patient> patient = patientDao.findPatientById(request.getPatient().getUser().getId());
            if (patient.isPresent()) {
                // TODO: crea un appuntamento e un medicalExam
                // ...

                // Call the patient for the visit
                boolean emIdentifier = emergencyWardDao.callPatient(patient.get(), request.getAmbulatory());
                if (emIdentifier) {
                    return builder.build();
                }
                else {
                    throw Status.INTERNAL.withDescription("Patient not called for visit").asRuntimeException();
                }
            }
            throw Status.NOT_FOUND.withDescription("Patient not found").asRuntimeException();
        });
    }
}
