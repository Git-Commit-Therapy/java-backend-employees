package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
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

    @Column(name = "medical_event_id")
    private Integer medicalEvent;

}