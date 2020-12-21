package ru.koryakin.animal_shop.factory;

import ru.koryakin.animal_shop.entities.Seller;

public interface SellerFactory {

    Seller createSeller (Long id, String nickName, String name, String lastname, String password, String email, String phoneNumber);

}
