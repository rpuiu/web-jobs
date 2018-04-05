package com.web.jobs.core.rest;

import com.web.jobs.core.service.HistoryService;
import com.web.jobs.persistence.entity.HistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HistoryRestController {

    private final HistoryService historyService;

    @Autowired
    public HistoryRestController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @PostMapping
    public ResponseEntity createHistory(@RequestBody HistoryEntity history) {
        historyService.insert(history.getUserId(), history.getJobId(), history.getRatingId(), history.getEmployeeId(), history.getPrice(), history.getTimestamp());

        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/history/{id}")
    public ResponseEntity getHistory(@PathVariable long id) {
        HistoryEntity historyById = historyService.findById(id);
        
        return ResponseEntity.ok(historyById);
    }
    
    @GetMapping(value = "/history")
    public ResponseEntity getAll() {
        HistoryEntity historyById = historyService.findById(1L);

        return ResponseEntity.ok(historyById);
    }

}
