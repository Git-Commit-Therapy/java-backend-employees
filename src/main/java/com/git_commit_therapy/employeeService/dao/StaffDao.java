package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Doctor;
import com.git_commit_therapy.employeeService.entity.Staff;
import com.git_commit_therapy.employeeService.repository.StaffRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StaffDao {

    private final StaffRepository staffRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public StaffDao(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Optional<Staff> findStaffById(String staffId) {
        return staffRepository.findById(staffId);
    }

    public Staff findStaffBySub(String sub) {
        return staffRepository.findBySub(sub);
    }

    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Transactional
    public Staff upsert(Staff staff) {
        entityManager.persist(staff.getUser());
        entityManager.flush();
        entityManager.persist(staff);
        entityManager.flush();
        return staff;
    }
}
