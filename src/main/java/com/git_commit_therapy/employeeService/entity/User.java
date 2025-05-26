package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "id", nullable = false, length = 16)
    private String id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "surname", nullable = false, length = Integer.MAX_VALUE)
    private String surname;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "sub", nullable = false, length = 50)
    private String sub;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "email", nullable = false, length = Integer.MAX_VALUE)
    private String email;
}