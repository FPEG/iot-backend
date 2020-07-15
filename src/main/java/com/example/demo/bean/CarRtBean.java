package com.example.demo.bean;

import com.example.demo.dto.CarRtDto;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarRtBean {
    Map<String, CarRtDto> carRtDtoMap = new HashMap<>();

    public Map<String, CarRtDto> getMap() {
        return carRtDtoMap;
    }

    public void setMap(Map<String, CarRtDto> map) {
        carRtDtoMap = map;
    }

}
