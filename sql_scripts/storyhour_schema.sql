CREATE DATABASE IF NOT EXISTS `storyhour`;
USE `storyhour`;

DROP TABLE IF EXISTS `story`;

CREATE TABLE `story` (
  `id` int NOT NULL AUTO_INCREMENT,
  `story_name` varchar(60) NOT NULL,
  `description` TINYBLOB,
  `audio_link` varchar(120) NOT NULL,
  `youtube_link` varchar(120),
  PRIMARY KEY (`id`,`story_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

