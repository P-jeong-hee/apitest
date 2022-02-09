package com.sparta.apitest.repository;

import com.sparta.apitest.model.Food;
import com.sparta.apitest.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepostitory extends JpaRepository<Order,Long> {
    List<Food> findAllByRestaurant(Restaurant restaurant);

}
