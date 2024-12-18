package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}