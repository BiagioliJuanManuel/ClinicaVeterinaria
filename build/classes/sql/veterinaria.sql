-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 27, 2023 at 05:55 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `veterinaria`
--

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `documento` int(11) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `contactoAlternativo` varchar(50) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nombre`, `documento`, `direccion`, `telefono`, `contactoAlternativo`, `estado`) VALUES
(1, 'Juan Perez', 12874122, 'Calle Publica 43', '15-2121415', 'Mariela: 15-5684657', 1),
(2, 'Mariela Rosa Corzo', 6345242, 'calle bolivia', '15-21151415', 'Mariela: 15-5684657', 1),
(4, 'v', 63452662, 'calle colombia', '15-21151415', 'Mariela: 15-5684657', 0),
(5, 'Marcos', 6, 'dasd', '4234', '5435', 1),
(6, 'Walter', 55, 'asdssadd', '42324234', '654546', 1),
(7, 'Victoria Galetovich', 43653968, 'Calle procrear', '154605069', '4498819', 1);

-- --------------------------------------------------------

--
-- Table structure for table `mascotas`
--

CREATE TABLE `mascotas` (
  `idMascota` int(11) NOT NULL,
  `alias` varchar(70) NOT NULL,
  `sexo` varchar(11) NOT NULL,
  `especie` varchar(50) NOT NULL,
  `raza` varchar(20) NOT NULL,
  `colorPelo` varchar(20) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mascotas`
--

INSERT INTO `mascotas` (`idMascota`, `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `fechaNacimiento`, `idCliente`, `estado`) VALUES
(3, 'Pichichu', 'macho', 'perro', 'salchicha', 'negro', '2021-07-25', 1, 1),
(4, 'Lola', 'hembra', 'gata', 'siames', 'blanca', '2022-11-09', 1, 1),
(5, 'Tobias', 'Macho', 'Perro', 'Labrador', 'Amarillo', '2015-07-16', 2, 1),
(6, 'Amelia', 'hembra', 'gata', 'carey', 'gris y blanca', '2015-08-07', 7, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tratamientos`
--

CREATE TABLE `tratamientos` (
  `idTratamiento` int(11) NOT NULL,
  `tipoTratamiento` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `codigo` int(11) NOT NULL,
  `importe` double NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tratamientos`
--

INSERT INTO `tratamientos` (`idTratamiento`, `tipoTratamiento`, `descripcion`, `codigo`, `importe`, `estado`) VALUES
(1, 'Vacunación', 'Primer esquema de vacunación', 1, 4000, 1),
(2, 'Baño', 'Baño y corte de pelo', 2, 2300, 1),
(3, 'Desparasitación', 'Ninguna', 3, 3000, 1),
(4, 'Castracion', 'ninguna', 4, 10000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `visitas`
--

CREATE TABLE `visitas` (
  `idVisita` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `fechaVisita` date NOT NULL,
  `pesoActual` double NOT NULL,
  `pesoPromedio` double NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `pago` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `visitas`
--

INSERT INTO `visitas` (`idVisita`, `idMascota`, `idTratamiento`, `descripcion`, `fechaVisita`, `pesoActual`, `pesoPromedio`, `estado`, `pago`) VALUES
(9, 6, 1, '', '2023-10-23', 4, 4, 1, 0),
(10, 6, 2, '', '2023-10-23', 4, 4, 1, 0),
(22, 3, 1, '', '2023-10-05', 2, 3, 1, 0),
(23, 3, 2, 'muy sucio', '2023-10-05', 4, 4, 1, 0),
(24, 3, 1, '', '2023-10-04', 4, 4, 1, 0),
(25, 3, 1, '', '2023-10-05', 4, 4, 1, 0),
(26, 3, 1, 'cliente equivocado', '2023-10-04', 4, 4, 1, 0),
(27, 3, 1, 'sdfa', '2023-10-26', 5, 5, 1, 0),
(28, 3, 1, '', '2023-10-04', 3, 3, 1, 0),
(29, 4, 2, '', '2023-10-05', 2, 2, 1, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `documento` (`documento`);

--
-- Indexes for table `mascotas`
--
ALTER TABLE `mascotas`
  ADD PRIMARY KEY (`idMascota`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indexes for table `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD PRIMARY KEY (`idTratamiento`),
  ADD UNIQUE KEY `tipoTratamiento` (`tipoTratamiento`);

--
-- Indexes for table `visitas`
--
ALTER TABLE `visitas`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idTratamiento` (`idTratamiento`),
  ADD KEY `idMascota` (`idMascota`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `mascotas`
--
ALTER TABLE `mascotas`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tratamientos`
--
ALTER TABLE `tratamientos`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `visitas`
--
ALTER TABLE `visitas`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mascotas`
--
ALTER TABLE `mascotas`
  ADD CONSTRAINT `mascotas_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`);

--
-- Constraints for table `visitas`
--
ALTER TABLE `visitas`
  ADD CONSTRAINT `visitas_ibfk_1` FOREIGN KEY (`idMascota`) REFERENCES `mascotas` (`idMascota`),
  ADD CONSTRAINT `visitas_ibfk_2` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamientos` (`idTratamiento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
