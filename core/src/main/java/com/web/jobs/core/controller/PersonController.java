package com.web.jobs.core.controller;

import com.web.jobs.persistence.dto.PersonDTO;
import com.web.jobs.persistence.session.HibernateTransaction;

public class PersonController implements EntityController<PersonDTO> {

    private HibernateTransaction hibernateTransaction;

    @Override
    public void create(PersonDTO model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(PersonDTO model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public PersonDTO findById(Class<PersonDTO> clazz, Long id) {
        return (PersonDTO) hibernateTransaction.findById(clazz, id);
    }
}
