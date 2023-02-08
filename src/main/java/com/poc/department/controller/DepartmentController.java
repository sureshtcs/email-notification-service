package com.poc.department.controller;

import com.poc.department.model.Department;
import com.poc.department.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
        log.info("Inside getDepartmentById method of DepartmentController");
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/")
    public List getAllDepartments() {
        log.info("Inside getDepartmentById method of DepartmentController");
        return departmentService.getAllDepartments();
    }
}
