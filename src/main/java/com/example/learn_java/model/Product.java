package com.example.learn_java.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;


@Entity
@Table(name = "goods")
public class Product {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String country;
    private String price;
    private String weight;
    private String description;
    private String size;

    public Product(UUID id, String country, String price, String weight, String description, String size) {
        this.id = id;
        this.country = country;
        this.price = price;
        this.weight = weight;
        this.description = description;
        this.size = size;
    }

    public Product() {

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
