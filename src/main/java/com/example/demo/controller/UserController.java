package com.example.demo.controller;

import com.example.demo.bean.DriverInfoBean;
import com.example.demo.dto.DriverGeoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    DriverInfoBean driverInfoBean;

    @GetMapping("/geo/{id}")
    public DriverGeoDto fetch(
            @PathVariable("id") Long id
    ){
        return driverInfoBean.getGeoDtoMap().get(id);
    }
}
