package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "MedicalEvent")
public class MedicalEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MedicalEvent_id_gen")
    @SequenceGenerator(name = "MedicalEvent_id_gen", sequenceName = "MedicalEvent_EventID_seq", allocationSize = 1)
    @Column(name = "EventID", nullable = false)
    private Integer id;

    @Column(name = "patientID")
    private String patientID;

    @Column(name = "FromDateTime", nullable = false)
    private Date fromDateTime;

    @Column(name = "ToDateTime")
    private Date toDateTime;

    @Column(name = "SeverityCode")
    private String severity;

    @Column(name = "DischargeLetter")
    private String dischargeLetter;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ExamID")
    List<MedicalExam> exams;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "WardID")
    private Ward ward;

}