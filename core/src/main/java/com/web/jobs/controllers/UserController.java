package com.web.jobs.controllers;

import com.web.jobs.dao.User;
import com.web.jobs.session.PersistenceManagement;

public class UserController implements EntityController<User> {

    private PersistenceManagement persistenceManagement;

    @Override
    public void create(User model) {
        persistenceManagement.insert(model);
    }

    @Override
    public void delete(User model) {
        persistenceManagement.delete(model);
    }

    @Override
    public User findById(Class<User> clazz, Integer id) {
        return (User) persistenceManagement.findById(clazz, id);
    }
}
