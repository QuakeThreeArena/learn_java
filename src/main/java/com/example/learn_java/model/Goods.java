package com.example.learn_java.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


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
    private String price;
    @Getter
    private UUID userId;

    public Goods(UUID id, String name, String description, String location, String price, UUID userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.price = price;
        this.userId = userId;
    }

    public Goods() {

    }

}
