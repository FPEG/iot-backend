package com.example.demo.dto;

import cn.leancloud.types.AVGeoPoint;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarRtDto {
    AVGeoPoint geo;
    float speed;    // 时速
    int passengers; // 乘客数量
    Long adcode;
    String id;
}
