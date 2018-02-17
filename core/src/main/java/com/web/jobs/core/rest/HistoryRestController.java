package com.web.jobs.core.rest;

import com.web.jobs.core.service.HistoryService;
import com.web.jobs.persistence.dto.HistoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/wj/history")
public class HistoryRestController {

    @Autowired
    private HistoryService historyService;

    @PostMapping
    public ResponseEntity createHistory(@RequestBody HistoryDTO history) {
        historyService.insert(history.getUserId(), history.getJobId(), history.getRatingId(), history.getEmployeeId(), history.getPrice(), history.getTimestamp());

        return ResponseEntity.ok().build();
    }

}
