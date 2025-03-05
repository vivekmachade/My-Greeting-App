package com.bridgelabz.mygreeting.controller;

import com.bridgelabz.mygreeting.model.Greeting;
import com.bridgelabz.mygreeting.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // POST request to save a greeting
    @PostMapping
    public Greeting createGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }
}