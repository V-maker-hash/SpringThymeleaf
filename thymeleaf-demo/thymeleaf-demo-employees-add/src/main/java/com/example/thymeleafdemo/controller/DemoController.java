package com.example.thymeleafdemo.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class DemoController {

    //create a mapping for "/helloworld"
    @GetMapping("/hello")
    public String sayHello(Model model) {

        model.addAttribute("theModel", LocalDateTime.now());
        return "hello-world";
    }

}
