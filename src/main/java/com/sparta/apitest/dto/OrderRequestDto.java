package com.sparta.apitest.dto;

import java.util.List;

public class OrderRequestDto {
    private Long restaurantId;
    private List<FoodOrderRequestDto> foods;
}
