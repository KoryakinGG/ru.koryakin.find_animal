package ru.koryakin.find_animal.factory;

import ru.koryakin.find_animal.sellers.Seller;

public interface SellerFactory {

    Seller createSeller (Integer id, String nickName, String name, String lastname, String password, String email, String phoneNumber);

}
