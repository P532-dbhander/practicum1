package com.example.practicum1.controllers;

import com.example.practicum1.model.AnimalData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class HomeController {
    @GetMapping("/")
    public String greetings()
    {
        return "Welcome to animal service!";
    }
}
