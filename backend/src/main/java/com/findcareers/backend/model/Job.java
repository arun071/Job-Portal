package com.findcareers.backend.model;

import com.findcareers.backend.enums.EmploymentType;
import com.findcareers.backend.enums.JobCategory;
import com.findcareers.backend.enums.JobLevel;
import com.findcareers.backend.enums.WorkMode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String role;
    private String jobDescription;
    private String location;
    private Double salary;
    private String link;
    private EmploymentType empType;
    private JobLevel experienceLevel;
    private WorkMode workMode;
    private LocalDateTime postedAt;
    private LocalDateTime deadline;
    private boolean status;    // Optional fields
    private String skillsRequired;
    private JobCategory category;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User postedBy;  // Reference to the user who posted the job (Employer)
}