package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
}