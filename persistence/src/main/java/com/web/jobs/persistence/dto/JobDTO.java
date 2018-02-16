package com.web.jobs.persistence.dto;

import javax.persistence.*;

@Entity
public class JobDTO implements EntityDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String jobTitle;

    @Column
    private String description;

    @Column
    private String category;

    @Column
    private Double fare;

    @OneToOne(mappedBy = "jobDTO")
    private EmployeeDTO employeeDTO;


    public JobDTO() {
        // Default constructor
    }

    public JobDTO(String jobTitle, String description, String category, Double fare) {
        this.jobTitle = jobTitle;
        this.description = description;
        this.category = category;
        this.fare = fare;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Double getFare() {
        return fare;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
