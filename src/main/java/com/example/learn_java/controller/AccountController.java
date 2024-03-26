package com.example.learn_java.controller;


import com.example.learn_java.controller.dto.RegisterRequest;
import com.example.learn_java.model.Account;
import com.example.learn_java.model.Product;
import com.example.learn_java.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class AccountController {

    public final AccountRepository accountRepository;
    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @PostMapping( "/account")
    public UUID create(@RequestBody RegisterRequest request){
        Account account = new Account();
        account.setName(request.getName());
        account.setPhone(request.getPhone());
        account.setLocation(request.getLocation());

        return accountRepository.save(account).getId();
    }
    @GetMapping("/account")
    public List<Account> getAllProducts() {
        return accountRepository.findAll();
    }
}
