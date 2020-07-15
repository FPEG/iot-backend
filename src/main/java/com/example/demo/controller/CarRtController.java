package com.example.demo.controller;

import com.example.demo.dto.CarRtDto;
import com.example.demo.service.CarInfoListService;
import com.example.demo.service.CarRtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carRt")
public class CarRtController {

    @Autowired
    CarRtService carRtService;

    @GetMapping("/adcodec/{adcode}")
    public List<CarRtDto> fetchByAdcode(
           @PathVariable("adcode") Long adcode
    ) {
        return carRtService.fetchByAdcode(adcode);
    }

    @PostMapping("/{id}")
    public void editById(
            @PathVariable("id") String id,
            @RequestBody CarRtDto carRtDto
    ) {
        carRtService.editById(id, carRtDto);
    }

}
