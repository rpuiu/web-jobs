package com.web.jobs.dao;

import com.web.jobs.model.PersonBuilder;

import javax.persistence.*;

@Entity
public class Person implements EntityModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    @OneToOne(mappedBy = "person")
    private Employee employee;

    @OneToOne(mappedBy = "person")
    private User user;


    public Person() {

    }

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.username = personBuilder.getUsername();
        this.address = personBuilder.getAddress();
        this.phone = personBuilder.getPhone();
        this.bankAccount = personBuilder.getBankAccount();
    }

    public Person(String name, String surname, String username, String address, String phone, String bankAccount) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.bankAccount = bankAccount;
    }

    public Integer getId() {
        return id;
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
