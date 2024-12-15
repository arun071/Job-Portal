package com.findcareers.backend.controller;

import com.findcareers.backend.model.Job;
import com.findcareers.backend.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class JobController {
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/add-job")
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @GetMapping("/get-job")
    public List<Job> getJob() {
        return jobService.getJob();
    }
    @GetMapping("/get/{id}")
    public Optional<Job> getJob(@PathVariable int id) {
        return jobService.getJobById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteJob(@PathVariable int id) {
         jobService.deleteJobById(id);
    }
}
