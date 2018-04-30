package com.web.jobs.core.controller;

import com.web.jobs.persistence.entity.UserEntity;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController implements EntityController<UserEntity> {

    private HibernateTransaction hibernateTransaction = HibernateTransaction.getHibernateTransaction();

    @Override
    public void create(UserEntity model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(UserEntity model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public UserEntity findById(Class<UserEntity> clazz, Long id) {
        return (UserEntity) hibernateTransaction.findById(clazz, id);
    }

    @Override
    public List<UserEntity> getAll(Class<UserEntity> clazz) {
        return hibernateTransaction.findAll(clazz);
    }


}
