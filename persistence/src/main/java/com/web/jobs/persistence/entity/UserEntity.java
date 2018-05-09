package com.web.jobs.persistence.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

    public UserEntity() {
        // Default constructor
    }

    public UserEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }

    public PersonEntity getPerson() {
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
