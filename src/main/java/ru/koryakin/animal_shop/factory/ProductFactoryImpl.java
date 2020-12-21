package ru.koryakin.animal_shop.factory;

import ru.koryakin.animal_shop.entities.Product;

public class ProductFactoryImpl implements ProductFactory {
    @Override
    public Product createProduct(String typeOfAnimal, String breed, String nickname, Integer age, Integer price) {
        return new Product(typeOfAnimal, breed, nickname, age, price);
    }
}
