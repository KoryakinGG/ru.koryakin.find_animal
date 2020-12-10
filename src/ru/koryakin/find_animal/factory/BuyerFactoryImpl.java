package ru.koryakin.find_animal.factory;

import ru.koryakin.find_animal.buyers.Buyer;
import ru.koryakin.find_animal.buyers.BuyerImpl;
import ru.koryakin.find_animal.sellers.Seller;

public class BuyerFactoryImpl implements BuyerFactory {

    @Override
    public Buyer createBuyer(Integer id, String nickName, String name, String lastname, String password, String email, String phoneNumber) {
        return new BuyerImpl(id, nickName, name, lastname, password, email, phoneNumber);
    }
}
