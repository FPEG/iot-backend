package com.example.demo.controller;

import com.example.demo.bean.CarInfoBean;
import com.example.demo.dto.GeoDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarInfoBean carInfoBean;

    // 上传司机的位置
    @PostMapping("/geo/{id}")
    public String tester( @RequestBody GeoDto geo, @PathVariable("id") Number id) {
        if (carInfoBean.getGeoDtoMap().containsKey(id)) {
            carInfoBean.getGeoDtoMap().replace(id, geo);
        }
        carInfoBean.getGeoDtoMap().put(id, geo);
        System.out.println(carInfoBean.getGeoDtoMap().get(id));
        return "{\"msg\":\"ok\"}";
    }

    // 获取司机的位置
    @GetMapping("/geo/{id}")
    public GeoDto getNowGeo(@PathVariable("id") Number id) {
        GeoDto geoDto = (GeoDto) carInfoBean.getGeoDtoMap().get(id);
        return geoDto;
    }

    // @GetMapping("/running")
}
