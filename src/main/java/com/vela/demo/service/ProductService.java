package com.vela.demo.service;

import com.vela.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Integer id);

    void save(Product product);

    void remove(Product product);

}
