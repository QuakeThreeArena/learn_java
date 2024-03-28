package com.example.learn_java.controller;




import com.example.learn_java.controller.dto.RegisterRequestUser;
import com.example.learn_java.model.User;
import com.example.learn_java.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {
    public final UsersRepository usersRepository;

    @Autowired
    public UserController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping("/users")
    public UUID create(@RequestBody RegisterRequestUser requestUser){
        User user = new User();
        user.setUsername(requestUser.getUsername());
        user.setPassword(requestUser.getPassword());
        user.setFirstname(requestUser.getFirstname());
        user.setLastname(requestUser.getLastname());
        user.setContactPhone(requestUser.getContactPhone());
        user.setEmail(requestUser.getEmail());


        return usersRepository.save(user).getId();
    }

}
