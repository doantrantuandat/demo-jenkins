package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }
}