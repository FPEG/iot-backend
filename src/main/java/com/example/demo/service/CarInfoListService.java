package com.example.demo.service;

import cn.leancloud.AVObject;
import cn.leancloud.AVQuery;
import cn.leancloud.types.AVGeoPoint;
import com.example.demo.bean.CarRtBean;
import com.example.demo.dto.CarInfoListDto;
import com.example.demo.dto.CarInfoListIndexDto;
import com.example.demo.dto.CarRtDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CarInfoListService {

    @Autowired
    CarRtBean carRtBean;

    public CarInfoListDto fetchByAcode(Long adcode) {
        Map<String, CarRtDto> map = carRtBean.getMap();

        AVQuery<AVObject> query = new AVQuery<>("Main");
        query.whereEqualTo("adcode", adcode);
        query.selectKeys(Arrays.asList("objectId", "license"));
        List<AVObject> avObjects = query.find();
        List<CarInfoListIndexDto> collect = avObjects.stream().map(e -> {
            CarRtDto carRtDto = map.get(e.getObjectId());
            return CarInfoListIndexDto.builder()
                    .id(e.getObjectId())
                    .rt(carRtDto)
                    .license(e.get("license").toString())
                    .build();
        }).collect(Collectors.toList());
        return CarInfoListDto.builder()
                .dtos(collect)
                .build();
    }
}
