package com.christyjohn.restcruddemo.rest;

import com.christyjohn.restcruddemo.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        // create multiple products
        Product product1 = new Product("iPhone 15 Pro Max", "apip01234", 1689.66,
                "Apple iPhone 15 Pro Max (256 GB) - Black Titanium");
        Product product2 = new Product("Samsung Galaxy S25 FE", "sfeip03434", 889.00,
                "Samsung Galaxy S25 FE Cell Phone (2025), 256GB");
        Product product3 = new Product("Samsung Galaxy Z Fold7", "sgzip012re", 1189.13,
                "Samsung Galaxy Z Fold7 SM-F966U 1 TB Flexible Folding Screen");
        products.add(product1);
        products.add(product2);
        products.add(product3);

        return products;
    }
}
