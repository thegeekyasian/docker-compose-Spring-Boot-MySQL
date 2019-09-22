package com.thegeekyasian.controller;

import com.thegeekyasian.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/")
public class AppController {

    @Autowired
    MessageService messageService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public String sayHello(@RequestParam(value = "message") String message) {
        messageService.create(message);
        return message;
    }
}
