package com.example.dog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//This controller class is to redirect Thymleaf to point the index.html file inside resources folder.
@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String index() {
        return "index";
    }
}

