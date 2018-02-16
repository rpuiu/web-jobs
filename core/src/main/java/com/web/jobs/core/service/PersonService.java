package com.web.jobs.core.service;

import com.web.jobs.core.controller.PersonController;
import com.web.jobs.persistence.dto.PersonDTO;
import com.web.jobs.persistence.model.PersonBuilder;

public class PersonService {

    private PersonController personController;

    public void insert(String name, String surname, String username, String address, String phone, String bankAccount) {
        PersonDTO person = new PersonBuilder()
                .withName(name)
                .withSurame(surname)
                .withUsername(username)
                .withAddress(address)
                .withPhone(phone)
                .withBankAccount(bankAccount)
                .build();

        personController.create(person);
    }

    public void delete(PersonDTO person) {
        personController.delete(person);
    }

    public PersonDTO findById(Long id) {
        return personController.findById(PersonDTO.class, id);
    }
}
