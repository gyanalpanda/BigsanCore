package com.bigsan.userservice.controller;

import com.bigsan.userservice.model.User;
import com.bigsan.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public User create(@RequestBody User user){
        return service.create(user);
    }

    @GetMapping
    public List<User> getAll(){
        return service.getAll();
    }
}