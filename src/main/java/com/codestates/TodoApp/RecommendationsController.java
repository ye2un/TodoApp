package com.codestates.TodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController {
    @GetMapping("/")
    public String hello() {
        return "To-do Application!";
    }
}
