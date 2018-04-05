package com.web.jobs.core.rest;

import com.web.jobs.core.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wj/job")
public class JobRestController {
    
    private JobService jobService;
    
    @Autowired
    public JobRestController(JobService jobService) {
        this.jobService = jobService;
    }
    
}
