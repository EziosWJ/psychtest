/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50642
Source Host           : localhost:3306
Source Database       : psychtest

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2018-12-30 20:12:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wx_list
-- ----------------------------
DROP TABLE IF EXISTS `wx_list`;
CREATE TABLE `wx_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `redirect_url` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `custom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wx_list
-- ----------------------------
INSERT INTO `wx_list` VALUES ('1', 'ewqeq', null, null, '12', '2');
INSERT INTO `wx_list` VALUES ('2', 'ewqeq', 'www.adsadsadsaffffffffff', 'aaaaaaa', '12', '2');
INSERT INTO `wx_list` VALUES ('3', 'ewqeq', 'www.adsadsadsaffffffffff', 'aaaaaaa', '12', '3');
INSERT INTO `wx_list` VALUES ('5', 'ewqeq', 'www.adsadsadsaffffffffff', 'aaaaaaa', '12', '1');
