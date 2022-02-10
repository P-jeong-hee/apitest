package com.sparta.apitest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class OrderRequestDto {
  Long restaurantId;
  List<FoodOrderDto> foods;
  int x;
  int y;
}
