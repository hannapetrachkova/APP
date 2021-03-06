package com.example.demo.controller;

import com.example.demo.entity.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class HomeController {
    
    @GetMapping("/")
    public Task home() {
        return new Task(1, "Hello, world!");
    }
}
