package com.example.learn_java.repository;

import com.example.learn_java.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository <Account, UUID> {

}
