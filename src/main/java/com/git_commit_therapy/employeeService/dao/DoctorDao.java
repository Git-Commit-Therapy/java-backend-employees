package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Doctor;
import com.git_commit_therapy.employeeService.repository.DoctorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorDao {

    private final DoctorRepository doctorRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public DoctorDao(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Optional<Doctor> getDoctorById(String doctorId) {
        return doctorRepository.findById(doctorId);
    }

    public Doctor getDoctorBySub(String sub) {
        return doctorRepository.findByUserSub(sub);
    }


    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Transactional
    public Doctor upsert(Doctor doctor) {
        //return doctorRepository.save(doctor);
        entityManager.persist(doctor.getUser());
        entityManager.flush();
        entityManager.merge(doctor.getWard());
        entityManager.flush();
        entityManager.persist(doctor);
        entityManager.flush();
        return doctor;
    }
}
