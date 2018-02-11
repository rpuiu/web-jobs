package com.web.jobs.services;

import com.web.jobs.controllers.JobController;
import com.web.jobs.dao.Job;

public class JobService {

    private JobController jobController;

    public void insert(String jobTitle, String description, String category, Double fare) {
        Job job = new Job(jobTitle, description, category, fare);
        jobController.create(job);
    }

    public void delete(Job job){
        jobController.delete(job);
    }

    public Job findById(Integer id){
        return jobController.findById(Job.class, id);
    }
}
