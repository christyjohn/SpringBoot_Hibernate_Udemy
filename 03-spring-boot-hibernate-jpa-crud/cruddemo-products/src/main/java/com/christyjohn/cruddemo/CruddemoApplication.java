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
		};
	}

	private void createProduct(ProductDAO productDAO) {
		// create the product object
		System.out.println("Creating new product object ...");
		Product product = new Product("iPhone 15 Pro Max", "apip01234", 1689.66,
				"Apple iPhone 15 Pro Max (256 GB) - Black Titanium");

		// save the student object
		System.out.println("Saving the product ...");
		productDAO.save(product);

		// display id of the saved product
		System.out.println("Saved Product. Generated id: " + product.getId());
	}
}
