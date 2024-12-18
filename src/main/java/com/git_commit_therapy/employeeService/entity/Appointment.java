package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "Appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Appointment_id_gen")
    @SequenceGenerator(name = "Appointment_id_gen", sequenceName = "Appointment_AppointmentID_seq", allocationSize = 1)
    @Column(name = "AppointmentID", nullable = false)
    private Integer id;

    @Column(name = "DateTime", nullable = false)
    private OffsetDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StaffID")
    private Staff staffID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DoctorID")
    private Doctor doctorID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatientID")
    private Patient patientID;

}