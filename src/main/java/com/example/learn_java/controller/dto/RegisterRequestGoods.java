package com.example.learn_java.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class RegisterRequestGoods {
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
    @Setter
    private UUID userId;
}
