package com.example.learn_java.model;

public class Account {
    private int id;
    private String name;
    private int phone;
    private String location;

    public Account(int id, String name, int phone, String location) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.location = location;
    }


    public String getLocation() {
        return location;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



}
