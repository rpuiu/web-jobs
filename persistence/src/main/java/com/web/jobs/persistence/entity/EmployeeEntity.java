package com.web.jobs.persistence.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Employee")
public class EmployeeEntity implements DbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private PersonEntity personEntity;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "job_id", unique = true)
    private JobEntity jobEntity;

    @OneToMany(cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RatingEntity> ratingEntity;


    public EmployeeEntity() {
        // Default constructor
    }

    public EmployeeEntity(PersonEntity personEntity, JobEntity jobEntity, List<RatingEntity> ratingEntity) {
        this.personEntity = personEntity;
        this.jobEntity = jobEntity;
        this.ratingEntity = ratingEntity;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }

    public JobEntity getJobEntity() {
        return jobEntity;
    }

    public List<RatingEntity> getRatingEntity() {
        return ratingEntity;
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

