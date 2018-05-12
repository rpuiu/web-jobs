package com.web.jobs.core.rest;

import com.web.jobs.core.service.UserService;
import com.web.jobs.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    private UserService userService;
    
    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/user/add")
    public ResponseEntity insert(@RequestBody UserEntity user) {
        // TODO: validate the input
        userService.insert(user);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/user/delete")
    public ResponseEntity delete(@RequestBody UserEntity user) {
        userService.delete(user);

        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/user/{id}")
    public ResponseEntity getById(@PathVariable long id) {
        UserEntity byId = userService.findById(id);

        return ResponseEntity.ok(byId);
    }

    @GetMapping(value = "/users")
    public List getAll() {
        return userService.getAll();
    }
}
