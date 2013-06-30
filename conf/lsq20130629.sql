/*
Navicat MySQL Data Transfer

Source Server         : Jason
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : lsq

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-06-29 20:00:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `info`
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `infoId` bigint(11) NOT NULL default '0',
  `infoTitle` varchar(50) character set utf8 default NULL,
  `infoContent` text character set utf8,
  `infoRemark` text character set utf8,
  `infoDate` varchar(255) default NULL,
  `userId` int(11) unsigned default NULL,
  `infoType` int(10) default '0' COMMENT '0-商家广告 1-校园资讯',
  `infoState` int(11) default '0' COMMENT '0-可用 1-删除',
  PRIMARY KEY  (`infoId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES ('1', '学校启动“我的中国梦”主题教育活动', '学校启动“我的中国梦”主题教育活动', null, '2013-05-22', '2', '1', '0');
INSERT INTO `info` VALUES ('2', '吉软国际IT人才培训学校 JR1318班 顺利开班！', '吉软国际IT人才培训学校 JR1318班 顺利开班！', null, '2013-06-22', '2', '0', '0');
INSERT INTO `info` VALUES ('3', '吉软国际IT人才培训学校 JR1318班 顺利开班！', '吉软国际IT人才培训学校 JR1318班 顺利开班！', null, '2013-06-22', '2', '0', '0');
INSERT INTO `info` VALUES ('4', '吉软国际IT人才培训学校 JR1318班 顺利开班！', '吉软国际IT人才培训学校 JR1318班 顺利开班！', null, '2013-06-22', '2', '0', '0');
INSERT INTO `info` VALUES ('5', '吉软国际IT人才培训学校 JR1318班 顺利开班', '吉软国际IT人才培训学校 JR1318班 顺利开班！', null, '2013-06-22', '2', '0', '0');
INSERT INTO `info` VALUES ('6', '学校启动“我的中国梦”主题教育活动', '学校启动“我的中国梦”主题教育活动', null, '2013-05-22', '2', '1', '0');
INSERT INTO `info` VALUES ('7', '学校启动“我的中国梦”主题教育活动', '学校启动“我的中国梦”主题教育活动', null, '2013-05-22', '2', '1', '0');
INSERT INTO `info` VALUES ('8', '学校启动“我的中国梦”主题教育活动', '学校启动“我的中国梦”主题教育活动', null, '2013-05-22', '2', '1', '0');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `msgId` bigint(11) NOT NULL,
  `msgTypeId` bigint(11) default NULL,
  `msgConctent` text collate utf8_unicode_ci,
  `publisherName` varchar(20) character set latin1 default NULL,
  `publisherPhone` varchar(20) character set latin1 default NULL,
  `publishTime` varchar(20) character set latin1 default NULL,
  `msgRemark` text character set latin1,
  `msgStatus` int(11) default '0' COMMENT '0-待审核 1-已发布 2-未通过 3-已删除',
  PRIMARY KEY  (`msgId`),
  KEY `FK_message_messageType` (`msgTypeId`),
  CONSTRAINT `FK_message_messageType` FOREIGN KEY (`msgTypeId`) REFERENCES `messagetype` (`msgTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '1', '今日9时不慎将一部白色款iPhone4遗落在理工西区主教1002室，望拾到者归还...', '12', '18743021323', '2013-05-19 01:05:22', '', '1');
INSERT INTO `message` VALUES ('2', '1', '今天中午将书包遗落在西区第三食堂，没有贵重物品，希望好心人帮我找一下,谢...', '21', '18604499421', '2013-05-19 01:06:22', '', '1');
INSERT INTO `message` VALUES ('3', '1', '先本人手中有一考研证继续转让,望有意者尽快联系我,电话：18704493213', 'aa', '13280803423', '2013-05-19 01:04:25', '', '1');
INSERT INTO `message` VALUES ('4', '1', '想要购买一把二手椅子,不知道哪位同学想出售，可以联系我,QQ:1297197234', 'cc', '13523410880', '2013-04-13 10:51:59', '', '1');
INSERT INTO `message` VALUES ('5', '1', '端午节，去哪里？长白山3日游，有组团的童鞋可以联系一下！QQ:237505474', 'rr', '18744339841', '2013-05-19 01:04:30', '', '1');
INSERT INTO `message` VALUES ('7', '1', '今晚6点，东区二教8楼，adobe公司招聘会，有意者可以准时与会~', 'bb', '18654453367', '2013-04-14 02:24:54', '', '1');
INSERT INTO `message` VALUES ('8', '1', '明天是我哥们大亮的生日，在这里祝我哥们生日快乐，前途似锦~小亮', 'jj', '1322341453', '2013-04-14 06:15:02', '', '1');

-- ----------------------------
-- Table structure for `messagetype`
-- ----------------------------
DROP TABLE IF EXISTS `messagetype`;
CREATE TABLE `messagetype` (
  `msgTypeId` bigint(11) NOT NULL,
  `msgTypeName` varchar(20) character set utf8 default NULL,
  `msgTypeRemark` text character set utf8,
  `msgTypeStatus` int(11) default '0' COMMENT '0-可用 1-不可用',
  PRIMARY KEY  (`msgTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of messagetype
-- ----------------------------
INSERT INTO `messagetype` VALUES ('1', '1', '1', '0');
INSERT INTO `messagetype` VALUES ('2', '2', '校园资讯', '0');
INSERT INTO `messagetype` VALUES ('3', '3', '商家广告', '0');

-- ----------------------------
-- Table structure for `power`
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power` (
  `powerId` bigint(11) NOT NULL,
  `powerName` varchar(20) character set utf8 default NULL,
  `powerAction` varchar(40) character set utf8 NOT NULL,
  `powerStatus` int(11) default NULL,
  `powerRemark` text character set utf8,
  PRIMARY KEY  (`powerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of power
-- ----------------------------
INSERT INTO `power` VALUES ('1', '创建普通管理员', 'createOrdin.action', '0', null);
INSERT INTO `power` VALUES ('2', '冻结管理员账号', 'editOrdinAdminAction.action?userStatus=0', '0', null);
INSERT INTO `power` VALUES ('3', '恢复管理员账号', 'editOrdinAdminAction.action?userStatus=1', '0', null);
INSERT INTO `power` VALUES ('4', '修改密码', 'updatePassword.jsp', '0', null);
INSERT INTO `power` VALUES ('5', '信息审核', 'updateMessageStatus.jsp', '0', null);
INSERT INTO `power` VALUES ('6', '系统设置', 'systemSettings.jsp', '0', null);
INSERT INTO `power` VALUES ('7', '搜索信息', 'qureyMessage.jsp', '0', null);
INSERT INTO `power` VALUES ('8', '发布信息', 'insertmessage.jsp', '0', null);

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` bigint(11) NOT NULL,
  `roleName` varchar(20) character set utf8 default NULL,
  `roleStatus` int(11) default NULL,
  `roleRemark` text,
  PRIMARY KEY  (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员', '0', null);
INSERT INTO `role` VALUES ('2', '普通管理员', '0', null);

-- ----------------------------
-- Table structure for `role_power`
-- ----------------------------
DROP TABLE IF EXISTS `role_power`;
CREATE TABLE `role_power` (
  `powerId` bigint(11) NOT NULL,
  `roleId` bigint(11) NOT NULL,
  PRIMARY KEY  (`powerId`,`roleId`),
  KEY `FK_role_power2` (`roleId`),
  CONSTRAINT `FK_role_power` FOREIGN KEY (`powerId`) REFERENCES `power` (`powerId`),
  CONSTRAINT `FK_role_power2` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of role_power
-- ----------------------------
INSERT INTO `role_power` VALUES ('1', '1');
INSERT INTO `role_power` VALUES ('2', '1');
INSERT INTO `role_power` VALUES ('3', '1');
INSERT INTO `role_power` VALUES ('4', '1');
INSERT INTO `role_power` VALUES ('5', '1');
INSERT INTO `role_power` VALUES ('6', '1');
INSERT INTO `role_power` VALUES ('7', '1');
INSERT INTO `role_power` VALUES ('8', '1');
INSERT INTO `role_power` VALUES ('4', '2');
INSERT INTO `role_power` VALUES ('5', '2');
INSERT INTO `role_power` VALUES ('6', '2');
INSERT INTO `role_power` VALUES ('7', '2');
INSERT INTO `role_power` VALUES ('8', '2');

-- ----------------------------
-- Table structure for `settings`
-- ----------------------------
DROP TABLE IF EXISTS `settings`;
CREATE TABLE `settings` (
  `settingsId` int(11) NOT NULL auto_increment,
  `settingsName` varchar(255) default NULL,
  `settingsValue` int(11) NOT NULL default '0',
  `settingsRemark` text,
  PRIMARY KEY  (`settingsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of settings
-- ----------------------------
INSERT INTO `settings` VALUES ('1', 'SendMsgNum', '3', '每人每天发送信息此时限制');
INSERT INTO `settings` VALUES ('2', 'PerMsgWords', '2', '每条信息字数限制');
INSERT INTO `settings` VALUES ('3', 'DefaultPasswords', '12345', '默认密码');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` bigint(11) NOT NULL,
  `roleId` bigint(11) default NULL,
  `userName` varchar(20) default NULL,
  `userPassword` varchar(20) default NULL,
  `userRemark` text,
  `userStatus` int(11) default '0' COMMENT '0-å¯ç”¨ 1-ä¸å¯ç”¨',
  `userRealName` varchar(20) default NULL,
  `userCreateTime` varchar(50) default NULL,
  PRIMARY KEY  (`userId`),
  KEY `FK_user_role` (`roleId`),
  CONSTRAINT `FK_user_role` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 'lsq', 'lsq', null, '0', null, null);
INSERT INTO `user` VALUES ('13661787505780000', '2', '943632', '111111', null, '0', '颐和园', null);
INSERT INTO `user` VALUES ('13677506095810000', '2', '189073', '111111', null, '0', '银行业', null);
INSERT INTO `user` VALUES ('13677512463460000', '2', '826621', '111111', null, '1', '又黑又', null);
INSERT INTO `user` VALUES ('13677512523510001', '2', '847980', '111111', null, '0', '银行业', null);
INSERT INTO `user` VALUES ('13677529406620000', '2', '806478', '111111', null, '0', '于火焰', null);
INSERT INTO `user` VALUES ('13677529433930001', '2', '247536', '111111', null, '0', '怡红院', null);
INSERT INTO `user` VALUES ('13677537219540000', '2', '454434', '111111', null, '0', '御花园', null);
INSERT INTO `user` VALUES ('13677569978990000', '2', '353740', '111111', null, '0', '于海洋', '2013-05-05 20:29:57');
INSERT INTO `user` VALUES ('13677570467810001', '2', '1', '1', null, '0', '2', '2013-05-05 20:30:46');
