package com.web.jobs.persistence.entity;

import com.web.jobs.persistence.model.PersonBuilder;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@javax.persistence.Entity(name = "Person")
public class PersonEntity implements Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String username;

    @Column
    private String address;

    @Column
    private String phone;

    @Column
    private String bankAccount;

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
        this.username = personBuilder.getUsername();
        this.address = personBuilder.getAddress();
        this.phone = personBuilder.getPhone();
        this.bankAccount = personBuilder.getBankAccount();
    }

    public PersonEntity(String name, String surname, String username, String address, String phone, String bankAccount) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.bankAccount = bankAccount;
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

    public String getBankAccount() {
        return bankAccount;
    }

}
