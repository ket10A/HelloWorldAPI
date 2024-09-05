package com.example.helloworldapi.controller;


import com.example.helloworldapi.entity.Message;
import com.example.helloworldapi.exception.HelloWorldException;
import com.example.helloworldapi.service.MessageService;
import com.example.helloworldapi.util.JsonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/message")
    public List<Message> getMessage() {
        return messageService.getAllMessages();
    }

    @GetMapping("/message/{id}")
    public ResponseEntity<JsonResponse<Message>> getMessageById(@PathVariable("id") Integer id) {

        log.info("get");
        Message message = messageService.findMessageById(id);
        if (message == null) {
            throw new HelloWorldException("Message not found");
        }
        List<Message> messages = Collections.singletonList(message);
        JsonResponse<Message> messageJsonResponse = new JsonResponse<>(messages, null);
        return new ResponseEntity<>(messageJsonResponse, HttpStatus.OK);
    }

    @PostMapping(value = "/message")
    public Message addMessage(@RequestBody Message message) {

        messageService.saveMessage(message);
        return
                messageService.findMessageById(message.getId());
    }
}
