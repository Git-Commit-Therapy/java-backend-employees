package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

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

    @Column(name = "FromDateTime", nullable = false)
    private OffsetDateTime fromDateTime;

    @Column(name = "ToDateTime")
    private OffsetDateTime toDateTime;

}