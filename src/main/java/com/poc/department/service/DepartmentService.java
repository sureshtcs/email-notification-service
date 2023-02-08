package com.poc.department.service;

import com.poc.department.model.Department;
import com.poc.department.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        log.info("Inside getDepartmentById method of DepartmentService");
        return departmentRepository.getDepartmentById(id);
    }
    public List getAllDepartments() {
        return new ArrayList(departmentRepository.findAll());
    }
}
