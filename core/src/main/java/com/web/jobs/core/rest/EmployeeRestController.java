package com.web.jobs.core.rest;

import com.web.jobs.core.service.EmployeeService;
import com.web.jobs.persistence.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public ResponseEntity<EmployeeEntity> getById() {
        EmployeeEntity employeeEntity = employeeService.findById(1L);

        return ResponseEntity.ok(employeeEntity);
    }

}
