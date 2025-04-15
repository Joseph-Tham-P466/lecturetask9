package com.example.lecturetask9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lecturetask9 {
        @GetMapping("/")
    public String greeting() {
        return "Hello world!";
    }

    @GetMapping("/add/{n}/{m}")
    public String add(@PathVariable int n, @PathVariable int m) {
        return String.valueOf(n + m);
    }
}
