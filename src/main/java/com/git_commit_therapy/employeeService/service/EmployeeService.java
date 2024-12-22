package com.git_commit_therapy.employeeService.service;

import com.git_commit_therapy.employeeService.dao.*;
import com.git_commit_therapy.employeeService.entity.Appointment;
import com.git_commit_therapy.employeeService.entity.Doctor;
import com.git_commit_therapy.employeeService.entity.MedicalExam;
import com.git_commit_therapy.employeeService.entity.Staff;
import com.git_commit_therapy.employeeService.transformer.EmployeeTransformer;
import com.git_commit_therapy.proto.AppointmentOuterClass;
import com.git_commit_therapy.proto.EmployeeServicesGrpc;
import com.git_commit_therapy.proto.EmployeeServicesOuterClass;
import com.git_commit_therapy.proto.UserOuterClass;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.git_commit_therapy.employeeService.security.GrpcUtils.GrpcInterceptor;
import static com.git_commit_therapy.employeeService.transformer.EmployeeTransformer.convertToDate;
import static com.git_commit_therapy.employeeService.transformer.EmployeeTransformer.toEntity;

@GrpcService
public class EmployeeService extends EmployeeServicesGrpc.EmployeeServicesImplBase {

    private final AppointmentDao appointmentDao;
    private final DoctorDao doctorDao;
    private final MedicalEventDao medicalEventDao;
    private final MedicalExamDao medicalExamDao;
    private final MedicalInfoDao medicalInfoDao;
    private final StaffDao staffDao;

    @Autowired
    public EmployeeService(AppointmentDao appointmentDao, DoctorDao doctorDao,
                           MedicalEventDao medicalEventDao, MedicalExamDao medicalExamDao,
                           MedicalInfoDao medicalInfoDao, StaffDao staffDao) {
        this.appointmentDao = appointmentDao;
        this.doctorDao = doctorDao;
        this.medicalEventDao = medicalEventDao;
        this.medicalExamDao = medicalExamDao;
        this.medicalInfoDao = medicalInfoDao;
        this.staffDao = staffDao;
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
            String sid = getSidFromContext();
            if(sid != null){
                Optional<Doctor> optionalDoctor = doctorDao.getDoctorById(sid);
                if (optionalDoctor.isPresent()) {
                    EmployeeTransformer.toProto(optionalDoctor.get());
                }
            }
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
                /*Patient resFromDB = patientDao.getPatientBySid(sid);
                if (resFromDB != null){
                    Date from = EmployeeTransformer.convertToDate(request.getFromDate());
                    Date to = EmployeeTransformer.convertToDate(request.getToDate());
                    List<Appointment> appointments = appointmentDao.findAll(resFromDB.getPatientID(), from, to);
                    if(appointments != null){
                        appointments.stream().map(EmployeeTransformer::toProto).forEach(builder::addAppointments);
                    }
                }*/
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
                    EmployeeTransformer.toProto(optionalAppointment.get());
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
                appointment.setPatientID(request.getPatient().getUser().getId());
                appointment.setStaff(toEntity(request.getStaff()));
                appointment.setDoctor(toEntity(request.getDoctor()));
                appointment.setPatient(toEntity(request.getPatient()));
                Appointment savedAppointment = appointmentDao.upsert(appointment);

                if (savedAppointment != null) {
                    EmployeeTransformer.toProto(savedAppointment);
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
                appointment.setPatientID(request.getPatient().getUser().getId());
                appointment.setStaff(toEntity(request.getStaff()));
                appointment.setDoctor(toEntity(request.getDoctor()));
                appointment.setPatient(toEntity(request.getPatient()));
                Appointment savedAppointment = appointmentDao.upsert(appointment);

                if (savedAppointment != null) {
                    EmployeeTransformer.toProto(savedAppointment);
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
                    List<MedicalExam> medicalExams = medicalExamDao.findAll(optionalDoctor.get().getDoctorID(),from,to);
                    if(medicalExams != null){
                        medicalExams.stream().map(EmployeeTransformer::toProtoReduced).forEach(builder::addMedicalExams);
                    }
                }
            }
            return builder.build();
        });
    }
}
