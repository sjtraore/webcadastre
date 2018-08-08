-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: webc
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `idCity` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCity`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'Aguel\'hoc'),(2,'Araouane'),(3,'Azawad'),(4,'Bafoulabé'),(5,'Baguineda'),(6,'Bamako'),(7,'Bamba'),(8,'Banani'),(9,'Banamba'),(10,'Bandiagara'),(11,'Bankass'),(12,'Barouéli'),(13,'Bla'),(14,'Bougouni'),(15,'Bourem'),(16,'Diamou'),(17,'Djenné'),(18,'Djenné-Djenno'),(19,'Essouk'),(20,'Fana'),(21,'Gao'),(22,'Gargando'),(23,'Gossi'),(24,'Goumbou'),(25,'Guégnéka'),(26,'Hamdallaye'),(27,'Hombori'),(28,'Kadiolo'),(29,'Karakoro'),(30,'Kati'),(31,'Kayes'),(32,'Kéniéba'),(33,'Kidal'),(34,'Kita'),(35,'Kolokani'),(36,'Koniakary'),(37,'Koulikoro'),(38,'Koumantou'),(39,'Koutiala'),(40,'Kéniéba'),(41,'Léré'),(42,'Macina'),(43,'Markala'),(44,'Mopti'),(45,'Médine'),(46,'Nara'),(47,'Niafunké'),(48,'Niéna'),(49,'Niono'),(50,'Nioro du Sahel'),(51,'Sadiola'),(52,'San'),(53,'Sangha'),(54,'Siby'),(55,'Sikasso'),(56,'Sitakili'),(57,'Ségou'),(58,'Taghaza'),(59,'Taoudeni'),(60,'Tessalit'),(61,'Tombola'),(62,'Tombouctou'),(63,'Tominian'),(64,'Toukoto'),(65,'Yanfolila'),(66,'Yorosso'),(67,'Yélimané');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-08 16:34:58
