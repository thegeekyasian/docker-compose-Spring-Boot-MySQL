package com.thegeekyasian.service;

import com.thegeekyasian.model.Message;
import com.thegeekyasian.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void create(String message) {
        messageRepository.save(new Message(message));
    }
}
