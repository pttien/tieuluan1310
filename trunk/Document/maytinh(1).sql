-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 13, 2013 at 04:48 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `maytinh`
--
CREATE DATABASE IF NOT EXISTS `maytinh` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `maytinh`;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_member` bigint(20) NOT NULL,
  `info` text,
  `date` datetime NOT NULL,
  `id_product` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_member_idx` (`id_member`),
  KEY `id_product_idx` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `detail_oder`
--

CREATE TABLE IF NOT EXISTS `detail_oder` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_oder` bigint(20) NOT NULL,
  `id_product` bigint(20) NOT NULL,
  `quantum` bigint(20) NOT NULL,
  `total_money` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_oder_idx` (`id_oder`),
  KEY `id_product_idx` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `factory`
--

CREATE TABLE IF NOT EXISTS `factory` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `favorite_product`
--

CREATE TABLE IF NOT EXISTS `favorite_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_product` bigint(20) NOT NULL,
  `id_member` bigint(20) NOT NULL,
  `is_activated` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_member_idx` (`id_member`),
  KEY `id_product_idx` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE IF NOT EXISTS `member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(255) NOT NULL,
  `user` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `id_card` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `mail` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `oder`
--

CREATE TABLE IF NOT EXISTS `oder` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_member` bigint(20) NOT NULL,
  `date_oder` datetime NOT NULL,
  `date_delivery` datetime NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_member_idx` (`id_member`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `pice` bigint(20) NOT NULL,
  `factory_id` bigint(20) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `info` text,
  `warranty` bigint(20) DEFAULT NULL,
  `category_id` bigint(20) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `category_id_idx` (`category_id`),
  KEY `factory_id_idx` (`factory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_forgot_password`
--

CREATE TABLE IF NOT EXISTS `sf_guard_forgot_password` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `unique_key` varchar(255) DEFAULT NULL,
  `expires_at` datetime NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id_idx` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_group`
--

CREATE TABLE IF NOT EXISTS `sf_guard_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sf_guard_group`
--

INSERT INTO `sf_guard_group` (`id`, `name`, `description`, `created_at`, `updated_at`) VALUES
(1, 'admin', 'Administrator group', '2013-10-07 20:34:46', '2013-10-07 20:34:46');

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_group_permission`
--

CREATE TABLE IF NOT EXISTS `sf_guard_group_permission` (
  `group_id` bigint(20) NOT NULL DEFAULT '0',
  `permission_id` bigint(20) NOT NULL DEFAULT '0',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`group_id`,`permission_id`),
  KEY `sf_guard_group_permission_permission_id_sf_guard_permission_id` (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sf_guard_group_permission`
--

INSERT INTO `sf_guard_group_permission` (`group_id`, `permission_id`, `created_at`, `updated_at`) VALUES
(1, 1, '2013-10-07 20:34:46', '2013-10-07 20:34:46');

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_permission`
--

CREATE TABLE IF NOT EXISTS `sf_guard_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sf_guard_permission`
--

INSERT INTO `sf_guard_permission` (`id`, `name`, `description`, `created_at`, `updated_at`) VALUES
(1, 'admin', 'Administrator permission', '2013-10-07 20:34:46', '2013-10-07 20:34:46');

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_remember_key`
--

CREATE TABLE IF NOT EXISTS `sf_guard_remember_key` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `remember_key` varchar(32) DEFAULT NULL,
  `ip_address` varchar(50) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id_idx` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_user`
--

CREATE TABLE IF NOT EXISTS `sf_guard_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) NOT NULL,
  `username` varchar(128) NOT NULL,
  `algorithm` varchar(128) NOT NULL DEFAULT 'sha1',
  `salt` varchar(128) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  `is_super_admin` tinyint(1) DEFAULT '0',
  `last_login` datetime DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_address` (`email_address`),
  UNIQUE KEY `username` (`username`),
  KEY `is_active_idx_idx` (`is_active`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sf_guard_user`
--

INSERT INTO `sf_guard_user` (`id`, `first_name`, `last_name`, `email_address`, `username`, `algorithm`, `salt`, `password`, `is_active`, `is_super_admin`, `last_login`, `created_at`, `updated_at`) VALUES
(1, 'John', 'Doe', 'john.doe@gmail.com', 'admin', 'sha1', '27084312fdac25b61f94a2933a7e8e23', '5aeff25700ba9177557783f08476856a69371a60', 1, 1, NULL, '2013-10-07 20:34:46', '2013-10-07 20:34:46');

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_user_group`
--

CREATE TABLE IF NOT EXISTS `sf_guard_user_group` (
  `user_id` bigint(20) NOT NULL DEFAULT '0',
  `group_id` bigint(20) NOT NULL DEFAULT '0',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`user_id`,`group_id`),
  KEY `sf_guard_user_group_group_id_sf_guard_group_id` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sf_guard_user_group`
--

INSERT INTO `sf_guard_user_group` (`user_id`, `group_id`, `created_at`, `updated_at`) VALUES
(1, 1, '2013-10-07 20:34:46', '2013-10-07 20:34:46');

-- --------------------------------------------------------

--
-- Table structure for table `sf_guard_user_permission`
--

CREATE TABLE IF NOT EXISTS `sf_guard_user_permission` (
  `user_id` bigint(20) NOT NULL DEFAULT '0',
  `permission_id` bigint(20) NOT NULL DEFAULT '0',
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`user_id`,`permission_id`),
  KEY `sf_guard_user_permission_permission_id_sf_guard_permission_id` (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comment`
--
ALTER TABLE `comment`
  ADD CONSTRAINT `comment_id_member_member_id` FOREIGN KEY (`id_member`) REFERENCES `member` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `comment_id_product_product_id` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `detail_oder`
--
ALTER TABLE `detail_oder`
  ADD CONSTRAINT `detail_oder_id_oder_oder_id` FOREIGN KEY (`id_oder`) REFERENCES `oder` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `detail_oder_id_product_product_id` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `favorite_product`
--
ALTER TABLE `favorite_product`
  ADD CONSTRAINT `favorite_product_id_member_member_id` FOREIGN KEY (`id_member`) REFERENCES `member` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `favorite_product_id_product_product_id` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `oder`
--
ALTER TABLE `oder`
  ADD CONSTRAINT `oder_id_member_member_id` FOREIGN KEY (`id_member`) REFERENCES `member` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_category_id_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `product_factory_id_factory_id` FOREIGN KEY (`factory_id`) REFERENCES `factory` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `sf_guard_forgot_password`
--
ALTER TABLE `sf_guard_forgot_password`
  ADD CONSTRAINT `sf_guard_forgot_password_user_id_sf_guard_user_id` FOREIGN KEY (`user_id`) REFERENCES `sf_guard_user` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `sf_guard_group_permission`
--
ALTER TABLE `sf_guard_group_permission`
  ADD CONSTRAINT `sf_guard_group_permission_group_id_sf_guard_group_id` FOREIGN KEY (`group_id`) REFERENCES `sf_guard_group` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `sf_guard_group_permission_permission_id_sf_guard_permission_id` FOREIGN KEY (`permission_id`) REFERENCES `sf_guard_permission` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `sf_guard_remember_key`
--
ALTER TABLE `sf_guard_remember_key`
  ADD CONSTRAINT `sf_guard_remember_key_user_id_sf_guard_user_id` FOREIGN KEY (`user_id`) REFERENCES `sf_guard_user` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `sf_guard_user_group`
--
ALTER TABLE `sf_guard_user_group`
  ADD CONSTRAINT `sf_guard_user_group_group_id_sf_guard_group_id` FOREIGN KEY (`group_id`) REFERENCES `sf_guard_group` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `sf_guard_user_group_user_id_sf_guard_user_id` FOREIGN KEY (`user_id`) REFERENCES `sf_guard_user` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `sf_guard_user_permission`
--
ALTER TABLE `sf_guard_user_permission`
  ADD CONSTRAINT `sf_guard_user_permission_permission_id_sf_guard_permission_id` FOREIGN KEY (`permission_id`) REFERENCES `sf_guard_permission` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `sf_guard_user_permission_user_id_sf_guard_user_id` FOREIGN KEY (`user_id`) REFERENCES `sf_guard_user` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
