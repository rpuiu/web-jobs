package com.web.jobs.persistence.entity;

import javax.persistence.*;

@javax.persistence.Entity(name = "Rating")
public class RatingEntity implements Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double score;

    @Column
    private String message;

    @ManyToOne
    private EmployeeEntity employeeEntity;

    @ManyToOne
    private UserEntity userEntity;

    public RatingEntity() {
        // Default constructor
    }

    public RatingEntity(Double score, String message) {
        this.score = score;
        this.message = message;
    }

    public Double getScore() {
        return score;
    }

    public String getMessage() {
        return message;
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
