package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {
}