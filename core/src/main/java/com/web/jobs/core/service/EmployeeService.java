package com.web.jobs.core.service;

import com.web.jobs.core.controller.EmployeeController;
import com.web.jobs.persistence.dto.EmployeeDTO;
import com.web.jobs.persistence.dto.JobDTO;
import com.web.jobs.persistence.dto.PersonDTO;
import com.web.jobs.persistence.dto.RatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeController employeeController;

    public void insert(PersonDTO person, JobDTO jobDTO, List<RatingDTO> ratingDTOS) {
        EmployeeDTO employee = new EmployeeDTO(person, jobDTO, ratingDTOS);
        employeeController.create(employee);
    }

    public void delete(EmployeeDTO employee){
        employeeController.delete(employee);
    }

    public EmployeeDTO findById(Long id){
        return employeeController.findById(EmployeeDTO.class, id);
    }
}
