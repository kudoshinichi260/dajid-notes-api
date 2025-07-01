package com.example.dajidnotesapi.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    @GetMapping("/api/hello")
    public String sayHello() {
        return " Xin chào từ backend Java Spring Boot!";
    }
}
