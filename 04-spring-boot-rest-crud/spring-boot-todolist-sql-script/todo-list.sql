CREATE DATABASE  IF NOT EXISTS `todo_list_application`;
USE `todo_list_application`;

--
-- Table structure for table `todo_list_application`
--

DROP TABLE IF EXISTS `todo_list`;

CREATE TABLE `todo_list` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` TEXT,
  `is_completed` BOOLEAN DEFAULT FALSE,
  `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `todo_list`
--

INSERT INTO `todo_list` (`title`, `description`, `is_completed`) VALUES 
    ('Do Laundry', 'Do the laundry for last week.', false),
    ('Do Grocery shopping', 'Buy vegetables and grocery for next week', true),
    ('Finish Homework', 'Do the math homework and complete the Physics assignment', false),
    ('Exercise', 'Complete the 45 minutes strength training session', false),
    ('Call Mother', 'Call mother and check on her wellness.', false);

