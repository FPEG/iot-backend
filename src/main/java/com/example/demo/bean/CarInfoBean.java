package com.example.demo.bean;

import com.example.demo.dto.CarRT;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Component
@Setter
@Getter
public class CarInfoBean {

    int id;
    String license;
    String start;
    String end;

    Map<Number, CarRT> geoDtoMap = new HashMap<>();

    public Map<Number, CarRT> getGeoDtoMap() {
        return geoDtoMap;
    }


}
