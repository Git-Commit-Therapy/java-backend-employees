package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcType;
import org.hibernate.dialect.PostgreSQLEnumJdbcType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medical_event")
public class MedicalEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", nullable = false)
    private Integer id;

    @Column(name = "from_date_time", nullable = false)
    private Date fromDateTime;

    @Column(name = "to_date_time")
    private Date toDateTime;

    @Enumerated(EnumType.STRING)
    @JdbcType(PostgreSQLEnumJdbcType.class)
    @Column(name = "severity_code", columnDefinition = "severity")
    private SeverityCode severity;

    @Column(name = "discharge_letter")
    private String dischargeLetter;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JoinColumn(name = "exam_id")
    List<MedicalExam> exams;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ward_id",nullable = true)
    private Ward ward;

    public MedicalEvent(SeverityCode severity, Patient patient) {
        this.fromDateTime = new Date();
        this.severity = severity;
        this.dischargeLetter = "";
        this.patient = patient;
        this.exams = new ArrayList<>();
        this.ward = null;
    }

    public void addExam(MedicalExam exam) {
        if(this.exams == null) {
            this.exams = new ArrayList<>();
        }
        if(exam != null) {
            this.exams.add(exam);
        }
    }
}