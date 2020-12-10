package ru.koryakin.find_animal.factory;

import ru.koryakin.find_animal.buyers.Buyer;
import ru.koryakin.find_animal.entities.User;
import ru.koryakin.find_animal.sellers.Seller;

public interface BuyerFactory {

    Buyer createBuyer (Integer id, String nickName, String name, String lastname, String password, String email, String phoneNumber);

}
