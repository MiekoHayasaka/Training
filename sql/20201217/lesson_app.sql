-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 03, 2017 at 05:18 PM
-- Server version: 5.7.16
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lesson_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `category` varchar(30) DEFAULT '未分類',
  `title` varchar(255) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `updated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `category`, `title`, `price`, `updated`) VALUES
(1, '雑誌', 'ジャンプ', 300, '2018-08-31'),
(2, '雑誌', 'サンデー', 290, '2018-08-31'),
(3, '漫画', 'タッチ', 570, '2000-01-11'),
(4, '漫画', 'ドラゴンボール', 530, '1982-12-11'),
(5, '漫画', '北斗の拳', 380, '1983-02-27'),
(6, '小説', 'ノルウェイの森', 1700, '1987-05-26'),
(7, '小説', '海辺のカフカ', 1800, '2004-08-15'),
(8, '小説', '騎士団長殺し', 1820, '2017-03-10'),
(9, '未分類', '君が僕を知ってる', 960, NULL),
(10, '小説', 'この世に猫がいなかったら', 1200, '2016-11-01'),
(12, '未分類', 'スキー入門', 1340, '2018-09-01'),
(13, '未分類', '必勝麻雀', 1420, '2018-09-01'),
(14, '漫画', 'アラレちゃん', 350, '1978-12-11'),
(15, '未分類', 'Java入門', 1800, '2018-09-01'),
(16, '未分類', 'SQL入門', 2800, '2017-08-31'),
(17, '未分類', 'パーフェクトJava', 2700, '2017-09-01'),
(18, '技術書', 'Unity入門', 2700, '2017-09-01'),
(19, '技術書', 'Unity入門', 2700, '2017-09-01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
