package com.web.jobs.services;

import com.web.jobs.controllers.PersonController;
import com.web.jobs.dao.Person;
import com.web.jobs.model.PersonBuilder;

public class PersonService {

    private PersonController personController;

    public void insert(String name, String phone) {
        Person person = new PersonBuilder().withName(name).build();

        personController.create(person);
    }
}
