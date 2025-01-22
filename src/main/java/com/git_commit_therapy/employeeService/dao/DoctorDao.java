package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Doctor;
import com.git_commit_therapy.employeeService.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorDao {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorDao(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Optional<Doctor> getDoctorById(String doctorId) {
        return doctorRepository.findById(doctorId);
    }

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public Doctor upsert(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
