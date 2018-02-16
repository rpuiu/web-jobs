package com.web.jobs.core.controller;

import com.web.jobs.persistence.dto.UserDTO;
import com.web.jobs.persistence.session.HibernateTransaction;

public class UserController implements EntityController<UserDTO> {

    private HibernateTransaction hibernateTransaction;

    @Override
    public void create(UserDTO model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(UserDTO model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public UserDTO findById(Class<UserDTO> clazz, Long id) {
        return (UserDTO) hibernateTransaction.findById(clazz, id);
    }
}
