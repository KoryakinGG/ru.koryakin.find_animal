package ru.koryakin.animal_shop.controllers;

import org.springframework.stereotype.Controller;
import ru.koryakin.animal_shop.entities.Order;
import ru.koryakin.animal_shop.entities.Product;

public interface SellerController {

    public Product createProduct();
    public Product checkProduct();
    public Product sellProduct();
    public Order checkOrder();
}
