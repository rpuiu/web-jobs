package com.web.jobs.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private Person person;


    @OneToMany(cascade = {CascadeType.ALL})
//    @JoinColumn(name = "rating_id", unique = true)
    private List<Rating> rating;


    @Column
    private String account;

    public User() {
    }

    public User(Person person, List<Rating> rating, String account) {
        this.person = person;
        this.rating = rating;
        this.account = account;

    }

    public Person getPerson() {
        return person;
    }

    public List<Rating> getRating() {
        return rating;
    }

    public String getAccount() {
        return account;
    }

}
