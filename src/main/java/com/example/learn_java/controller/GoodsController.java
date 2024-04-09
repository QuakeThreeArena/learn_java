package com.example.learn_java.controller;

import com.example.learn_java.controller.dto.GoodsDto;
import com.example.learn_java.service.GoodsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GoodsController {
    private final GoodsService goodsService;

    public GoodsController(GoodsService userService) {
        this.goodsService = userService;
    }

    @GetMapping("/goods/{id}")
    public GoodsDto findById(@PathVariable("id") UUID id) {
        return goodsService.findById(id);
    }

    @PostMapping("/goods")
    public GoodsDto create(@RequestBody GoodsDto goodsDto) {
        return goodsService.create(goodsDto);
    }

    @PutMapping("/goods/{id}")
    public GoodsDto update(@PathVariable("id") UUID id, @RequestBody GoodsDto goodsDto) {
        return goodsService.update(id, goodsDto);
    }

    @DeleteMapping("/goods/{id}")
    public void delete(@PathVariable("id") UUID id) {
        goodsService.delete(id);
    }

    @GetMapping("/goods")
    public List<GoodsDto> getAll() {
        return goodsService.getAll();
    }
}
