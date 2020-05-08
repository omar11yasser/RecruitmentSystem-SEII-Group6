-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 08, 2020 at 02:41 PM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myrecruitmentsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `vacancies`
--

DROP TABLE IF EXISTS `vacancies`;
CREATE TABLE IF NOT EXISTS `vacancies` (
  `vacancy_id` varchar(30) NOT NULL,
  `vacancy_employer_id` varchar(30) NOT NULL,
  `vacancy_title` varchar(50) NOT NULL,
  `vacancy_job_requirements` varchar(500) NOT NULL,
  `vacancy_deadline_timestamp` timestamp NOT NULL,
  `vacancy_creation_timestamp` timestamp NOT NULL,
  `vacancy_state` varchar(15) NOT NULL DEFAULT 'available'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vacancies`
--

INSERT INTO `vacancies` (`vacancy_id`, `vacancy_employer_id`, `vacancy_title`, `vacancy_job_requirements`, `vacancy_deadline_timestamp`, `vacancy_creation_timestamp`, `vacancy_state`) VALUES
('ID', 'EmployerId', 'VacancyTitle', 'Job requirments', '1970-01-19 09:22:23', '1970-01-19 09:22:23', 'available'),
('vacancy1588947610778', 'wejff', 'Android native developer', 'JAVA - Kotlin - flutter.', '2020-05-31 22:00:00', '2020-05-08 14:20:11', 'available');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
