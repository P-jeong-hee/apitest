package com.sparta.apitest.service;

import com.sparta.apitest.dto.FoodsDto;
import com.sparta.apitest.dto.OrderRequestDto;
import com.sparta.apitest.dto.OrderReturnDto;
import com.sparta.apitest.model.FoodOrder;
import com.sparta.apitest.repository.FoodOrderRepository;
import com.sparta.apitest.repository.FoodRepository;
import com.sparta.apitest.repository.OrderRepository;
import com.sparta.apitest.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final FoodOrderRepository foodorderRepository;
    private final FoodRepository foodRepository;
    private final RestaurantRepository restaurantRepository;


    @Transactional
    public OrderReturnDto saving(OrderRequestDto requestDto) throws Exception {
        List<FoodsDto> foodOrders = new ArrayList<>();
        ;
        OrderReturnDto orderReturnDto = new OrderReturnDto();
        List<FoodOrder> foodorders1 = new ArrayList<>();

        int totalPrice = 0;
        String restaurantName;
        return orderReturnDto;
    }

    public List<OrderReturnDto> finding() {
        List<Order> orders = orderRepository.findAll();
        List<OrderReturnDto> orderReturnDtos = new ArrayList<>();

        for (int i = 0; i <orders.size(); i++) {
            OrderReturnDto orderReturnDto = new OrderReturnDto();

            orderReturnDto.setRestaurantName(orders.get(i).getRestaurantName());
            orderReturnDto.setFoods(orders.get(i).getFoods());
            orderReturnDto.setDeliveryFee(orders.get(i).getDeliveryFee());
            orderReturnDto.setTotalPrice(orders.get(i).getTotalPrice());
            orderReturnDtos.add(orderReturnDto);
        }
        return orderReturnDtos;
    }

}
