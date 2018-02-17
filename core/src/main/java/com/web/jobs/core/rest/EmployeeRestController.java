package com.web.jobs.core.rest;

import com.web.jobs.core.service.EmployeeService;
import com.web.jobs.persistence.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wj/employee")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("test")
    public ResponseEntity<EmployeeDTO> getById() {
        EmployeeDTO employeeDTO = employeeService.findById(1L);

        return ResponseEntity.ok(employeeDTO);
    }

}
