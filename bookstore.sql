/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 50650
 Source Host           : localhost:3306
 Source Schema         : jdbc

 Target Server Type    : MySQL
 Target Server Version : 50650
 File Encoding         : 65001

 Date: 06/11/2021 13:42:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bookstore
-- ----------------------------
DROP TABLE IF EXISTS `bookstore`;
CREATE TABLE `bookstore`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bk_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `bk_author` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `press` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `amount` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bookstore
-- ----------------------------
INSERT INTO `bookstore` VALUES (1, '数据结构', '严蔚敏', '人民邮电出版社', 600);
INSERT INTO `bookstore` VALUES (2, 'javaweb程序设计任务教程', '黑马程序员1', '人民邮电出版社1', 594);
INSERT INTO `bookstore` VALUES (3, 'java基础案例教程1', '黑马程序员2', '人民邮电出版社2', 600);
INSERT INTO `bookstore` VALUES (4, 'javaEE企业应用开发', '黑马程序员3', '人民邮电出版社3', 600);
INSERT INTO `bookstore` VALUES (5, 'java基础案例教程2', '黑马程序员4', '人民邮电出版社4', 600);
INSERT INTO `bookstore` VALUES (6, '高等数学', '黑马程序员5', '人民邮电出版社5', 600);
INSERT INTO `bookstore` VALUES (7, '计算机导论', '黑马程序员1', '人民邮电出版社1', 600);
INSERT INTO `bookstore` VALUES (8, '计算机网络', '谢希仁', '电子工业出版社', 600);

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `jobs` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `phone` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES (1, 'joy', 'doctor', '11111111111');
INSERT INTO `t_customer` VALUES (2, 'jack', 'teacher', '12222222222');
INSERT INTO `t_customer` VALUES (3, 'tom', 'worker', '13333333333');
INSERT INTO `t_customer` VALUES (4, 'Spring', 'teacher', '14444444444');
INSERT INTO `t_customer` VALUES (5, '张三', 'doctor', '15555555555');
INSERT INTO `t_customer` VALUES (6, '李四', '教师', '16666666666');
INSERT INTO `t_customer` VALUES (7, '李白', '刺客', '17777777777');
INSERT INTO `t_customer` VALUES (8, 'Mybatis', 'teacher', '18888888888');

-- ----------------------------
-- Table structure for t_transition
-- ----------------------------
DROP TABLE IF EXISTS `t_transition`;
CREATE TABLE `t_transition`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `bookstore_id` int(32) NULL DEFAULT NULL,
  `customer_id` int(32) NULL DEFAULT NULL,
  `number` int(32) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `bookstore_id`(`bookstore_id`) USING BTREE,
  INDEX `customer_id`(`customer_id`) USING BTREE,
  CONSTRAINT `t_transition_ibfk_1` FOREIGN KEY (`bookstore_id`) REFERENCES `bookstore` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `t_transition_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `t_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_transition
-- ----------------------------
INSERT INTO `t_transition` VALUES (1, 3, 8, 1);
INSERT INTO `t_transition` VALUES (2, 4, 8, 1);
INSERT INTO `t_transition` VALUES (3, 5, 8, 1);
INSERT INTO `t_transition` VALUES (4, 2, 3, 1);
INSERT INTO `t_transition` VALUES (5, 3, 3, 1);
INSERT INTO `t_transition` VALUES (6, 4, 3, 1);
INSERT INTO `t_transition` VALUES (7, 2, 7, 1);
INSERT INTO `t_transition` VALUES (8, 3, 7, 1);
INSERT INTO `t_transition` VALUES (9, 3, 8, 1);
INSERT INTO `t_transition` VALUES (10, 2, 1, 1);
INSERT INTO `t_transition` VALUES (11, 3, 1, 1);
INSERT INTO `t_transition` VALUES (12, 4, 1, 1);
INSERT INTO `t_transition` VALUES (13, 5, 1, 1);
INSERT INTO `t_transition` VALUES (14, 2, 2, 1);
INSERT INTO `t_transition` VALUES (15, 3, 2, 1);
INSERT INTO `t_transition` VALUES (16, 4, 2, 1);
INSERT INTO `t_transition` VALUES (17, 5, 2, 1);
INSERT INTO `t_transition` VALUES (18, 2, 5, 26);
INSERT INTO `t_transition` VALUES (19, 3, 5, 1);
INSERT INTO `t_transition` VALUES (20, 4, 5, 1);
INSERT INTO `t_transition` VALUES (21, 5, 5, 1);
INSERT INTO `t_transition` VALUES (22, 2, 4, 1);
INSERT INTO `t_transition` VALUES (23, 3, 4, 1);
INSERT INTO `t_transition` VALUES (24, 4, 4, 1);
INSERT INTO `t_transition` VALUES (25, 5, 4, 1);
INSERT INTO `t_transition` VALUES (26, 2, 6, 1);
INSERT INTO `t_transition` VALUES (27, 3, 6, 1);
INSERT INTO `t_transition` VALUES (28, 4, 6, 1);
INSERT INTO `t_transition` VALUES (29, 5, 6, 1);

SET FOREIGN_KEY_CHECKS = 1;
