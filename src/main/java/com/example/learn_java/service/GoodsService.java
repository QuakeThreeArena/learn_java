package com.example.learn_java.service;

import com.example.learn_java.controller.dto.GoodsDto;

import java.util.List;
import java.util.UUID;

public interface GoodsService {
    GoodsDto findById(UUID id);

    GoodsDto create(GoodsDto goodsDto);

    GoodsDto update(UUID id, GoodsDto goodsDto);

    void delete(UUID id);

    List<GoodsDto> getAll();
}
