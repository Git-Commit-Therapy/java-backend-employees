package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "medical_exam")
public class MedicalExam {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "exam_id", nullable = false)
    private Integer id;

    @Column(name = "date_time", nullable = false)
    private Date dateTime;

    @Column(name = "medical_report", length = Integer.MAX_VALUE)
    private String medicalReport;

    @Column(name = "exam_type", length = Integer.MAX_VALUE)
    private String examType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medical_event_id")
    private MedicalEvent medicalEvent;


    public MedicalExam(String medicalReport, String examType, Doctor doctor, Patient patient, MedicalEvent medicalEvent) {
        this.medicalReport = medicalReport;
        this.examType = examType;
        this.doctor = doctor;
        this.patient = patient;
        this.medicalEvent = medicalEvent;
        this.dateTime = new Date();
    }
}