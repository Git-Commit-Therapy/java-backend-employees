package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @Column(name = "doctor_id", nullable = false, length = 16)
    private String doctorId;

    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private User user;

    @Column(name = "med_specialization", length = Integer.MAX_VALUE)
    private String medSpecialization;

    @Column(name = "office_phone_number", length = 15)
    private String officePhoneNumber;

    @ManyToOne
    @JoinColumn(name = "ward_id")
    private Ward ward;

}