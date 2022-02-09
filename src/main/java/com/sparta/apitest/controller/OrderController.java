package com.sparta.apitest.controller;

import com.sparta.apitest.dto.FoodRequestDto;
import com.sparta.apitest.dto.OrderRequestDto;
import com.sparta.apitest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //주문 API
    @PostMapping("POST/order/request")
    public requestOrder(@RequestBody List<OrderRequestDto>orderRequestDto, @PathVariable Long restaurantId) {
        OrderService.requestOrder(orderRequestDto, restaurantId);
    }

    //주문 조회 API
    @GetMapping("GET/orders")
    public List<OrderRequestDto> getAllOrders(@PathVariable Long restaurantId) {
        return orderService.getAllOrder(restaurantId);
}
