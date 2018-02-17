package com.web.jobs.persistence.dto;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Employee")
public class EmployeeDTO implements EntityDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private PersonDTO personDTO;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "job_id", unique = true)
    private JobDTO jobDTO;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<RatingDTO> ratingDTO;


    public EmployeeDTO() {
        // Default constructor
    }

    public EmployeeDTO(PersonDTO personDTO, JobDTO jobDTO, List<RatingDTO> ratingDTO) {
        this.personDTO = personDTO;
        this.jobDTO = jobDTO;
        this.ratingDTO = ratingDTO;
    }

    public PersonDTO getPersonDTO() {
        return personDTO;
    }

    public JobDTO getJobDTO() {
        return jobDTO;
    }

    public List<RatingDTO> getRatingDTO() {
        return ratingDTO;
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

