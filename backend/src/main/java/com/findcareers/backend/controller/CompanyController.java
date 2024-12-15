package com.findcareers.backend.controller;

import com.findcareers.backend.model.Company;
import com.findcareers.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public  class CompanyController {
    @Autowired
    private CompanyService companyService;


    @PostMapping("/add")
    public Company addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }


    @GetMapping("/get")
    public List<Company> getCompany(){
        return companyService.getCompany();
    }
}
