package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.MedicalExam;
import com.git_commit_therapy.employeeService.repository.MedicalExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MedicalExamDao {

    private final MedicalExamRepository medicalExamRepository;

    @Autowired
    public MedicalExamDao(MedicalExamRepository medicalExamRepository) {
        this.medicalExamRepository = medicalExamRepository;
    }

    public List<MedicalExam> findAll(String patientId, Date fromDate, Date toDate) {
        return medicalExamRepository.findAllByPatientAndDateRange(patientId,fromDate,toDate);
    }

    public Optional<MedicalExam> findMedicalExamById(Integer medicalExamId) {
        return medicalExamRepository.findById(medicalExamId);
    }

    public MedicalExam upsert(MedicalExam medicalExam) {
        return medicalExamRepository.save(medicalExam);
    }
}
