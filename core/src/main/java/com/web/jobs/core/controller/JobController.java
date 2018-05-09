package com.web.jobs.core.controller;

import com.web.jobs.persistence.entity.JobEntity;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class JobController implements EntityController<JobEntity> {

    private HibernateTransaction hibernateTransaction = HibernateTransaction.getHibernateTransaction();

    @Override
    public void create(JobEntity model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void update(JobEntity model) {
        //TODO update jobs if necessary
    }

    @Override
    public void delete(JobEntity model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public JobEntity findById(Class<JobEntity> clazz, Long id) {
        return (JobEntity) hibernateTransaction.findById(clazz,id);
    }

    @Override
    public List<JobEntity> getAll(Class<JobEntity> clazz) {
        return hibernateTransaction.findAll(clazz);
    }
}
