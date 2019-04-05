






-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-03-2019 a las 11:41:43
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `autentia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogo`
--

CREATE TABLE `catalogo` (
  `id` int(11) NOT NULL,
  `activo` char(1) COLLATE latin1_spanish_ci NOT NULL,
  `profesor` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `titulo` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `nivel` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `horas` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `catalogo`
--

INSERT INTO `catalogo` (`id`, `activo`, `profesor`, `titulo`, `nivel`, `horas`) VALUES
(1, 'S', 'Roberto Canales Mora', 'Introducción a JSF2', 'Intermedio ', 25),
(2, 'S', 'Mercedes Martin Guerrero', 'Novedades en Spring 3', 'Intermedio', 16),
(3, 'S', 'Mercedes Martin Guerrero', 'Java 01', 'Básico', 25),
(4, 'S', 'Mercedes Martín Guerrero', 'Java 02', 'Intermedio', 25),
(5, 'N', 'Mercedes Martin Guerrero', 'Angular', 'Básico', 22),
(6, 'N', 'Mercedes Martin Guerrero', 'DevOps', 'Avanzado', 30);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `catalogo`
--
ALTER TABLE `catalogo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `catalogo`
--
ALTER TABLE `catalogo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;