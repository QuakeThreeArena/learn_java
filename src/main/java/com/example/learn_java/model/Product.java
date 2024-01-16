package com.example.learn_java.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Goods")
public class Product {
    @Id
    @GeneratedValue
    private UUID id;
    private String country;
    private int price;
    private int weight;
    private String description;

    public Product(UUID id, String country, int price, int weight, String description) {
        this.id = id;
        this.country = country;
        this.price = price;
        this.weight = weight;
        this.description = description;
    }
    public Product(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
