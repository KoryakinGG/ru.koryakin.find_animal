package ru.koryakin.animal_shop.factory;

import ru.koryakin.animal_shop.entities.Buyer;

public interface BuyerFactory {

    Buyer createBuyer (Long id, String nickName, String name, String lastname, String password, String email, String phoneNumber);

}
