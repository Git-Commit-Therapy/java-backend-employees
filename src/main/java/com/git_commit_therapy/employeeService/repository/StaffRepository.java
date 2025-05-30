package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {

    @Query("select s from Staff s where s.user.sub = :sub")
    Staff findBySub(String sub);
}