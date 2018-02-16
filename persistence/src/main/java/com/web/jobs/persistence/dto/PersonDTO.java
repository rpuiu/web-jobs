package com.web.jobs.persistence.dto;

import com.web.jobs.persistence.model.PersonBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDTO implements EntityDTO {

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

    @OneToOne(mappedBy = "personDTO")
    private EmployeeDTO employeeDTO;

    @OneToOne(mappedBy = "personDTO")
    private UserDTO userDTO;


    public PersonDTO() {
        // Default constructor
    }

    public PersonDTO(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.username = personBuilder.getUsername();
        this.address = personBuilder.getAddress();
        this.phone = personBuilder.getPhone();
        this.bankAccount = personBuilder.getBankAccount();
    }

    public PersonDTO(String name, String surname, String username, String address, String phone, String bankAccount) {
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
