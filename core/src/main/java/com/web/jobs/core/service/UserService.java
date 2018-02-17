package com.web.jobs.core.service;

import com.web.jobs.core.controller.UserController;
import com.web.jobs.persistence.dto.PersonDTO;
import com.web.jobs.persistence.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserController userController;

    public void insert(PersonDTO person, String bankAccount) {
        UserDTO userDTO = new UserDTO(person, bankAccount);
        userController.create(userDTO);
    }

    public void delete(UserDTO userDTO) {
        userController.delete(userDTO);
    }

    public UserDTO findById(Long id) {
        return userController.findById(UserDTO.class, id);
    }
}
