package com.sparta.apitest.model;

import com.sparta.apitest.dto.RestaurantRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Restaurant {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private int minOrderPrice;

    @Column(nullable = false)
    private int deliveryFee;

    public Restaurant(RestaurantRequestDto restaurantRequestDto) {
        this.name = restaurantRequestDto.getName();
        this.minOrderPrice = restaurantRequestDto.getMinOrderPrice();
        this.deliveryFee = restaurantRequestDto.getDeliveryFee();
    }

}