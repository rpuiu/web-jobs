package com.web.jobs.controllers;

import com.web.jobs.dao.Person;
import com.web.jobs.session.PersistenceManagement;

public class PersonController implements EntityController<Person> {

    private PersistenceManagement persistenceManagement;

    @Override
    public void create(Person model) {
        persistenceManagement.insert(model);
    }

    @Override
    public void delete(Person model) {
        persistenceManagement.delete(model);
    }

    @Override
    public Person findById(Class<Person> personClass, Integer id) {
        return (Person) persistenceManagement.findById(Person.class, id);
    }

}
