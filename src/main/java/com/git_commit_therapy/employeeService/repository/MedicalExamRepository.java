package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.MedicalExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MedicalExamRepository extends JpaRepository<MedicalExam, Integer> {

    @Query("SELECT me FROM MedicalExam me WHERE me.patientID = :patientId " +
            "AND me.dateTime BETWEEN :fromDate AND :toDate")
    List<MedicalExam> findAllByPatientAndDateRange(String patientId, Date fromDate, Date toDate);

    @Query("SELECT me FROM MedicalExam me JOIN FETCH Doctor d WHERE me.patientID = :patientId " +
            "AND me.id = :id")
    MedicalExam findById(Integer id,String patientId);
}