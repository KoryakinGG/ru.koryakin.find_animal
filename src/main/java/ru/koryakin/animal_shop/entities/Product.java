package ru.koryakin.animal_shop.entities;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "typeOfAnimal")
    private String typeOfAnimal;
    @Column(name = "breed")
    private String breed;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "age")
    private Integer age;
    @Column(name = "price")
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "sellers_id")
    private Seller seller;

    public Product() {
    }

    public Product(String typeOfAnimal, String breed, String nickname, Integer age, Integer price) {
        this.typeOfAnimal = typeOfAnimal;
        this.breed = breed;
        this.nickname = nickname;
        this.age = age;
        this.price = price;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Product getProduct () {
        System.out.println("Это товар");
        return this;
    }
}
