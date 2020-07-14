package com.example.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    int id;
    String license;      // 车牌号
    Area start;          // 起点，可包含时间
    Area end;            // 终点
    List<Area> route;    // 路线
}