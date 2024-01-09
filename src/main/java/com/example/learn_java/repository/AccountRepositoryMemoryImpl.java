package com.example.learn_java.repository;


import com.example.learn_java.model.Account;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
@Repository
public class AccountRepositoryMemoryImpl implements AccountRepository{
    public static HashMap<Integer,String> baseAccount = new HashMap<>();

    public void saveAccount(Account account) {
        if(baseAccount.containsKey(account.getId())) System.out.println("Такой аккаунт уже существует!");
        else {
            baseAccount.put(account.getId(), account.getName());

        }
    }

}
