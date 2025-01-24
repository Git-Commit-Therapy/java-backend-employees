package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientRepository extends JpaRepository<Patient, String> {
    @Query("select p from Patient p where p.user.id = :id")
    Patient findByUserId(String id);
}