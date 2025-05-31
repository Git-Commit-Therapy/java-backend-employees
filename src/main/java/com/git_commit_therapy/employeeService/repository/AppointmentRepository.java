package com.git_commit_therapy.employeeService.repository;

import com.git_commit_therapy.employeeService.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    @Query("SELECT a FROM Appointment a JOIN FETCH a.doctor d WHERE a.patient.patientId = :patientId " +
            "AND a.dateTime BETWEEN :fromDate AND :toDate")
    List<Appointment> findAllByPatientAndDateRange(String patientId, Date fromDate, Date toDate);

    //Find all appointments for a specific doctor
    @Query("SELECT a FROM Appointment a JOIN FETCH a.doctor d JOIN FETCH a.patient p JOIN FETCH a.staff s WHERE d.doctorId = :doctorId " +
            "AND a.dateTime BETWEEN :fromDate AND :toDate")
    List<Appointment> findAllByDoctorAndDateRange(String doctorId, Date fromDate, Date toDate);
}