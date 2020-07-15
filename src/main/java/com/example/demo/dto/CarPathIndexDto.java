package com.example.demo.dto;

import cn.leancloud.types.AVGeoPoint;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CarPathIndexDto {
    List<AVGeoPoint> geos;
    String carId;
}
