package com.example.learn_java.service;

import com.example.learn_java.controller.dto.RegisterRequest;

import java.util.UUID;

public interface UserService {
    UUID register(RegisterRequest registerRequest);

    UUID login(String username, String password);
}
