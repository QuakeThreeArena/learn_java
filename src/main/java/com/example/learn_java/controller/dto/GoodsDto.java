package com.example.learn_java.controller.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class GoodsDto {
    private UUID id;
    private String name;
    private String description;
    private String location;
    private BigDecimal price;
    private UUID userId;

    public GoodsDto(UUID id, String name, String description, String location, BigDecimal price, UUID userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.price = price;
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public UUID getUserId() {
        return userId;
    }
}
