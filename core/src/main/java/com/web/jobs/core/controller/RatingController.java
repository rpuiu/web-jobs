package com.web.jobs.core.controller;

import com.web.jobs.persistence.dto.RatingDTO;
import com.web.jobs.persistence.session.HibernateTransaction;

public class RatingController implements EntityController<RatingDTO> {

    private HibernateTransaction hibernateTransaction;

    @Override
    public void create(RatingDTO model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public void delete(RatingDTO model) {
        hibernateTransaction.insert(model);
    }

    @Override
    public RatingDTO findById(Class<RatingDTO> clazz, Long id) {
        return (RatingDTO) hibernateTransaction.findById(clazz, id);
    }
}
