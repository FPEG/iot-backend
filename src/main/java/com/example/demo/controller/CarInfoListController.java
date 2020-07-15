package com.example.demo.controller;

import com.example.demo.dto.CarInfoListDto;
import com.example.demo.service.CarInfoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carInfoList")
public class CarInfoListController {

    @Autowired
    CarInfoListService carInfoListService;

    @GetMapping("/adcodec/{adcode}")
    public CarInfoListDto fetchByAdcode(
            @PathVariable("adcode") Long adcode
    ){
        return carInfoListService.fetchByAcode(adcode);
    }

}
