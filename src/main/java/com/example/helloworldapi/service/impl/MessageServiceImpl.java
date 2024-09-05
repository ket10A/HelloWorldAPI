package com.example.helloworldapi.service.impl;

import com.example.helloworldapi.entity.Message;
import com.example.helloworldapi.repository.mysql.MessageRepository;
import com.example.helloworldapi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message findMessageById(Integer id) {

        return messageRepository.findById(id).get();
    }

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }
}
