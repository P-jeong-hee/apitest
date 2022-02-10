package com.sparta.apitest.repository;

import com.sparta.apitest.model.Food;
import com.sparta.apitest.model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {

}
