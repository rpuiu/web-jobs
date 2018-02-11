package com.web.jobs.services;

import com.web.jobs.controllers.UserController;
import com.web.jobs.dao.Person;
import com.web.jobs.dao.User;

public class UserService {

    private UserController userController;

    public void insert(Person person, String bankAccount) {
        User user = new User(person, bankAccount);
        userController.create(user);
    }

    public void delete(User user) {
        userController.delete(user);
    }

    public User findById(Integer id) {
        return userController.findById(User.class, id);
    }
}
