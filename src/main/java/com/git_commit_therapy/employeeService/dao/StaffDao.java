package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Staff;
import com.git_commit_therapy.employeeService.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffDao {

    private final StaffRepository staffRepository;

    @Autowired
    public StaffDao(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Optional<Staff> findStaffById(String staffId) {
        return staffRepository.findById(staffId);
    }

    public List<Staff> findAll() {
        return staffRepository.findAll();
    }
}
