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

    public Appointment upsert(Appointment appointment) {
        // TODO: capire se serve splittare questo metodo in 2, uno per upsert e uno per update
        // il metodo .save() di JPA Repository fa anche l'update nel caso l'id sia già esistente a DB (per questo il nome del metodo "upsert")
        return appointmentRepository.save(appointment);
    }
}
