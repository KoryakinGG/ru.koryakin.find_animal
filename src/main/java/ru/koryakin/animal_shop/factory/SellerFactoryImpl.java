package ru.koryakin.animal_shop.factory;

import ru.koryakin.animal_shop.entities.Seller;

public class SellerFactoryImpl implements SellerFactory{
    @Override
    public Seller createSeller(Long id, String nickName, String name, String lastname, String password, String email, String phoneNumber) {
        return new Seller(id, nickName, name, lastname, password, email, phoneNumber);
    }
}
