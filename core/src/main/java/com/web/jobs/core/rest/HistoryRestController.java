package com.web.jobs.core.rest;

import com.web.jobs.core.service.HistoryService;
import com.web.jobs.persistence.entity.HistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
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
    public List<HistoryEntity> getAll() {
        HistoryEntity historyById = historyService.findById(1L);
        HistoryEntity historyEntity2 = historyService.findById(2L);
        return Arrays.asList(historyById, historyEntity2);
    }

}