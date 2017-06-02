-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.21-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for softfitness
CREATE DATABASE IF NOT EXISTS `softfitness` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `softfitness`;

-- Dumping structure for table softfitness.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doc_identidad` int(11) NOT NULL,
  `nombres` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `edad` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `sexo` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `peso` double NOT NULL,
  `direccion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `correo_elec` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_fijo` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_movil` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_reg` date NOT NULL,
  `estado` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `id_membresia` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `doc_identidad` (`doc_identidad`),
  KEY `fk_Cliente_membresia` (`id_membresia`),
  CONSTRAINT `fk_Cliente_membresia` FOREIGN KEY (`id_membresia`) REFERENCES `membresia` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene informacion referente a los clientes del establecimiento deportivo.';

-- Dumping data for table softfitness.cliente: ~0 rows (approximately)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Dumping structure for table softfitness.cliente_programa
CREATE TABLE IF NOT EXISTS `cliente_programa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` int(11) NOT NULL,
  `id_programa` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Cliente_Programa_cliente` (`id_cliente`),
  KEY `fk_Cliente_Programa_programa` (`id_programa`),
  CONSTRAINT `fk_Cliente_Programa_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `fk_Cliente_Programa_programa` FOREIGN KEY (`id_programa`) REFERENCES `programa` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene llaves FK para formacion de relacion 1:M y parte la relacin N:M entre las tabas cliente y programa';

-- Dumping data for table softfitness.cliente_programa: ~0 rows (approximately)
/*!40000 ALTER TABLE `cliente_programa` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente_programa` ENABLE KEYS */;

-- Dumping structure for table softfitness.evaluacion
CREATE TABLE IF NOT EXISTS `evaluacion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `hora` date NOT NULL,
  `peso` double NOT NULL,
  `indice_grasa` double NOT NULL,
  `rm` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Evaluacion_cliente` (`id_cliente`),
  CONSTRAINT `fk_Evaluacion_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene la elavaluacion y estadisticos de los clientes.';

-- Dumping data for table softfitness.evaluacion: ~0 rows (approximately)
/*!40000 ALTER TABLE `evaluacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion` ENABLE KEYS */;

-- Dumping structure for table softfitness.instructor
CREATE TABLE IF NOT EXISTS `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doc_identidad` int(11) NOT NULL,
  `nombres` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `edad` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `sexo` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `correo_elec` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_fijo` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `telefono_movil` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `doc_identidad` (`doc_identidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene las informacion de los instructores que laboran en el establecimiento deportivo.';

-- Dumping data for table softfitness.instructor: ~0 rows (approximately)
/*!40000 ALTER TABLE `instructor` DISABLE KEYS */;
/*!40000 ALTER TABLE `instructor` ENABLE KEYS */;

-- Dumping structure for table softfitness.membresia
CREATE TABLE IF NOT EXISTS `membresia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `precio` double NOT NULL,
  `duracion` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene las membresias disponibles para hacer uso de los servicios ofrecidos a los clientes.';

-- Dumping data for table softfitness.membresia: ~0 rows (approximately)
/*!40000 ALTER TABLE `membresia` DISABLE KEYS */;
/*!40000 ALTER TABLE `membresia` ENABLE KEYS */;

-- Dumping structure for table softfitness.programa
CREATE TABLE IF NOT EXISTS `programa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `sala` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `capacidad` int(11) NOT NULL,
  `cupo` int(11) NOT NULL,
  `estado` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `id_instructor` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Programa_instructor` (`id_instructor`),
  CONSTRAINT `fk_Programa_instructor` FOREIGN KEY (`id_instructor`) REFERENCES `instructor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene informacion sobre los progamas de entrenamiento grupal.';

-- Dumping data for table softfitness.programa: ~0 rows (approximately)
/*!40000 ALTER TABLE `programa` DISABLE KEYS */;
/*!40000 ALTER TABLE `programa` ENABLE KEYS */;

-- Dumping structure for table softfitness.sesion
CREATE TABLE IF NOT EXISTS `sesion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `hora_in` date NOT NULL,
  `hora_fn` date NOT NULL,
  `estado` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_instructor` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Sesion_cliente` (`id_cliente`),
  KEY `fk_Sesion_instructor` (`id_instructor`),
  CONSTRAINT `fk_Sesion_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `fk_Sesion_instructor` FOREIGN KEY (`id_instructor`) REFERENCES `instructor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene los clientes registrados en los programas de entrenamiento personal, asi como tambien el instructor a cargo del mismo.';

-- Dumping data for table softfitness.sesion: ~0 rows (approximately)
/*!40000 ALTER TABLE `sesion` DISABLE KEYS */;
/*!40000 ALTER TABLE `sesion` ENABLE KEYS */;

-- Dumping structure for table softfitness.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rol` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `clave` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_reg` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Contiene los usuarios para la autenticacion de inicio de sesion en la aplicacion java "SoftFitness"';

-- Dumping data for table softfitness.usuario: ~0 rows (approximately)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
