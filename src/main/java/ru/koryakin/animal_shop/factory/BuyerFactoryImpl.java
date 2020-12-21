package ru.koryakin.animal_shop.factory;

import ru.koryakin.animal_shop.entities.Buyer;

public class BuyerFactoryImpl implements BuyerFactory {

    @Override
    public Buyer createBuyer(Long id, String nickName, String name, String lastname, String password, String email, String phoneNumber) {
        return new Buyer(id, nickName, name, lastname, password, email, phoneNumber);
    }

}
