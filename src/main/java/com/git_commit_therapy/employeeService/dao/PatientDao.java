package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Patient;
import com.git_commit_therapy.employeeService.repository.PatientRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PatientDao {

    private final PatientRepository patientRepository;

    @PersistenceContext
    private EntityManager entityManager;

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

    @Transactional
    public Patient upsert(Patient patient) {
        //return patientRepository.saveAndFlush(patient);
        entityManager.persist(patient.getUser());
        entityManager.flush();
        entityManager.persist(patient);
        entityManager.flush();
        return patient;
    }
}
