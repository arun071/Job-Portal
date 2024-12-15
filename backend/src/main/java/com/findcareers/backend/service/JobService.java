package com.findcareers.backend.service;

import com.findcareers.backend.model.Job;
import com.findcareers.backend.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    public JobService(JobRepository repo) {
        this.repo = repo;
    }


    private JobRepository repo;

    public Job addJob(Job job) {
        return repo.save(job);
    }

    public List<Job> getJob() {
        return repo.findAll();
    }

    public Optional<Job> getJobById(int id) {
        return repo.findById(id);
    }

    public void deleteJobById(int id) {
        repo.deleteById(id);
    }
}
