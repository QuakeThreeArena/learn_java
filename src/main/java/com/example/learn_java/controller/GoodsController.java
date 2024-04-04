package com.example.learn_java.controller;

import com.example.learn_java.controller.dto.RegisterRequestGoods;
import com.example.learn_java.entity.Goods;
import com.example.learn_java.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
public class GoodsController {
    public final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @PostMapping("/goods/registration")
    public UUID create(@RequestBody RegisterRequestGoods request) {
        return goodsService.registration(request);
    }

    @PutMapping("/goods/update")
    public UUID update (@RequestParam RegisterRequestGoods requestGoods){
        return  goodsService.update(requestGoods);
    }
    @DeleteMapping("goods/deleted")
    public UUID deleted (@RequestParam RegisterRequestGoods requestGoods){
        return goodsService.deleted(requestGoods);
    }
    @GetMapping("goods/getAll")
    public List<Goods> findByAll(){
        return  goodsService.findByAll();
    }






}
