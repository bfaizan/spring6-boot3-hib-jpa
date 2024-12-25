package com.learn2code.faizanfirstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @GetMapping("/")
    public String sayHello() {
        return "HELLO FAIZAAN";
    }
}
