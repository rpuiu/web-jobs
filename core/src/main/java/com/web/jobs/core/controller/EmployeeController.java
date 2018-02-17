package com.web.jobs.core.controller;

import com.web.jobs.persistence.dto.EmployeeDTO;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController implements EntityController<EmployeeDTO> {

    private HibernateTransaction hibernateTransaction = HibernateTransaction.getHibernateTransaction();

    @Override
    public void create(EmployeeDTO model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(EmployeeDTO model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public EmployeeDTO findById(Class<EmployeeDTO> clazz, Long id) {
        return (EmployeeDTO) hibernateTransaction.findById(clazz, id);
    }
}
