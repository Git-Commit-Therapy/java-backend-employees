package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "medical_event")
public class MedicalEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "event_id", nullable = false)
    private Integer id;

    @Column(name = "from_date_time", nullable = false)
    private Date fromDateTime;

    @Column(name = "to_date_time")
    private Date toDateTime;

    @Column(name = "severity_code")
    private SeverityCode severity;

    @Column(name = "discharge_letter")
    private String dischargeLetter;

    @Column(name = "patient_id")
    private String patientID;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id")
    List<MedicalExam> exams;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ward_id")
    private Ward ward;

}