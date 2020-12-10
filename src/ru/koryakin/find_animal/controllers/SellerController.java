package ru.koryakin.find_animal.controllers;

import ru.koryakin.find_animal.Order;
import ru.koryakin.find_animal.Product;

public interface SellerController {
    public Product createProduct();
    public Product checkProduct();
    public Product sellProduct();
    public Order checkOrder();
}
