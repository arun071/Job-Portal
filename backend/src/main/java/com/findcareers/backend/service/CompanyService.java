package com.findcareers.backend.service;

import com.findcareers.backend.model.Company;
import com.findcareers.backend.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CompanyService {
    private CompanyRepository repository;

    @Autowired
    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }

    public Company addCompany(Company company) {
        return repository.save(company);
    }

    public List<Company> getCompany() {
        return repository.findAll();
    }
}
