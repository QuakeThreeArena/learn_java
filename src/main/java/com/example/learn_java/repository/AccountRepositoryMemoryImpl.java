package com.example.learn_java.repository;


import com.example.learn_java.model.Account;

import java.util.HashMap;

public class AccountRepositoryMemoryImpl implements AccountRepository{
    public static HashMap<Integer,String> BaseAccount = new HashMap<>();

    @Override
    public void AccountSave(Account account) {

    }
}
