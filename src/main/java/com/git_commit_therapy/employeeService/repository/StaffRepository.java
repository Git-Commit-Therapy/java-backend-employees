package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
}