package ru.koryakin.animal_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.koryakin.animal_shop.entities.Product;
import ru.koryakin.animal_shop.exeptions.ProductNotFoundException;
import ru.koryakin.animal_shop.repository.ProductsRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductsRepository productsRepository;

    public ProductService() {
    }

    @Autowired
    public ProductService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product saveOrUpdate (Product product) {return productsRepository.save(product);}

    public Product findById (Long id) {
        return productsRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Can't found product with id"));
    }

    public List <Product> findAll () {return productsRepository.findAll();}

    public Page <Product> findAll (Specification<Product> spec, Integer page) {
        if (page < 1L) {
            page = 1;
        }
        return productsRepository.findAll (spec, PageRequest.of(page-1, 10));
    }
}
