package com.web.jobs.core.service;

import com.web.jobs.core.controller.UserController;
import com.web.jobs.persistence.entity.PersonEntity;
import com.web.jobs.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserController userController;

    public void insert(PersonEntity person, String bankAccount) {
        UserEntity userEntity = new UserEntity(person, bankAccount);
        userController.create(userEntity);
    }

    public void delete(UserEntity userEntity) {
        userController.delete(userEntity);
    }

    public UserEntity findById(Long id) {
        return userController.findById(UserEntity.class, id);
    }

    public List<UserEntity> getAll() {
        return userController.getAll(UserEntity.class);
    }
}
