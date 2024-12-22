package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @Column(name = "PatientID", nullable = false, length = 16)
    private String patientID;

    @MapsId
    @OneToOne
    @JoinColumn(name = "PatientID", nullable = false)
    private User user;

    @OneToMany(fetch = FetchType.LAZY)
    private List<MedicalInfo> medicalInfos;

}