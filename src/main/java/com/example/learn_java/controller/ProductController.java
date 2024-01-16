package com.example.learn_java.controller;

import com.example.learn_java.controller.dto.RegisterRequestProduct;
import com.example.learn_java.model.Product;
import com.example.learn_java.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.UUID;

@RestController
public class ProductController {
    public  final  ProductRepository productRepository;
    @Autowired
    public ProductController (ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @PostMapping("/product")
    public UUID create(@RequestBody RegisterRequestProduct requestProduct){
        Product product = new Product();
        product.setCountry(requestProduct.getCountry());
        product.setDescription(requestProduct.getDescription());
        product.setPrice(requestProduct.getPrice());
        product.setWeight(requestProduct.getWeight());
        product.setSize(requestProduct.getSize());

        return productRepository.save(product).getId();
    }
    @GetMapping("/product")
    public Product getAll (){

        return null;
    }
}
