package com.example.gradle.web.controller;

import com.example.gradle.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingEndpoint {

    private final GreetingService greetingService;

    public GreetingEndpoint(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String greet(@RequestParam(required = false) String name) {
        return greetingService.greet(name);
    }
}
