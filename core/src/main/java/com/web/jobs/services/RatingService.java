package com.web.jobs.services;

import com.web.jobs.controllers.RatingController;
import com.web.jobs.dao.Rating;

public class RatingService {

    private RatingController ratingController;

    public void insert(Double score, String message) {
        Rating rating = new Rating(score, message);
        ratingController.create(rating);
    }

    public void delete(Rating rating) {
        ratingController.delete(rating);
    }

    public Rating findById(Integer id) {
        return ratingController.findById(Rating.class, id);
    }
}
