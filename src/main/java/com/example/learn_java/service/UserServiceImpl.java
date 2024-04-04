package com.example.learn_java.service;

import com.example.learn_java.controller.dto.RegisterRequest;
import com.example.learn_java.entity.User;
import com.example.learn_java.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID register(RegisterRequest registerRequest) {
        var user = new User(
                registerRequest.getUsername(),
                encodePasswordToBase64(registerRequest.getPassword()),
                registerRequest.getContactPhone(),
                registerRequest.getFirstname(),
                registerRequest.getLastname(),
                registerRequest.getEmail()
        );
        return repository.save(user).getId();
    }

    @Override
    public UUID login(String username, String password) {
        var user = repository.findByUsernameAndPassword(username, encodePasswordToBase64(password));
        if (Objects.isNull(user)) {
            throw new RuntimeException("User not found");
        }
        return user.getId();
    }

    private String encodePasswordToBase64(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
    }
}
