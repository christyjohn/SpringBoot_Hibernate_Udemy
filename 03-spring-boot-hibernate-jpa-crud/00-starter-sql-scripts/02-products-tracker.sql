CREATE DATABASE  IF NOT EXISTS `products_tracker`;
USE `products_tracker`;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_name`varchar(45) DEFAULT NULL,
  `sku` VARCHAR(100) DEFAULT NULL,
  `price` DECIMAL(10, 2) DEFAULT NULL,
  `product_description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

