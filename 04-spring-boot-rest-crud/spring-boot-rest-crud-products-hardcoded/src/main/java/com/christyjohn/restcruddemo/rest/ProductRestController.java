package com.christyjohn.restcruddemo.rest;

import com.christyjohn.restcruddemo.entity.Product;
import com.christyjohn.restcruddemo.exceptions.ProductErrorResponse;
import com.christyjohn.restcruddemo.exceptions.ProductNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void loadData() {
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
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return products;
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId) {
        if(productId >= products.size() || productId < 0) {
            throw new ProductNotFoundException("Product Id not found: " + productId);
        }
        return products.get(productId);
    }
    
    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleException(ProductNotFoundException exc) {
        ProductErrorResponse error = new ProductErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleException(Exception exc) {
        ProductErrorResponse error = new ProductErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
