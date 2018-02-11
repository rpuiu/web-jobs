package com.web.jobs.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User implements EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private Person person;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Rating> rating = new ArrayList<>();

    @Column
    private String bankAccount;

    public User() {
        // Default constructor
    }

    public User(Person person, String bankAccount) {
        this.person = person;
        this.bankAccount = bankAccount;
    }

    public Person getPerson() {
        return person;
    }

    public List<Rating> getRating() {
        return rating;
    }

    public String getBankAccount() {
        return bankAccount;
    }

}
