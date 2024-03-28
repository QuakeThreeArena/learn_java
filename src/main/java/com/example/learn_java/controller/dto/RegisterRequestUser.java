package com.example.learn_java.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class RegisterRequestUser {
    @Getter
    private UUID id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String contactPhone;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String firstname;

    @Getter
    @Setter
    private String lastname;

    @Getter
    @Setter
    private String email;
}
