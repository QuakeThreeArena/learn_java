package com.example.learn_java.service;


import com.example.learn_java.controller.dto.RegisterRequestGoods;
import com.example.learn_java.entity.Goods;
import com.example.learn_java.repository.GoodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GoodsServiceImpl implements GoodsService {
    private final GoodsRepository repository;

    public GoodsServiceImpl(GoodsRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID registration(RegisterRequestGoods registerRequest) {
        Goods goods = new Goods(
                registerRequest.getName(),
                registerRequest.getDescription(),
                registerRequest.getPrice(),
                registerRequest.getLocation(),
                registerRequest.getUserId()

        );
        return repository.save(goods).getId();
    }

    @Override
    public UUID update(RegisterRequestGoods requestGoods) {
        Optional<Goods> goods = repository.findById(requestGoods.getId());

        Goods newGoods = goods.get();
        newGoods.setDescription(requestGoods.getDescription());
        newGoods.setName(requestGoods.getName());
        newGoods.setPrice(requestGoods.getPrice());
        newGoods.setLocation(requestGoods.getLocation());

        return repository.save(newGoods).getId();
    }
    @Override
    public UUID deleted (RegisterRequestGoods requestGoods){
        repository.deleteById(requestGoods.getId());

        return UUID.fromString("Пользователь удален");
    }

    @Override
    public List<Goods> findByAll (){

        return repository.findAll();
    }
}
