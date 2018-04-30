package com.web.jobs.core.service;

import com.web.jobs.core.controller.HistoryController;
import com.web.jobs.persistence.entity.HistoryEntity;
import com.web.jobs.persistence.model.HistoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryController historyController;

    public void insert(Long userId, Long jobId, Long ratingId, Long employeeId, Double price, Long timestamp) {
       HistoryEntity historyEntity = new HistoryBuilder()
               .withUserId(userId)
               .withJobId(jobId)
               .withRatingId(ratingId)
               .withEmployeeId(employeeId)
               .withPrice(price)
               .withTimestamp(timestamp)
           .build();
        historyController.create(historyEntity);
    }

    public void delete(HistoryEntity historyEntity){
        historyController.delete(historyEntity);
    }

    public HistoryEntity findById(Long id){
        return historyController.findById(HistoryEntity.class, id);
    }

    public List<HistoryEntity> getAll() {
        return historyController.getAll(HistoryEntity.class);
    }
}
