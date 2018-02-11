package com.web.jobs.dao;

import javax.persistence.*;

@Entity
public class Job implements EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String jobTitle;

    @Column
    private String description;

    @Column
    private String category;

    @Column
    private Double fare;

    @OneToOne(mappedBy = "job")
    private Employee employee;


    public Job(String jobTitle, String description, String category, Double fare) {
        this.jobTitle = jobTitle;
        this.description = description;
        this.category = category;
        this.fare = fare;
    }

    public Job() {
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

}
