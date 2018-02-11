package com.web.jobs.services;

import com.web.jobs.controllers.PersonController;
import com.web.jobs.dao.Person;
import com.web.jobs.model.PersonBuilder;

public class PersonService {

    private PersonController personController;

    public void insert(String name, String surname, String username, String address, String phone, String bankAccount) {
        Person person = new PersonBuilder()
                .withName(name)
                .withSurame(surname)
                .withUsername(username)
                .withAddress(address)
                .withPhone(phone)
                .withBankAccount(bankAccount)
                .build();

        personController.create(person);
    }

    public void delete(Person person) {
        personController.delete(person);
    }

    public Person findById(Integer id) {
        return personController.findById(Person.class, id);
    }
}
