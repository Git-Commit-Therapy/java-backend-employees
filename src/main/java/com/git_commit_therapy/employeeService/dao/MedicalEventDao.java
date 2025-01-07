package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.MedicalEvent;
import com.git_commit_therapy.employeeService.repository.MedicalEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalEventDao {
    private final MedicalEventRepository medicalEventRepository;

    @Autowired
    public MedicalEventDao(MedicalEventRepository medicalEventRepository) {
        this.medicalEventRepository = medicalEventRepository;
    }

    public MedicalEvent insert(MedicalEvent medicalEvent) {
        return medicalEventRepository.save(medicalEvent);
    }
}
