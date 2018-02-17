package com.web.jobs.core.rest;

import com.web.jobs.common.model.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wj/entity")
public class EntityController {

    @GetMapping("test")
    public ResponseEntity<Greeting> getGreeting() {
        Greeting greeting = new Greeting(10, "Lucian");

        return ResponseEntity.ok(greeting);
    }

}
