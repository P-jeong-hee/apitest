package com.sparta.apitest.controller;

import com.sparta.apitest.dto.FoodRequestDto;
import com.sparta.apitest.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    // 음식 등록 API
    @PostMapping("/restaurant/{restaurantId}/food/register")
    public void registerFood(@RequestBody List<FoodRequestDto> foodRequestDto, @PathVariable Long restaurantId) {
        foodService.registerFood(foodRequestDto,restaurantId);
    }

    // 메뉴판 조회 API
    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<FoodRequestDto> getAllFoods(@PathVariable Long restaurantId) {
        return foodService.getAllFoods(restaurantId);
    }

}
