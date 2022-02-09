package com.sparta.apitest.dto;

import com.sparta.apitest.model.Food;
import com.sparta.apitest.model.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoodRequestDto {

    private Long id;
    private Restaurant restaurant;
    private String name;
    private int price;

    public FoodRequestDto(Food food) {
        this.id = food.getId();
        this.name = food.getName();
        this.price = food.getPrice();
    }
}
