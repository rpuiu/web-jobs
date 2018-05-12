package com.web.jobs.core.rest;

import com.web.jobs.core.service.JobService;
import com.web.jobs.persistence.entity.JobEntity;
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
public class JobRestController {
    
    private JobService jobService;
    
    @Autowired
    public JobRestController(JobService jobService) {
        this.jobService = jobService;
    }

    
    @PostMapping(value = "/job/add")
    public ResponseEntity insert(@RequestBody JobEntity job) {
        //TODO: validate the input
        //TODO getThe current employee id from the session (job.getEmployeeIdentifier() = 1)
        jobService.insert(job.getJobTitle(), job.getDescription(), job.getCategory(), job.getFare(), 1L);
        
        return ResponseEntity.ok().build();
    }
    
    @DeleteMapping(value = "/job/delete")
    public ResponseEntity delete(@RequestBody JobEntity job) {
        jobService.delete(job);

        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/job/{id}")
    public ResponseEntity getById(@PathVariable long id) {
        JobEntity byId = jobService.findById(id);

        return ResponseEntity.ok(byId);
    }

    @GetMapping(value = "/jobs")
    public List getAll() {
        return jobService.getAll();
    }
    
}
