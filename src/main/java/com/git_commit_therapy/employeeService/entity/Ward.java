package com.git_commit_therapy.employeeService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Ward")
public class Ward {
    @Id
    @Column(name = "WardID")
    private Integer wardID;

    @Column(name = "Name")
    private String name;

}