package com.example.spring_hello_world;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

    @GetMapping("/greet")
    public String greet() {
        return "greet";
    }

    @PostMapping("/greet")
    public String greetUser(@RequestParam String name, Model model) {
        model.addAttribute("message", "Привіт, " + name + "!");
        return "greet";
    }
}

