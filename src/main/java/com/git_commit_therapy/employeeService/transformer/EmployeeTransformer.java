package com.git_commit_therapy.employeeService.transformer;

import com.git_commit_therapy.employeeService.entity.*;
import com.git_commit_therapy.proto.*;
import com.google.protobuf.Timestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class EmployeeTransformer {

    /**
     * To proto methods
     */
    public static UserOuterClass.User toProto(User user) {
        UserOuterClass.User.Builder userBuilder = UserOuterClass.User.newBuilder();

        Timestamp birthDateTimestamp = convertToTimestampWithDateTime(user.getDateOfBirth());

        userBuilder.setId(user.getId());
        userBuilder.setName(user.getName());
        userBuilder.setSurname(user.getSurname());
        userBuilder.setBirthDate(birthDateTimestamp);
        if(user.getPhoneNumber() != null) {
            userBuilder.setPhoneNumber(user.getPhoneNumber());
        }
        if(user.getEmail() != null) {
            userBuilder.setEmail(user.getEmail());
        }
        return userBuilder.build();
    }

    public static UserOuterClass.Doctor toProto(Doctor doctor) {
        UserOuterClass.Doctor.Builder doctorBuilder = UserOuterClass.Doctor.newBuilder();

        doctorBuilder.setMedSpecialization(doctor.getMedSpecialization());
        doctorBuilder.setOfficePhoneNumber(doctor.getOfficePhoneNumber());
        doctorBuilder.setUser(toProto(doctor.getUser()));

        return doctorBuilder.build();
    }

    public static UserOuterClass.Staff toProto(Staff staff) {
        UserOuterClass.Staff.Builder staffBuilder = UserOuterClass.Staff.newBuilder();

        staffBuilder.setUser(toProto(staff.getUser()));

        return staffBuilder.build();
    }

    public static UserOuterClass.Patient toProto(Patient patient) {
        UserOuterClass.Patient.Builder patientBuilder = UserOuterClass.Patient.newBuilder();

        patientBuilder.setUser(toProto(patient.getUser()));

        return patientBuilder.build();
    }

    public static WardOuterClass.Ward toProto(Ward ward) {
        WardOuterClass.Ward.Builder wardBuilder = WardOuterClass.Ward.newBuilder();

        wardBuilder.setWardId(ward.getWardId());
        wardBuilder.setName(ward.getName());

        return wardBuilder.build();
    }

    public static MedicalInfoOuterClass.MedicalInfo toProto(MedicalInfo medicalInfo) {
        MedicalInfoOuterClass.MedicalInfo.Builder builder = MedicalInfoOuterClass.MedicalInfo.newBuilder();
        builder.setMedicalInfoId(medicalInfo.getId());
        builder.setDescription(medicalInfo.getDescription());
        return builder.build();
    }

    public static UserOuterClass.Doctor toProtoReduced(Doctor doctor) {
        UserOuterClass.Doctor.Builder builder = UserOuterClass.Doctor.newBuilder();
        builder.setUser(toProtoReduced(doctor.getUser()));
        return builder.build();
    }

    public static UserOuterClass.User toProtoReduced(User user) {
        UserOuterClass.User.Builder userBuilder = UserOuterClass.User.newBuilder();
        userBuilder.setName(user.getName());
        userBuilder.setSurname(user.getSurname());
        if(user.getEmail() != null) {
            userBuilder.setEmail(user.getEmail());
        }
        return userBuilder.build();
    }

    public static AppointmentOuterClass.Appointment toProto(Appointment appointment) {
        AppointmentOuterClass.Appointment.Builder builder = AppointmentOuterClass.Appointment.newBuilder();

        builder.setAppointmentId(appointment.getId());
        builder.setDateTime(convertToTimestampWithDateTime(appointment.getDateTime()));
        builder.setDoctor(toProtoReduced(appointment.getDoctor()));
        builder.setPatient(toProto(appointment.getPatient()));
        builder.setStaff(toProto(appointment.getStaff()));

        return builder.build();
    }

    public static MedicalExamOuterClass.MedicalExam toProtoReduced(MedicalExam medicalExam) {
        MedicalExamOuterClass.MedicalExam.Builder builder = MedicalExamOuterClass.MedicalExam.newBuilder();
        builder.setExamId(medicalExam.getId());
        builder.setDateTime(convertToTimestampWithDateTime(medicalExam.getDateTime()));
        builder.setExamType(medicalExam.getExamType());
        builder.setMedicalEvent(MedicalEventOuterClass.MedicalEvent.newBuilder().setEventId(medicalExam.getId()).build());
        return builder.build();
    }

    public static MedicalExamOuterClass.MedicalExam toProto(MedicalExam medicalExam) {
        MedicalExamOuterClass.MedicalExam.Builder builder = MedicalExamOuterClass.MedicalExam.newBuilder();
        builder.setExamId(medicalExam.getId());
        builder.setDateTime(convertToTimestampWithDateTime(medicalExam.getDateTime()));
        builder.setMedicalReport(medicalExam.getMedicalReport());
        builder.setExamType(medicalExam.getExamType());
        builder.setDoctor(toProtoReduced(medicalExam.getDoctor()));
        builder.setMedicalEvent(MedicalEventOuterClass.MedicalEvent.newBuilder().setEventId(medicalExam.getId()).build());
        return builder.build();
    }

    public static MedicalEventOuterClass.MedicalEvent toProto(MedicalEvent medicalEvent) {
        MedicalEventOuterClass.MedicalEvent.Builder builder = MedicalEventOuterClass.MedicalEvent.newBuilder();
        builder.setEventId(medicalEvent.getId());
        builder.setFromDateTime(convertToTimestampWithDateTime(medicalEvent.getFromDateTime()));
        builder.setToDateTime(convertToTimestampWithDateTime(medicalEvent.getToDateTime()));
        switch (medicalEvent.getSeverity()){
            case WHITE ->builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.WHITE_VALUE);
            case GREEN -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.GREEN_VALUE);
            case YELLOW -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.YELLOW_VALUE);
            case ORANGE -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.ORANGE_VALUE);
            case RED -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.RED_VALUE);
            default -> builder.setSeverityCodeValue(-1);
        }
        if(medicalEvent.getDischargeLetter() != null){
            builder.setDischargeLetter(medicalEvent.getDischargeLetter());
        }
        if(medicalEvent.getWard() != null){
            builder.setWard(WardOuterClass.Ward.newBuilder().setName(medicalEvent.getWard().getName()).build());
        }
        medicalEvent.getExams().forEach(medicalExam -> {builder.addMedicalExamIds(medicalExam.getId());});
        return builder.build();
    }

    /**
     * To entity methods
     */
    public static User toEntity(UserOuterClass.User userProto) {
        User user = new User();

        user.setId(userProto.getId());
        user.setName(userProto.getName());
        user.setSurname(userProto.getSurname());
        user.setDateOfBirth(convertToDate(userProto.getBirthDate()));
        user.setSid(userProto.getId());
        user.setPhoneNumber(userProto.getPhoneNumber());
        user.setEmail(userProto.getEmail());

        return user;
    }

    public static Staff toEntity(UserOuterClass.Staff staffProto){
        Staff staff = new Staff();
        staff.setUser(toEntity(staffProto.getUser()));
        staff.setStaffID(staffProto.getUser().getId());

        return staff;
    }

    public static Doctor toEntity(UserOuterClass.Doctor doctorProto){
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorProto.getUser().getId());
        doctor.setUser(toEntity(doctorProto.getUser()));
        doctor.setMedSpecialization(doctorProto.getMedSpecialization());
        doctor.setOfficePhoneNumber(doctorProto.getOfficePhoneNumber());

        return doctor;
    }

    public static Patient toEntity(UserOuterClass.Patient patientProto){
        Patient patient = new Patient();
        patient.setPatientId(patientProto.getUser().getId());
        patient.setUser(toEntity(patientProto.getUser()));
        patient.setMedicalInfos(null);  // TODO: come popolare questo campo?

        return patient;
    }

    public static Ward toEntity(WardOuterClass.Ward wardProto){
        Ward ward = new Ward();
        ward.setWardId(wardProto.getWardId());
        ward.setName(wardProto.getName());

        return ward;
    }

    public static MedicalEvent toEntity(MedicalEventOuterClass.MedicalEvent medicalEventProto){
        MedicalEvent medicalEvent = new MedicalEvent();
        medicalEvent.setId(medicalEventProto.getEventId());
        medicalEvent.setFromDateTime(convertToDate(medicalEventProto.getFromDateTime()));
        medicalEvent.setToDateTime(convertToDate(medicalEventProto.getToDateTime()));
        medicalEvent.setDischargeLetter(medicalEventProto.getDischargeLetter());
        medicalEvent.setSeverity(SeverityCode.valueOf(medicalEventProto.getSeverityCode().name()));
        //medicalEvent.setExams(); --> impostato a codice per recuperare i MedicalEvent
        medicalEvent.setPatient(toEntity(medicalEventProto.getPatient()));
        medicalEvent.setWard(toEntity(medicalEventProto.getWard()));

        return medicalEvent;
    }

    // Utility methods
    private static Timestamp convertToTimestampWithDateTime(Date dateTime) {
        Instant instant = dateTime.toInstant();
        return Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).setNanos(instant.getNano()).build();
    }

    private static Timestamp convertToTimestamp(LocalDate date) {
        Instant instant = date.atStartOfDay().toInstant(ZoneOffset.UTC);
        return Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).setNanos(instant.getNano()).build();
    }

    public static Date convertToDate(Timestamp timestamp) {
        return new Date(timestamp.getSeconds() * 1000 + timestamp.getNanos() / 1000000);
    }

    public static SeverityCode fromProto(MedicalEventOuterClass.SeverityCode severityCode) {
         switch (severityCode){
             case WHITE -> {
                 return SeverityCode.WHITE;
             }
             case GREEN -> {
                 return SeverityCode.GREEN;
             }
             case YELLOW -> {
                 return SeverityCode.YELLOW;
             }
             case ORANGE -> {
                 return SeverityCode.ORANGE;
             }
             case RED -> {
                 return SeverityCode.RED;
             }
             default -> throw new IllegalStateException("Unexpected value: " + severityCode);
         }
    }
}
