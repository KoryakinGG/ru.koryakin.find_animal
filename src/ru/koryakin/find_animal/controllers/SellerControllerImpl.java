package ru.koryakin.find_animal.controllers;

import ru.koryakin.find_animal.Order;
import ru.koryakin.find_animal.Product;

public class SellerControllerImpl extends Product implements SellerController{

    public SellerControllerImpl(String typeOfAnimal, String breed, String nickname, Integer age, Double cost) {
        super(typeOfAnimal, breed, nickname, age, cost);
    }

    @Override
    public Product createProduct() {
        return null;
    }

    @Override
    public Product checkProduct() {
        return null;
    }

    @Override
    public Product sellProduct() {
        return null;
    }

    @Override
    public Order checkOrder() {
        return null;
    }
}
