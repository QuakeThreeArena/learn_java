package com.example.learn_java.controller;

import com.example.learn_java.controller.dto.RegisterRequestProduct;
import com.example.learn_java.model.Product;
import com.example.learn_java.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PutMapping("/product")
    public UUID update(UUID uuid, String newSize, String newCountry, int newWeight, int newPrice, String newDescription) {
        Optional<Product> product = productRepository.findById(uuid);

            Product newProduct = product.get();
            newProduct.setDescription(newDescription);
            newProduct.setPrice(newPrice);
            newProduct.setSize(newSize);
            newProduct.setCountry(newCountry);
            newProduct.setWeight(newWeight);

            return productRepository.save(newProduct).getId();

    }
}
