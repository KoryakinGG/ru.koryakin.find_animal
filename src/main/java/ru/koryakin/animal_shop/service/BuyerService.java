package ru.koryakin.animal_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.koryakin.animal_shop.entities.Buyer;
import ru.koryakin.animal_shop.repository.BuyersRepository;

import java.util.List;

@Service
public class BuyerService {
    private BuyersRepository buyersRepository;

//    @Autowired
    public void setBuyersRepository(BuyersRepository buyersRepository) {
        this.buyersRepository = buyersRepository;
    }

    public List<Buyer> getAll () {
        return buyersRepository.findAll();
    }
}
