package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.MedicalInfo;
import com.git_commit_therapy.employeeService.repository.MedicalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalInfoDao {
    private final MedicalInfoRepository medicalInfoRepository;

    @Autowired
    public MedicalInfoDao(MedicalInfoRepository medicalInfoRepository) {
        this.medicalInfoRepository = medicalInfoRepository;
    }

    public MedicalInfo insert(MedicalInfo medicalInfo) {
        return medicalInfoRepository.save(medicalInfo);
    }
}
