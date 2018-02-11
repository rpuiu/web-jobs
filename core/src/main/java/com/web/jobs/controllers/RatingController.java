package com.web.jobs.controllers;

import com.web.jobs.dao.Rating;
import com.web.jobs.session.PersistenceManagement;

public class RatingController implements EntityController<Rating> {

    private PersistenceManagement persistenceManagement;

    @Override
    public void create(Rating model) {
        persistenceManagement.insert(model);
    }

    @Override
    public void delete(Rating model) {
        persistenceManagement.insert(model);
    }

    @Override
    public Rating findById(Class<Rating> clazz, Integer id) {
        return (Rating) persistenceManagement.findById(clazz, id);
    }
}
