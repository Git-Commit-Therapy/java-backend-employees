package com.git_commit_therapy.emergency.service;

import com.git_commit_therapy.emergency.dao.EmergencyWardDao;
import com.git_commit_therapy.employeeService.dao.DoctorDao;
import com.git_commit_therapy.employeeService.dao.MedicalEventDao;
import com.git_commit_therapy.employeeService.dao.PatientDao;
import com.git_commit_therapy.employeeService.entity.*;
import com.git_commit_therapy.employeeService.repository.DoctorRepository;
import com.git_commit_therapy.employeeService.repository.PatientRepository;
import com.git_commit_therapy.employeeService.transformer.EmployeeTransformer;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesGrpc;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.Claims;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


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
            //Get Patient from db
            Patient patient = patientDao.findById(request.getPatient().getUser().getId());
            //Get Doctor from db
            Doctor doctor = doctorDao.getDoctorById(request.getDoctor().getUser().getId());
            //Create the MedicalEvent
            SeverityCode severityCode = EmployeeTransformer.fromProto(request.getSeverityCode());
            MedicalEvent medicalEvent = new MedicalEvent(severityCode,patient);
            //Create the medicalExam
            MedicalExam medicalExam = new MedicalExam(request.getMedicalReport(),request.getExamType(),doctor,patient,medicalEvent);
            medicalEvent.addExam(medicalExam);
            //Persist data
            medicalEvent = medicalEventDao.save(medicalEvent);
            //Add the patient to the emergency ward
            String emIdentifier = emergencyWardDao.addPatient(patient,severityCode);
            builder.setPatient(request.getPatient());
            builder.setEmergencyPatientId(emIdentifier);
            builder.setMedicalEventId(medicalEvent.getId());
            return builder.build();
        });
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
