package com.web.jobs.controllers;

import com.web.jobs.dao.Person;
import com.web.jobs.session.PersistenceManagement;

public class PersonController implements EntityController<Person> {

    private PersistenceManagement persistenceManagement;

    public void create(Person model) {
        persistenceManagement.insert(model);
    }

    public void delete(Person model) {
        persistenceManagement.delete(model);
    }
}
