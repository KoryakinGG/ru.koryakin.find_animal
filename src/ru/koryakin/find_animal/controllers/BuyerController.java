package ru.koryakin.find_animal.controllers;

import ru.koryakin.find_animal.Order;
import ru.koryakin.find_animal.Product;

public interface BuyerController {

    public Product checkProduct();
    public Product buyProduct();
    public Order checkOrder();
}
