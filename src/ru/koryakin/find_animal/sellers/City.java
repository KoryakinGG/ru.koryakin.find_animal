package ru.koryakin.find_animal.sellers;

public abstract class City implements Seller{
    String city;
    public City(String city) {
        this.city=city;
    }
}
