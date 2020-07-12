package com.example.demo.controller;

import com.example.demo.bean.DriverInfoBean;
import com.example.demo.dto.DriverGeoDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverInfoBean driverInfoBean;

    @PostMapping("/geo/{id}")
    public Object tester(
            @RequestBody DriverGeoDto geo,
            @PathVariable("id") Long id
    ) {
        driverInfoBean.getGeoDtoMap().put(id, geo);
        System.out.println(driverInfoBean.getGeoDtoMap().size());
        return null;
    }
}
