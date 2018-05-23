package com.web.jobs.core.service;

import com.web.jobs.core.controllers.EmployeeController;
import com.web.jobs.core.controllers.JobController;
import com.web.jobs.persistence.entity.EmployeeEntity;
import com.web.jobs.persistence.entity.JobEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class JobService {

    @Autowired
    private JobController jobController;
    
    @Autowired
    private EmployeeController employeeController;

    public void insert(String jobTitle, String description, String category, Double fare, Long employeeId) {
        EmployeeEntity employeeEntity = employeeController.findById(EmployeeEntity.class, employeeId);
        
        if (Objects.nonNull(employeeEntity)) {
            JobEntity jobEntity = new JobEntity(jobTitle, description, category, fare, employeeEntity.getId());
            employeeEntity.addJob(jobEntity);
            jobController.create(jobEntity);
            employeeController.update(employeeEntity);
        }
    }

    public void delete(JobEntity jobEntity){
        jobController.delete(jobEntity);
    }

    public JobEntity findById(Long id){
        return jobController.findById(JobEntity.class, id);
    }
    
    public List<JobEntity> getAll() {
        return jobController.getAll(JobEntity.class);
    }
}
