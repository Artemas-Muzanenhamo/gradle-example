package com.example.gradle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest {

    private GreetingService greetingService;

    @BeforeEach
    void setup() {
        greetingService = new GreetingService();
    }

    @DisplayName("Should return greeting with name given")
    @Test
    void greetingTest() {
        String greeting = greetingService.greet("Artemas");

        assertThat(greeting).isEqualTo("Hello Artemas");
    }
}