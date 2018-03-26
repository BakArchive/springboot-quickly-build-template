
drop database if EXISTS demo;
create database demo charset utf8;
use demo;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `name` varchar(255) DEFAULT NULL COMMENT '部门名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '部门描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL COMMENT '部门id',
  `hobby` varchar(255) DEFAULT NULL COMMENT '爱好',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;
