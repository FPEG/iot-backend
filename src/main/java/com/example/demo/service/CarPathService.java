package com.example.demo.service;

import cn.leancloud.AVObject;
import cn.leancloud.AVQuery;
import cn.leancloud.types.AVGeoPoint;
import com.example.demo.dto.CarInfoListIndexDto;
import com.example.demo.dto.CarPathDto;
import com.example.demo.dto.CarPathIndexDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarPathService {
    public CarPathDto fetchByAdcode(Long adcode){
        AVQuery<AVObject> query = new AVQuery<>("Main");
        query.whereEqualTo("adcode",adcode);
        query.selectKeys(Arrays.asList("objectId", "path"));
        List<AVObject> avObjects = query.find();
        List<CarPathIndexDto> collect = avObjects.stream().map(e -> CarPathIndexDto.builder()
                .carId(e.getObjectId())
                .geos(((List<AVGeoPoint>) e.get("path")))
                .build()).collect(Collectors.toList());
        return CarPathDto.builder()
                .dtos(collect)
                .build();
    }
}
