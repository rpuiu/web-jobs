package com.web.jobs.core.rest;

import com.web.jobs.core.service.EmployeeService;
import com.web.jobs.persistence.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/employee/add")
    public ResponseEntity insert(@RequestBody EmployeeEntity employeeEntity) {
        // TODO: validate the input
        employeeService.insert(employeeEntity.getPersonEntity(), employeeEntity.getJobEntity(), employeeEntity.getRatingEntity());
        
        return ResponseEntity.ok().build();
    }
    
    @DeleteMapping(value = "/employee/delete")
    public ResponseEntity delete(@RequestBody EmployeeEntity employeeEntity) {
        employeeService.delete(employeeEntity);

        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity getById(@PathVariable long id) {
        EmployeeEntity byId = employeeService.findById(id);

        return ResponseEntity.ok(byId);
    }

    @GetMapping(value = "/employees")
    public List getAll() {
        return employeeService.getAll();
    }
}
