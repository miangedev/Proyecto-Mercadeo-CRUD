CREATE DATABASE  IF NOT EXISTS `gestion_de_campanas_mercadeo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gestion_de_campanas_mercadeo`;
-- MySQL dump 10.13  Distrib 8.0.45, for macos15 (x86_64)
--
-- Host: 127.0.0.1    Database: gestion_de_campanas_mercadeo
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activos`
--

DROP TABLE IF EXISTS `activos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `activos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `ano_adquisicion` date NOT NULL,
  `valor_comercial` decimal(20,2) NOT NULL,
  `estado` enum('DISPONIBLE','RESERVADO','PRESTADO') NOT NULL DEFAULT 'DISPONIBLE',
  `CATEGORIAS_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ACTIVOS_CATEGORIAS_idx` (`CATEGORIAS_id`),
  CONSTRAINT `fk_ACTIVOS_CATEGORIAS` FOREIGN KEY (`CATEGORIAS_id`) REFERENCES `categorias` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activos`
--

LOCK TABLES `activos` WRITE;
/*!40000 ALTER TABLE `activos` DISABLE KEYS */;
INSERT INTO `activos` VALUES (1,'Stand Expo 3000','Stand','ProStand','S-3000','2021-06-01',5000000.00,'DISPONIBLE',1),(2,'Display LED 55','Display','LedCorp','L55','2022-01-15',1200000.00,'DISPONIBLE',1),(3,'Banner Grande XL','Banner','PrintCo','B-XL','2020-03-20',200000.00,'DISPONIBLE',2),(4,'Pop-up Vertical','Pop-up','PrintCo','PU-1','2019-08-10',150000.00,'DISPONIBLE',2),(5,'Mesa Promocional M20','Mobiliario','Furno','M-20','2023-02-05',800000.00,'DISPONIBLE',2);
/*!40000 ALTER TABLE `activos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campanas`
--

DROP TABLE IF EXISTS `campanas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `campanas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` text,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `estado` enum('PLANIFICADA','EN_EJECUCION','FINALIZADA') NOT NULL DEFAULT 'PLANIFICADA',
  `PERSONAS_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_CAMPANAS_PERSONAS1_idx` (`PERSONAS_id`),
  CONSTRAINT `fk_CAMPANAS_PERSONAS1` FOREIGN KEY (`PERSONAS_id`) REFERENCES `personas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campanas`
--

LOCK TABLES `campanas` WRITE;
/*!40000 ALTER TABLE `campanas` DISABLE KEYS */;
INSERT INTO `campanas` VALUES (1,'Lanzamiento del Año','Lanzamiento de los productos del año 2025','2026-02-01','2026-02-28','FINALIZADA',1),(2,'Promoción de Investigación','Promoción de Productos Investigativos UIS','2026-03-01','2026-03-31','PLANIFICADA',2),(3,'Comida Deliciosa Calle Master','Promoción de la Mejor Hamburguesa Calle Master','2026-04-10','2026-04-20','PLANIFICADA',6),(4,'Tecnologia UTS','Venta de productos investigativos SEIIS','2025-12-01','2025-12-31','FINALIZADA',1),(5,'ExpoLibros UIS','Venta de Libros de la Facultad de Humanas UIS','2026-06-01','2026-06-30','PLANIFICADA',2),(6,'Semillero SEIIS','Semillero de investigación de SISTEMAS UTS','2026-04-28','2026-05-16','PLANIFICADA',9);
/*!40000 ALTER TABLE `campanas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` enum('PREMIUM','STANDARD') NOT NULL,
  `dias_prestamo` int(11) NOT NULL,
  `porcentaje_penalizacion` decimal(3,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'PREMIUM',3,1.00),(2,'STANDARD',10,0.50);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penalizacion_prestamos`
--

DROP TABLE IF EXISTS `penalizacion_prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `penalizacion_prestamos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dias_retraso` int(11) NOT NULL,
  `valor_penali` decimal(10,2) NOT NULL,
  `fecha_generacion` date NOT NULL,
  `pagada` tinyint(4) NOT NULL DEFAULT '0',
  `PRESTAMOS_ACTIVO_PERSONA_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_PENALIZACION_PRESTAMOS_PRESTAMOS_ACTIVO_PERSONA1_idx` (`PRESTAMOS_ACTIVO_PERSONA_id`),
  CONSTRAINT `fk_PENALIZACION_PRESTAMOS_PRESTAMOS_ACTIVO_PERSONA1` FOREIGN KEY (`PRESTAMOS_ACTIVO_PERSONA_id`) REFERENCES `prestamos_activo_persona` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penalizacion_prestamos`
--

LOCK TABLES `penalizacion_prestamos` WRITE;
/*!40000 ALTER TABLE `penalizacion_prestamos` DISABLE KEYS */;
INSERT INTO `penalizacion_prestamos` VALUES (1,1,50000.00,'2026-02-14',0,1),(2,5,3750.00,'2026-01-25',1,4),(3,1,4000.00,'2026-02-26',0,5);
/*!40000 ALTER TABLE `penalizacion_prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_documento` varchar(45) NOT NULL,
  `numero_documento` varchar(45) NOT NULL,
  `razon_social` varchar(45) NOT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `ROL_id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numero_documento_UNIQUE` (`numero_documento`),
  KEY `fk_PERSONAS_ROL1_idx` (`ROL_id`),
  CONSTRAINT `fk_PERSONAS_ROL1` FOREIGN KEY (`ROL_id`) REFERENCES `rol` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'NIT','900100200-1','Unidades Tecnologicas de Santander','3101000100','contacto@correo.uts.edu.co','Calle 1 #10-20',1,'UTS'),(2,'NIT','900200300-1','Universidad Industrial de Santander','3102000200','info@correo.uis.edu.co','Calle 2 #20-30',1,'UIS'),(3,'CC','12345678','Empleado','3203000300','solangelyepesnunez@gmail.com','Cra 3 #30-40',2,'Sol Angel Yepes'),(4,'CC','87654321','Empleado','3204000400','angeloso74@hotmail.com','Av 4 #40-50',2,'Miguel Angel Osorio Orduz'),(5,'CC','00000001','ADMIN','3000000001','admin@agencia.com','Oficina Central',3,'Admin'),(6,'NIT','900300400-1','Pachorizo Food','3103000300','contacto@pachorizo.com','Calle 5 #50-60',1,'Pachorizo'),(7,'CC','5555555','SOPORTE','3107000700','soporte@apachorizo.com','Soporte Piso 1',5,'Soporte Técnico'),(8,'CC','4444444','SUPERVISOR','3108000800','supervisor@pachorizo.com','Gerencia Piso 2',4,'Supervisor'),(9,'TI','1234567890','DUEÑA DE PACHORIZO','3053034242','mariana@mariana.com','calle 62 1w26',7,'Mariana Ravelo Osorio');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamos_activo_persona`
--

DROP TABLE IF EXISTS `prestamos_activo_persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamos_activo_persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_inicio` date NOT NULL,
  `fecha_fin_programa` date NOT NULL,
  `fecha_entrega_real` date DEFAULT NULL,
  `estado` enum('ACTIVO','ATRASADO','FINALIZADO') NOT NULL DEFAULT 'ACTIVO',
  `PERSONAS_id` int(11) NOT NULL,
  `ACTIVOS_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_PRESTAMOS_ACTIVO_PERSONA_PERSONAS1_idx` (`PERSONAS_id`),
  KEY `fk_PRESTAMOS_ACTIVO_PERSONA_ACTIVOS1_idx` (`ACTIVOS_id`),
  CONSTRAINT `fk_PRESTAMOS_ACTIVO_PERSONA_ACTIVOS1` FOREIGN KEY (`ACTIVOS_id`) REFERENCES `activos` (`id`),
  CONSTRAINT `fk_PRESTAMOS_ACTIVO_PERSONA_PERSONAS1` FOREIGN KEY (`PERSONAS_id`) REFERENCES `personas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos_activo_persona`
--

LOCK TABLES `prestamos_activo_persona` WRITE;
/*!40000 ALTER TABLE `prestamos_activo_persona` DISABLE KEYS */;
INSERT INTO `prestamos_activo_persona` VALUES (1,'2026-02-10','2026-02-13','2026-02-14','FINALIZADO',1,1),(2,'2026-02-01','2026-02-11','2026-02-11','FINALIZADO',2,3),(3,'2026-02-20','2026-02-23',NULL,'ACTIVO',6,2),(4,'2026-01-10','2026-01-20','2026-01-25','FINALIZADO',1,4),(5,'2026-02-15','2026-02-25','2026-02-26','FINALIZADO',2,5);
/*!40000 ALTER TABLE `prestamos_activo_persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas_activos_clientes`
--

DROP TABLE IF EXISTS `reservas_activos_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas_activos_clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_reserva` date NOT NULL,
  `estado` enum('ACTIVA','CANCELADA','ATENDIDA') DEFAULT 'ACTIVA',
  `ACTIVOS_id` int(11) NOT NULL,
  `PERSONAS_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_RESERVAS_ACTIVOS_CLIENTES_ACTIVOS1_idx` (`ACTIVOS_id`),
  KEY `fk_RESERVAS_ACTIVOS_CLIENTES_PERSONAS1_idx` (`PERSONAS_id`),
  CONSTRAINT `fk_RESERVAS_ACTIVOS_CLIENTES_ACTIVOS1` FOREIGN KEY (`ACTIVOS_id`) REFERENCES `activos` (`id`),
  CONSTRAINT `fk_RESERVAS_ACTIVOS_CLIENTES_PERSONAS1` FOREIGN KEY (`PERSONAS_id`) REFERENCES `personas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas_activos_clientes`
--

LOCK TABLES `reservas_activos_clientes` WRITE;
/*!40000 ALTER TABLE `reservas_activos_clientes` DISABLE KEYS */;
INSERT INTO `reservas_activos_clientes` VALUES (1,'2026-02-20','ATENDIDA',3,1),(2,'2026-02-25','ACTIVA',1,2),(3,'2026-02-27','CANCELADA',2,6),(4,'2026-02-28','ACTIVA',4,1),(5,'2026-03-01','ACTIVA',5,2);
/*!40000 ALTER TABLE `reservas_activos_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_rol` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'CLIENTE'),(2,'EMPLEADO'),(3,'ADMIN'),(4,'HIPERVISOR'),(5,'SOPORTE'),(7,'CONTADOR');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'gestion_de_campanas_mercadeo'
--

--
-- Dumping routines for database 'gestion_de_campanas_mercadeo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-05-06  0:57:32
