package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/swagger")
public class SwaggerController {

    @RequestMapping("/test")
    public String hello() {
        return "hello,swagger!";
    }
}
