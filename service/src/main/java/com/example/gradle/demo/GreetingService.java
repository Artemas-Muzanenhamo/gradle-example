package com.example.gradle.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greetingWithName(String name) {
        return "Hello " + name;
    }
}
