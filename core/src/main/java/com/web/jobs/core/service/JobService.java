package com.web.jobs.core.service;

import com.web.jobs.core.controller.JobController;
import com.web.jobs.persistence.entity.JobEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobController jobController;

    public void insert(String jobTitle, String description, String category, Double fare) {
        JobEntity jobEntity = new JobEntity(jobTitle, description, category, fare);
        jobController.create(jobEntity);
    }

    public void delete(JobEntity jobEntity){
        jobController.delete(jobEntity);
    }

    public JobEntity findById(Long id){
        return jobController.findById(JobEntity.class, id);
    }
}
