package com.bridgelabz.mygreeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET request to return a greeting message
    @GetMapping
    public String getGreeting() {
        return "Hello, World!";
    }

    // POST request to return a custom greeting message
    @PostMapping
    public String postGreeting() {
        return "Greeting created successfully!";
    }
}