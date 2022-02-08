package com.sparta.apitest.controller;

import com.sparta.apitest.dto.RestaurantRequestDto;
import com.sparta.apitest.service.RestaurantService;
import com.sparta.apitest.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    // 음식점 등록 API
    @PostMapping("/restaurant/register")
    public Restaurant registerRestaurant(@RequestBody RestaurantRequestDto restaurantRequestDto) {
        return restaurantService.registerRestaurant(restaurantRequestDto);
    }

    // 모든 음식점 조회 API
    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }


}
