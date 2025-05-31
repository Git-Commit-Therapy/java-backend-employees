package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Appointment;
import com.git_commit_therapy.employeeService.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentDao {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentDao(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Optional<Appointment> findAppointmentById(Integer appointmentId) {
        return appointmentRepository.findById(appointmentId);
    }

    public List<Appointment> findAll(String patientId, Date fromDate, Date toDate) {
        return appointmentRepository.findAllByPatientAndDateRange(patientId,fromDate,toDate);
    }

    public List<Appointment> findAllByDoctorAndDateRange(String doctorId, Date fromDate, Date toDate) {
        return appointmentRepository.findAllByDoctorAndDateRange(doctorId, fromDate, toDate);
    }

    public Appointment upsert(Appointment appointment) {
        Appointment app = appointmentRepository.save(appointment);
        appointmentRepository.flush();
        return app;
    }

    public boolean deleteAppointment(Appointment appointment) {
        if(appointment == null || appointment.getId() == null) {
            return false; // Cannot delete a null appointment or one without an ID
        }
        try {
            appointmentRepository.delete(appointment);
            appointmentRepository.flush();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
