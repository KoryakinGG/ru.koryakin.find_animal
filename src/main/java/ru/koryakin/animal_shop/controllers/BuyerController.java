package ru.koryakin.animal_shop.controllers;

import org.springframework.stereotype.Controller;
import ru.koryakin.animal_shop.entities.Order;
import ru.koryakin.animal_shop.entities.Product;


public interface BuyerController {

    public Product checkProduct();
    public Product buyProduct();
    public Order checkOrder();
}
