package com.web.jobs.core.service;

import com.web.jobs.core.controller.EmployeeController;
import com.web.jobs.persistence.entity.EmployeeEntity;
import com.web.jobs.persistence.entity.JobEntity;
import com.web.jobs.persistence.entity.PersonEntity;
import com.web.jobs.persistence.entity.RatingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeController employeeController;

    public void insert(PersonEntity person) {
        EmployeeEntity employee = new EmployeeEntity(person);
        employeeController.create(employee);
    }

    public void delete(EmployeeEntity employeeEntity){
        employeeController.delete(employeeEntity);
    }

    public EmployeeEntity findById(Long id){
        return employeeController.findById(EmployeeEntity.class, id);
    }

    public List<EmployeeEntity> getAll() {
        return employeeController.getAll(EmployeeEntity.class);
    }
}
