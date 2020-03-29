package com.example.gradle.demo.controller;

import com.example.gradle.demo.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    private GreetingService greetingService;

    public Endpoint(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String greeting(@RequestParam String name) {
        return greetingService.greetingWithName(name);
    }
}