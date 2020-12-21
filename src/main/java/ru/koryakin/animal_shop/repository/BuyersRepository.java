package ru.koryakin.animal_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.koryakin.animal_shop.entities.Buyer;

@Repository
public interface BuyersRepository extends JpaRepository<Buyer, Long> {
}
