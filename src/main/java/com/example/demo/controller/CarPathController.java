package com.example.demo.controller;

import com.example.demo.dto.CarPathDto;
import com.example.demo.service.CarPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carPath")
public class CarPathController {

    @Autowired
    CarPathService carPathService;

    @GetMapping("/adcodec/{adcode}")
    public CarPathDto fetchByAdcode(
         @PathVariable("adcode") Long adcode
    ){
        return carPathService.fetchByAdcode(adcode);
    }
}
