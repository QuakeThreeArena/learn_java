package com.example.learn_java.controller;


import com.example.learn_java.controller.dto.RegisterRequest;
import com.example.learn_java.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    public final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @PostMapping("/account")
    public Integer create(@RequestBody RegisterRequest request){
        return -412312;
    }
}
