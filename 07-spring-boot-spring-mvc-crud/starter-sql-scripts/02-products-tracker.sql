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

--
-- Data for table `products`
--
INSERT INTO `products` (`product_name`, `sku`, `price`, `product_description`) VALUES 
    ("Apple iPhone 17 Pro Max", "B0G4B8J95P", 1199.66, "Apple iPhone 17 Pro Max, 256GB, eSIM, Cosmic Orange- Unlocked"),
    ("Samsung Galaxy S25 FE", "B0FG1THCD7", 681.99, "Samsung Galaxy S25 FE Cell Phone (2025), 256GB"),
    ("Samsung Galaxy Z Fold7", "B0F7K9LFCL", 2119.99, "Samsung Galaxy Z Fold7 SM-F966U 1 TB Flexible Folding Screen"),
    ("Samsung Galaxy Watch Ultra", "B0F7PKN2C8'", 529.99, "Samsung Galaxy Watch Ultra (2025) 47mm LTE Smartwatch"),
    ("Garmin Forerunner 55", "B092RCLKHN", 199.00, "Garmin Forerunner 55, GPS Running Watch with Daily Suggested Workouts");
	
DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` char(68) NOT NULL,
  `enabled` tinyint NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `users`
--
-- NOTE: The passwords are encrypted using BCrypt
--
-- A generation tool is avail at: https://www.luv2code.com/generate-bcrypt-password
--
-- Default passwords here are: fun123
--

INSERT INTO `users` 
VALUES 
('john','{bcrypt}$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q',1),
('mary','{bcrypt}$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q',1),
('susan','{bcrypt}$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q',1);


--
-- Table structure for table `authorities`
--

CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities4_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities4_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `authorities`
--

INSERT INTO `authorities` 
VALUES 
('john','ROLE_EMPLOYEE'),
('mary','ROLE_EMPLOYEE'),
('mary','ROLE_MANAGER'),
('susan','ROLE_EMPLOYEE'),
('susan','ROLE_MANAGER'),
('susan','ROLE_ADMIN');