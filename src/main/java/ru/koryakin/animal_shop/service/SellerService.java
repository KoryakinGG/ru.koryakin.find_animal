package ru.koryakin.animal_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.koryakin.animal_shop.entities.Seller;
import ru.koryakin.animal_shop.repository.SellersRepository;

import java.util.List;

@Service
public class SellerService {
    private SellersRepository sellersRepository;

    public SellerService() {
    }

    //    @Autowired
    public void setSellersRepository(SellersRepository sellersRepository) {
        this.sellersRepository = sellersRepository;
    }

    public List<Seller> getAllSellers (){
        return sellersRepository.findAll();
    }
}
