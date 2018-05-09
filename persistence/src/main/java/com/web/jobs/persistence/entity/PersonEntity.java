package com.web.jobs.persistence.entity;

import com.web.jobs.persistence.model.PersonBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Person")
public class PersonEntity implements DbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String email;
    
    @Column
    private String username;

    @Column
    private String address;

    @Column
    private String phone;

    @OneToOne(mappedBy = "personEntity")
    private EmployeeEntity employeeEntity;

    @OneToOne(mappedBy = "personEntity")
    private UserEntity userEntity;


    public PersonEntity() {
        // Default constructor
    }

    public PersonEntity(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.email = personBuilder.getEmail();
        this.username = personBuilder.getUsername();
        this.address = personBuilder.getAddress();
        this.phone = personBuilder.getPhone();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
