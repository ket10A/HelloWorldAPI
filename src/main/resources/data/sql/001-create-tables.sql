DROP TABLE IF EXISTS `MySchema`.`message`;

CREATE TABLE `MySchema`.`message`
(
    `id`      int NOT NULL,
    `message` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
