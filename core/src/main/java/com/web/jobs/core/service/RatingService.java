package com.web.jobs.core.service;

import com.web.jobs.core.controller.RatingController;
import com.web.jobs.persistence.dto.RatingDTO;

public class RatingService {

    private RatingController ratingController;

    public void insert(Double score, String message) {
        RatingDTO ratingDTO = new RatingDTO(score, message);
        ratingController.create(ratingDTO);
    }

    public void delete(RatingDTO ratingDTO) {
        ratingController.delete(ratingDTO);
    }

    public RatingDTO findById(Long id) {
        return ratingController.findById(RatingDTO.class, id);
    }
}
