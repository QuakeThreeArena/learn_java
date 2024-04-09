package com.example.learn_java.service;

import com.example.learn_java.controller.dto.GoodsDto;
import com.example.learn_java.entity.Goods;
import com.example.learn_java.repository.GoodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class GoodsServiceImpl implements GoodsService {
    private final GoodsRepository repository;

    public GoodsServiceImpl(GoodsRepository repository) {
        this.repository = repository;
    }

    @Override
    public GoodsDto findById(UUID id) {
        var entity = repository.findById(id);
        return entity.stream()
                .map(goods -> new GoodsDto(
                        goods.getId(),
                        goods.getName(),
                        goods.getDescription(),
                        goods.getLocation(),
                        goods.getPrice(),
                        goods.getUserId()
                ))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Goods with id=" + id + " is not found"));
    }

    @Override
    public GoodsDto create(GoodsDto dto) {
        var entity = repository.save(new Goods(
                dto.getName(),
                dto.getDescription(),
                dto.getLocation(),
                dto.getPrice(),
                dto.getUserId()
        ));
        repository.save(entity);
        return dto;
    }

    @Override
    public GoodsDto update(UUID id, GoodsDto goodsDto) {
        var entity = repository.findById(id);
        entity.ifPresent(goods -> {
            if (Objects.nonNull(goodsDto.getName()))
                goods.setName(goodsDto.getName());
            if (Objects.nonNull(goodsDto.getDescription()))
                goods.setDescription(goodsDto.getDescription());
            if (Objects.nonNull(goodsDto.getLocation()))
                goods.setLocation(goodsDto.getLocation());
            if (Objects.nonNull(goodsDto.getPrice()))
                goods.setPrice(goodsDto.getPrice());
            repository.save(goods);
        });
        return entity.stream()
                .map(goods -> new GoodsDto(
                        goods.getId(),
                        goods.getName(),
                        goods.getDescription(),
                        goods.getLocation(),
                        goods.getPrice(),
                        goods.getUserId()
                ))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Goods with id=" + id + " is not found"));
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public List<GoodsDto> getAll() {
        return repository.findAll().stream()
                .map(goods -> new GoodsDto(
                        goods.getId(),
                        goods.getName(),
                        goods.getDescription(),
                        goods.getLocation(),
                        goods.getPrice(),
                        goods.getUserId()
                ))
                .collect(Collectors.toList());
    }
}
