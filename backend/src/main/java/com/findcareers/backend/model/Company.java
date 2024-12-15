package com.findcareers.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    private Long id;
    private String companyName;
    private int foundedYear;
    private String headquarters;
    @ElementCollection
    private List<String> officeLocations;
    private String website;
}
