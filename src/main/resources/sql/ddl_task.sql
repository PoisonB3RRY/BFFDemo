create database BFF;

CREATE TABLE `bff`.`task` (
  `id` BIGINT(32) NOT NULL AUTO_INCREMENT,
  `business_id` VARCHAR(64) NULL,
  `request_id` VARCHAR(64) NULL,
  `task_id` VARCHAR(64) NULL,
  `create_user` VARCHAR(45) NULL,
  `create_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `update_user` VARCHAR(45) NULL,
  `update_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));


CREATE TABLE `bff`.`order_info` (
  `id` BIGINT(32) NOT NULL AUTO_INCREMENT,
  `task_id` VARCHAR(64) NULL,
  `order_type` VARCHAR(128) NULL,
  `params` LONGTEXT NULL,
  `create_user` VARCHAR(45) NULL,
  `create_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `update_user` VARCHAR(45) NULL,
  `update_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));
