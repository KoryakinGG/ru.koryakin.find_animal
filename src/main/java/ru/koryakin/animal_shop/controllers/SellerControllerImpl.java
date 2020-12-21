package ru.koryakin.animal_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.koryakin.animal_shop.entities.Order;
import ru.koryakin.animal_shop.entities.Product;
import ru.koryakin.animal_shop.entities.Seller;
import ru.koryakin.animal_shop.service.SellerService;

import java.util.List;

@Controller
@RequestMapping("/sellers")
public class SellerControllerImpl implements SellerController {

    private SellerService sellerService;

    @Autowired
    public SellerControllerImpl(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    public String showAllSellers (Model model) {
        List<Seller> sellerList = sellerService.getAllSellers();
        model.addAttribute("sellers", sellerList);
        return "all_sellers";
    }

    @Override
    public Product createProduct() {
        return null;
    }

    @Override
    public Product checkProduct() {
        return null;
    }

    @Override
    public Product sellProduct() {
        return null;
    }

    @Override
    public Order checkOrder() {
        return null;
    }
}
