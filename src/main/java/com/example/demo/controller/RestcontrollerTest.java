package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestcontrollerTest {

    @GetMapping("/say")
    public String sayHello(){
        return "hello, nt";
    }

}
