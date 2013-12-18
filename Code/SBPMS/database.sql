create database sbpms;

use sbpms;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `e_mail` varchar(50) NOT NULL,
  `role` int(11) NOT NULL,
  `report_to` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (1,'ROOT','123','123@123.com',0,0);
UNLOCK TABLES;

