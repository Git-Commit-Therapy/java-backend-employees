package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "MedicalExam")
public class MedicalExam {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MedicalExam_id_gen")
    @SequenceGenerator(name = "MedicalExam_id_gen", sequenceName = "MedicalExam_ExamID_seq", allocationSize = 1)
    @Column(name = "ExamID", nullable = false)
    private Integer id;

    @Column(name = "DateTime", nullable = false)
    private Date dateTime;

    @Column(name = "MedicalReport", length = Integer.MAX_VALUE)
    private String medicalReport;

    @Column(name = "ExamType", length = Integer.MAX_VALUE)
    private String examType;

    @Column(name = "PatientID")
    private String patientID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DoctorID")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatientID")
    private Patient patient;

    @Column(name = "EventID")
    private Integer medicalEvent;

}