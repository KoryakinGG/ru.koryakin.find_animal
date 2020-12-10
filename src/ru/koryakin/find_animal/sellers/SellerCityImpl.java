package ru.koryakin.find_animal.sellers;

public class SellerCityImpl extends SellerCity {
    public SellerCityImpl(String city) {
        super(city);
    }

    @Override
    public void getInfo() {
        System.out.println("Выводим название города: " + city);
    }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
    }
}
