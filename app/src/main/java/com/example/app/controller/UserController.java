package com.example.app.controller;

import com.example.app.entity.User;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User demo(@PathVariable Long id) {
        return userService.getOne(id);
    }

}
