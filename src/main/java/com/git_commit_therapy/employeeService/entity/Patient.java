package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @Column(name = "PatientID", nullable = false, length = 16)
    private String patientID;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PatientID", nullable = false)
    private User user;

}