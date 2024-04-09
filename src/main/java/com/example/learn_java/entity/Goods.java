package com.example.learn_java.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.util.UUID;


@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue
    @Getter
    private UUID id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private String location;
    @Getter
    @Setter
    private BigDecimal price;
    @Getter
    private UUID userId;

    public Goods(String name, String description, String location, BigDecimal price,UUID userId) {
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.location = location;
        this.price = price;
    }

    public Goods() {

    }

}
