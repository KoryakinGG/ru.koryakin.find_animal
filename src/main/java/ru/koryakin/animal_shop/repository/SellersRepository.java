package ru.koryakin.animal_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.koryakin.animal_shop.entities.Seller;

@Repository
public interface SellersRepository extends JpaRepository <Seller, Long>, JpaSpecificationExecutor<Seller> {
}
