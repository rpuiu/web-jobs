package com.web.jobs.persistence.dto;

import javax.persistence.*;

@Entity
public class RatingDTO implements EntityDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double score;

    @Column
    private String message;

    @ManyToOne
    private EmployeeDTO employeeDTO;

    @ManyToOne
    private UserDTO userDTO;

    public RatingDTO() {
        // Default constructor
    }

    public RatingDTO(Double score, String message) {
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
