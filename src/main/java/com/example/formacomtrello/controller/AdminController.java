package com.example.formacomtrello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
    @GetMapping("/createproject")
    public String createProject() {
        return "createproject";
    }
    @GetMapping("/createcolaborator")
    public String createColaborator() {
        return "createcolaborator";
    }
}