package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
    @GetMapping("/app/car")
    public String index() {
        return "/index.html";
    }
    @GetMapping("/app/map")
    public String index2() {
        return "/index.html";
    }
    @GetMapping("/app")
    public String index3() {
        return "/index.html";
    }
//    @GetMapping("/manifest.json")
//    public String index4() {
//        return "/manifest.json";
//    }
}
