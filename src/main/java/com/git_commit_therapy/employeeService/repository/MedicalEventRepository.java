package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.MedicalEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MedicalEventRepository extends JpaRepository<MedicalEvent, Integer> {

    @Query("SELECT me FROM MedicalEvent me JOIN FETCH MedicalExam medEx WHERE me.patient.patientId = :patientId " +
            "AND me.fromDateTime BETWEEN :fromDate AND :toDate")
    List<MedicalEvent> findAllByPatientAndDateRange(String patientId, Date fromDate, Date toDate);

    @Modifying
    @Query("UPDATE MedicalEvent me SET me.dischargeLetter = :dischargeLetter, me.toDateTime=current_timestamp WHERE me.id = :medicalEventId")
    void closeMedicalEvent(@Param("medicalEventId") int medicalEventId, @Param("dischargeLetter") String dischargeLetter);


    @Query("SELECT me FROM MedicalEvent me WHERE me.patient.patientId = :patientId AND me.ward.name = :wardName")
    MedicalEvent findMedicalEventIdByPatientAndWard(String patientId, String wardName);
}