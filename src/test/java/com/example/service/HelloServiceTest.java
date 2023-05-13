package com.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HelloServiceTest {

    private HelloService helloService;

    @BeforeEach
    public void setup() {
        helloService = Mockito.mock(HelloService.class);
    }

    @DisplayName("test hello world successful")
    @Test
    public void testHelloWorld() {
        Mockito.when(helloService.helloWorld()).thenReturn("Hello, world!");

        assertEquals("Hello, world!", helloService.helloWorld());
    }
}
