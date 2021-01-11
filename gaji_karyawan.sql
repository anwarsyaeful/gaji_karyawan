-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Mar 2020 pada 11.10
-- Versi server: 10.3.16-MariaDB
-- Versi PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gaji_karyawan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `gaji`
--

CREATE TABLE `gaji` (
  `nrp` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jabatan` varchar(15) NOT NULL,
  `gapok` int(10) NOT NULL,
  `tunjangan` int(10) NOT NULL,
  `transport` int(10) NOT NULL,
  `masuk` int(3) NOT NULL,
  `gaji` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `gaji`
--

INSERT INTO `gaji` (`nrp`, `nama`, `jabatan`, `gapok`, `tunjangan`, `transport`, `masuk`, `gaji`) VALUES
('67653', 'Wahyu setiawan', 'Asisten Manager', 4500000, 337500, 21500, 23, 5332000),
('67654', 'Syaeful Anwar', 'Manager', 5000000, 375000, 21500, 22, 5848000),
('67656', 'Cahya Nugroho', 'HRD', 4000000, 300000, 21500, 25, 4837500),
('67657', 'Deni Saputra', 'Staf Keuangan', 3500000, 262500, 21500, 25, 4300000),
('67660', 'Supriyadi', 'Karyawan', 3000000, 225000, 21500, 26, 3784000),
('70155', 'Agus Heryanto', 'Karyawan', 3000000, 225000, 21500, 26, 3784000),
('70156', 'Dodi ', 'Karyawan', 3000000, 225000, 21500, 26, 3784000),
('70157', 'Ganix Wijayanto', 'Karyawan', 3000000, 225000, 21500, 26, 3784000),
('70158', 'Ahmad Winarso', 'Karyawan', 3000000, 225000, 21500, 26, 3784000),
('70159', 'Atik Firmansyah', 'Office Boy', 2500000, 187500, 21500, 26, 3246500),
('70160', 'Wjiayanto', 'Office Boy', 2500000, 187500, 21500, 26, 3246500);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `gaji`
--
ALTER TABLE `gaji`
  ADD PRIMARY KEY (`nrp`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
