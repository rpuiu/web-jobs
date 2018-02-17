package com.web.jobs.core.controller;

import com.web.jobs.persistence.dto.JobDTO;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.springframework.stereotype.Controller;

@Controller
public class JobController implements EntityController<JobDTO> {

    private HibernateTransaction hibernateTransaction = HibernateTransaction.getHibernateTransaction();

    @Override
    public void create(JobDTO model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(JobDTO model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public JobDTO findById(Class<JobDTO> clazz, Long id) {
        return (JobDTO) hibernateTransaction.findById(clazz,id);
    }
}
