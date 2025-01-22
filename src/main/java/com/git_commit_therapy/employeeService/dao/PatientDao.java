package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Patient;
import com.git_commit_therapy.employeeService.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientDao {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientDao(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Optional<Patient> findPatientById(String patientId) {
        return patientRepository.findById(patientId);
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public Patient upsert(Patient patient) {
        return patientRepository.save(patient);
    }
}
