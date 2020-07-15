package com.example.demo.dto;

import cn.leancloud.types.AVGeoPoint;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarInfoListIndexDto {
    String id;
    CarRtDto rt;
    String license;
}
