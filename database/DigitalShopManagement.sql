-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 17, 2022 at 04:53 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanliProduct`
--

-- --------------------------------------------------------

--
-- Table structure for table `Account`
--

CREATE TABLE `Account` (
  `fullName` varchar(50) DEFAULT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(60) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Account`
--

INSERT INTO `Account` (`fullName`, `userName`, `password`, `role`, `status`, `email`) VALUES
('Admin', 'admin', '$2a$12$Y87zSnx.tpFvieylSeXuo.agjb7swi3UVnoo6KVMY9xP5STj4zJhm', 'Admin', 1, 'dat3002999@gmail.com'),
('Adam Cu', 'adamita', '$2a$12$PhiTGBbHjHoB3dbS6BmCC.rzdMCBqDrdK9Y8Ae8GPcKe1RpHiWARO', 'Exported officer', 1, '22540006@gm.uit.edu.vn'),
('Peter Ty', 'petero', '$2a$12$89As1J0AB0yrqGjnQUHtpevc6voGyvzAd8OvzkS1vGDo3YPO2P.Ia', 'Imported officer', 1, '22540002@gm.uit.edu.vn'),
('Johny Teo', 'Johnian', '$2a$12$myOaq0kATMzNkbxgzQEkPu8ht2K0pXOGzZMZo6nSBowq6EyoLo7tS', 'Stock manager', 1, '22540003@gm.uit.edu.vn');

-- --------------------------------------------------------

--
-- Table structure for table `ImportedDetailedInvoice`
--

CREATE TABLE `ImportedDetailedInvoice` (
  `invoiceId` varchar(50) NOT NULL,
  `productId` varchar(50) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ImportedDetailedInvoice`
--

INSERT INTO `ImportedDetailedInvoice` (`invoiceId`, `productId`, `quantity`, `price`) VALUES
('PN1', 'LP10', 1, 23490000),
('PN1', 'LP19', 1, 19490000),
('PN10', 'LP16', 1, 22990000),
('PN10', 'LP22', 1, 23490000),
('PN10', 'LP9', 4, 16490000),
('PN11', 'LP17', 1, 23190000),
('PN11', 'LP25', 1, 18390000),
('PN11', 'PC1', 8, 7090000),
('PN12', 'LP24', 1, 21490000),
('PN12', 'LP8', 1, 18390000),
('PN13', 'LP24', 1, 21490000),
('PN13', 'LP6', 1, 17490000),
('PN14', 'LP19', 1, 19490000),
('PN14', 'LP20', 1, 20790000),
('PN14', 'LP4', 1, 10690000),
('PN15', 'LP14', 1, 22490000),
('PN15', 'LP6', 1, 17490000),
('PN16', 'LP17', 1, 23190000),
('PN16', 'LP5', 1, 19290000),
('PN16', 'PC06', 1, 9690000),
('PN17', 'LP19', 1, 19490000),
('PN17', 'LP4', 1, 10690000),
('PN18', 'LP15', 1, 25190000),
('PN18', 'LP5', 1, 19290000),
('PN18', 'LP6', 1, 17490000),
('PN18', 'PC06', 1, 9690000),
('PN18', 'PC1', 1, 7090000),
('PN19', 'LP18', 1, 24990000),
('PN19', 'LP24', 1, 21490000),
('PN19', 'LP4', 1, 10690000),
('PN19', 'PC06', 1, 9690000),
('PN2', 'LP20', 1, 20790000),
('PN2', 'LP21', 1, 25990000),
('PN20', 'LP16', 1, 22990000),
('PN20', 'LP25', 10, 18390000),
('PN20', 'LP5', 1, 19290000),
('PN20', 'PC1', 1, 7090000),
('PN21', 'LP16', 45, 22990000),
('PN21', 'LP8', 25, 18390000),
('PN22', 'LP10', 1, 23490000),
('PN22', 'LP15', 1, 25190000),
('PN22', 'LP22', 1, 23490000),
('PN22', 'LP6', 1, 17490000),
('PN23', 'LP19', 2, 19490000),
('PN23', 'LP5', 2, 19290000),
('PN23', 'LP7', 2, 17490000),
('PN24', 'PC7', 20, 116990000),
('PN25', 'LP14', 1, 22490000),
('PN26', 'LP15', 2, 25190000),
('PN27', 'LP5', 10, 19290000),
('PN28', 'LP15', 2, 25190000),
('PN28', 'LP24', 1, 21490000),
('PN29', 'LP4', 1, 10690000),
('PN3', 'LP15', 1, 25190000),
('PN3', 'LP22', 1, 23490000),
('PN3', 'LP25', 1, 18390000),
('PN3', 'LP4', 2, 10690000),
('PN30', 'LP16', 1, 22990000),
('PN30', 'LP24', 1, 21490000),
('PN30', 'LP3', 1, 15000000),
('PN31', 'LP14', 1, 22490000),
('PN31', 'LP25', 1, 18390000),
('PN31', 'LP7', 1, 17490000),
('PN32', 'LP18', 1, 24990000),
('PN32', 'LP5', 1, 19290000),
('PN32', 'LP9', 1, 16490000),
('PN32', 'PC2', 1, 8290000),
('PN32', 'PC7', 1, 11200000),
('PN33', 'LP14', 1, 22490000),
('PN33', 'LP22', 1, 23490000),
('PN33', 'LP3', 1, 15000000),
('PN33', 'PC1', 1, 7090000),
('PN34', 'LP25', 7, 18390000),
('PN34', 'LP6', 20, 17490000),
('PN34', 'LP8', 1, 18390000),
('PN34', 'PC2', 2, 8290000),
('PN35', 'LP24', 1, 21490000),
('PN35', 'LP4', 1, 10690000),
('PN35', 'LP8', 1, 18390000),
('PN35', 'PC5', 1, 9190000),
('PN36', 'LP19', 20, 19490000),
('PN37', 'LP19', 1, 19490000),
('PN37', 'LP4', 1, 10690000),
('PN37', 'LP8', 3, 18390000),
('PN38', 'LP23', 20, 15690000),
('PN38', 'LP6', 30, 17490000),
('PN4', 'LP5', 1, 19290000),
('PN4', 'LP7', 1, 17490000),
('PN4', 'LP9', 1, 16490000),
('PN5', 'LP4', 3, 10690000),
('PN6', 'LP17', 1, 23190000),
('PN6', 'LP3', 1, 15000000),
('PN7', 'LP15', 1, 25190000),
('PN7', 'LP25', 1, 18390000),
('PN7', 'LP8', 5, 18390000),
('PN8', 'LP19', 1, 19490000),
('PN8', 'LP4', 1, 10690000),
('PN8', 'LP9', 1, 16490000),
('PN9', 'LP21', 1, 25990000),
('PN9', 'LP6', 1, 17490000);

-- --------------------------------------------------------

--
-- Table structure for table `ExportedDetailedInvoice`
--

CREATE TABLE `ExportedDetailedInvoice` (
  `invoiceId` varchar(50) NOT NULL,
  `productId` varchar(50) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ExportedDetailedInvoice`
--

INSERT INTO `ExportedDetailedInvoice` (`invoiceId`, `productId`, `quantity`, `price`) VALUES
('PX1', 'LP10', 1, 23490000),
('PX1', 'LP19', 13, 19490000),
('PX1', 'LP3', 1, 15000000),
('PX10', 'LP20', 1, 20790000),
('PX10', 'LP4', 1, 10690000),
('PX10', 'LP8', 1, 18390000),
('PX10', 'PC06', 1, 9690000),
('PX10', 'PC2', 1, 8290000),
('PX12', 'LP20', 1, 20790000),
('PX12', 'LP6', 1, 17490000),
('PX12', 'PC1', 1, 7090000),
('PX13', 'LP18', 1, 24990000),
('PX13', 'LP5', 2, 19290000),
('PX13', 'LP6', 1, 17490000),
('PX13', 'PC1', 4, 7090000),
('PX14', 'LP20', 1, 20790000),
('PX14', 'LP24', 1, 21490000),
('PX14', 'LP8', 1, 18390000),
('PX14', 'PC06', 1, 9690000),
('PX14', 'PC2', 1, 8290000),
('PX15', 'LP17', 1, 23190000),
('PX15', 'LP20', 1, 20790000),
('PX15', 'LP5', 1, 19290000),
('PX15', 'LP9', 1, 16490000),
('PX15', 'PC1', 1, 7090000),
('PX16', 'LP14', 4, 22490000),
('PX16', 'LP20', 1, 20790000),
('PX16', 'LP21', 1, 25990000),
('PX17', 'LP21', 2, 25990000),
('PX18', 'LP16', 5, 22990000),
('PX18', 'LP8', 2, 18390000),
('PX19', 'LP18', 1, 24990000),
('PX19', 'LP23', 1, 15690000),
('PX19', 'PC06', 1, 9690000),
('PX19', 'PC3', 1, 8990000),
('PX2', 'LP21', 1, 25990000),
('PX2', 'LP6', 2, 17490000),
('PX2', 'PC06', 1, 9690000),
('PX20', 'LP6', 2, 17490000),
('PX20', 'LP9', 1, 16490000),
('PX20', 'PC06', 1, 9690000),
('PX20', 'PC3', 2, 8990000),
('PX21', 'LP23', 1, 15690000),
('PX21', 'LP7', 1, 17490000),
('PX21', 'PC06', 2, 9690000),
('PX21', 'PC2', 1, 8290000),
('PX22', 'LP5', 1, 19290000),
('PX22', 'LP9', 1, 16490000),
('PX23', 'LP23', 1, 15690000),
('PX23', 'PC06', 1, 9690000),
('PX23', 'PC1', 1, 7090000),
('PX23', 'PC3', 1, 8990000),
('PX24', 'LP19', 1, 19490000),
('PX24', 'LP8', 1, 18390000),
('PX24', 'LP9', 1, 16490000),
('PX24', 'PC3', 1, 8990000),
('PX25', 'LP19', 1, 19490000),
('PX25', 'LP7', 2, 17490000),
('PX25', 'PC1', 1, 7090000),
('PX26', 'LP19', 1, 19490000),
('PX26', 'LP22', 1, 23490000),
('PX26', 'LP3', 1, 15000000),
('PX26', 'LP5', 1, 19290000),
('PX26', 'LP6', 1, 17490000),
('PX3', 'LP22', 1, 23490000),
('PX3', 'LP4', 1, 10690000),
('PX3', 'LP8', 1, 18390000),
('PX4', 'LP17', 1, 23190000),
('PX4', 'LP6', 1, 17490000),
('PX4', 'LP7', 1, 17490000),
('PX5', 'LP16', 1, 22990000),
('PX5', 'LP5', 1, 19290000),
('PX5', 'LP7', 1, 17490000),
('PX5', 'LP9', 1, 16490000),
('PX5', 'PC3', 1, 8990000),
('PX6', 'LP12', 1, 13090000),
('PX6', 'LP13', 1, 9990000),
('PX6', 'LP15', 1, 25190000),
('PX6', 'LP17', 1, 23190000),
('PX7', 'LP21', 1, 25990000),
('PX7', 'LP5', 1, 19290000),
('PX7', 'PC1', 1, 7090000),
('PX8', 'LP24', 1, 21490000),
('PX8', 'LP3', 1, 15000000),
('PX8', 'LP5', 1, 19290000),
('PX8', 'LP8', 1, 18390000),
('PX8', 'PC1', 1, 7090000),
('PX9', 'LP21', 1, 25990000),
('PX9', 'LP22', 1, 23490000),
('PX9', 'LP4', 1, 10690000);

-- --------------------------------------------------------

--
-- Table structure for table `Product`
--

CREATE TABLE `Product` (
  `id` varchar(50) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `quantity` int(11) NOT NULL DEFAULT 0,
  `CPU` varchar(50) NOT NULL DEFAULT '0',
  `RAM` varchar(50) NOT NULL DEFAULT '0',
  `graphics` varchar(50) DEFAULT NULL,
  `price` double NOT NULL DEFAULT 0,
  `mainBoard` varchar(50) DEFAULT NULL,
  `PSU` int(11) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `ROM` varchar(50) DEFAULT NULL,
  `screenSize` double DEFAULT NULL,
  `PIN` varchar(50) DEFAULT NULL,
  `origin` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Product`
--

INSERT INTO `Product` (`id`, `name`, `quantity`, `CPU`, `RAM`, `graphics`, `price`, `mainBoard`, `PSU`, `type`, `ROM`, `screenSize`, `PIN`, `origin`, `status`) VALUES
('LP10', 'Laptop Lenovo IdeaPad Gaming 3', 36, 'Intel Core i5 12500H', '16 GB', 'NVIDIA GeForce RTX 3050', 23490000, NULL, NULL, 'Laptop', '512 GB', 15.6, '4 Cell', 'China', 0),
('LP12', 'Laptop MSI Modern 14 B11MOU-1028VN', 23, 'Intel Core i3 115G4', '8 GB', 'Intel UHD Graphics', 13090000, NULL, NULL, 'Laptop', '256 GB', 14, '3 Cell', 'China', 0),
('LP13', 'Laptop HP 15s-fq2663TU', 19, 'Intel Core i3 1115G4', '4 GB', 'Intel UHD Graphics', 9990000, NULL, NULL, 'Laptop', '256 GB', 15.6, '3 Cell', 'China', 1),
('LP14', 'Laptop Lenovo IdeaPad 5 Pro 16IAH7', 3, 'Intel Core i5 12500H', '16 GB', 'Intel Iris Xe Graphics', 22490000, NULL, NULL, 'Laptop', '512 GB', 16, '4 Cell', 'China', 1),
('LP15', 'Laptop Lenovo IdeaPad 5 Pro 16IAH7', 28, 'Intel Core i7 12700H', '16 GB', 'Intel Iris Xe Graphics', 25190000, NULL, NULL, 'Laptop', '512 GB', 16, '75 Wh', 'China', 1),
('LP16', 'Laptop Acer Nitro Gaming AN515-57-54MV', 62, 'Intel Core i5 11400H', '8', 'NVIDIA GeForce RTX 3050', 22990000, NULL, NULL, 'Laptop', '512 GB', 15.6, '4 Cell ', 'China', 1),
('LP17', 'Laptop MSI Gaming Katana GF66 12UCK-815VN', 22, 'Intel Core i5 12450H', '8 GB', 'Intel UHD Graphics', 23190000, NULL, NULL, 'Laptop', '512 GB', 15.6, '53.5 Wh', 'China', 1),
('LP18', 'Laptop Asus TUF Gaming FX517ZC-HN077W', 23, 'Intel Core i5 12450H', '8 GB', 'NVIDIA GeForce RTX 3050', 24990000, NULL, NULL, 'Laptop', '512 GB', 15.6, '4 Cell', 'China', 1),
('LP19', 'Laptop HP Gaming Victus 16-e0175AX', 18, 'AMD Ryzen 5 5600H', '8 GB', 'NVIDIA GeForce RTX 3050 Ti', 19490000, NULL, NULL, 'Laptop', '512 GB', 16.1, '4 Cell', 'China', 1),
('LP20', 'Laptop MSI GF63 Thin 11UC-444VN', 19, 'Intel Core i5 11400H', '8 GB', 'NVIDIA GeForce RTX 3050', 20790000, NULL, NULL, 'Laptop', '512 GB', 15.6, '3 Cell', 'China', 1),
('LP21', 'Laptop Asus TUF Gaming FX517ZE-HN045W', 16, 'Intel Core i5 12450H', '8 GB', 'NVIDIA GeForce RTX 3050 Ti', 25990000, NULL, NULL, 'Laptop', '512 GB', 15.6, '4 Cell', 'China', 1),
('LP22', 'Laptop Lenovo Yoga Slim 7 Pro 14IHU5O', 20, 'Intel Core i5 11300H', '16 GB', 'Intel Iris Xe Graphics', 23490000, NULL, NULL, 'Laptop', '512 GB', 14, '4 Cell ', 'China', 1),
('LP23', 'Laptop Gigabyte U4 UD-50VN823SO', 37, 'Intel Core i5 1155G7', '16 GB', 'Intel Iris Xe Graphics', 15690000, NULL, NULL, 'Laptop', '512 GB', 14, '36 Wh', 'China', 1),
('LP24', 'Laptop Dell Vostro V5410 i5', 34, 'Intel Core i5 11320H', '8 GB', 'Intel Iris Xe Graphics', 21490000, NULL, NULL, 'Laptop', '512 GB', 14, '4 Cell', 'China', 1),
('LP25', 'Laptop MSI Gaming GF63 Thin 11SC-666VN', 53, 'Intel Core i5 11400H', '8 GB', 'NVIDIA GeForce GTX 1650', 18390000, NULL, NULL, 'Laptop', '512 GB', 15.6, '3 Cell', 'China', 1),
('LP3', 'Lenovo ThinkPad E14', 83, 'Intel Core i5 11G352', '8GB', 'OnBoard', 15000000, NULL, NULL, 'Laptop', '521GB', 14, '45Wh', 'China', 1),
('LP4', 'Lenovo Ideapad 3 15ITL6', 118, 'Intel Core i3 1115G4', '8GB', 'Onboard', 10690000, NULL, NULL, 'Laptop', '512GB', 15.6, '35Wh', 'China', 1),
('LP5', 'Gigabyte Gaming G5 GD', 11, 'Intel Core i5 11400H', '16GB', 'NVIDIA GeForce RTX 3050 4GB', 19290000, NULL, NULL, 'Laptop', '512GB', 15.6, '50Wh', 'China', 1),
('LP6', 'MSI Gaming GF63 Thin 11SC-1090VN', 90, 'Intel Core i5 11400H', '8GB', 'NVIDIA GeForce GTX 1650 4GB', 17490000, NULL, NULL, 'Laptop', '512GB', 15.6, '50Wh', 'China', 1),
('LP7', 'Laptop Asus TUF Gaming FX506LHB-HN188W', 19, 'Intel Core i5 10300H', '8 GB', 'NVIDIA GeForce GTX 1650', 17490000, NULL, NULL, 'Laptop', '512 GB', 15.6, '3 Cell', 'China', 1),
('LP8', 'Laptop MSI Gaming GF63 Thin 11SC-1090VN', 60, 'Intel Core i5 11400H', '8 GB', 'NVIDIA GeForce GTX 1650 4GB', 18390000, NULL, NULL, 'Laptop', '512 GB', 15.6, '3 Cell', 'China', 1),
('LP9', 'Laptop Asus TUF Gaming FA506IHRB-HN019W', 25, 'AMD Ryzen 5 4600H', '8 GB', 'NVIDIA GeForce GTX 1650', 16490000, NULL, NULL, 'Laptop', '512 GB', 12, '3 cell', 'China', 1),
('PC06', 'PC E-Power Office 08', 19, 'Intel Core i5 11400', '16 GB', 'Intel UHD Graphics 730', 9690000, 'Intel H510', 9690000, 'PC', '240 GB', NULL, NULL, 'Vietnam', 1),
('PC1', 'PC E-Power Office 04', 16, 'Intel Core i3 10105', '8GB', 'Intel HD Graphics 630', 7090000, 'Intel H510', 0, 'Laptop', '240GB', NULL, NULL, 'Vietnam', 1),
('PC2', 'PC E-Power Office 05', 30, 'Intel Core i5 10400', '8 GB', 'Intel UHD Graphics 630', 8290000, 'Intel H510', 300, 'PC', '8 GB', NULL, NULL, 'Vietnam', 1),
('PC3', 'PC E-Power Office 07', 19, 'Intel Core i5 11400', '8 GB', 'Intel UHD Graphics 730', 8990000, 'Intel H510', 8990000, 'PC', '240 GB', NULL, NULL, 'Vietnam', 1),
('PC30', 'ASUS Vivobook', 1, ' Ryzen 7 5800H ', '16GB', 'GTX 3060', 25000000, NULL, NULL, 'Laptop', '512GB', 24, '3000', 'Vietnam', 1),
('PC4', 'PC Gaming E-Power G1650', 71, 'Intel Core i3 10100F', '8 GB', 'Intel UHD Graphics 730', 11990000, 'Intel H510', 300, 'PC', '240 GB', NULL, NULL, 'Vietnam', 1),
('PC5', 'PC E-Power Office 06', 33, 'Intel Core i5 10400', '16 GB', 'Intel HD Graphics 630', 9190000, 'Intel H510', 200, 'PC', '240 GB', NULL, NULL, 'Vietnam', 1),
('PC7', 'PC Acer Aspire AS-XC780 DT.B8ASV.006', 21, ' Intel Core i5-7400', '4GB', ' Intel HD Graphics 630 / GeForce GT 720 2GB', 11200000, 'Intel H510', 300, 'PC', '1TB', NULL, NULL, 'Vietnam', 1);

-- --------------------------------------------------------

--
-- Table structure for table `Supplier`
--

CREATE TABLE `Supplier` (
  `id` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Supplier`
--

INSERT INTO `Supplier` (`id`, `name`, `phone`, `address`) VALUES
('ANPHAT', 'An Phat Company', '02835109735', 'Phu Nhuan district, Hochiminh city'),
('CODO', 'Co Do Company', '02838115345', 'Tan Binh district, Hochiminh city'),
('FPT', 'FPT Telecom', '02873023456', 'Thu Duc district, Hochiminh city'),
('HACOM', 'HACOM Company', '1900 1903', 'Hai Ba Trung district, Hanoi'),
('HOANGPHAT', 'Hoang Phat Company', '02253250888', 'Ngo Quyen district, Haiphong'),
('PHONGVU', 'Phong Vu Company', '0967567567', 'district 1, Hochiminh city'),
('TGDD', 'Mobile World Company','028 38125960', 'district 1, Hochiminh city'),
('VIETSTARS', 'Vietstars Company', '090 469 0212', 'Hai Chau district, Danang');

-- --------------------------------------------------------

--
-- Table structure for table `ImportedInvoice`
--

CREATE TABLE `ImportedInvoice` (
  `id` varchar(50) NOT NULL,
  `createdAt` timestamp NULL DEFAULT NULL,
  `createdBy` varchar(50) DEFAULT NULL,
  `supplier` varchar(50) DEFAULT NULL,
  `totalPrice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ImportedInvoice`
--

INSERT INTO `ImportedInvoice` (`id`, `createdAt`, `createdBy`, `supplier`, `totalPrice`) VALUES
('PN1', '2022-12-01 13:59:09', 'admin', 'FPT', 42980000),
('PN10', '2022-12-07 18:04:19', 'admin', 'HOANGPHAT', 112440000),
('PN11', '2022-12-07 18:48:21', 'admin', 'FPT', 98300000),
('PN12', '2022-12-16 02:19:48', 'admin', 'HACOM', 39880000),
('PN13', '2022-12-16 02:19:36', 'admin', 'PHONGVU', 38980000),
('PN14', '2022-12-08 12:28:57', 'admin', 'FPT', 50970000),
('PN15', '2022-12-08 12:36:25', 'admin', 'FPT', 39980000),
('PN16', '2022-12-08 16:30:48', 'admin', 'HOANGPHAT', 52170000),
('PN17', '2022-12-09 14:29:43', 'admin', 'FPT', 30180000),
('PN18', '2022-12-09 17:08:19', 'admin', 'FPT', 78750000),
('PN19', '2022-12-12 07:09:21', 'admin', 'PHONGVU', 66860000),
('PN2', '2022-12-01 13:59:23', 'admin', 'FPT', 46780000),
('PN20', '2022-12-13 19:46:37', 'admin', 'PHONGVU', 233270000),
('PN21', '2022-12-14 11:54:21', 'admin', 'PHONGVU', 1536180000),
('PN22', '2022-12-14 12:32:09', 'admin', 'FPT', 89660000),
('PN23', '2022-12-14 14:28:52', 'admin', 'FPT', 112540000),
('PN24', '2022-12-14 14:41:23', 'admin', 'FPT', 2339800000),
('PN25', '2022-12-14 15:18:25', 'admin', 'ANPHAT', 22490000),
('PN26', '2022-12-14 20:01:37', 'admin', 'ANPHAT', 50380000),
('PN27', '2022-12-14 20:02:31', 'admin', 'ANPHAT', 192900000),
('PN28', '2022-12-15 10:43:36', 'admin', 'ANPHAT', 71870000),
('PN29', '2022-12-16 02:19:55', 'admin', 'CODO', 10690000),
('PN3', '2022-12-03 03:58:18', 'admin', 'FPT', 88450000),
('PN30', '2022-12-15 23:13:22', 'admin', 'ANPHAT', 59480000),
('PN31', '2022-12-15 23:14:59', 'petero', 'ANPHAT', 58370000),
('PN32', '2022-12-16 02:19:27', 'admin', 'HOANGPHAT', 80260000),
('PN33', '2022-12-16 13:09:45', 'petero', 'VIETSTARS', 68070000),
('PN34', '2022-12-16 15:31:14', 'admin', 'HOANGPHAT', 513500000),
('PN35', '2022-12-16 15:36:48', 'admin', 'HOANGPHAT', 59760000),
('PN36', '2022-12-16 15:40:31', 'admin', 'ANPHAT', 389800000),
('PN37', '2022-12-17 01:02:09', 'admin', 'ANPHAT', 85350000),
('PN38', '2022-12-17 01:08:48', 'admin', 'ANPHAT', 838500000),
('PN4', '2022-12-03 03:58:37', 'admin', 'TGDD', 53270000),
('PN5', '2022-12-06 17:51:02', 'admin', 'FPT', 32070000),
('PN6', '2022-12-06 18:50:32', 'admin', 'FPT', 38190000),
('PN7', '2022-12-06 18:59:43', 'admin', 'PHONGVU', 135530000),
('PN8', '2022-12-06 19:15:01', 'admin', 'FPT', 46670000),
('PN9', '2022-12-06 19:20:44', 'admin', 'FPT', 43480000);

-- --------------------------------------------------------

--
-- Table structure for table `ExportedInvoice`
--

CREATE TABLE `ExportedInvoice` (
  `id` varchar(50) NOT NULL,
  `createdAt` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `createdBy` varchar(50) NOT NULL,
  `totalPrice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ExportedInvoice`
--

INSERT INTO `ExportedInvoice` (`id`, `createdAt`, `createdBy`, `totalPrice`) VALUES
('PX1', '2022-12-01 14:10:44', 'admin', 291860000),
('PX10', '2022-12-07 18:41:08', 'admin', 57160000),
('PX12', '2022-12-07 19:06:56', 'admin', 45370000),
('PX13', '2022-12-08 12:31:48', 'admin', 109420000),
('PX14', '2022-12-08 16:30:10', 'admin', 78650000),
('PX15', '2022-12-12 22:31:09', 'admin', 86850000),
('PX16', '2022-12-14 15:04:47', 'admin', 136740000),
('PX17', '2022-12-14 15:34:07', 'admin', 51980000),
('PX18', '2022-12-15 20:32:57', 'admin', 151730000),
('PX19', '2022-12-16 02:20:15', 'Admin', 59360000),
('PX2', '2022-12-04 16:45:43', 'admin', 70660000),
('PX20', '2022-12-16 13:26:33', 'Admin', 79140000),
('PX21', '2022-12-16 13:36:43', 'Admin', 60850000),
('PX22', '2022-12-16 16:39:41', 'Admin', 35780000),
('PX23', '2022-12-16 17:18:54', 'Admin', 41460000),
('PX24', '2022-12-16 17:25:10', 'Admin', 63360000),
('PX25', '2022-12-16 18:51:31', 'Admin', 92550000),
('PX26', '2022-12-17 00:19:47', 'Admin', 94760000),
('PX3', '2022-12-04 16:45:52', 'admin', 89350000),
('PX4', '2022-12-04 16:45:59', 'admin', 58170000),
('PX5', '2022-12-06 19:10:13', 'admin', 85250000),
('PX6', '2022-12-06 19:19:12', 'admin', 71460000),
('PX7', '2022-12-06 19:25:43', 'admin', 52370000),
('PX8', '2022-12-07 18:39:54', 'admin', 39880000),
('PX9', '2022-12-07 18:40:22', 'admin', 36680000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Account`
--
ALTER TABLE `Account`
  ADD PRIMARY KEY (`userName`) USING BTREE;

--
-- Indexes for table `ImportedDetailedInvoice`
--
ALTER TABLE `ImportedDetailedInvoice`
  ADD PRIMARY KEY (`invoiceId`,`productId`),
  ADD KEY `FK_ImportedDetailedInvoice_Product` (`productId`);

--
-- Indexes for table `ExportedDetailedInvoice`
--
ALTER TABLE `ExportedDetailedInvoice`
  ADD PRIMARY KEY (`invoiceId`,`productId`),
  ADD KEY `FK_ExportedDetailedInvoice_Product` (`productId`);

--
-- Indexes for table `Product`
--
ALTER TABLE `Product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Supplier`
--
ALTER TABLE `Supplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ImportedInvoice`
--
ALTER TABLE `ImportedInvoice`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_ImportedInvoice_Supplier` (`supplier`),
  ADD KEY `FK_ImportedInvoice_Account` (`createdBy`);

--
-- Indexes for table `ExportedInvoice`
--
ALTER TABLE `ExportedInvoice`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_ExportedInvoice_Account` (`createdBy`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ImportedDetailedInvoice`
--
ALTER TABLE `ImportedDetailedInvoice`
  ADD CONSTRAINT `FK_ImportedDetailedInvoice_Product` FOREIGN KEY (`productId`) REFERENCES `Product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_ImportedDetailedInvoice_ImportedInvoice` FOREIGN KEY (`invoiceId`) REFERENCES `ImportedInvoice` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ExportedDetailedInvoice`
--
ALTER TABLE `ExportedDetailedInvoice`
  ADD CONSTRAINT `FK_ExportedDetailedInvoice_Product` FOREIGN KEY (`productId`) REFERENCES `Product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_ExportedDetailedInvoice_ExportedInvoice` FOREIGN KEY (`invoiceId`) REFERENCES `ExportedInvoice` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ImportedInvoice`
--
ALTER TABLE `ImportedInvoice`
  ADD CONSTRAINT `FK_ImportedInvoice_Account` FOREIGN KEY (`createdBy`) REFERENCES `Account` (`userName`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_ImportedInvoice_Supplier` FOREIGN KEY (`supplier`) REFERENCES `Supplier` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ExportInvoice`
--
ALTER TABLE `ExportedInvoice`
  ADD CONSTRAINT `FK_ExportedInvoice_Account` FOREIGN KEY (`createdBy`) REFERENCES `Account` (`userName`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
