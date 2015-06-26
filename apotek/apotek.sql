-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 02, 2015 at 09:00 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `apotek`
--

-- --------------------------------------------------------

--
-- Table structure for table `golongan_obat`
--

CREATE TABLE IF NOT EXISTS `golongan_obat` (
  `KODE_GOLONGAN` varchar(15) NOT NULL,
  `GOLONGAN` varchar(20) NOT NULL,
  PRIMARY KEY (`KODE_GOLONGAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `KODE_OBAT` varchar(15) NOT NULL,
  `KODE_GOLONGAN` varchar(15) NOT NULL,
  `NAMA_OBAT` varchar(30) NOT NULL,
  `KODE_STOCK` varchar(15) NOT NULL,
  `HARGA_SATUAN` varchar(15) NOT NULL,
  `KADALUARSA` date NOT NULL,
  PRIMARY KEY (`KODE_OBAT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE IF NOT EXISTS `pasien` (
  `ID_PASSIEN` varchar(15) NOT NULL,
  `NAMA_PASIEN` varchar(30) NOT NULL,
  `ALAMAT` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE IF NOT EXISTS `pembelian` (
  `KODE_PEMBELIAN` varchar(15) NOT NULL,
  `ID_SUPPLIER` varchar(15) NOT NULL,
  `ID_PASIEN` varchar(15) NOT NULL,
  `KODE_OBAT` varchar(15) NOT NULL,
  `JUMLAH_PEMBELIAN` varchar(20) NOT NULL,
  PRIMARY KEY (`KODE_PEMBELIAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
  `KODE_PENJUALAN` varchar(15) NOT NULL,
  `ID_PEGAWAI` varchar(15) NOT NULL,
  `KODE_OBAT` varchar(15) NOT NULL,
  `TANGGAL_PENJUALAN` date NOT NULL,
  `OBAT TERJUAL` varchar(15) NOT NULL,
  PRIMARY KEY (`KODE_PENJUALAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stock_obat`
--

CREATE TABLE IF NOT EXISTS `stock_obat` (
  `KODE_STOCK` varchar(15) NOT NULL,
  `JUMLAH_STOCK` varchar(20) NOT NULL,
  PRIMARY KEY (`KODE_STOCK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE IF NOT EXISTS `supplier` (
  `ID_SUPPLIER` varchar(15) NOT NULL,
  `NAMA_SUPPLIER` varchar(30) NOT NULL,
  `NO_TELEPON` varchar(15) NOT NULL,
  `ALAMAT` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_SUPPLIER`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
