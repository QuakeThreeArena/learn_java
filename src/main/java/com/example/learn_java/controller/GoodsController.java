package com.example.learn_java.controller;

import com.example.learn_java.controller.dto.RegisterRequestGoods;
import com.example.learn_java.model.Goods;
import com.example.learn_java.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class GoodsController {
    public final GoodsRepository goodsRepository;

    @Autowired
    public GoodsController(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @PostMapping("/goods")
    public UUID create(@RequestBody RegisterRequestGoods requestProduct) {
        Goods goods = new Goods();
        goods.setName(requestProduct.getName());
        goods.setLocation(requestProduct.getLocation());
        goods.setPrice(requestProduct.getPrice());
        goods.setDescription(requestProduct.getDescription());


        return goodsRepository.save(goods).getId();
    }
        //
    @GetMapping("/goods")
    public List<Goods> getAllProducts() {
        return goodsRepository.findAll();


    }
    @GetMapping("/goods/1")
    public Optional<Goods> getProduct(RegisterRequestGoods registerRequestGoods) {
        return goodsRepository.findById(registerRequestGoods.getId());
  }



}
