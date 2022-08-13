CREATE TABLE `pelicularesponse` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Country` varchar(255) DEFAULT NULL,
  `Language` varchar(255) DEFAULT NULL,
  `Rated` varchar(255) DEFAULT NULL,
  `Title` varchar(255) DEFAULT NULL,
  `Year` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `votante` (
  `tipo_votante` varchar(31) NOT NULL,
  `id_votante` int NOT NULL AUTO_INCREMENT,
  `esDestacado` bit(1) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `promedio` double DEFAULT NULL,
  `grado` double DEFAULT NULL,
  `esAbanderado` bit(1) DEFAULT NULL,
  `pagaAportes` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id_votante`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `votacion` (
  `id_votacion` int NOT NULL AUTO_INCREMENT,
  `pelicula_id` int DEFAULT NULL,
  `votante_id_votante` int DEFAULT NULL,
  PRIMARY KEY (`id_votacion`),
  KEY `FK_htcnjfdc4780lg9x2xkjlbqd6` (`pelicula_id`),
  KEY `FK_otwoudrlgm9uaeh64u10lrqf6` (`votante_id_votante`),
  CONSTRAINT `FK_htcnjfdc4780lg9x2xkjlbqd6` FOREIGN KEY (`pelicula_id`) REFERENCES `pelicularesponse` (`id`),
  CONSTRAINT `FK_otwoudrlgm9uaeh64u10lrqf6` FOREIGN KEY (`votante_id_votante`) REFERENCES `votante` (`id_votante`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

