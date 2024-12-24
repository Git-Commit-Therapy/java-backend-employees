package com.git_commit_therapy.employeeService.service;

import com.git_commit_therapy.employeeService.dao.*;
import com.git_commit_therapy.employeeService.entity.*;
import com.git_commit_therapy.employeeService.security.GrpcInterceptor;
import com.git_commit_therapy.employeeService.transformer.EmployeeTransformer;
import com.git_commit_therapy.proto.*;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.java.Log;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.client.RestClient;

import java.util.*;

import static com.git_commit_therapy.employeeService.security.GrpcUtils.GrpcInterceptor;
import static com.git_commit_therapy.employeeService.transformer.EmployeeTransformer.*;

@Log
//@GrpcService(interceptors = { GrpcInterceptor.class })
@GrpcService
public class EmployeeService extends EmployeeServicesGrpc.EmployeeServicesImplBase {

    private final AppointmentDao appointmentDao;
    private final DoctorDao doctorDao;
    private final MedicalEventDao medicalEventDao;
    private final MedicalExamDao medicalExamDao;
    private final MedicalInfoDao medicalInfoDao;
    private final StaffDao staffDao;
    private final RestClient.Builder builder;

    @Autowired
    public EmployeeService(AppointmentDao appointmentDao, DoctorDao doctorDao,
                           MedicalEventDao medicalEventDao, MedicalExamDao medicalExamDao,
                           MedicalInfoDao medicalInfoDao, StaffDao staffDao, RestClient.Builder builder) {
        this.appointmentDao = appointmentDao;
        this.doctorDao = doctorDao;
        this.medicalEventDao = medicalEventDao;
        this.medicalExamDao = medicalExamDao;
        this.medicalInfoDao = medicalInfoDao;
        this.staffDao = staffDao;
        this.builder = builder;
    }

    @SuppressWarnings("unchecked")
    private String getSidFromContext(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null){
            Map<String, Object> info =(Map<String, Object>) authentication.getCredentials();
            return (String) info.get("sid");
        } else{
            return null;
        }
    }

    @Override
    public void getDoctor(Empty request, StreamObserver<UserOuterClass.Doctor> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            UserOuterClass.Doctor.Builder builder = UserOuterClass.Doctor.newBuilder();

            Optional<Doctor> optionalDoctor = doctorDao.getDoctorById("1");
            if (optionalDoctor.isPresent()) {
                builder.setUser(toProto(optionalDoctor.get().getUser()));
                builder.setMedSpecialization(optionalDoctor.get().getMedSpecialization());
                builder.setOfficePhoneNumber(optionalDoctor.get().getOfficePhoneNumber());
            }
            /*String sid = getSidFromContext();
            if(sid != null){
                Optional<Doctor> optionalDoctor = doctorDao.getDoctorById(sid);
                if (optionalDoctor.isPresent()) {
                    builder.setUser(toProto(optionalDoctor.get().getUser()));
                    builder.setMedSpecialization(optionalDoctor.get().getMedSpecialization());
                    builder.setOfficePhoneNumber(optionalDoctor.get().getOfficePhoneNumber());
                    //builder.setWard(null);  // TODO: serve popolare questo campo? Come?
                }
            }*/
            return builder.build();
        });
    }

    @Override
    public void getAllDoctors(Empty request, StreamObserver<EmployeeServicesOuterClass.GetAllDoctorsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllDoctorsResponse.Builder builder = EmployeeServicesOuterClass.GetAllDoctorsResponse.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                List<Doctor> doctorList = doctorDao.findAll();
                if (doctorList != null && !doctorList.isEmpty()){
                    doctorList.stream().map(EmployeeTransformer::toProto).forEach(builder::addDoctors);
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getStaff(Empty request, StreamObserver<UserOuterClass.Staff> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            UserOuterClass.Staff.Builder builder = UserOuterClass.Staff.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                Optional<Staff> optionalStaff = staffDao.findStaffById(sid);
                if (optionalStaff.isPresent()) {
                    builder.setUser(EmployeeTransformer.toProto(optionalStaff.get().getUser()));
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getAllStaffs(Empty request, StreamObserver<EmployeeServicesOuterClass.GetAllStaffsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllStaffsResponse.Builder builder = EmployeeServicesOuterClass.GetAllStaffsResponse.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                List<Staff> staffList = staffDao.findAll();
                if (staffList != null && !staffList.isEmpty()){
                    staffList.stream().map(EmployeeTransformer::toProto).forEach(builder::addStaffs);
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getAppointments(EmployeeServicesOuterClass.GetAppointmentsRequest request, StreamObserver<EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAppointmentsResponse.Builder builder = EmployeeServicesOuterClass.GetAppointmentsResponse.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                // TODO: da capire il sid
                Patient resFromDB = null;   //.getPatientBySid(sid);
                if (resFromDB != null){
                    Date from = EmployeeTransformer.convertToDate(request.getFromDate());
                    Date to = EmployeeTransformer.convertToDate(request.getToDate());
                    List<Appointment> appointments = appointmentDao.findAll(resFromDB.getPatientId(), from, to);
                    if (appointments != null){
                        appointments.stream().map(EmployeeTransformer::toProto).forEach(builder::addAppointments);
                    }
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getAppointmentDetails(AppointmentOuterClass.Appointment request, StreamObserver<EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAppointmentsResponse.Builder builder = EmployeeServicesOuterClass.GetAppointmentsResponse.newBuilder();
            String sid = getSidFromContext();
            if (sid != null){
                Optional<Appointment> optionalAppointment = appointmentDao.findAppointmentById(request.getAppointmentId());
                if (optionalAppointment.isPresent()) {
                    EmployeeTransformer.toProto(optionalAppointment.get()); // TODO: rivedere perchè da cambiare proto di response
                }
            }
            return builder.build();
        });
    }

    @Override
    public void modifyAppointment(AppointmentOuterClass.Appointment request, StreamObserver<EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.ModifyAppointmentResponse.Builder builder = EmployeeServicesOuterClass.ModifyAppointmentResponse.newBuilder();
            String sid = getSidFromContext();
            if (sid != null){
                // prepare appointment to be edit
                Appointment appointment = new Appointment();
                appointment.setId(request.getAppointmentId());
                appointment.setDateTime(convertToDate(request.getDateTime()));
                appointment.setStaff(toEntity(request.getStaff()));
                appointment.setDoctor(toEntity(request.getDoctor()));
                appointment.setPatient(toEntity(request.getPatient()));

                Appointment savedAppointment = appointmentDao.upsert(appointment);

                if (savedAppointment != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Appointment updated successfully");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Appointment not updated");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void createAppointment(AppointmentOuterClass.Appointment request, StreamObserver<EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateAppointmentResponse.Builder builder = EmployeeServicesOuterClass.CreateAppointmentResponse.newBuilder();
            String sid = getSidFromContext();
            if (sid != null){
                // prepare appointment to be edit
                Appointment appointment = new Appointment();
                appointment.setId(request.getAppointmentId());
                appointment.setDateTime(convertToDate(request.getDateTime()));
                appointment.setStaff(toEntity(request.getStaff()));
                appointment.setDoctor(toEntity(request.getDoctor()));
                appointment.setPatient(toEntity(request.getPatient()));

                Appointment savedAppointment = appointmentDao.upsert(appointment);

                if (savedAppointment != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Appointment created successfully");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Appointment not created");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getAllMedicalExam(EmployeeServicesOuterClass.GetAllMedicalExamRequest request, StreamObserver<EmployeeServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllMedicalExamResponse.Builder builder = EmployeeServicesOuterClass.GetAllMedicalExamResponse.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                Optional<Doctor> optionalDoctor = doctorDao.getDoctorById(sid);
                if (optionalDoctor.isPresent()) {
                    Date from = EmployeeTransformer.convertToDate(request.getFromDate());
                    Date to = EmployeeTransformer.convertToDate(request.getToDate());
                    List<MedicalExam> medicalExams = medicalExamDao.findAll(optionalDoctor.get().getDoctorId(),from,to);
                    if (medicalExams != null){
                        medicalExams.stream().map(EmployeeTransformer::toProtoReduced).forEach(builder::addMedicalExams);
                    }
                }
            }
            return builder.build();
        });
    }

    @Override
    public void createMedicalExam(MedicalExamOuterClass.MedicalExam request, StreamObserver<EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateMedicalExamResponse.Builder builder = EmployeeServicesOuterClass.CreateMedicalExamResponse.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                MedicalExam medicalExam = new MedicalExam();
                medicalExam.setId(request.getExamId());
                medicalExam.setDateTime(convertToDate(request.getDateTime()));
                medicalExam.setMedicalReport(request.getMedicalReport());
                medicalExam.setExamType(request.getExamType());
                medicalExam.setDoctor(toEntity(request.getDoctor()));
                medicalExam.setPatient(toEntity(request.getPatient()));
                medicalExam.setMedicalEvent(request.getMedicalEvent().getEventId());

                MedicalExam savedMedicalExam = medicalExamDao.insert(medicalExam);

                if (savedMedicalExam != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Successfully created medical exam");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Medical exam not created");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void createMedicalEvent(MedicalEventOuterClass.MedicalEvent request, StreamObserver<EmployeeServicesOuterClass.CreateMedicalEventResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateMedicalEventResponse.Builder builder = EmployeeServicesOuterClass.CreateMedicalEventResponse.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                MedicalEvent medicalEvent = new MedicalEvent();
                medicalEvent.setId(request.getEventId());
                medicalEvent.setPatientID(request.getPatient().getUser().getId());
                medicalEvent.setFromDateTime(convertToDate(request.getFromDateTime()));
                medicalEvent.setToDateTime(convertToDate(request.getToDateTime()));
                medicalEvent.setSeverity(SeverityCode.valueOf(request.getSeverityCode().name()));
                medicalEvent.setDischargeLetter(request.getDischargeLetter());
                medicalEvent.setExams(retrieveMedialExamList(request.getMedicalExamIdsList()));
                medicalEvent.setWard(toEntity(request.getWard()));

                MedicalEvent savedMedicalEvent = medicalEventDao.insert(medicalEvent);

                if (savedMedicalEvent != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Successfully created medical event");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Medical event not created");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void createMedicalInfo(MedicalInfoOuterClass.MedicalInfo request, StreamObserver<EmployeeServicesOuterClass.CreateMedicalInfoResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateMedicalInfoResponse.Builder builder = EmployeeServicesOuterClass.CreateMedicalInfoResponse.newBuilder();
            String sid = getSidFromContext();
            if(sid != null){
                MedicalInfo medicalInfo = new MedicalInfo();
                medicalInfo.setId(request.getMedicalInfoId());
                medicalInfo.setDescription(request.getDescription());
                medicalInfo.setPatientID(toEntity(request.getPatient()));

                MedicalInfo savedMedicalInfo = medicalInfoDao.insert(medicalInfo);

                if (savedMedicalInfo != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Successfully created medical info");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Medical info not created");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request, StreamObserver<EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.Builder builder = EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.newBuilder();
            String sid = getSidFromContext();
            if (sid != null){
                Optional<MedicalExam> optionalMedicalExam = medicalExamDao.findMedicalExamById(request.getExamId());
                if (optionalMedicalExam.isPresent()) {
                    builder.setExam(EmployeeTransformer.toProto(optionalMedicalExam.get()));
                }
            }
            return builder.build();
        });
    }

    /**
     * Utility methods
     */

    private List<MedicalExam> retrieveMedialExamList(List<Integer> medicalExamIdsList) {
        List<MedicalExam> medicalExamList = new ArrayList<>();

        for (Integer medicalExamId : medicalExamIdsList) {
            Optional<MedicalExam> medicalExam = medicalExamDao.findMedicalExamById(medicalExamId);
            medicalExam.ifPresent(medicalExamList::add);
        }

        return medicalExamList;
    }
}
