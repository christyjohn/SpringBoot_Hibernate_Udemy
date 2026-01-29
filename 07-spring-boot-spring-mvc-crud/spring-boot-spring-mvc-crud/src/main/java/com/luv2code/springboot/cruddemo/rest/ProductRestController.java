package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Product;
import com.luv2code.springboot.cruddemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    // expose "/products" and return a list of employees
    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    // add mapping for GET /products/{productId}
    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId) {

        Product theProduct = productService.findById(productId);

        if (theProduct == null) {
            throw new RuntimeException("Product id not found - " + productId);
        }

        return theProduct;
    }

    // add mapping for POST /products - add new product
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        product.setId(0);

        Product dbProduct = productService.save(product);

        return dbProduct;
    }

    // add mapping for PUT /products - update existing product
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {

        Product dbProduct = productService.save(product);

        return dbProduct;
    }

    // add mapping for DELETE /products/{productId} - delete employee
    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId) {

        Product tempProduct = productService.findById(productId);

        // throw exception if null
        if (tempProduct == null) {
            throw new RuntimeException("Product id not found - " + productId);
        }

        productService.deleteById(productId);

        return "Deleted product id - " + productId;
    }

}














