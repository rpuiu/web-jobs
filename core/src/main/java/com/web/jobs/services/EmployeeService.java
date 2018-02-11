package com.web.jobs.services;

import com.web.jobs.controllers.EmployeeController;
import com.web.jobs.dao.Employee;
import com.web.jobs.dao.Job;
import com.web.jobs.dao.Person;
import com.web.jobs.dao.Rating;

import java.util.List;

public class EmployeeService {

    private EmployeeController employeeController;

    public void insert(Person person, Job job, List<Rating> ratings) {
        Employee employee = new Employee(person, job, ratings);
        employeeController.create(employee);
    }

    public void delete(Employee employee){
        employeeController.delete(employee);
    }

    public Employee findById(Integer id){
        return employeeController.findById(Employee.class, id);
    }
}
