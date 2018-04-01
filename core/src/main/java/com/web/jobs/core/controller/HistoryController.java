package com.web.jobs.core.controller;

import com.web.jobs.persistence.entity.HistoryEntity;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.springframework.stereotype.Controller;

@Controller
public class HistoryController implements EntityController<HistoryEntity> {

    private HibernateTransaction hibernateTransaction = HibernateTransaction.getHibernateTransaction();

    @Override
    public void create(HistoryEntity model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(HistoryEntity model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public HistoryEntity findById(Class<HistoryEntity> clazz, Long id) {
        return (HistoryEntity) hibernateTransaction.findById(clazz, id);
    }
}
