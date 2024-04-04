package com.example.learn_java.controller;

import com.example.learn_java.controller.dto.Credential;
import com.example.learn_java.controller.dto.RegisterRequest;
import com.example.learn_java.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/registration")
    public UUID registration(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }

    @PostMapping("/user/login")
    public UUID login(@RequestBody Credential credential) {
        return userService.login(credential.getUsername(), credential.getPassword());
    }
}
