package com.web.jobs.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Job")
public class JobEntity implements DbEntity {

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

    @OneToOne(mappedBy = "jobEntity")
    private EmployeeEntity employeeEntity;


    public JobEntity() {
        // Default constructor
    }

    public JobEntity(String jobTitle, String description, String category, Double fare) {
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
