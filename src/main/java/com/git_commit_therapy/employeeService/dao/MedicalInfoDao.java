package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.MedicalInfo;
import com.git_commit_therapy.employeeService.repository.MedicalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalInfoDao {
    private final MedicalInfoRepository medicalInfoRepository;

    @Autowired
    public MedicalInfoDao(MedicalInfoRepository medicalInfoRepository) {
        this.medicalInfoRepository = medicalInfoRepository;
    }

    public MedicalInfo upsert(MedicalInfo medicalInfo) {
        return medicalInfoRepository.save(medicalInfo);
    }

    public Optional<MedicalInfo> findMedicalInfoById(Integer medicalInfoId) {
        return medicalInfoRepository.findById(medicalInfoId);
    }

    public List<MedicalInfo> findAllByPatientId(String patientId) {
        return medicalInfoRepository.findByPatientId(patientId);
    }
}
