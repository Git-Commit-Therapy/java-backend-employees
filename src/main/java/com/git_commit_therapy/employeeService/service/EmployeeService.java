package com.git_commit_therapy.employeeService.service;

import com.git_commit_therapy.employeeService.dao.*;
import com.git_commit_therapy.employeeService.entity.*;
import com.git_commit_therapy.employeeService.transformer.EmployeeTransformer;
import com.git_commit_therapy.proto.*;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.Claims;
import lombok.extern.java.Log;
import net.devh.boot.grpc.server.service.GrpcService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.*;
import java.util.stream.Collectors;

import static com.git_commit_therapy.employeeService.security.GrpcUtils.GrpcInterceptor;
import static com.git_commit_therapy.employeeService.transformer.EmployeeTransformer.*;
import static com.git_commit_therapy.employeeService.transformer.EmployeeTransformer.toEntity;

@Log
@GrpcService
public class EmployeeService extends EmployeeServicesGrpc.EmployeeServicesImplBase {

    private final AppointmentDao appointmentDao;
    private final DoctorDao doctorDao;
    private final MedicalEventDao medicalEventDao;
    private final MedicalExamDao medicalExamDao;
    private final MedicalInfoDao medicalInfoDao;
    private final StaffDao staffDao;
    private final PatientDao patientDao;
    private final WardDao wardDao;

    @Autowired
    public EmployeeService(AppointmentDao appointmentDao, DoctorDao doctorDao,
                           MedicalEventDao medicalEventDao, MedicalExamDao medicalExamDao,
                           MedicalInfoDao medicalInfoDao, StaffDao staffDao, PatientDao patientDao,
                           WardDao wardDao) {
        this.appointmentDao = appointmentDao;
        this.doctorDao = doctorDao;
        this.medicalEventDao = medicalEventDao;
        this.medicalExamDao = medicalExamDao;
        this.medicalInfoDao = medicalInfoDao;
        this.staffDao = staffDao;
        this.patientDao = patientDao;
        this.wardDao = wardDao;
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
    public void getDoctor(Empty request, StreamObserver<UserOuterClass.Doctor> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            UserOuterClass.Doctor.Builder builder = UserOuterClass.Doctor.newBuilder();
            String sid = getSubjectFromContext();
            if(sid != null){
                Optional<Doctor> optionalDoctor = doctorDao.getDoctorById(sid);
                if (optionalDoctor.isPresent()) {
                    builder.setUser(toProto(optionalDoctor.get().getUser()));
                    builder.setMedSpecialization(optionalDoctor.get().getMedSpecialization());
                    builder.setOfficePhoneNumber(optionalDoctor.get().getOfficePhoneNumber());
                    builder.setWard(toProto(optionalDoctor.get().getWard()));
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getAllDoctors(Empty request, StreamObserver<EmployeeServicesOuterClass.GetAllDoctorsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllDoctorsResponse.Builder builder = EmployeeServicesOuterClass.GetAllDoctorsResponse.newBuilder();
            String sid = getSubjectFromContext();
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
            String sid = getSubjectFromContext();
            if(sid != null){
                Optional<Staff> optionalStaff = staffDao.findStaffById(sid);
                optionalStaff.ifPresent(staff -> builder.setUser(EmployeeTransformer.toProto(staff.getUser())));
            }
            return builder.build();
        });
    }

    @Override
    public void getAllStaffs(Empty request, StreamObserver<EmployeeServicesOuterClass.GetAllStaffsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllStaffsResponse.Builder builder = EmployeeServicesOuterClass.GetAllStaffsResponse.newBuilder();
            String sid = getSubjectFromContext();
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
    public void getPatient(Empty request, StreamObserver<UserOuterClass.Patient> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            UserOuterClass.Patient.Builder builder = UserOuterClass.Patient.newBuilder();
            String sid = getSubjectFromContext();
            if(sid != null){
                Optional<Patient> optionalPatient = patientDao.findPatientById(sid);
                optionalPatient.ifPresent(patient -> builder.setUser(EmployeeTransformer.toProto(patient.getUser())));
            }
            return builder.build();
        });
    }

    @Override
    public void getAllPatients(Empty request, StreamObserver<EmployeeServicesOuterClass.GetAllPatientsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllPatientsResponse.Builder builder = EmployeeServicesOuterClass.GetAllPatientsResponse.newBuilder();
            String sid = getSubjectFromContext();
            if(sid != null){
                List<Patient> patientList = patientDao.findAll();
                if (patientList != null && !patientList.isEmpty()){
                    patientList.stream().map(EmployeeTransformer::toProto).forEach(builder::addPatients);
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getAppointments(EmployeeServicesOuterClass.GetAppointmentsRequest request, StreamObserver<EmployeeServicesOuterClass.GetAppointmentsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAppointmentsResponse.Builder builder = EmployeeServicesOuterClass.GetAppointmentsResponse.newBuilder();
            String sid = getSubjectFromContext();
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
    public void getAppointmentDetails(AppointmentOuterClass.Appointment request, StreamObserver<EmployeeServicesOuterClass.GetAppointmentDetailsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAppointmentDetailsResponse.Builder builder = EmployeeServicesOuterClass.GetAppointmentDetailsResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                Optional<Appointment> optionalAppointment = appointmentDao.findAppointmentById(request.getAppointmentId());
                optionalAppointment.ifPresent(EmployeeTransformer::toProto);
            }
            return builder.build();
        });
    }

    @Override
    public void getAllMedicalExam(EmployeeServicesOuterClass.GetAllMedicalExamRequest request, StreamObserver<EmployeeServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllMedicalExamResponse.Builder builder = EmployeeServicesOuterClass.GetAllMedicalExamResponse.newBuilder();
            String sid = getSubjectFromContext();
            if(sid != null){
                Optional<Doctor> optionalDoctor = doctorDao.getDoctorById(sid);
                if (optionalDoctor.isPresent()) {
                    Date from = EmployeeTransformer.convertToDate(request.getFromDate());
                    Date to = EmployeeTransformer.convertToDate(request.getToDate());
                    List<MedicalExam> medicalExams = medicalExamDao.findAll(optionalDoctor.get().getDoctorId(), from, to);
                    if (medicalExams != null){
                        medicalExams.stream().map(EmployeeTransformer::toProtoReduced).forEach(builder::addMedicalExams);
                    }
                }
            }
            return builder.build();
        });
    }

    @Override
    public void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request, StreamObserver<EmployeeServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.Builder builder = EmployeeServicesOuterClass.GetMedicalExamDetailsResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                Optional<MedicalExam> optionalMedicalExam = medicalExamDao.findMedicalExamById(request.getExamId());
                optionalMedicalExam.ifPresent(medicalExam -> builder.setExam(EmployeeTransformer.toProto(medicalExam)));
            }
            return builder.build();
        });
    }

   @Override
    public void getAllMedicalEvent(EmployeeServicesOuterClass.GetAllMedicalEventRequest request, StreamObserver<EmployeeServicesOuterClass.GetAllMedicalEventResponse> responseObserver) {
       GrpcInterceptor(responseObserver, request,null,()->{
           EmployeeServicesOuterClass.GetAllMedicalEventResponse.Builder builder = EmployeeServicesOuterClass.GetAllMedicalEventResponse.newBuilder();
           String sid = getSubjectFromContext();
           if(sid != null){
               Optional<Doctor> optionalDoctor = doctorDao.getDoctorById(sid);
               if (optionalDoctor.isPresent()) {
                   Date from = EmployeeTransformer.convertToDate(request.getFromDate());
                   Date to = EmployeeTransformer.convertToDate(request.getToDate());
                   List<MedicalEvent> medicalEvents = medicalEventDao.findAll(optionalDoctor.get().getDoctorId(), from, to);
                   if (medicalEvents != null){
                       medicalEvents.stream().map(EmployeeTransformer::toProto).forEach(builder::addMedicalEvent);
                   }
               }
           }
           return builder.build();
       });
    }

    @Override
    public void getMedicalEventDetails(MedicalEventOuterClass.MedicalEvent request, StreamObserver<EmployeeServicesOuterClass.GetMedicalEventDetailsResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetMedicalEventDetailsResponse.Builder builder = EmployeeServicesOuterClass.GetMedicalEventDetailsResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                Optional<MedicalEvent> optionalMedicalEvent = medicalEventDao.findMedicalEventById(request.getEventId());
                optionalMedicalEvent.ifPresent(medicalEvent -> builder.setEvent(EmployeeTransformer.toProto(medicalEvent)));
            }
            return builder.build();
        });
    }

    @Override
    public void getAllWard(Empty request, StreamObserver<EmployeeServicesOuterClass.GetAllWardResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.GetAllWardResponse.Builder builder = EmployeeServicesOuterClass.GetAllWardResponse.newBuilder();
            String sid = getSubjectFromContext();
            if(sid != null){
                List<Ward> wardList = wardDao.findAll();
                if (wardList != null && !wardList.isEmpty()){
                    wardList.stream().map(EmployeeTransformer::toProto).forEach(builder::addWard);
                }
            }
            return builder.build();
        });
    }

    @Override
    public void createMedicalExam(MedicalExamOuterClass.MedicalExam request, StreamObserver<EmployeeServicesOuterClass.CreateMedicalExamResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateMedicalExamResponse.Builder builder = EmployeeServicesOuterClass.CreateMedicalExamResponse.newBuilder();
            String sid = getSubjectFromContext();
            if(sid != null){
                MedicalExam medicalExam = new MedicalExam();
                medicalExam.setId(request.getExamId());
                medicalExam.setDateTime(convertToDate(request.getDateTime()));
                medicalExam.setMedicalReport(request.getMedicalReport());
                medicalExam.setExamType(request.getExamType());
                medicalExam.setDoctor(toEntity(request.getDoctor()));
                medicalExam.setPatient(toEntity(request.getPatient()));
                medicalExam.setMedicalEvent(toEntity(request.getMedicalEvent()));

                MedicalExam savedMedicalExam = medicalExamDao.upsert(medicalExam);

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
            String sid = getSubjectFromContext();
            if(sid != null){
                MedicalEvent medicalEvent = new MedicalEvent();
                medicalEvent.setId(request.getEventId());
                medicalEvent.setPatient(request.getPatient().getUser());
                medicalEvent.setFromDateTime(convertToDate(request.getFromDateTime()));
                medicalEvent.setToDateTime(convertToDate(request.getToDateTime()));
                medicalEvent.setSeverity(SeverityCode.valueOf(request.getSeverityCode().name()));
                medicalEvent.setDischargeLetter(request.getDischargeLetter());
                medicalEvent.setExams(retrieveMedialExamList(request.getMedicalExamIdsList()));
                medicalEvent.setWard(toEntity(request.getWard()));

                MedicalEvent savedMedicalEvent = medicalEventDao.upsert(medicalEvent);

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
            String sid = getSubjectFromContext();
            if(sid != null){
                MedicalInfo medicalInfo = new MedicalInfo();
                medicalInfo.setId(request.getMedicalInfoId());
                medicalInfo.setDescription(request.getDescription());
                medicalInfo.setPatientID(toEntity(request.getPatient()));

                MedicalInfo savedMedicalInfo = medicalInfoDao.upsert(medicalInfo);

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
    public void createAppointment(AppointmentOuterClass.Appointment request, StreamObserver<EmployeeServicesOuterClass.CreateAppointmentResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateAppointmentResponse.Builder builder = EmployeeServicesOuterClass.CreateAppointmentResponse.newBuilder();
            String sid = getSubjectFromContext();
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
    public void createPatient(UserOuterClass.Patient request, StreamObserver<EmployeeServicesOuterClass.CreatePatientResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreatePatientResponse.Builder builder = EmployeeServicesOuterClass.CreatePatientResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // prepare patient to be inserted
                Patient patient = new Patient();
                patient.setPatientId(request.getUser().getId());
                patient.setMedicalInfos(null);
                patient.setUser(toEntity(request.getUser()));

                Patient savedPatient = patientDao.upsert(patient);

                if (savedPatient != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Patient created successfully");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Patient not created");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void createDoctor(UserOuterClass.Doctor request, StreamObserver<EmployeeServicesOuterClass.CreateDoctorResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateDoctorResponse.Builder builder = EmployeeServicesOuterClass.CreateDoctorResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // prepare doctor to be inserted
                Doctor doctor = new Doctor();
                doctor.setDoctorId(request.getUser().getId());
                doctor.setOfficePhoneNumber(request.getOfficePhoneNumber());
                doctor.setMedSpecialization(request.getMedSpecialization());
                doctor.setUser(toEntity(request.getUser()));
                doctor.setWard(toEntity(request.getWard()));

                Doctor savedDoctor = doctorDao.upsert(doctor);

                if (savedDoctor != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Doctor created successfully");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Doctor not created");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void createWard(WardOuterClass.Ward request, StreamObserver<EmployeeServicesOuterClass.CreateWardResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.CreateWardResponse.Builder builder = EmployeeServicesOuterClass.CreateWardResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // prepare ward to be inserted
                Ward ward = toEntity(request);
                Ward savedWard = wardDao.upsert(ward);

                if (savedWard != null) {
                    builder.setSuccess(true);
                    builder.setMessage("Ward created successfully");
                }
                else {
                    builder.setSuccess(false);
                    builder.setMessage("Ward not created");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void modifyAppointment(AppointmentOuterClass.Appointment request, StreamObserver<EmployeeServicesOuterClass.ModifyAppointmentResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.ModifyAppointmentResponse.Builder builder = EmployeeServicesOuterClass.ModifyAppointmentResponse.newBuilder();
            String sid = getSubjectFromContext();
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
    public void modifyPatient(UserOuterClass.Patient request, StreamObserver<EmployeeServicesOuterClass.ModifyPatientResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.ModifyPatientResponse.Builder builder = EmployeeServicesOuterClass.ModifyPatientResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // Prepare patient to be edit
                Optional<Patient> optionalPatient = patientDao.findPatientById(request.getUser().getId());
                if(optionalPatient.isPresent()){
                    Patient patient = optionalPatient.get();
                    if (StringUtils.isNotBlank(request.getUser().getName())) patient.getUser().setName(request.getUser().getName());
                    if (StringUtils.isNotBlank(request.getUser().getEmail())) patient.getUser().setEmail(request.getUser().getEmail());
                    if (StringUtils.isNotBlank(request.getUser().getPhoneNumber())) patient.getUser().setPhoneNumber(request.getUser().getPhoneNumber());
                    if (StringUtils.isNotBlank(request.getUser().getSurname())) patient.getUser().setSurname(request.getUser().getSurname());
                    //if (request.getUser().getBirthDate() != null) patient.getUser().setDateOfBirth(convertToDate(request.getUser().getBirthDate()));

                    Patient savedPatient = patientDao.upsert(patient);
                    if (savedPatient != null) {
                        builder.setSuccess(true);
                        builder.setMessage("Patient updated successfully");
                    }
                    else {
                        builder.setSuccess(false);
                        builder.setMessage("Patient not updated");
                    }
                } else {
                    builder.setSuccess(false);
                    builder.setMessage("Patient not found");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void modifyDoctor(UserOuterClass.Doctor request, StreamObserver<EmployeeServicesOuterClass.ModifyDoctorResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.ModifyDoctorResponse.Builder builder = EmployeeServicesOuterClass.ModifyDoctorResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // Prepare doctor to be edit
                Optional<Doctor> optionalDoctor = doctorDao.getDoctorById(request.getUser().getId());
                if(optionalDoctor.isPresent()){
                    Doctor doctor = optionalDoctor.get();
                    if (StringUtils.isNotBlank(request.getUser().getName())) doctor.getUser().setName(request.getUser().getName());
                    if (StringUtils.isNotBlank(request.getUser().getEmail())) doctor.getUser().setEmail(request.getUser().getEmail());
                    if (StringUtils.isNotBlank(request.getUser().getPhoneNumber())) doctor.getUser().setPhoneNumber(request.getUser().getPhoneNumber());
                    if (StringUtils.isNotBlank(request.getUser().getSurname())) doctor.getUser().setSurname(request.getUser().getSurname());
                    //if (request.getUser().getBirthDate() != null) patient.getUser().setDateOfBirth(convertToDate(request.getUser().getBirthDate()));

                    Doctor savedDoctor = doctorDao.upsert(doctor);
                    if (savedDoctor != null) {
                        builder.setSuccess(true);
                        builder.setMessage("Doctor updated successfully");
                    }
                    else {
                        builder.setSuccess(false);
                        builder.setMessage("Doctor not updated");
                    }
                } else {
                    builder.setSuccess(false);
                    builder.setMessage("Doctor not found");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void modifyMedicalEvent(MedicalEventOuterClass.MedicalEvent request, StreamObserver<EmployeeServicesOuterClass.ModifyMedicalEventResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.ModifyMedicalEventResponse.Builder builder = EmployeeServicesOuterClass.ModifyMedicalEventResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // Prepare medicalEvent to be edit
                Optional<MedicalEvent> optionalMedicalEvent = medicalEventDao.findMedicalEventById(request.getEventId());
                if(optionalMedicalEvent.isPresent()){
                    MedicalEvent medicalEvent = optionalMedicalEvent.get();
                    if (request.hasWard()) medicalEvent.setWard(toEntity(request.getWard()));
                    if (request.getMedicalExamIdsList() != null){
                        List<MedicalExam> medicalExamList = request.getMedicalExamIdsList().stream()
                                .map(medicalExamId -> medicalExamDao.findMedicalExamById(medicalExamId).orElse(null)).collect(Collectors.toList());
                        medicalEvent.setExams(medicalExamList);
                    }
                    if (request.getSeverityCode() != null) medicalEvent.setSeverity(SeverityCode.valueOf(request.getSeverityCode().name()));
                    if (StringUtils.isNotBlank(request.getDischargeLetter())) medicalEvent.setDischargeLetter(request.getDischargeLetter());
                    if (request.hasFromDateTime()) medicalEvent.setFromDateTime(convertToDate(request.getFromDateTime()));
                    if (request.hasToDateTime()) medicalEvent.setToDateTime(convertToDate(request.getToDateTime()));

                    MedicalEvent savedMedicalEvent = medicalEventDao.upsert(medicalEvent);
                    if (savedMedicalEvent != null) {
                        builder.setSuccess(true);
                        builder.setMessage("Medical Event updated successfully");
                    }
                    else {
                        builder.setSuccess(false);
                        builder.setMessage("Medical Event not updated");
                    }
                } else {
                    builder.setSuccess(false);
                    builder.setMessage("Medical Event not found");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void modifyMedicalExam(MedicalExamOuterClass.MedicalExam request, StreamObserver<EmployeeServicesOuterClass.ModifyMedicalExamResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.ModifyMedicalExamResponse.Builder builder = EmployeeServicesOuterClass.ModifyMedicalExamResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // Prepare medicalExam to be edit
                Optional<MedicalExam> optionalMedicalExam = medicalExamDao.findMedicalExamById(request.getExamId());
                if(optionalMedicalExam.isPresent()){
                    MedicalExam medicalExam = optionalMedicalExam.get();
                    if (request.hasDateTime()) medicalExam.setDateTime(convertToDate(request.getDateTime()));
                    if (request.hasDoctor()) medicalExam.setDoctor(toEntity(request.getDoctor()));
                    if (request.hasMedicalEvent()) medicalExam.setMedicalEvent(request.getMedicalEvent().getEventId());
                    if (StringUtils.isNotBlank(request.getExamType())) medicalExam.setExamType(request.getExamType());
                    if (StringUtils.isNotBlank(request.getMedicalReport())) medicalExam.setMedicalReport(request.getMedicalReport());

                    MedicalExam savedMedicalExam = medicalExamDao.upsert(medicalExam);
                    if (savedMedicalExam != null) {
                        builder.setSuccess(true);
                        builder.setMessage("Medical Exam updated successfully");
                    }
                    else {
                        builder.setSuccess(false);
                        builder.setMessage("Medical Exam not updated");
                    }
                } else {
                    builder.setSuccess(false);
                    builder.setMessage("Medical Exam not found");
                }
            }
            return builder.build();
        });
    }

    @Override
    public void modifyMedicalInfo(MedicalInfoOuterClass.MedicalInfo request, StreamObserver<EmployeeServicesOuterClass.ModifyMedicalInfoResponse> responseObserver) {
        GrpcInterceptor(responseObserver, request,null,()->{
            EmployeeServicesOuterClass.ModifyMedicalInfoResponse.Builder builder = EmployeeServicesOuterClass.ModifyMedicalInfoResponse.newBuilder();
            String sid = getSubjectFromContext();
            if (sid != null){
                // Prepare medicalInfo to be edit
                Optional<MedicalInfo> optionalMedicalInfo = medicalInfoDao.findMedicalInfoById(request.getMedicalInfoId());
                if(optionalMedicalInfo.isPresent()){
                    MedicalInfo medicalInfo = optionalMedicalInfo.get();
                    if (StringUtils.isNotBlank(request.getDescription())) medicalInfo.setDescription(request.getDescription());

                    MedicalInfo savedMedicalInfo = medicalInfoDao.upsert(medicalInfo);
                    if (savedMedicalInfo != null) {
                        builder.setSuccess(true);
                        builder.setMessage("Medical Info updated successfully");
                    }
                    else {
                        builder.setSuccess(false);
                        builder.setMessage("Medical Info not updated");
                    }
                } else {
                    builder.setSuccess(false);
                    builder.setMessage("Medical Info not found");
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
