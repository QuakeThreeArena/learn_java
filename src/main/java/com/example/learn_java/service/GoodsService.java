package com.example.learn_java.service;


import com.example.learn_java.controller.dto.RegisterRequestGoods;
import com.example.learn_java.entity.Goods;


import java.util.List;
import java.util.UUID;

public interface GoodsService {
    UUID registration(RegisterRequestGoods registerRequest);
    UUID update(RegisterRequestGoods requestGoods);
    UUID deleted (RegisterRequestGoods requestGoods);
    List<Goods> findByAll();
}
