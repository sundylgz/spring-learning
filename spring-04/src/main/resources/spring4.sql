/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : spring4

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 06/10/2018 21:54:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `username` varchar(128) DEFAULT NULL,
  `balance` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of account
-- ----------------------------
BEGIN;
INSERT INTO `account` VALUES ('AA', 1300);
COMMIT;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `isbn` varchar(11) DEFAULT NULL,
  `book_name` varchar(128) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of book
-- ----------------------------
BEGIN;
INSERT INTO `book` VALUES ('1001', 'java', 100);
INSERT INTO `book` VALUES ('1002', 'c', 200);
COMMIT;

-- ----------------------------
-- Table structure for book_stock
-- ----------------------------
DROP TABLE IF EXISTS `book_stock`;
CREATE TABLE `book_stock` (
  `isbn` varchar(64) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of book_stock
-- ----------------------------
BEGIN;
INSERT INTO `book_stock` VALUES ('1001', 17);
INSERT INTO `book_stock` VALUES ('1002', 10);
COMMIT;

-- ----------------------------
-- Table structure for departments
-- ----------------------------
DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of employees
-- ----------------------------
BEGIN;
INSERT INTO `employees` VALUES (2, 'Jack', 'admin@qq.com', 5);
INSERT INTO `employees` VALUES (3, 'Jack1', 'admin@qq.com', 5);
INSERT INTO `employees` VALUES (4, 'Jack', 'admin@qq.com', 5);
INSERT INTO `employees` VALUES (5, 'AA', 'aa@atguigu.com', 1);
INSERT INTO `employees` VALUES (6, 'BB', 'bb@atguigu.com', 2);
INSERT INTO `employees` VALUES (7, 'CC', 'cc@atguigu.com', 3);
INSERT INTO `employees` VALUES (8, 'DD', 'dd@atguigu.com', 3);
INSERT INTO `employees` VALUES (9, 'EE', 'ee@atguigu.com', 2);
INSERT INTO `employees` VALUES (10, 'XYZ', 'xyz@sina.com', 3);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
