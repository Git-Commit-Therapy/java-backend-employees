package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "patient")
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @Column(name = "patient_id", nullable = false, length = 16)
    private String patientId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private User user;

    @OneToMany(fetch = FetchType.LAZY)
    private List<MedicalInfo> medicalInfos;

}