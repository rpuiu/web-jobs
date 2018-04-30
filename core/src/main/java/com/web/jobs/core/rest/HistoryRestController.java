package com.web.jobs.core.rest;

import com.web.jobs.core.service.HistoryService;
import com.web.jobs.persistence.entity.HistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HistoryRestController {

    private final HistoryService historyService;

    @Autowired
    public HistoryRestController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @PostMapping(value = "/history/add")
    public ResponseEntity insert(@RequestBody HistoryEntity history) {
        // TODO: validate the input
        historyService.insert(history.getUserId(), history.getJobId(), history.getRatingId(), history.getEmployeeId(), history.getPrice(), history.getTimestamp());

        return ResponseEntity.ok().build();
    }
    
    @DeleteMapping(value = "/history/delete")
    public ResponseEntity delete(@RequestBody HistoryEntity history) {
        historyService.delete(history);
        
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/history/{id}")
    public ResponseEntity getById(@PathVariable long id) {
        HistoryEntity byId = historyService.findById(id);
        
        return ResponseEntity.ok(byId);
    }
    
    @GetMapping(value = "/histories")
    public List getAll() {
        return historyService.getAll();
    }

}