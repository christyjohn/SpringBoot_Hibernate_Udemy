package com.luv2code.springboot.productllst.dao;

import com.luv2code.springboot.productllst.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    // that's it ... no need to write any code LOL!

}
