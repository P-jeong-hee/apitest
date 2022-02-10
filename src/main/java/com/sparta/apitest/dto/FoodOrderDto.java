package com.sparta.apitest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class FoodOrderDto {
    Long id;
    int quantity;
}