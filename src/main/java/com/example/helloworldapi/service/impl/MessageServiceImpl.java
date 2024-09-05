package com.example.helloworldapi.service.impl;

import com.example.helloworldapi.entity.Message;
import com.example.helloworldapi.exception.HelloWorldException;
import com.example.helloworldapi.repository.mysql.MessageRepository;
import com.example.helloworldapi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Message updateMessageById(Integer id, Message message) {
        Optional<Message> currentMessage = messageRepository.findById(id);

        if (currentMessage.isPresent()) {
            Message m = currentMessage.get();
            m.setMessage(message.getMessage());
            messageRepository.save(m);

            return messageRepository.findById(id).get();
        }
        else {
            throw new HelloWorldException("Message not found");
        }
    }
}
