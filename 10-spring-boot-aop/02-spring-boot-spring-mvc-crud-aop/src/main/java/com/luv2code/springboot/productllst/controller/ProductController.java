package com.luv2code.springboot.productllst.controller;

import com.luv2code.springboot.productllst.entity.Product;
import com.luv2code.springboot.productllst.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("id") int id,
                                   Model model) {
        // get the product from the service
        Product product = productService.findById(id);

        // set product as a model attribute to pre-populate the form
        model.addAttribute("product", product);

        // send over to our form
        return "products/product-form";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        // save the product
        productService.save(product);

        // use a redirect to prevent duplicate submissions
        return "redirect:/products/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {

        // delete the product
        productService.deleteById(id);

        // redirect to /products/list
        return "redirect:/products/list";
        }
}
