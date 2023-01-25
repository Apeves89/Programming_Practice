package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/{hello}")
    public String HelloWorld(@PathVariable(value="hello") String hello,String cheese){
       
        return hello+cheese;
    }
    
    
}
