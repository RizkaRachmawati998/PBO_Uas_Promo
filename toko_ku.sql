-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2019 at 01:28 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_ku`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Username` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`) VALUES
('admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_barang` varchar(10) NOT NULL,
  `nm_barang` varchar(50) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `detail` varchar(50) NOT NULL,
  `harga` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_barang`, `nm_barang`, `jenis`, `detail`, `harga`) VALUES
('K001', 'Indomie Goreng', 'Makanan', '900 Gram', 500),
('R002', 'Pepsodent', 'Pasta gigi', 'Berat 250 Gram', 11000),
('R129P', 'Narmada ', 'Minuman', 'Narmada Tanggung 500ml', 19000),
('TYO08', 'Tepung Segitiga Biru', 'Tepung Terigu', 'Berat 500 gram', 6000);

-- --------------------------------------------------------

--
-- Table structure for table `promo`
--

CREATE TABLE `promo` (
  `kd_promo` varchar(10) NOT NULL,
  `kd_barang` varchar(10) NOT NULL,
  `nm_barang` varchar(20) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `promo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `promo`
--

INSERT INTO `promo` (`kd_promo`, `kd_barang`, `nm_barang`, `jenis`, `promo`) VALUES
('001', 'K001', 'Indomie Goreng', 'Makanan', 500),
('098', 'TYO08', 'Tepung Segitiga Biru', 'Tepung Terigu', 2000),
('309', 'R002', 'Pepsodent', 'Pasta Gigi', 2000),
('345', 'R129P', 'Narmada ', 'Minuman', 1000);

--
-- Triggers `promo`
--
DELIMITER $$
CREATE TRIGGER `promo_barang` AFTER INSERT ON `promo` FOR EACH ROW BEGIN
UPDATE barang,promo SET barang.harga = barang.harga - promo.promo
WHERE promo.kd_barang = barang.kd_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kd_transaksi` int(10) NOT NULL,
  `kd_barang` varchar(10) NOT NULL,
  `qty` int(11) NOT NULL,
  `total_harga` double NOT NULL,
  `jml_bayar` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`kd_transaksi`, `kd_barang`, `qty`, `total_harga`, `jml_bayar`) VALUES
(1, 'R129P', 4, 2000, 10000),
(2, 'K001', 5, 1500, 100000),
(3, 'R002', 4, 13000, 100000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indexes for table `promo`
--
ALTER TABLE `promo`
  ADD PRIMARY KEY (`kd_promo`),
  ADD KEY `kd_barang` (`kd_barang`),
  ADD KEY `kd_barang_2` (`kd_barang`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kd_transaksi`),
  ADD KEY `kd_barang` (`kd_barang`),
  ADD KEY `kd_barang_2` (`kd_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `kd_transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `promo`
--
ALTER TABLE `promo`
  ADD CONSTRAINT `promo_ibfk_1` FOREIGN KEY (`kd_barang`) REFERENCES `barang` (`kd_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`kd_barang`) REFERENCES `barang` (`kd_barang`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
