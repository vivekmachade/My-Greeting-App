package com.bridgelabz.mygreeting.service;

import com.bridgelabz.mygreeting.model.Greeting;
import com.bridgelabz.mygreeting.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Save a new greeting
    public Greeting saveGreeting(String message) {
        return greetingRepository.save(new Greeting(message));
    }

    // Find a greeting by ID
    public Greeting findGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    // Get all greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    // Update a greeting message
    public Greeting updateGreeting(Long id, String newMessage) {
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
        if (optionalGreeting.isPresent()) {
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        }
        return null; // Return null if ID is not found
    }
}