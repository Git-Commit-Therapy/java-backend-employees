package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Ward;
import com.git_commit_therapy.employeeService.repository.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WardDao {

    private final WardRepository wardRepository;

    @Autowired
    public WardDao(WardRepository wardRepository) {
        this.wardRepository = wardRepository;
    }

    public Optional<Ward> findWardById(Integer wardId) {
        return wardRepository.findById(wardId);
    }

    public List<Ward> findAll() {
        return wardRepository.findAll();
    }

    public Ward upsert(Ward ward) {
        return wardRepository.save(ward);
    }
}
