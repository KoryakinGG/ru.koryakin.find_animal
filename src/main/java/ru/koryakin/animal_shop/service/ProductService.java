package ru.koryakin.animal_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.koryakin.animal_shop.entities.Product;
import ru.koryakin.animal_shop.exeptions.ProductNotFoundException;
import ru.koryakin.animal_shop.repository.ProductRepository;


import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveOrUpdate (Product product) {return productRepository.save(product);}

    public Product findById (Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Can't found product with id"));
    }

    public List <Product> findAll () {return productRepository.findAll();}

    public Page <Product> findAll (Specification<Product> spec, Integer page) {
        if (page < 1L) {
            page = 1;
        }
        return productRepository.findAll (spec, PageRequest.of(page-1, 10));
    }
}
