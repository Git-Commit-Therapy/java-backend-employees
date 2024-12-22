package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.MedicalEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MedicalEventRepository extends JpaRepository<MedicalEvent, Integer> {

    @Query("SELECT me FROM MedicalEvent me JOIN FETCH MedicalExam medEx WHERE me.patientID = :patientId " +
            "AND me.fromDateTime BETWEEN :fromDate AND :toDate")
    List<MedicalEvent> findAllByPatientAndDateRange(String patientId, Date fromDate, Date toDate);
}