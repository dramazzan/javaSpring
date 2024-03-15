package org.example.service;

import org.example.model.Basket;
import org.example.model.Car;
import org.example.repository.BasketRepository;

public class BasketService {

    private final BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public String addBasket(Basket basket){

            basketRepository.save(basket);

        return "Added to Basket";
    }


}
