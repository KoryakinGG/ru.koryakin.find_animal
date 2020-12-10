package ru.koryakin.find_animal.factory;

import ru.koryakin.find_animal.sellers.Seller;
import ru.koryakin.find_animal.sellers.SellerImpl;

public class SellerFactoryImpl implements SellerFactory{
    @Override
    public Seller createSeller(Integer id, String nickName, String name, String lastname, String password, String email, String phoneNumber) {
        return new SellerImpl(id, nickName, name, lastname, password, email, phoneNumber);
    }
}
