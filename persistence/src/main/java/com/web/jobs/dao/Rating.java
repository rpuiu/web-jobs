package com.web.jobs.dao;

import javax.persistence.*;

@Entity
public class Rating implements EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double score;

    @Column
    private String message;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private User user;

    public Rating() {
        // Default constructor
    }

    public Rating(Double score, String message) {
        this.score = score;
        this.message = message;
    }

    public Double getScore() {
        return score;
    }

    public String getMessage() {
        return message;
    }
}
