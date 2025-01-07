package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    @Query("SELECT a FROM Appointment a JOIN FETCH Doctor d WHERE a.patient.patientId = :patientId " +
            "AND a.dateTime BETWEEN :fromDate AND :toDate")
    List<Appointment> findAllByPatientAndDateRange(String patientId, Date fromDate, Date toDate);
}