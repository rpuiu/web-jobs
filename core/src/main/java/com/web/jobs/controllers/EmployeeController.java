package com.web.jobs.controllers;

import com.web.jobs.dao.Employee;
import com.web.jobs.session.PersistenceManagement;

public class EmployeeController implements EntityController<Employee> {

    private PersistenceManagement persistenceManagement;

    @Override
    public void create(Employee model) {
        persistenceManagement.insert(model);
    }

    @Override
    public void delete(Employee model) {
        persistenceManagement.delete(model);
    }

    @Override
    public Employee findById(Class<Employee> clazz, Integer id) {
        return (Employee) persistenceManagement.findById(clazz, id);
    }
}
