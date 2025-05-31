package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.MedicalEvent;
import com.git_commit_therapy.employeeService.repository.MedicalEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MedicalEventDao {
    private final MedicalEventRepository medicalEventRepository;

    @Autowired
    public MedicalEventDao(MedicalEventRepository medicalEventRepository) {
        this.medicalEventRepository = medicalEventRepository;
    }

    public List<MedicalEvent> findAll(String patientId, Date fromDate, Date toDate) {
        return medicalEventRepository.findAllByPatientAndDateRange(patientId,fromDate,toDate);
    }

    public Optional<MedicalEvent> findMedicalEventById(Integer medicalEventId) {
        return medicalEventRepository.findById(medicalEventId);
    }

    public MedicalEvent upsert(MedicalEvent medicalEvent) {
        return medicalEventRepository.saveAndFlush(medicalEvent);
    }

    public boolean closeMedicalEvent(int medicalEventId, String dischargeLetter) {
        medicalEventRepository.closeMedicalEvent(medicalEventId, dischargeLetter);
        return true;
    }

    public MedicalEvent findMedicalEventIdByPatientAndWard(String patientId, String wardName) {
        return medicalEventRepository.findMedicalEventIdByPatientAndWard(patientId, wardName);
    }
}
