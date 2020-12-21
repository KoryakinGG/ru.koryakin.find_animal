package ru.koryakin.animal_shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.koryakin.animal_shop.entities.Order;
import ru.koryakin.animal_shop.entities.Product;
@Controller
public class BuyerControllerImpl implements BuyerController {

   @Override
    public Product checkProduct() {
        return null;
    }

    @Override
    public Product buyProduct() {
        return null;
    }

    @Override
    public Order checkOrder() {
        return null;
    }
}
