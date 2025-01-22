package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Patient;
import com.git_commit_therapy.employeeService.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDao {
    private final PatientRepository patientRepository;

    @Autowired
    public PatientDao(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient findById(String id) {
        return patientRepository.findByUserId(id);
    }
}
