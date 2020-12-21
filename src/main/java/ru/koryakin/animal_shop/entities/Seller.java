package ru.koryakin.animal_shop.entities;


import ru.koryakin.animal_shop.entities.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sellers")
public class Seller implements  User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "nickName")
    String nickName;
    @Column(name = "name")
    String name;
    @Column(name = "lastname")
    String lastname;
    @Column(name = "password")
    String password;
    @Column(name = "email")
    String email;
    @Column(name = "phoneNumber")
    String phoneNumber;

    @OneToMany (mappedBy = "sellers")
    private List<Product> productList;

    public Seller() {}

    public Seller(Long id, String nickName, String name, String lastname, String password, String email, String phoneNumber) {
        this.id = id;
        this.nickName = nickName;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
    public void getUserInfo() {

    }
}
