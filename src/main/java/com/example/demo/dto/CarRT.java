package com.example.demo.dto;

import cn.leancloud.types.AVGeoPoint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Car Real Time Dto
// 车辆实时信息
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarRT {
    AVGeoPoint geo;
    float speed;    // 时速
    int passengers; // 乘客数量
}