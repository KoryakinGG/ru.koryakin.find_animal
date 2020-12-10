package ru.koryakin.find_animal;

import org.w3c.dom.ls.LSOutput;

public class Product {
    Integer id;
    String typeOfAnimal;
    String breed;
    String nickname;
    Integer age;
    Double cost;

    public Product(String typeOfAnimal, String breed, String nickname, Integer age, Double cost) {
        this.typeOfAnimal = typeOfAnimal;
        this.breed = breed;
        this.nickname = nickname;
        this.age = age;
        this.cost = cost;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Product getProduct () {
        System.out.println("Это товар");
        return this;
    }
}
