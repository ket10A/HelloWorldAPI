package com.example.helloworldapi.service;

import com.example.helloworldapi.entity.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {

    List<Message> getAllMessages();

    Message findMessageById(Integer id);

    void saveMessage(Message message);

    Message updateMessageById(Integer id, Message message);
}
