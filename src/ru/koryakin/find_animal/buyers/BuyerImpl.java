package ru.koryakin.find_animal.buyers;

import ru.koryakin.find_animal.entities.User;

public class BuyerImpl implements Buyer, User {

    Integer id;
    String nickName;
    String name;
    String lastname;
    String password;
    String email;
    String phoneNumber;

    public BuyerImpl(Integer id, String nickName, String name, String lastname, String password, String email, String phoneNumber) {
        this.id = id;
        this.nickName = nickName;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void getUserInfo() {

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void getInfo() {
        System.out.println("Buyer{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                '}');
    }
}
