package com.web.jobs.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.jobs.persistence.entity.EmployeeEntity;
import com.web.jobs.persistence.entity.JobEntity;
import com.web.jobs.persistence.entity.PersonEntity;

public class Test {

    public static void main(String[] args) {
        
        
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(1L);
        EmployeeEntity employeeEntity = new EmployeeEntity(personEntity);

        JobEntity artist = new JobEntity("jobTitle", "description", "category", 123.0, 1L);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(employeeEntity);
            System.out.println("JSON = " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    
}
