package com.web.jobs.persistence.dto;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "User")
public class UserDTO implements EntityDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", unique = true)
    private PersonDTO personDTO;

    @OneToMany(cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RatingDTO> ratingDTO = new ArrayList<>();

    @Column
    private String bankAccount;

    public UserDTO() {
        // Default constructor
    }

    public UserDTO(PersonDTO personDTO, String bankAccount) {
        this.personDTO = personDTO;
        this.bankAccount = bankAccount;
    }

    public PersonDTO getPersonDTO() {
        return personDTO;
    }

    public List<RatingDTO> getRatingDTO() {
        return ratingDTO;
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
