package com.christyjohn.cruddemo;

import com.christyjohn.cruddemo.dao.ProductDAO;
import com.christyjohn.cruddemo.entity.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProductDAO productDAO) {
		return runner -> {
			createProduct(productDAO);
			createMultipleProducts(productDAO);
		};
	}

	private void createProduct(ProductDAO productDAO) {
		// create the product object
		System.out.println("Creating new product object ...");
		Product product = new Product("Samsung Galaxy S23", "sg217654", 949.03,
				"Samsung Galaxy S23 Ultra 5G, US Version, 256GB, Phantom Black");

		// save the student object
		System.out.println("Saving the product ...");
		productDAO.save(product);

		// display id of the saved product
		System.out.println("Saved Product. Generated id: " + product.getId());
	}

	private void createMultipleProducts(ProductDAO productDAO) {
		// create multiple products
		Product product1 = new Product("iPhone 15 Pro Max", "apip01234", 1689.66,
				"Apple iPhone 15 Pro Max (256 GB) - Black Titanium");
		Product product2 = new Product("Samsung Galaxy S25 FE", "sfeip03434", 1689.66,
				"Samsung Galaxy S25 FE Cell Phone (2025), 256GB");
		Product product3 = new Product("Samsung Galaxy Z Fold7", "sgzip012re", 1689.66,
				"Samsung Galaxy Z Fold7 SM-F966U 1 TB Flexible Folding Screen");

		// save the product objects
		System.out.println("Saving the products ...");
		productDAO.save(product1);
		productDAO.save(product2);
		productDAO.save(product3);
	}
}
