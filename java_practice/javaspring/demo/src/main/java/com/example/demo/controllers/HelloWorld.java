package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }
    
    @RequestMapping("/cheese")
    public String Cheese(){
        return "Gouda";
    }
}
