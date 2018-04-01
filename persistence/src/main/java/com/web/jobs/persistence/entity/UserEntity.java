package com.web.jobs.persistence.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity(name = "User")
public class UserEntity implements Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private PersonEntity personEntity;

    @OneToMany(cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RatingEntity> ratingEntity = new ArrayList<>();

    @Column
    private String bankAccount;

    public UserEntity() {
        // Default constructor
    }

    public UserEntity(PersonEntity personEntity, String bankAccount) {
        this.personEntity = personEntity;
        this.bankAccount = bankAccount;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }

    public List<RatingEntity> getRatingEntity() {
        return ratingEntity;
    }

    public String getBankAccount() {
        return bankAccount;
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
