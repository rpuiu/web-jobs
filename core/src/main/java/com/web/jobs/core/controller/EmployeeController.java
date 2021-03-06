package com.web.jobs.core.controller;

import com.web.jobs.persistence.entity.EmployeeEntity;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController implements EntityController<EmployeeEntity> {

    private HibernateTransaction hibernateTransaction = HibernateTransaction.getHibernateTransaction();

    @Override
    public void create(EmployeeEntity model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(EmployeeEntity model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public EmployeeEntity findById(Class<EmployeeEntity> clazz, Long id) {
        return (EmployeeEntity) hibernateTransaction.findById(clazz, id);
    }
    
}
