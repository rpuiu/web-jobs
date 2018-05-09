package com.web.jobs.persistence.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Employee")
public class EmployeeEntity implements DbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private PersonEntity personEntity;

    @OneToMany(cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<JobEntity> jobEntities = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RatingEntity> ratingEntities = new ArrayList<>();


    public EmployeeEntity() {
        // Default constructor
    }

    public EmployeeEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }
    
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setPersonEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }

    public List<RatingEntity> getRatingEntities() {
        return ratingEntities;
    }

    public void addRating(RatingEntity ratingEntity) {
        this.ratingEntities.add(ratingEntity);
    }

    public List<JobEntity> getJobEntities() {
        return jobEntities;
    }

    public void addJob(JobEntity jobEntity) {
        this.jobEntities.add(jobEntity);
    }
}

