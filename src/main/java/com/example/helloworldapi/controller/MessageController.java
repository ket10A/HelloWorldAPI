package com.example.helloworldapi.controller;


import com.example.helloworldapi.entity.Message;
import com.example.helloworldapi.mysql.MySQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {


    @Autowired
    MySQLRepository mySQLRepository;

    @GetMapping("/message")
    public List<Message> getMessage() {
        return mySQLRepository.findAll();
    }

    @GetMapping("/message/{id}")
    public Message getMessageById(@PathVariable("id") Integer id) {
        return mySQLRepository.findById(id).get();
    }
}
