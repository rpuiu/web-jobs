package com.web.jobs.services;

import com.web.jobs.controllers.HistoryController;
import com.web.jobs.dao.History;
import com.web.jobs.model.HistoryBuilder;

public class HistoryService {

    private HistoryController historyController;

    public void insert(int userId, int jobId, int ratingId, int employeeId, Double price, Long timestamp) {
       History history = new HistoryBuilder()
               .withUserId(userId)
               .withJobId(jobId)
               .withRatingId(ratingId)
               .withEmployeeId(employeeId)
               .withPrice(price)
               .withTimestamp(timestamp)
           .build();
        historyController.create(history);
    }

    public void delete(History history){
        historyController.delete(history);
    }

    public History findById(Integer id){
        return historyController.findById(History.class, id);
    }
}
