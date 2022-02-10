package com.sparta.apitest.model;

import com.sparta.apitest.dto.FoodsDto;
import lombok.NoArgsConstructor;
import lombok.Getter;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class FoodOrder {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int price;

    public FoodOrder(String foodName, int quantity, int price) {
        this.name = foodName;
        this.quantity = quantity;
        this.price = price;
    }
    public FoodOrder(FoodsDto foodsDto) {
        this.name = foodsDto.getName();
        this.quantity = foodsDto.getQuantity();
        this.price = foodsDto.getPrice();
    }
}
