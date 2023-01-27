package com.example.chatservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1")
public class RestMessageController {

    @PostMapping("/{toUser}")
    void sendMessage(@RequestBody String message, @PathVariable String toUser){
        log.info("rest send message to user",message,toUser);
    }
}
