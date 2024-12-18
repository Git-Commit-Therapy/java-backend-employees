package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MedicalInfo")
public class MedicalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MedicalInfo_id_gen")
    @SequenceGenerator(name = "MedicalInfo_id_gen", sequenceName = "MedicalInfo_MedicalInfoID_seq", allocationSize = 1)
    @Column(name = "MedicalInfoID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatientID")
    private Patient patientID;

    @Column(name = "Description", length = Integer.MAX_VALUE)
    private String description;

}