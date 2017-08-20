CREATE DATABASE t_20170819_test CHARACTER SET utf8;

use t_20170819_test;

/*
Navicat MySQL Data Transfer

Source Server         : xueyao.org
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : itcast

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-08-19 15:24:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
	`pid` int(11) NOT NULL AUTO_INCREMENT,
	`pname` varchar(20) DEFAULT NULL,
	`price` double DEFAULT NULL,
	`category_id` varchar(32) DEFAULT NULL,
	PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE product ADD status INT NOT NULL DEFAULT 1 COMMENT "商品显示状态";
-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '联想', '500', 'c001');
INSERT INTO `product` VALUES ('2', '海尔', '500', 'c001');
INSERT INTO `product` VALUES ('3', '雷神', '500', 'c001');
INSERT INTO `product` VALUES ('4', 'JACK JONES', '500', 'c002');
INSERT INTO `product` VALUES ('5', '真维斯', '500', 'c002');
INSERT INTO `product` VALUES ('6', '花花公子', '500', 'c002');
INSERT INTO `product` VALUES ('7', '劲霸', '500', 'c002');
INSERT INTO `product` VALUES ('8', '香奈儿', '500', 'c003');
INSERT INTO `product` VALUES ('9', '相宜本草', '500', 'c003');
INSERT INTO `product` VALUES ('10', '面霸', '500', 'c003');
INSERT INTO `product` VALUES ('11', '好想你枣', '500', 'c004');
INSERT INTO `product` VALUES ('12', '香飘飘奶茶', '500', 'c005');
INSERT INTO `product` VALUES ('13', '果9', '500', null);
SET FOREIGN_KEY_CHECKS=1;
