package com.sparta.apitest.model;

import com.sparta.apitest.dto.FoodRequestDto;
import com.sparta.apitest.repository.FoodRepository;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Food {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    public Food (FoodRequestDto foodRequestDto) {
        this.name = foodRequestDto.getName;
        this.price = foodRequestDto.getPrice;
    }
}
