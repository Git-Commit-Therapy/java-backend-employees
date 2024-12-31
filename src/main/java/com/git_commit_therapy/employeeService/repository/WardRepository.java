package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Ward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WardRepository extends JpaRepository<Ward, Integer> {
}