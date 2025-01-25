package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
    @Query("select d from Doctor d where d.user.id = :id")
    Doctor findByUserId(String id);
}