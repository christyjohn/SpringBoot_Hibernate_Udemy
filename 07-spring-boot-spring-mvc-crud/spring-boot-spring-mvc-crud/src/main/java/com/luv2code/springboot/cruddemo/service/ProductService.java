package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int theId);

    Product save(Product theProduct);

    void deleteById(int theId);

}
