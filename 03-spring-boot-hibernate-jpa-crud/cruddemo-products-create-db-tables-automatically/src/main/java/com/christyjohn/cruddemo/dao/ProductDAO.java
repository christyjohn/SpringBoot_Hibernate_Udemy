package com.christyjohn.cruddemo.dao;

import com.christyjohn.cruddemo.entity.Product;

import java.util.List;

public interface ProductDAO {
    void save(Product product);

    Product findById(Integer id);

    List<Product> findAll();

    Product findBySKU(String sku);

    List<Product> findByProductName(String productName);

    void update(Product product);

    void delete(Integer id);

    int deleteAll();
}
