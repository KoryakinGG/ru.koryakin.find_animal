package ru.koryakin.animal_shop.repository.specification;

import org.springframework.data.jpa.domain.Specification;
import ru.koryakin.animal_shop.entities.Product;

public class ProductSpecifications {
    public static Specification <Product> priceGreaterOrEqualsThan(int minPrice){
        return (Specification<Product>) (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("price"), minPrice);
    }

    public static Specification <Product> priceLesserOrEqualsThan(int maxPrice){
        return (Specification<Product>) (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("price"), maxPrice);
    }

}
