package com.sparta.apitest.repository;

import com.sparta.apitest.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository <Food,Long>{
}
