package com.example.demo.controller;

import com.example.demo.bean.CarInfoBean;
import com.example.demo.dto.Area;
import com.example.demo.dto.Car;
import com.example.demo.dto.CarRT;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.leancloud.AVObject;
import cn.leancloud.AVQuery;
import cn.leancloud.types.AVGeoPoint;


@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarInfoBean carInfoBean;

    // 上传司机的位置
    @PostMapping("/rt/{id}")
    public String tester( @RequestBody CarRT info, @PathVariable("id") Number id) {
        if (carInfoBean.getGeoDtoMap().containsKey(id)) {
            carInfoBean.getGeoDtoMap().replace(id, info);
        }
        carInfoBean.getGeoDtoMap().put(id, info);
        System.out.println(carInfoBean.getGeoDtoMap().get(id));
        return "{\"msg\":\"ok\"}";
    }

    // 获取司机的位置
    @GetMapping("/rt/{id}")
    public CarRT getNowGeo(@PathVariable("id") Number id) {
        CarRT carRTDto = (CarRT) carInfoBean.getGeoDtoMap().get(id);
        return carRTDto;
    }

    @GetMapping("/all")
    public List<AVObject> getAllCars() {
        AVQuery<AVObject> query = new AVQuery<>("Car");
        return query.find();
    }

    //@GetMapping("/testdata")
    // 本地测试已经上传到 Leancloud
    public String genTestData() {
        AVObject car = new AVObject("Car");
        car.put("license", "沪A88888");
        Area start = new Area("上海海事大学5号门", new AVGeoPoint(30.881303, 121.902742), 10, new Date());
        Area end = new Area("上海海事大学3号门", new AVGeoPoint(30.876133, 121.910863), 10, new Date());
        car.put("start", start);
        car.put("end", end);
        car.put("status", "running");
        CarRT carRT = new CarRT(new AVGeoPoint(30.881679, 121.915471), 40, 20);
        car.put("now", carRT);
        ArrayList<Area> routes = new ArrayList<Area>();
        routes.add(new Area("好德便利店", new AVGeoPoint(30.879314, 121.912451), 10, new Date()));
        routes.add(new Area("临港新世界休闲广场", new AVGeoPoint(30.885612, 121.920439), 10, new Date()));
        routes.add(new Area("维也纳酒店", new AVGeoPoint(30.883135, 121.922998), 10, new Date()));
        routes.add(new Area("百润大地", new AVGeoPoint(30.877012, 121.916641), 10, new Date()));
        car.put("routes", routes);
        car.save();
        return "ok";
    }
}
