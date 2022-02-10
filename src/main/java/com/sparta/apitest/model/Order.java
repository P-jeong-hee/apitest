package com.sparta.apitest.model;

import com.sparta.apitest.dto.OrderReturnDto;
import lombok.NoArgsConstructor;
import lombok.Getter;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import com.sparta.apitest.dto.FoodsDto;
import com.sparta.apitest.dto.FoodRequestDto;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Table(name = "orders")
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Order {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String restaurantName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(nullable = false)
    private List<FoodOrder> foods;

    @Column(nullable = false)
    private int deliveryFee;

    @Column(nullable = false)
    private int totalPrice;


    public Order(OrderReturnDto orderReturnDto) {
        this.restaurantName = orderReturnDto.getRestaurantName();
        this.foods = orderReturnDto.getFoods();
        this.deliveryFee = orderReturnDto.getDeliveryFee();
        this.totalPrice = orderReturnDto.getTotalPrice();
    }
}