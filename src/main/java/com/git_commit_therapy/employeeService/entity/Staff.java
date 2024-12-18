package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Staff")
public class Staff {
    @Id
    @Column(name = "StaffID", nullable = false, length = 16)
    private String staffID;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "StaffID", nullable = false)
    private User user;

}