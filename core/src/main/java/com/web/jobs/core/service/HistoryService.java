package com.web.jobs.core.service;

import com.web.jobs.core.controller.HistoryController;
import com.web.jobs.persistence.dto.HistoryDTO;
import com.web.jobs.persistence.model.HistoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {

    @Autowired
    private HistoryController historyController;

    public void insert(Long userId, Long jobId, Long ratingId, Long employeeId, Double price, Long timestamp) {
       HistoryDTO historyDTO = new HistoryBuilder()
               .withUserId(userId)
               .withJobId(jobId)
               .withRatingId(ratingId)
               .withEmployeeId(employeeId)
               .withPrice(price)
               .withTimestamp(timestamp)
           .build();
        historyController.create(historyDTO);
    }

    public void delete(HistoryDTO historyDTO){
        historyController.delete(historyDTO);
    }

    public HistoryDTO findById(Long id){
        return historyController.findById(HistoryDTO.class, id);
    }
}
