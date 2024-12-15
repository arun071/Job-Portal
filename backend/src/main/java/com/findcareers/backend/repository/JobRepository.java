package com.findcareers.backend.repository;

import com.findcareers.backend.model.Company;
import com.findcareers.backend.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepository  extends JpaRepository<Job, Integer> {

}

