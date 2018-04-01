package com.web.jobs.persistence.model;

import com.web.jobs.persistence.entity.PersonEntity;

public class PersonBuilder {

    private String name;
    private String surname;
    private String username;
    private String address;
    private String phone;
    private String bankAccount;

    public PersonBuilder() {
        // Default constructor
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withSurame(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public PersonBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder withBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    public PersonEntity build() {
        return new PersonEntity(this);
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
