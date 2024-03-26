package com.example.learn_java.controller;

import com.example.learn_java.controller.dto.RegisterRequestProduct;
import com.example.learn_java.model.Product;
import com.example.learn_java.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ProductController {
    public final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/product")
    public UUID create(@RequestBody RegisterRequestProduct requestProduct) {
        Product product = new Product();
        product.setCountry(requestProduct.getCountry());
        product.setDescription(requestProduct.getDescription());
        product.setPrice(requestProduct.getPrice());
        product.setWeight(requestProduct.getWeight());
        product.setSize(requestProduct.getSize());

        return productRepository.save(product).getId();
    }
        //
    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productRepository.findAll();


    }
    @GetMapping("/product/1")
    public Optional<Product> getProduct( RegisterRequestProduct registerRequestProduct) {
        return productRepository.findById(registerRequestProduct.getUuid());
  }



    @PutMapping("/product")
    public UUID update(@RequestBody RegisterRequestProduct registerRequestProduct) {
        Optional<Product> product = productRepository.findById(registerRequestProduct.getUuid());

        Product newProduct = product.get();
        newProduct.setDescription(registerRequestProduct.getDescription());
        newProduct.setPrice(registerRequestProduct.getPrice());
        newProduct.setSize(registerRequestProduct.getSize());
        newProduct.setCountry(registerRequestProduct.getCountry());
        newProduct.setWeight(registerRequestProduct.getWeight());

        return productRepository.save(newProduct).getId();

    }

}
