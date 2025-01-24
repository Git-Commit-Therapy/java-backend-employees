package com.git_commit_therapy.emergency.transformer;

import com.git_commit_therapy.emergency.model.CalledPatient;
import com.git_commit_therapy.employeeService.entity.SeverityCode;
import com.git_commit_therapy.proto.MedicalEventOuterClass;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Timestamp;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class EmergencyWardPanelsTransformer {
    public static EmergencyWardServicesOuterClass.QueueStatusResponse toProto(Map<SeverityCode,Long> queue){
        EmergencyWardServicesOuterClass.QueueStatusResponse.Builder builder = EmergencyWardServicesOuterClass.QueueStatusResponse.newBuilder();
        for(SeverityCode severityCode : queue.keySet()){
            builder.putQueueStatus(severityCode.name(), Math.toIntExact(queue.get(severityCode)));
        }
        return builder.build();
    }

    public static EmergencyWardServicesOuterClass.LastPatientsCalledResponse toProto(List<CalledPatient> calledPatientList){
        EmergencyWardServicesOuterClass.LastPatientsCalledResponse.Builder builder = EmergencyWardServicesOuterClass.LastPatientsCalledResponse.newBuilder();
        calledPatientList.stream().map(EmergencyWardPanelsTransformer::toProto).forEach(builder::addPatientsCalled);
        return builder.build();
    }

    public static EmergencyWardServicesOuterClass.EmergencyWardPatient toProto(CalledPatient calledPatient){
        EmergencyWardServicesOuterClass.EmergencyWardPatient.Builder builder = EmergencyWardServicesOuterClass.EmergencyWardPatient.newBuilder();
        builder.setCallTime(convertToTimestampWithDateTime(calledPatient.getCalledTime()));
        builder.setPatientCode(calledPatient.getWaitingPatientIdentifier());
        switch (calledPatient.getSeverityCode()) {
            case WHITE -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.WHITE_VALUE);
            case GREEN -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.GREEN_VALUE);
            case YELLOW -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.YELLOW_VALUE);
            case ORANGE -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.ORANGE_VALUE);
            case RED -> builder.setSeverityCodeValue(MedicalEventOuterClass.SeverityCode.RED_VALUE);
            default -> builder.setSeverityCodeValue(-1);
        }
        builder.setAmbulatory(calledPatient.getAmbulatory());
        return builder.build();
    }

    private static Timestamp convertToTimestampWithDateTime(Date dateTime) {
        Instant instant = dateTime.toInstant();
        return Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).setNanos(instant.getNano()).build();
    }
}
