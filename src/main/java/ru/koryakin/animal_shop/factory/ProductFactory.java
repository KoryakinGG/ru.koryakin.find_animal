package ru.koryakin.animal_shop.factory;

import ru.koryakin.animal_shop.entities.Product;

public interface ProductFactory {
    Product createProduct (String typeOfAnimal, String breed, String nickname, Integer age, Integer price);
}
