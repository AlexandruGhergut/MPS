package com.oreilly.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    public String sayHello(@RequestParam(value = "name",
            defaultValue = "World") String name, Model model) {
        model.addAttribute("user", name);
        
        return "hello";
    }
}