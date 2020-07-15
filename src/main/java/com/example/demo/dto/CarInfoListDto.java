package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarInfoListDto {
    List<CarInfoListIndexDto> dtos;
}
