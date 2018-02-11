package com.web.jobs.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee implements EntityModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private Person person;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "job_id", unique = true)
    private Job job;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Rating> ratings;


    public Employee() {

    }

    public Employee(Person person, Job job, List<Rating> ratings) {
        this.person = person;
        this.job = job;
        this.ratings = ratings;
    }

    public Person getPerson() {
        return person;
    }

    public Job getJob() {
        return job;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

}

