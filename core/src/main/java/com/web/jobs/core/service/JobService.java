package com.web.jobs.core.service;

import com.web.jobs.core.controller.JobController;
import com.web.jobs.persistence.dto.JobDTO;

public class JobService {

    private JobController jobController;

    public void insert(String jobTitle, String description, String category, Double fare) {
        JobDTO jobDTO = new JobDTO(jobTitle, description, category, fare);
        jobController.create(jobDTO);
    }

    public void delete(JobDTO jobDTO){
        jobController.delete(jobDTO);
    }

    public JobDTO findById(Long id){
        return jobController.findById(JobDTO.class, id);
    }
}
