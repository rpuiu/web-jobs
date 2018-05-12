package com.web.jobs.persistence.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "User")
public class UserEntity implements DbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private PersonEntity personEntity;

    @OneToMany(cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RatingEntity> ratingEntities = new ArrayList<>();

    @Column
    private boolean isEmployee;

    public boolean getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(boolean employee) {
        isEmployee = employee;
    }

    public UserEntity() {
        // Default constructor
    }

    public UserEntity(PersonEntity personEntity, boolean isEmployee) {
        this.personEntity = personEntity;
        this.isEmployee = isEmployee;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }

    public List<RatingEntity> getRatings() {
        return ratingEntities;
    }
    
    public void addRating(RatingEntity ratingEntity) {
        this.ratingEntities.add(ratingEntity);
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
