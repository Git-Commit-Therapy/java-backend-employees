package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "ID", nullable = false, length = 16)
    private String id;

    @Column(name = "Name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "Surname", nullable = false, length = Integer.MAX_VALUE)
    private String surname;

    @Column(name = "DateOfBirth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "SID", nullable = false, length = 50)
    private String sid;

    @Column(name = "PhoneNumber", length = 15)
    private String phoneNumber;

    @Column(name = "Email", nullable = false, length = Integer.MAX_VALUE)
    private String email;
}