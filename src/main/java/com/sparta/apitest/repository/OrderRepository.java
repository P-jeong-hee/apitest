package com.sparta.apitest.repository;

import com.sparta.apitest.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
