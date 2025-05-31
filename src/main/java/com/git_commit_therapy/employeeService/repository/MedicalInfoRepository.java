package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.MedicalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalInfoRepository extends JpaRepository<MedicalInfo, Integer> {

    //Find all medical info by patient ID
    @Query("SELECT mi FROM MedicalInfo mi JOIN FETCH mi.patient pa WHERE pa.patientId = :patientId")
    List<MedicalInfo> findByPatientId(String patientId);
}