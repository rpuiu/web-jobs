package com.web.jobs.persistence.dto;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmployeeDTO implements EntityDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private PersonDTO person;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "job_id", unique = true)
    private JobDTO jobDTO;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<RatingDTO> ratingDTOS;


    public EmployeeDTO() {
        // Default constructor
    }

    public EmployeeDTO(PersonDTO person, JobDTO jobDTO, List<RatingDTO> ratingDTOS) {
        this.person = person;
        this.jobDTO = jobDTO;
        this.ratingDTOS = ratingDTOS;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public JobDTO getJobDTO() {
        return jobDTO;
    }

    public List<RatingDTO> getRatingDTOS() {
        return ratingDTOS;
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

