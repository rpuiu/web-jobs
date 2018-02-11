package com.web.jobs.model;

import javax.persistence.*;

@Entity
public class Rating {

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
