package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

	@Value("${send.message}")
    private String message;
	
    @RequestMapping("/ping")
    public String sendMessage() {
        return message;
    }
}
