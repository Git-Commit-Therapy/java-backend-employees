package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.MedicalEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalEventRepository extends JpaRepository<MedicalEvent, Integer> {
}