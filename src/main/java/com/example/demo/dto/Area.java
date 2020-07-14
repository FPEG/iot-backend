package com.example.demo.dto;

import java.util.Date;

import org.springframework.lang.Nullable;

import cn.leancloud.types.AVGeoPoint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 地点
// time 设置为 Nullable，用于路程表和时刻表共用
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Area {
    String name;
    AVGeoPoint geo;

    @Nullable
    float range;

    @Nullable
    Date time;
}