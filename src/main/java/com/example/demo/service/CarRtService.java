package com.example.demo.service;

import com.example.demo.bean.CarRtBean;
import com.example.demo.dto.CarRtDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CarRtService {
    @Autowired
    CarRtBean carRtBean;

    public List<CarRtDto> fetchByAdcode(Long adcode) {
        List<CarRtDto> ret = new LinkedList<>();
        carRtBean.getMap().forEach((key, value) -> {
            if (value.getAdcode().equals(adcode)) {
                value.setId(key);
                ret.add(value);
            }
        });
        return ret;
    }

    public void editById(String id, CarRtDto carRtDto) {
        if (carRtDto.getAdcode() == null)
            carRtDto.setAdcode(carRtBean.getMap().get(id).getAdcode());
        carRtBean.getMap().put(id, carRtDto);
    }
}
