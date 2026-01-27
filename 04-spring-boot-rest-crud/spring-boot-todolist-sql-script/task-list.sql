CREATE DATABASE  IF NOT EXISTS `task_list_application`;
USE `task_list_application`;

--
-- Table structure for table `task_list_application`
--

DROP TABLE IF EXISTS `task_list`;

CREATE TABLE `task_list` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` TEXT,
  `is_completed` BOOLEAN DEFAULT FALSE,
  `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `task_list`
--

INSERT INTO `task_list` (`title`, `description`, `is_completed`) VALUES 
    ('Do Laundry', 'Do the laundry for last week.', false),
    ('Do Grocery shopping', 'Buy vegetables and grocery for next week', true),
    ('Finish Homework', 'Do the math homework and complete the Physics assignment', false),
    ('Exercise', 'Complete the 45 minutes strength training session', false),
    ('Call Mother', 'Call mother and check on her wellness.', false);

