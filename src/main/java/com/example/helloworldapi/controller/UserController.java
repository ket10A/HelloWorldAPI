package com.example.helloworldapi.controller;

import com.example.helloworldapi.entity.User;
import com.example.helloworldapi.repository.cassandra.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<User> getAllUsers() {
        List<User> users;
        users = userRepository.findAll();
        return users;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
