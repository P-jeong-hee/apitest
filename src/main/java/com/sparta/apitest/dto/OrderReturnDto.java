package com.sparta.apitest.dto;

import com.sparta.apitest.model.FoodOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class OrderReturnDto {
    private String restaurantName;
    private List<FoodOrder> foods;
    private int deliveryFee;
    private int totalPrice;
}
