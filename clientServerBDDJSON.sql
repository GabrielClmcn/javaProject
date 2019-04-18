-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 18, 2019 at 12:53 PM
-- Server version: 5.7.25-0ubuntu0.18.04.2
-- PHP Version: 7.2.15-0ubuntu0.18.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaProject`
--

-- --------------------------------------------------------

--
-- Table structure for table `anniversaire`
--

CREATE TABLE `anniversaire` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `Gender` int(2) NOT NULL,
  `Year` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `anniversaire`
--

INSERT INTO `anniversaire` (`Id`, `Name`, `LastName`, `Gender`, `Year`) VALUES
(1, 'Gabriel', 'C', 0, 1998),
(2, 'Jullian', 'B', 0, 1995),
(3, 'Arnaud', 'D', 0, 2000),
(4, 'Quentin', 'G', 0, 1999),
(5, 'Janette', 'D', 1, 1995),
(6, 'Marie', 'C', 1, 1998),
(7, 'Caroline', 'B', 1, 1977),
(8, 'Robyn', 'F', 1, 1988);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anniversaire`
--
ALTER TABLE `anniversaire`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anniversaire`
--
ALTER TABLE `anniversaire`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
