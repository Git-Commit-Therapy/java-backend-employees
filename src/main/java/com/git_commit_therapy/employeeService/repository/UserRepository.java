package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}