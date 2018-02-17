package com.web.jobs.core.controller;

import com.web.jobs.persistence.dto.HistoryDTO;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.springframework.stereotype.Controller;

@Controller
public class HistoryController implements EntityController<HistoryDTO> {

    private HibernateTransaction hibernateTransaction = HibernateTransaction.getHibernateTransaction();

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
