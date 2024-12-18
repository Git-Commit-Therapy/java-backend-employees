package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.MedicalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInfoRepository extends JpaRepository<MedicalInfo, Integer> {
}