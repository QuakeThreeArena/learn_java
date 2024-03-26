package com.example.learn_java;

import com.example.learn_java.controller.dto.RegisterRequest;
import com.example.learn_java.controller.dto.RegisterRequestProduct;
import com.example.learn_java.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJavaApplication   {

    public static void main(String[] args) {
        SpringApplication.run(LearnJavaApplication.class, args);
    }

}
