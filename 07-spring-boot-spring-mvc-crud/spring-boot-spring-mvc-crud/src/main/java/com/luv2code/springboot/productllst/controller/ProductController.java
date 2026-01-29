package com.luv2code.springboot.productllst.controller;

import com.luv2code.springboot.productllst.entity.Product;
import com.luv2code.springboot.productllst.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // add  mapping for "/list"
    @GetMapping("/list")
    public String listProducts(Model model) {
        // get the products from db
        List<Product> products = productService.findAll();

        // add that to the spring model
        model.addAttribute("products", products);

        return "products/list-products";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        // create model attribute to bind form data
        Product product = new Product();

        model.addAttribute("product", product);

        return "products/product-form";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        // save the product
        productService.save(product);

        // use a redirect to prevent duplicate submissions
        return "redirect:/products/list";
    }
}
