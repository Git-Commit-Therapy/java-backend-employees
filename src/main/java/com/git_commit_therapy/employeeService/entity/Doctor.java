package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id
    @Column(name = "DoctorID", nullable = false, length = 16)
    private String doctorID;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DoctorID", nullable = false)
    private User user;

    @Column(name = "MedSpecialization", length = Integer.MAX_VALUE)
    private String medSpecialization;

    @Column(name = "OfficePhoneNumber", length = 15)
    private String officePhoneNumber;

}