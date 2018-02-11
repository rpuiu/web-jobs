package com.web.jobs.model;

import javax.persistence.*;

@Entity
public class Person {


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
    private String account;

    @OneToOne(mappedBy = "person")
    private Employee employee;

    @OneToOne(mappedBy = "person")
    private User user;


    public Person() {
    }

    public Person(String name, String surname, String username, String address, String phone, String account) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.account = account;
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

    public String getAccount() {
        return account;
    }
}
