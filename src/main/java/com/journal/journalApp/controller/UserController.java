package com.journal.journalApp.controller;


import com.journal.journalApp.entity.User;
import com.journal.journalApp.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User acc) {
        userService.saveEntry(acc);
        return new ResponseEntity<>(acc,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User acc) {
        User temp = userService.findByUserName(acc.getUsername());
        if(temp!=null) {
            temp.setPassword(acc.getPassword());
            temp.setUsername(acc.getUsername());
            userService.saveEntry(temp);
        }
        return new ResponseEntity<>(acc,HttpStatus.NO_CONTENT);
    }
    @GetMapping("id/{id}")
    public List<User> delUserById(ObjectId Id) {
        userService.DelUserById(Id);
        return userService.getAll();
    }

}
