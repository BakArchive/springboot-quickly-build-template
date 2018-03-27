
drop database if EXISTS demo;
create database demo charset utf8;
use demo;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yh_dept
-- ----------------------------
DROP TABLE IF EXISTS `yh_dept`;
CREATE TABLE `yh_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `num` int(11) DEFAULT NULL COMMENT '部门排序码',
  `pid` int(11) DEFAULT NULL COMMENT '父部门',
  `simplename` varchar(255) DEFAULT NULL COMMENT '部门简称',
  `fullname` varchar(255) DEFAULT NULL COMMENT '部门全称',
  `tips` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for yh_menu
-- ----------------------------
DROP TABLE IF EXISTS `yh_menu`;
CREATE TABLE `yh_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `code` varchar(255) DEFAULT NULL COMMENT '菜单码',
  `pcode` varchar(255) DEFAULT NULL COMMENT '父菜单码',
  `name` varchar(255) DEFAULT NULL COMMENT '菜单名',
  `url` varchar(255) DEFAULT NULL COMMENT '菜单访问地址',
  `status` int(255) DEFAULT NULL COMMENT '菜单状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for yh_relation
-- ----------------------------
DROP TABLE IF EXISTS `yh_relation`;
CREATE TABLE `yh_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色菜单关联id',
  `menuid` int(11) DEFAULT NULL COMMENT '菜单id',
  `roleid` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for yh_role
-- ----------------------------
DROP TABLE IF EXISTS `yh_role`;
CREATE TABLE `yh_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `num` int(11) DEFAULT NULL COMMENT '角色排序码',
  `pid` int(11) DEFAULT NULL COMMENT '父角色',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `deptid` int(11) DEFAULT NULL COMMENT '角色所属部门',
  `tips` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for yh_user
-- ----------------------------
DROP TABLE IF EXISTS `yh_user`;
CREATE TABLE `yh_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `account` varchar(255) DEFAULT NULL COMMENT '用户名',
  `userpass` varchar(255) DEFAULT NULL COMMENT '密码',
  `realname` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `img` varchar(255) DEFAULT NULL COMMENT '头像',
  `birthd` date DEFAULT NULL COMMENT '生日',
  `roleid` int(11) DEFAULT NULL COMMENT '角色id',
  `deptid` int(11) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;
