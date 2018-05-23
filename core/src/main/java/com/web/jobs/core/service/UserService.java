package com.web.jobs.core.service;

import com.web.jobs.core.controllers.EmployeeController;
import com.web.jobs.core.controllers.UserController;
import com.web.jobs.persistence.entity.EmployeeEntity;
import com.web.jobs.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserController userController;
    @Autowired
    private EmployeeController employeeController;

    public void insert(UserEntity userEntity) {
        if(userEntity.getIsEmployee()){
            EmployeeEntity employeeEntity = new EmployeeEntity(userEntity.getPersonEntity());
            employeeController.create(employeeEntity);
        }
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
