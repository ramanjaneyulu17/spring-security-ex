package com.example.spring_security_ex.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Home(HttpServletRequest request){
        return "Welcome to Spring Boot : "+request.getSession().getId();
    }

    @GetMapping("/greet")
    public String greet(HttpServletRequest request){
        return "Hello World : "+request.getSession().getId();
    }


}
