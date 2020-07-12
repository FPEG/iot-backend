package com.example.demo.bean;

import com.example.demo.dto.DriverGeoDto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DriverInfoBean {
    Map<Long, DriverGeoDto> geoDtoMap = new HashMap<>();

    public Map<Long, DriverGeoDto> getGeoDtoMap() {
        return geoDtoMap;
    }
}
