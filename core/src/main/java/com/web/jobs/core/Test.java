package com.web.jobs.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.jobs.persistence.entity.EmployeeEntity;
import com.web.jobs.persistence.entity.JobEntity;

public class Test {

    public static void main(String[] args) {
        

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(1L);

        JobEntity artist = new JobEntity("jobTitle", "description", "category", 123.0, 1L, "123");

        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(artist);
            System.out.println("JSON = " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    
}
