package com.christyjohn.cruddemo;

import com.christyjohn.cruddemo.dao.ProductDAO;
import com.christyjohn.cruddemo.entity.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProductDAO productDAO) {
		return runner -> {
			//createProduct(productDAO);
			//createMultipleProducts(productDAO);
			//readProduct(productDAO);
			//queryForProducts(productDAO);
			//queryForProductBySKU(productDAO, "sfeip03434");
			//queryForStudentsByProductName(productDAO, "iPhone 15 Pro Max");
			updateProduct(productDAO, 5);
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

	private void readProduct(ProductDAO productDAO) {
		// create  a product object
		System.out.println("Creating new Product object ...");
		Product product = new Product("Samsung Galaxy Z Fold7", "sgzip012re", 1689.66,
				"Samsung Galaxy Z Fold7 SM-F966U 1 TB Flexible Folding Screen");

		// save the product
		System.out.println("Saving the product ...");
		productDAO.save(product);

		// display id of the saved product
		int theId = product.getId();
		System.out.println("Saved product. Generated id: " + theId);

		// retrieve product based on the id: primary key
		System.out.println("Retrieving product with id: " + theId);
		Product myProduct = productDAO.findById(theId);

		// display student
		System.out.println("Found the product: " + myProduct);
	}

	private void queryForProducts(ProductDAO productDAO) {
		// get a list of products
		List<Product> products = productDAO.findAll();

		// display the list of products
		for(Product product : products)
			System.out.println(product);
	}

	private void queryForProductBySKU(ProductDAO productDAO, String sku) {
		Product product = productDAO.findBySKU(sku);

		System.out.println(product);
	}

	private void queryForStudentsByProductName(ProductDAO productDAO, String prodName) {
		// get a list of products
		List<Product> products = productDAO.findByProductName(prodName);

		// display the list of products
		for(Product product : products)
			System.out.println(product);
	}

	private void updateProduct(ProductDAO productDAO, int id) {
		System.out.println("Getting product with id: " + id);
		Product product = productDAO.findById(id);

		System.out.println("Updating product...");
		product.setProductName("A new Stylish Nothing Phone");
		product.setProductDescription("Nothing Phone (3), White (12GB, 256GB)");

		// update the product
		productDAO.update(product);

		// display the updated product
		System.out.println("Updated product: " + product);
	}
}
