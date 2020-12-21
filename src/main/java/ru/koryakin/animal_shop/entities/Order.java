package ru.koryakin.animal_shop.entities;

import javax.persistence.*;

@Entity
@Table (name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "buyer")
    private String buyer;

    @Column(name = "seller")
    private String seller;

    @Column (name = "product")
    private String product;

    public Order() {}

    public Order(Integer id, String buyer, String seller, String product) {
        this.id = id;
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
    }
}
