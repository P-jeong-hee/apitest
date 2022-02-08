package com.sparta.apitest.service;

import com.sparta.apitest.dto.FoodRequestDto;
import com.sparta.apitest.model.Food;
import com.sparta.apitest.repository.FoodRepository;
import com.sparta.apitest.valid.FoodValid;
import com.sparta.apitest.valid.RestaurantValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class FoodService {
    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Food registerFood (FoodRequestDto foodRequestDto) {
        FoodValid foodValid = new foodValid();
        foodValid.isValidfood(foodRequestDto);

    }
}
