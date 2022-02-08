package com.sparta.apitest.controller;

import com.sparta.apitest.dto.FoodRequestDto;
import com.sparta.apitest.model.Food;
import com.sparta.apitest.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class  FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping("/restaurant/{restaurantId}/food/register")
    public Food registerFood (FoodRequestDto foodRequestDto) {
        return foodService.registerFood(foodRequestDto);
    }

    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<Food> getAllFood() {
        return foodService.getAllFood();
    }
}
