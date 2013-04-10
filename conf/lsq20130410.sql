/*
Navicat MySQL Data Transfer

Source Server         : Jason
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : lsq

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-04-10 14:30:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `msgId` int(11) NOT NULL,
  `msgTypeId` int(11) default NULL,
  `msgConctent` text,
  `publisherName` varchar(20) default NULL,
  `publisherPhone` varchar(20) default NULL,
  `publishTime` varchar(20) default NULL,
  `msgRemark` text,
  `msgStatus` int(11) default '0' COMMENT '0-待审核 1-已发布 2-未通过 3-已删除',
  PRIMARY KEY  (`msgId`),
  KEY `FK_message_messageType` (`msgTypeId`),
  CONSTRAINT `FK_message_messageType` FOREIGN KEY (`msgTypeId`) REFERENCES `messagetype` (`msgTypeId`)
);

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `messagetype`
-- ----------------------------
DROP TABLE IF EXISTS `messagetype`;
CREATE TABLE `messagetype` (
  `msgTypeId` int(11) NOT NULL,
  `msgTypeName` varchar(20) default NULL,
  `msgTypeRemark` text,
  `msgTypeStatus` int(11) default '0' COMMENT '0-可用 1-不可用',
  PRIMARY KEY  (`msgTypeId`)
);

-- ----------------------------
-- Records of messagetype
-- ----------------------------

-- ----------------------------
-- Table structure for `power`
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power` (
  `powerId` int(11) NOT NULL,
  `powerName` varchar(20) default NULL,
  `powerStatus` int(11) default NULL,
  `powerRemark` text,
  PRIMARY KEY  (`powerId`)
) ;

-- ----------------------------
-- Records of power
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL,
  `roleName` varchar(20) default NULL,
  `roleStatus` int(11) default NULL,
  `roleRemark` text,
  PRIMARY KEY  (`roleId`)
) ;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for `role_power`
-- ----------------------------
DROP TABLE IF EXISTS `role_power`;
CREATE TABLE `role_power` (
  `powerId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL,
  PRIMARY KEY  (`powerId`,`roleId`),
  KEY `FK_role_power2` (`roleId`),
  CONSTRAINT `FK_role_power` FOREIGN KEY (`powerId`) REFERENCES `power` (`powerId`),
  CONSTRAINT `FK_role_power2` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ;

-- ----------------------------
-- Records of role_power
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `roleId` int(11) default NULL,
  `userName` varchar(20) default NULL,
  `userPassword` varchar(20) default NULL,
  `userRemark` text,
  `userStatus` int(11) default '0' COMMENT '0-可用 1-不可用',
  PRIMARY KEY  (`userId`),
  KEY `FK_user_role` (`roleId`),
  CONSTRAINT `FK_user_role` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ;

-- ----------------------------
-- Records of user
-- ----------------------------
