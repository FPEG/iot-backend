package com.example.demo.controller;

import com.example.demo.bean.CarInfoBean;
import com.example.demo.dto.GeoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    CarInfoBean carInfoBean;

    @GetMapping("/geo/{id}")
    public GeoDto fetch(
            @PathVariable("id") Number id
    ){
        return carInfoBean.getGeoDtoMap().get(id);
    }
}
