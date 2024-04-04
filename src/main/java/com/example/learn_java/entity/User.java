package com.example.learn_java.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Getter
    private UUID id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String contactPhone;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String firstname;

    @Getter
    @Setter
    private String lastname;

    @Getter
    @Setter
    private String email;

    public User(String username, String contactPhone, String password, String firstname, String lastname, String email) {
        this.username = username;
        this.contactPhone = contactPhone;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    public User() {

    }

}
