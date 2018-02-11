package com.web.jobs.controllers;

import com.web.jobs.dao.Job;
import com.web.jobs.session.PersistenceManagement;

public class JobController implements EntityController<Job> {

    private PersistenceManagement persistenceManagement;

    @Override
    public void create(Job model) {
        persistenceManagement.insert(model);
    }

    @Override
    public void delete(Job model) {
        persistenceManagement.delete(model);
    }

    @Override
    public Job findById(Class<Job> clazz, Integer id) {
        return (Job) persistenceManagement.findById(clazz,id);
    }
}
