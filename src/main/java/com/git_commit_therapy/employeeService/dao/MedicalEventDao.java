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

    public MedicalEvent save(MedicalEvent medicalEvent) {
        //TODO check if the medicalEvent already exists and the updates
        return medicalEventRepository.saveAndFlush(medicalEvent);
    }

    public MedicalEvent findById(Integer id) {
        return medicalEventRepository.findById(id).get();
    }

}
