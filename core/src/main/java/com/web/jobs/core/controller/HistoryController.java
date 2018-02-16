package com.web.jobs.core.controller;

import com.web.jobs.persistence.dto.HistoryDTO;
import com.web.jobs.persistence.session.HibernateTransaction;

public class HistoryController implements EntityController<HistoryDTO> {

    private HibernateTransaction hibernateTransaction;

    @Override
    public void create(HistoryDTO model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(HistoryDTO model) {
        hibernateTransaction.delete(model);
    }

    @Override
    public HistoryDTO findById(Class<HistoryDTO> clazz, Long id) {
        return (HistoryDTO) hibernateTransaction.findById(clazz, id);
    }
}
