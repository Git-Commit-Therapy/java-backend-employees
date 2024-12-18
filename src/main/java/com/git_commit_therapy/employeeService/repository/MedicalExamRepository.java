package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.MedicalExam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalExamRepository extends JpaRepository<MedicalExam, Integer> {
}