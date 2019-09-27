/*
 Navicat Premium Data Transfer

 Source Server         : xx
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : 127.0.0.1:3306
 Source Schema         : sicau_sx

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 27/09/2019 19:39:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);
INSERT INTO `hibernate_sequence` VALUES (14);

-- ----------------------------
-- Table structure for sx_dict_campus
-- ----------------------------
DROP TABLE IF EXISTS `sx_dict_campus`;
CREATE TABLE `sx_dict_campus`  (
  `sx_dict_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_dict_campus` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '校区',
  PRIMARY KEY (`sx_dict_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_dict_campus
-- ----------------------------
INSERT INTO `sx_dict_campus` VALUES (1, '雅安校区');
INSERT INTO `sx_dict_campus` VALUES (2, '成都校区');
INSERT INTO `sx_dict_campus` VALUES (3, '都江堰校区');

-- ----------------------------
-- Table structure for sx_dict_clazz
-- ----------------------------
DROP TABLE IF EXISTS `sx_dict_clazz`;
CREATE TABLE `sx_dict_clazz`  (
  `sx_dict_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_dict_major_id` int(11) UNSIGNED NOT NULL COMMENT '专业ID',
  `sx_dict_clazz_count` int(4) UNSIGNED NOT NULL COMMENT '班级个数',
  PRIMARY KEY (`sx_dict_id`) USING BTREE,
  INDEX `fk_major`(`sx_dict_major_id`) USING BTREE,
  CONSTRAINT `fk_major` FOREIGN KEY (`sx_dict_major_id`) REFERENCES `sx_dict_major` (`sx_dict_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 310 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_dict_clazz
-- ----------------------------
INSERT INTO `sx_dict_clazz` VALUES (1, 1, 5);
INSERT INTO `sx_dict_clazz` VALUES (2, 2, 5);
INSERT INTO `sx_dict_clazz` VALUES (3, 3, 5);
INSERT INTO `sx_dict_clazz` VALUES (4, 4, 5);
INSERT INTO `sx_dict_clazz` VALUES (5, 5, 5);
INSERT INTO `sx_dict_clazz` VALUES (6, 6, 5);
INSERT INTO `sx_dict_clazz` VALUES (7, 7, 5);
INSERT INTO `sx_dict_clazz` VALUES (8, 8, 5);
INSERT INTO `sx_dict_clazz` VALUES (9, 9, 5);
INSERT INTO `sx_dict_clazz` VALUES (10, 10, 5);
INSERT INTO `sx_dict_clazz` VALUES (11, 11, 5);
INSERT INTO `sx_dict_clazz` VALUES (12, 12, 5);
INSERT INTO `sx_dict_clazz` VALUES (13, 13, 5);
INSERT INTO `sx_dict_clazz` VALUES (14, 14, 5);
INSERT INTO `sx_dict_clazz` VALUES (15, 15, 5);
INSERT INTO `sx_dict_clazz` VALUES (16, 16, 5);
INSERT INTO `sx_dict_clazz` VALUES (17, 17, 5);
INSERT INTO `sx_dict_clazz` VALUES (18, 18, 5);
INSERT INTO `sx_dict_clazz` VALUES (19, 19, 5);
INSERT INTO `sx_dict_clazz` VALUES (20, 20, 5);
INSERT INTO `sx_dict_clazz` VALUES (21, 21, 5);
INSERT INTO `sx_dict_clazz` VALUES (22, 22, 5);
INSERT INTO `sx_dict_clazz` VALUES (23, 23, 5);
INSERT INTO `sx_dict_clazz` VALUES (24, 24, 5);
INSERT INTO `sx_dict_clazz` VALUES (25, 25, 5);
INSERT INTO `sx_dict_clazz` VALUES (26, 26, 5);
INSERT INTO `sx_dict_clazz` VALUES (27, 27, 5);
INSERT INTO `sx_dict_clazz` VALUES (28, 28, 5);
INSERT INTO `sx_dict_clazz` VALUES (29, 29, 5);
INSERT INTO `sx_dict_clazz` VALUES (30, 30, 5);
INSERT INTO `sx_dict_clazz` VALUES (31, 31, 5);
INSERT INTO `sx_dict_clazz` VALUES (32, 32, 5);
INSERT INTO `sx_dict_clazz` VALUES (33, 33, 5);
INSERT INTO `sx_dict_clazz` VALUES (34, 34, 5);
INSERT INTO `sx_dict_clazz` VALUES (35, 35, 5);
INSERT INTO `sx_dict_clazz` VALUES (36, 36, 5);
INSERT INTO `sx_dict_clazz` VALUES (37, 37, 5);
INSERT INTO `sx_dict_clazz` VALUES (38, 38, 5);
INSERT INTO `sx_dict_clazz` VALUES (39, 39, 5);
INSERT INTO `sx_dict_clazz` VALUES (40, 40, 5);
INSERT INTO `sx_dict_clazz` VALUES (41, 41, 5);
INSERT INTO `sx_dict_clazz` VALUES (42, 42, 5);
INSERT INTO `sx_dict_clazz` VALUES (43, 43, 5);
INSERT INTO `sx_dict_clazz` VALUES (44, 44, 5);
INSERT INTO `sx_dict_clazz` VALUES (45, 45, 5);
INSERT INTO `sx_dict_clazz` VALUES (46, 46, 5);
INSERT INTO `sx_dict_clazz` VALUES (47, 47, 5);
INSERT INTO `sx_dict_clazz` VALUES (48, 48, 5);
INSERT INTO `sx_dict_clazz` VALUES (49, 49, 5);
INSERT INTO `sx_dict_clazz` VALUES (50, 50, 5);
INSERT INTO `sx_dict_clazz` VALUES (51, 51, 5);
INSERT INTO `sx_dict_clazz` VALUES (52, 52, 5);
INSERT INTO `sx_dict_clazz` VALUES (53, 53, 5);
INSERT INTO `sx_dict_clazz` VALUES (54, 54, 5);
INSERT INTO `sx_dict_clazz` VALUES (55, 55, 5);
INSERT INTO `sx_dict_clazz` VALUES (56, 56, 5);
INSERT INTO `sx_dict_clazz` VALUES (57, 57, 5);
INSERT INTO `sx_dict_clazz` VALUES (58, 58, 5);
INSERT INTO `sx_dict_clazz` VALUES (59, 59, 5);
INSERT INTO `sx_dict_clazz` VALUES (60, 60, 5);
INSERT INTO `sx_dict_clazz` VALUES (61, 61, 5);
INSERT INTO `sx_dict_clazz` VALUES (62, 62, 5);
INSERT INTO `sx_dict_clazz` VALUES (63, 63, 5);
INSERT INTO `sx_dict_clazz` VALUES (64, 64, 5);
INSERT INTO `sx_dict_clazz` VALUES (65, 65, 5);
INSERT INTO `sx_dict_clazz` VALUES (66, 66, 5);
INSERT INTO `sx_dict_clazz` VALUES (67, 67, 5);
INSERT INTO `sx_dict_clazz` VALUES (68, 68, 5);
INSERT INTO `sx_dict_clazz` VALUES (69, 69, 5);
INSERT INTO `sx_dict_clazz` VALUES (70, 70, 5);
INSERT INTO `sx_dict_clazz` VALUES (71, 71, 5);
INSERT INTO `sx_dict_clazz` VALUES (72, 72, 5);
INSERT INTO `sx_dict_clazz` VALUES (73, 73, 5);
INSERT INTO `sx_dict_clazz` VALUES (74, 74, 5);
INSERT INTO `sx_dict_clazz` VALUES (75, 75, 5);
INSERT INTO `sx_dict_clazz` VALUES (76, 76, 5);
INSERT INTO `sx_dict_clazz` VALUES (77, 77, 5);
INSERT INTO `sx_dict_clazz` VALUES (78, 78, 5);
INSERT INTO `sx_dict_clazz` VALUES (79, 79, 5);
INSERT INTO `sx_dict_clazz` VALUES (80, 80, 5);
INSERT INTO `sx_dict_clazz` VALUES (81, 81, 5);
INSERT INTO `sx_dict_clazz` VALUES (82, 82, 5);
INSERT INTO `sx_dict_clazz` VALUES (83, 83, 5);
INSERT INTO `sx_dict_clazz` VALUES (84, 84, 5);
INSERT INTO `sx_dict_clazz` VALUES (85, 85, 5);
INSERT INTO `sx_dict_clazz` VALUES (86, 86, 5);
INSERT INTO `sx_dict_clazz` VALUES (87, 87, 5);
INSERT INTO `sx_dict_clazz` VALUES (88, 88, 5);
INSERT INTO `sx_dict_clazz` VALUES (89, 89, 5);
INSERT INTO `sx_dict_clazz` VALUES (90, 90, 5);
INSERT INTO `sx_dict_clazz` VALUES (91, 91, 5);
INSERT INTO `sx_dict_clazz` VALUES (92, 92, 5);
INSERT INTO `sx_dict_clazz` VALUES (93, 93, 5);
INSERT INTO `sx_dict_clazz` VALUES (94, 94, 5);
INSERT INTO `sx_dict_clazz` VALUES (95, 95, 5);
INSERT INTO `sx_dict_clazz` VALUES (96, 96, 5);
INSERT INTO `sx_dict_clazz` VALUES (97, 97, 5);
INSERT INTO `sx_dict_clazz` VALUES (98, 98, 5);
INSERT INTO `sx_dict_clazz` VALUES (99, 99, 5);
INSERT INTO `sx_dict_clazz` VALUES (100, 100, 5);
INSERT INTO `sx_dict_clazz` VALUES (101, 101, 5);
INSERT INTO `sx_dict_clazz` VALUES (102, 102, 5);
INSERT INTO `sx_dict_clazz` VALUES (103, 103, 5);
INSERT INTO `sx_dict_clazz` VALUES (104, 104, 5);
INSERT INTO `sx_dict_clazz` VALUES (105, 105, 5);
INSERT INTO `sx_dict_clazz` VALUES (106, 106, 5);
INSERT INTO `sx_dict_clazz` VALUES (107, 107, 5);
INSERT INTO `sx_dict_clazz` VALUES (108, 108, 5);
INSERT INTO `sx_dict_clazz` VALUES (109, 109, 5);
INSERT INTO `sx_dict_clazz` VALUES (110, 110, 5);
INSERT INTO `sx_dict_clazz` VALUES (111, 111, 5);
INSERT INTO `sx_dict_clazz` VALUES (112, 112, 5);
INSERT INTO `sx_dict_clazz` VALUES (113, 113, 5);
INSERT INTO `sx_dict_clazz` VALUES (114, 114, 5);
INSERT INTO `sx_dict_clazz` VALUES (115, 115, 5);
INSERT INTO `sx_dict_clazz` VALUES (116, 116, 5);
INSERT INTO `sx_dict_clazz` VALUES (117, 117, 5);
INSERT INTO `sx_dict_clazz` VALUES (118, 118, 5);
INSERT INTO `sx_dict_clazz` VALUES (119, 119, 5);
INSERT INTO `sx_dict_clazz` VALUES (120, 120, 5);
INSERT INTO `sx_dict_clazz` VALUES (121, 121, 5);
INSERT INTO `sx_dict_clazz` VALUES (122, 122, 5);
INSERT INTO `sx_dict_clazz` VALUES (123, 123, 5);
INSERT INTO `sx_dict_clazz` VALUES (124, 124, 5);
INSERT INTO `sx_dict_clazz` VALUES (125, 125, 5);
INSERT INTO `sx_dict_clazz` VALUES (126, 126, 5);
INSERT INTO `sx_dict_clazz` VALUES (127, 127, 5);
INSERT INTO `sx_dict_clazz` VALUES (128, 128, 5);
INSERT INTO `sx_dict_clazz` VALUES (129, 129, 5);
INSERT INTO `sx_dict_clazz` VALUES (130, 130, 5);
INSERT INTO `sx_dict_clazz` VALUES (131, 131, 5);
INSERT INTO `sx_dict_clazz` VALUES (132, 132, 5);
INSERT INTO `sx_dict_clazz` VALUES (133, 133, 5);
INSERT INTO `sx_dict_clazz` VALUES (134, 134, 5);
INSERT INTO `sx_dict_clazz` VALUES (135, 135, 5);
INSERT INTO `sx_dict_clazz` VALUES (136, 136, 5);
INSERT INTO `sx_dict_clazz` VALUES (137, 137, 5);
INSERT INTO `sx_dict_clazz` VALUES (138, 138, 5);
INSERT INTO `sx_dict_clazz` VALUES (139, 139, 5);
INSERT INTO `sx_dict_clazz` VALUES (140, 140, 5);
INSERT INTO `sx_dict_clazz` VALUES (141, 141, 5);
INSERT INTO `sx_dict_clazz` VALUES (142, 142, 5);
INSERT INTO `sx_dict_clazz` VALUES (143, 143, 5);
INSERT INTO `sx_dict_clazz` VALUES (144, 144, 5);
INSERT INTO `sx_dict_clazz` VALUES (145, 145, 5);
INSERT INTO `sx_dict_clazz` VALUES (146, 146, 5);
INSERT INTO `sx_dict_clazz` VALUES (147, 147, 5);
INSERT INTO `sx_dict_clazz` VALUES (148, 148, 5);
INSERT INTO `sx_dict_clazz` VALUES (149, 149, 5);
INSERT INTO `sx_dict_clazz` VALUES (150, 150, 5);
INSERT INTO `sx_dict_clazz` VALUES (151, 151, 5);
INSERT INTO `sx_dict_clazz` VALUES (152, 152, 5);
INSERT INTO `sx_dict_clazz` VALUES (153, 153, 5);
INSERT INTO `sx_dict_clazz` VALUES (154, 154, 5);
INSERT INTO `sx_dict_clazz` VALUES (155, 155, 5);
INSERT INTO `sx_dict_clazz` VALUES (156, 156, 5);
INSERT INTO `sx_dict_clazz` VALUES (157, 157, 5);
INSERT INTO `sx_dict_clazz` VALUES (158, 158, 5);
INSERT INTO `sx_dict_clazz` VALUES (159, 159, 5);
INSERT INTO `sx_dict_clazz` VALUES (160, 160, 5);
INSERT INTO `sx_dict_clazz` VALUES (161, 161, 5);
INSERT INTO `sx_dict_clazz` VALUES (162, 162, 5);
INSERT INTO `sx_dict_clazz` VALUES (163, 163, 5);
INSERT INTO `sx_dict_clazz` VALUES (164, 164, 5);
INSERT INTO `sx_dict_clazz` VALUES (165, 165, 5);
INSERT INTO `sx_dict_clazz` VALUES (166, 166, 5);
INSERT INTO `sx_dict_clazz` VALUES (167, 167, 5);
INSERT INTO `sx_dict_clazz` VALUES (168, 168, 5);
INSERT INTO `sx_dict_clazz` VALUES (169, 169, 5);
INSERT INTO `sx_dict_clazz` VALUES (170, 170, 5);
INSERT INTO `sx_dict_clazz` VALUES (171, 171, 5);
INSERT INTO `sx_dict_clazz` VALUES (172, 172, 5);
INSERT INTO `sx_dict_clazz` VALUES (173, 173, 5);
INSERT INTO `sx_dict_clazz` VALUES (174, 174, 5);
INSERT INTO `sx_dict_clazz` VALUES (175, 175, 5);
INSERT INTO `sx_dict_clazz` VALUES (176, 176, 5);
INSERT INTO `sx_dict_clazz` VALUES (177, 177, 5);
INSERT INTO `sx_dict_clazz` VALUES (178, 178, 5);
INSERT INTO `sx_dict_clazz` VALUES (179, 179, 5);
INSERT INTO `sx_dict_clazz` VALUES (180, 180, 5);
INSERT INTO `sx_dict_clazz` VALUES (181, 181, 5);
INSERT INTO `sx_dict_clazz` VALUES (182, 182, 5);
INSERT INTO `sx_dict_clazz` VALUES (183, 183, 5);
INSERT INTO `sx_dict_clazz` VALUES (184, 184, 5);
INSERT INTO `sx_dict_clazz` VALUES (185, 185, 5);
INSERT INTO `sx_dict_clazz` VALUES (186, 186, 5);
INSERT INTO `sx_dict_clazz` VALUES (187, 187, 5);
INSERT INTO `sx_dict_clazz` VALUES (188, 188, 5);
INSERT INTO `sx_dict_clazz` VALUES (189, 189, 5);
INSERT INTO `sx_dict_clazz` VALUES (190, 190, 5);
INSERT INTO `sx_dict_clazz` VALUES (191, 191, 5);
INSERT INTO `sx_dict_clazz` VALUES (192, 192, 5);
INSERT INTO `sx_dict_clazz` VALUES (193, 193, 5);
INSERT INTO `sx_dict_clazz` VALUES (194, 194, 5);
INSERT INTO `sx_dict_clazz` VALUES (195, 195, 5);
INSERT INTO `sx_dict_clazz` VALUES (196, 196, 5);
INSERT INTO `sx_dict_clazz` VALUES (197, 197, 5);
INSERT INTO `sx_dict_clazz` VALUES (198, 198, 5);
INSERT INTO `sx_dict_clazz` VALUES (199, 199, 5);
INSERT INTO `sx_dict_clazz` VALUES (200, 200, 5);
INSERT INTO `sx_dict_clazz` VALUES (201, 201, 5);
INSERT INTO `sx_dict_clazz` VALUES (202, 202, 5);
INSERT INTO `sx_dict_clazz` VALUES (203, 203, 5);
INSERT INTO `sx_dict_clazz` VALUES (204, 204, 5);
INSERT INTO `sx_dict_clazz` VALUES (205, 205, 5);
INSERT INTO `sx_dict_clazz` VALUES (206, 206, 5);
INSERT INTO `sx_dict_clazz` VALUES (207, 207, 5);
INSERT INTO `sx_dict_clazz` VALUES (208, 208, 5);
INSERT INTO `sx_dict_clazz` VALUES (209, 209, 5);
INSERT INTO `sx_dict_clazz` VALUES (210, 210, 5);
INSERT INTO `sx_dict_clazz` VALUES (211, 211, 5);
INSERT INTO `sx_dict_clazz` VALUES (212, 212, 5);
INSERT INTO `sx_dict_clazz` VALUES (213, 213, 5);
INSERT INTO `sx_dict_clazz` VALUES (214, 214, 5);
INSERT INTO `sx_dict_clazz` VALUES (215, 215, 5);
INSERT INTO `sx_dict_clazz` VALUES (216, 216, 5);
INSERT INTO `sx_dict_clazz` VALUES (217, 217, 5);
INSERT INTO `sx_dict_clazz` VALUES (218, 218, 5);
INSERT INTO `sx_dict_clazz` VALUES (219, 219, 5);
INSERT INTO `sx_dict_clazz` VALUES (220, 220, 5);
INSERT INTO `sx_dict_clazz` VALUES (221, 221, 5);
INSERT INTO `sx_dict_clazz` VALUES (222, 222, 5);
INSERT INTO `sx_dict_clazz` VALUES (223, 223, 5);
INSERT INTO `sx_dict_clazz` VALUES (224, 224, 5);
INSERT INTO `sx_dict_clazz` VALUES (225, 225, 5);
INSERT INTO `sx_dict_clazz` VALUES (226, 226, 5);
INSERT INTO `sx_dict_clazz` VALUES (227, 227, 5);
INSERT INTO `sx_dict_clazz` VALUES (228, 228, 5);
INSERT INTO `sx_dict_clazz` VALUES (229, 229, 5);
INSERT INTO `sx_dict_clazz` VALUES (230, 230, 5);
INSERT INTO `sx_dict_clazz` VALUES (231, 231, 5);
INSERT INTO `sx_dict_clazz` VALUES (232, 232, 5);
INSERT INTO `sx_dict_clazz` VALUES (233, 233, 5);
INSERT INTO `sx_dict_clazz` VALUES (234, 234, 5);
INSERT INTO `sx_dict_clazz` VALUES (235, 235, 5);
INSERT INTO `sx_dict_clazz` VALUES (236, 236, 5);
INSERT INTO `sx_dict_clazz` VALUES (237, 237, 5);
INSERT INTO `sx_dict_clazz` VALUES (238, 238, 5);
INSERT INTO `sx_dict_clazz` VALUES (239, 239, 5);
INSERT INTO `sx_dict_clazz` VALUES (240, 240, 5);
INSERT INTO `sx_dict_clazz` VALUES (241, 241, 5);
INSERT INTO `sx_dict_clazz` VALUES (242, 242, 5);
INSERT INTO `sx_dict_clazz` VALUES (243, 243, 5);
INSERT INTO `sx_dict_clazz` VALUES (244, 244, 5);
INSERT INTO `sx_dict_clazz` VALUES (245, 245, 5);
INSERT INTO `sx_dict_clazz` VALUES (246, 246, 5);
INSERT INTO `sx_dict_clazz` VALUES (247, 247, 5);
INSERT INTO `sx_dict_clazz` VALUES (248, 248, 5);
INSERT INTO `sx_dict_clazz` VALUES (249, 249, 5);
INSERT INTO `sx_dict_clazz` VALUES (250, 250, 5);
INSERT INTO `sx_dict_clazz` VALUES (251, 251, 5);
INSERT INTO `sx_dict_clazz` VALUES (252, 252, 5);
INSERT INTO `sx_dict_clazz` VALUES (253, 253, 5);
INSERT INTO `sx_dict_clazz` VALUES (254, 254, 5);
INSERT INTO `sx_dict_clazz` VALUES (255, 255, 5);
INSERT INTO `sx_dict_clazz` VALUES (256, 256, 5);
INSERT INTO `sx_dict_clazz` VALUES (257, 257, 5);
INSERT INTO `sx_dict_clazz` VALUES (258, 258, 5);
INSERT INTO `sx_dict_clazz` VALUES (259, 259, 5);
INSERT INTO `sx_dict_clazz` VALUES (260, 260, 5);
INSERT INTO `sx_dict_clazz` VALUES (261, 261, 5);
INSERT INTO `sx_dict_clazz` VALUES (262, 262, 5);
INSERT INTO `sx_dict_clazz` VALUES (263, 263, 5);
INSERT INTO `sx_dict_clazz` VALUES (264, 264, 5);
INSERT INTO `sx_dict_clazz` VALUES (265, 265, 5);
INSERT INTO `sx_dict_clazz` VALUES (266, 266, 5);
INSERT INTO `sx_dict_clazz` VALUES (267, 267, 5);
INSERT INTO `sx_dict_clazz` VALUES (268, 268, 5);
INSERT INTO `sx_dict_clazz` VALUES (269, 269, 5);
INSERT INTO `sx_dict_clazz` VALUES (270, 270, 5);
INSERT INTO `sx_dict_clazz` VALUES (271, 271, 5);
INSERT INTO `sx_dict_clazz` VALUES (272, 272, 5);
INSERT INTO `sx_dict_clazz` VALUES (273, 273, 5);
INSERT INTO `sx_dict_clazz` VALUES (274, 274, 5);
INSERT INTO `sx_dict_clazz` VALUES (275, 275, 5);
INSERT INTO `sx_dict_clazz` VALUES (276, 276, 5);
INSERT INTO `sx_dict_clazz` VALUES (277, 277, 5);
INSERT INTO `sx_dict_clazz` VALUES (278, 278, 5);
INSERT INTO `sx_dict_clazz` VALUES (279, 279, 5);
INSERT INTO `sx_dict_clazz` VALUES (280, 280, 5);
INSERT INTO `sx_dict_clazz` VALUES (281, 281, 5);
INSERT INTO `sx_dict_clazz` VALUES (282, 282, 5);
INSERT INTO `sx_dict_clazz` VALUES (283, 283, 5);
INSERT INTO `sx_dict_clazz` VALUES (284, 284, 5);
INSERT INTO `sx_dict_clazz` VALUES (285, 285, 5);
INSERT INTO `sx_dict_clazz` VALUES (286, 286, 5);
INSERT INTO `sx_dict_clazz` VALUES (287, 287, 5);
INSERT INTO `sx_dict_clazz` VALUES (288, 288, 5);
INSERT INTO `sx_dict_clazz` VALUES (289, 289, 5);
INSERT INTO `sx_dict_clazz` VALUES (290, 290, 5);
INSERT INTO `sx_dict_clazz` VALUES (291, 291, 5);
INSERT INTO `sx_dict_clazz` VALUES (292, 292, 5);
INSERT INTO `sx_dict_clazz` VALUES (293, 293, 5);
INSERT INTO `sx_dict_clazz` VALUES (294, 294, 5);
INSERT INTO `sx_dict_clazz` VALUES (295, 295, 5);
INSERT INTO `sx_dict_clazz` VALUES (296, 296, 5);
INSERT INTO `sx_dict_clazz` VALUES (297, 297, 5);
INSERT INTO `sx_dict_clazz` VALUES (298, 298, 5);
INSERT INTO `sx_dict_clazz` VALUES (299, 299, 5);
INSERT INTO `sx_dict_clazz` VALUES (300, 300, 5);
INSERT INTO `sx_dict_clazz` VALUES (301, 301, 5);
INSERT INTO `sx_dict_clazz` VALUES (302, 302, 5);
INSERT INTO `sx_dict_clazz` VALUES (303, 303, 5);
INSERT INTO `sx_dict_clazz` VALUES (304, 304, 5);
INSERT INTO `sx_dict_clazz` VALUES (305, 305, 5);
INSERT INTO `sx_dict_clazz` VALUES (306, 306, 5);
INSERT INTO `sx_dict_clazz` VALUES (307, 307, 5);
INSERT INTO `sx_dict_clazz` VALUES (308, 308, 5);
INSERT INTO `sx_dict_clazz` VALUES (309, 309, 5);

-- ----------------------------
-- Table structure for sx_dict_college
-- ----------------------------
DROP TABLE IF EXISTS `sx_dict_college`;
CREATE TABLE `sx_dict_college`  (
  `sx_dict_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_dict_campus_id` int(11) UNSIGNED DEFAULT NULL,
  `sx_dict_college` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学院',
  PRIMARY KEY (`sx_dict_id`, `sx_dict_college`) USING BTREE,
  INDEX `sx_dict_id`(`sx_dict_id`) USING BTREE,
  INDEX `fk_campus`(`sx_dict_campus_id`) USING BTREE,
  CONSTRAINT `fk_campus` FOREIGN KEY (`sx_dict_campus_id`) REFERENCES `sx_dict_campus` (`sx_dict_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_dict_college
-- ----------------------------
INSERT INTO `sx_dict_college` VALUES (1, 1, '城乡建设学院');
INSERT INTO `sx_dict_college` VALUES (2, 1, '动物科技学院');
INSERT INTO `sx_dict_college` VALUES (4, 1, '法学院');
INSERT INTO `sx_dict_college` VALUES (15, 1, '旅游学院');
INSERT INTO `sx_dict_college` VALUES (16, 1, '农学院');
INSERT INTO `sx_dict_college` VALUES (17, 1, '人文学院');
INSERT INTO `sx_dict_college` VALUES (18, 1, '商学院');
INSERT INTO `sx_dict_college` VALUES (19, 1, '生命科学学院');
INSERT INTO `sx_dict_college` VALUES (20, 1, '食品学院');
INSERT INTO `sx_dict_college` VALUES (24, 1, '土木工程学院');
INSERT INTO `sx_dict_college` VALUES (27, 1, '信息与工程技术学院');
INSERT INTO `sx_dict_college` VALUES (31, 1, '政治学院');
INSERT INTO `sx_dict_college` VALUES (33, 1, '资源环境学院');
INSERT INTO `sx_dict_college` VALUES (9, 2, '建筑与城乡规划学院');
INSERT INTO `sx_dict_college` VALUES (10, 2, '经济管理学院');
INSERT INTO `sx_dict_college` VALUES (11, 2, '经济学院');
INSERT INTO `sx_dict_college` VALUES (12, 2, '理学院');
INSERT INTO `sx_dict_college` VALUES (13, 2, '林学园艺学院');
INSERT INTO `sx_dict_college` VALUES (14, 2, '林学院');
INSERT INTO `sx_dict_college` VALUES (21, 2, '水利水电学院');
INSERT INTO `sx_dict_college` VALUES (22, 2, '体育学院');
INSERT INTO `sx_dict_college` VALUES (25, 2, '文法学院');
INSERT INTO `sx_dict_college` VALUES (28, 2, '艺术与传媒学院');
INSERT INTO `sx_dict_college` VALUES (30, 2, '园艺学院');
INSERT INTO `sx_dict_college` VALUES (32, 2, '职业技术师范学院');
INSERT INTO `sx_dict_college` VALUES (34, 2, '资源学院');
INSERT INTO `sx_dict_college` VALUES (3, 3, '动物医学院');
INSERT INTO `sx_dict_college` VALUES (5, 3, '风景园林学院');
INSERT INTO `sx_dict_college` VALUES (6, 3, '管理学院');
INSERT INTO `sx_dict_college` VALUES (7, 3, '环境学院');
INSERT INTO `sx_dict_college` VALUES (8, 3, '机电学院');
INSERT INTO `sx_dict_college` VALUES (26, 3, '信息工程学院');
INSERT INTO `sx_dict_college` VALUES (29, 3, '艺术与体育学院');

-- ----------------------------
-- Table structure for sx_dict_grade
-- ----------------------------
DROP TABLE IF EXISTS `sx_dict_grade`;
CREATE TABLE `sx_dict_grade`  (
  `sx_dict_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_dict_grade` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级',
  `sx_dict_is_open` tinyint(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '班级是否开放 0 未开放  1-开放',
  PRIMARY KEY (`sx_dict_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 94 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_dict_grade
-- ----------------------------
INSERT INTO `sx_dict_grade` VALUES (7, '2014', 1);
INSERT INTO `sx_dict_grade` VALUES (8, '2015', 1);
INSERT INTO `sx_dict_grade` VALUES (9, '2016', 1);
INSERT INTO `sx_dict_grade` VALUES (10, '2017', 1);
INSERT INTO `sx_dict_grade` VALUES (11, '2018', 1);
INSERT INTO `sx_dict_grade` VALUES (12, '2019', 0);
INSERT INTO `sx_dict_grade` VALUES (13, '2020', 0);
INSERT INTO `sx_dict_grade` VALUES (14, '2021', 0);
INSERT INTO `sx_dict_grade` VALUES (15, '2022', 0);
INSERT INTO `sx_dict_grade` VALUES (16, '2023', 0);
INSERT INTO `sx_dict_grade` VALUES (17, '2024', 0);
INSERT INTO `sx_dict_grade` VALUES (18, '2025', 0);
INSERT INTO `sx_dict_grade` VALUES (19, '2026', 0);
INSERT INTO `sx_dict_grade` VALUES (20, '2027', 0);
INSERT INTO `sx_dict_grade` VALUES (21, '2028', 0);
INSERT INTO `sx_dict_grade` VALUES (22, '2029', 0);
INSERT INTO `sx_dict_grade` VALUES (23, '2030', 0);
INSERT INTO `sx_dict_grade` VALUES (24, '2031', 0);
INSERT INTO `sx_dict_grade` VALUES (25, '2032', 0);
INSERT INTO `sx_dict_grade` VALUES (26, '2033', 0);
INSERT INTO `sx_dict_grade` VALUES (27, '2034', 0);
INSERT INTO `sx_dict_grade` VALUES (28, '2035', 0);
INSERT INTO `sx_dict_grade` VALUES (29, '2036', 0);
INSERT INTO `sx_dict_grade` VALUES (30, '2037', 0);
INSERT INTO `sx_dict_grade` VALUES (31, '2038', 0);
INSERT INTO `sx_dict_grade` VALUES (32, '2039', 0);
INSERT INTO `sx_dict_grade` VALUES (33, '2040', 0);
INSERT INTO `sx_dict_grade` VALUES (34, '2041', 0);
INSERT INTO `sx_dict_grade` VALUES (35, '2042', 0);
INSERT INTO `sx_dict_grade` VALUES (36, '2043', 0);
INSERT INTO `sx_dict_grade` VALUES (37, '2044', 0);
INSERT INTO `sx_dict_grade` VALUES (38, '2045', 0);
INSERT INTO `sx_dict_grade` VALUES (39, '2046', 0);
INSERT INTO `sx_dict_grade` VALUES (40, '2047', 0);
INSERT INTO `sx_dict_grade` VALUES (41, '2048', 0);
INSERT INTO `sx_dict_grade` VALUES (42, '2049', 0);
INSERT INTO `sx_dict_grade` VALUES (43, '2050', 0);
INSERT INTO `sx_dict_grade` VALUES (44, '2051', 0);
INSERT INTO `sx_dict_grade` VALUES (45, '2052', 0);
INSERT INTO `sx_dict_grade` VALUES (46, '2053', 0);
INSERT INTO `sx_dict_grade` VALUES (47, '2054', 0);
INSERT INTO `sx_dict_grade` VALUES (48, '2055', 0);
INSERT INTO `sx_dict_grade` VALUES (49, '2056', 0);
INSERT INTO `sx_dict_grade` VALUES (50, '2057', 0);
INSERT INTO `sx_dict_grade` VALUES (51, '2058', 0);
INSERT INTO `sx_dict_grade` VALUES (52, '2059', 0);
INSERT INTO `sx_dict_grade` VALUES (53, '2060', 0);
INSERT INTO `sx_dict_grade` VALUES (54, '2061', 0);
INSERT INTO `sx_dict_grade` VALUES (55, '2062', 0);
INSERT INTO `sx_dict_grade` VALUES (56, '2063', 0);
INSERT INTO `sx_dict_grade` VALUES (57, '2064', 0);
INSERT INTO `sx_dict_grade` VALUES (58, '2065', 0);
INSERT INTO `sx_dict_grade` VALUES (59, '2066', 0);
INSERT INTO `sx_dict_grade` VALUES (60, '2067', 0);
INSERT INTO `sx_dict_grade` VALUES (61, '2068', 0);
INSERT INTO `sx_dict_grade` VALUES (62, '2069', 0);
INSERT INTO `sx_dict_grade` VALUES (63, '2070', 0);
INSERT INTO `sx_dict_grade` VALUES (64, '2071', 0);
INSERT INTO `sx_dict_grade` VALUES (65, '2072', 0);
INSERT INTO `sx_dict_grade` VALUES (66, '2073', 0);
INSERT INTO `sx_dict_grade` VALUES (67, '2074', 0);
INSERT INTO `sx_dict_grade` VALUES (68, '2075', 0);
INSERT INTO `sx_dict_grade` VALUES (69, '2076', 0);
INSERT INTO `sx_dict_grade` VALUES (70, '2077', 0);
INSERT INTO `sx_dict_grade` VALUES (71, '2078', 0);
INSERT INTO `sx_dict_grade` VALUES (72, '2079', 0);
INSERT INTO `sx_dict_grade` VALUES (73, '2080', 0);
INSERT INTO `sx_dict_grade` VALUES (74, '2081', 0);
INSERT INTO `sx_dict_grade` VALUES (75, '2082', 0);
INSERT INTO `sx_dict_grade` VALUES (76, '2083', 0);
INSERT INTO `sx_dict_grade` VALUES (77, '2084', 0);
INSERT INTO `sx_dict_grade` VALUES (78, '2085', 0);
INSERT INTO `sx_dict_grade` VALUES (79, '2086', 0);
INSERT INTO `sx_dict_grade` VALUES (80, '2087', 0);
INSERT INTO `sx_dict_grade` VALUES (81, '2088', 0);
INSERT INTO `sx_dict_grade` VALUES (82, '2089', 0);
INSERT INTO `sx_dict_grade` VALUES (83, '2090', 0);
INSERT INTO `sx_dict_grade` VALUES (84, '2091', 0);
INSERT INTO `sx_dict_grade` VALUES (85, '2092', 0);
INSERT INTO `sx_dict_grade` VALUES (86, '2093', 0);
INSERT INTO `sx_dict_grade` VALUES (87, '2094', 0);
INSERT INTO `sx_dict_grade` VALUES (88, '2095', 0);
INSERT INTO `sx_dict_grade` VALUES (89, '2096', 0);
INSERT INTO `sx_dict_grade` VALUES (90, '2097', 0);
INSERT INTO `sx_dict_grade` VALUES (91, '2098', 0);
INSERT INTO `sx_dict_grade` VALUES (92, '2099', 0);
INSERT INTO `sx_dict_grade` VALUES (93, '2100', 0);

-- ----------------------------
-- Table structure for sx_dict_major
-- ----------------------------
DROP TABLE IF EXISTS `sx_dict_major`;
CREATE TABLE `sx_dict_major`  (
  `sx_dict_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_dict_college_id` int(11) UNSIGNED NOT NULL COMMENT '关联学院',
  `sx_dict_major` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专业',
  PRIMARY KEY (`sx_dict_id`) USING BTREE,
  INDEX `fk_college`(`sx_dict_college_id`) USING BTREE,
  CONSTRAINT `fk_college` FOREIGN KEY (`sx_dict_college_id`) REFERENCES `sx_dict_college` (`sx_dict_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 331 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_dict_major
-- ----------------------------
INSERT INTO `sx_dict_major` VALUES (1, 1, '城乡规划');
INSERT INTO `sx_dict_major` VALUES (2, 1, '地理信息系统教育');
INSERT INTO `sx_dict_major` VALUES (3, 1, '工业与民用建筑');
INSERT INTO `sx_dict_major` VALUES (4, 1, '环境工程(环境治理工程方向)');
INSERT INTO `sx_dict_major` VALUES (5, 1, '地理信息系统');
INSERT INTO `sx_dict_major` VALUES (6, 3, '动物医学');
INSERT INTO `sx_dict_major` VALUES (7, 3, '动物医学(本硕连读)');
INSERT INTO `sx_dict_major` VALUES (8, 3, '动物医学(动物检疫与进出口贸易方向)');
INSERT INTO `sx_dict_major` VALUES (9, 3, '动物医学(生物医学工程方向)');
INSERT INTO `sx_dict_major` VALUES (10, 3, '动物医学(兽医方向)');
INSERT INTO `sx_dict_major` VALUES (11, 3, '动物医学(小动物医学方向)');
INSERT INTO `sx_dict_major` VALUES (12, 3, '动物医学(药学方向)');
INSERT INTO `sx_dict_major` VALUES (13, 3, '动植物检疫');
INSERT INTO `sx_dict_major` VALUES (14, 3, '动植物检疫(动物检疫检验方向)');
INSERT INTO `sx_dict_major` VALUES (15, 3, '动植物检疫(水生动物疫病与检疫方向)');
INSERT INTO `sx_dict_major` VALUES (16, 3, '生物工程');
INSERT INTO `sx_dict_major` VALUES (17, 3, '生物工程(动物方向)');
INSERT INTO `sx_dict_major` VALUES (18, 3, '制药工程');
INSERT INTO `sx_dict_major` VALUES (19, 3, '动物医学(应用型)');
INSERT INTO `sx_dict_major` VALUES (20, 3, '生物工程(动物生物技术方向)');
INSERT INTO `sx_dict_major` VALUES (21, 3, '生物医学工程');
INSERT INTO `sx_dict_major` VALUES (22, 3, '药物制剂');
INSERT INTO `sx_dict_major` VALUES (23, 3, '药学');
INSERT INTO `sx_dict_major` VALUES (24, 3, '药学(中兽药学方向)');
INSERT INTO `sx_dict_major` VALUES (25, 4, '法学');
INSERT INTO `sx_dict_major` VALUES (26, 4, '社会工作');
INSERT INTO `sx_dict_major` VALUES (27, 4, '社会工作教育');
INSERT INTO `sx_dict_major` VALUES (28, 4, '政治学与行政学');
INSERT INTO `sx_dict_major` VALUES (29, 5, '景观建筑设计');
INSERT INTO `sx_dict_major` VALUES (30, 5, '环境设计');
INSERT INTO `sx_dict_major` VALUES (31, 5, '风景园林');
INSERT INTO `sx_dict_major` VALUES (32, 5, '生物技术(生物技术教育)');
INSERT INTO `sx_dict_major` VALUES (33, 5, '室内设计技术');
INSERT INTO `sx_dict_major` VALUES (34, 5, '艺术设计(环境艺术设计方向)');
INSERT INTO `sx_dict_major` VALUES (35, 5, '园林');
INSERT INTO `sx_dict_major` VALUES (36, 5, '园林(风景园林方向)');
INSERT INTO `sx_dict_major` VALUES (37, 5, '园林(景观设计方向)');
INSERT INTO `sx_dict_major` VALUES (38, 5, '园林(园林教育)');
INSERT INTO `sx_dict_major` VALUES (39, 5, '园林(绿化工程方向)');
INSERT INTO `sx_dict_major` VALUES (40, 5, '风景园林(景观建筑设计方向)');
INSERT INTO `sx_dict_major` VALUES (41, 6, '财务管理');
INSERT INTO `sx_dict_major` VALUES (42, 6, '财务管理(财务会计方向)');
INSERT INTO `sx_dict_major` VALUES (43, 6, '工商管理');
INSERT INTO `sx_dict_major` VALUES (44, 6, '农林经济管理');
INSERT INTO `sx_dict_major` VALUES (45, 6, '农林经济管理(本硕连读)');
INSERT INTO `sx_dict_major` VALUES (46, 6, '农林经济管理(企业管理方向)');
INSERT INTO `sx_dict_major` VALUES (47, 6, '市场营销');
INSERT INTO `sx_dict_major` VALUES (48, 6, '审计学');
INSERT INTO `sx_dict_major` VALUES (49, 7, '环境生态工程');
INSERT INTO `sx_dict_major` VALUES (50, 7, '环境科学');
INSERT INTO `sx_dict_major` VALUES (51, 7, '生态学');
INSERT INTO `sx_dict_major` VALUES (52, 7, '环境工程');
INSERT INTO `sx_dict_major` VALUES (53, 8, '农业机械化及其自动化(职教)');
INSERT INTO `sx_dict_major` VALUES (54, 8, '农业电气化与自动化');
INSERT INTO `sx_dict_major` VALUES (55, 8, '农业机械化及其自动化');
INSERT INTO `sx_dict_major` VALUES (56, 8, '农业机械化及其自动化(教育)');
INSERT INTO `sx_dict_major` VALUES (57, 8, '农业机械化及其自动化教育');
INSERT INTO `sx_dict_major` VALUES (58, 8, '农业电气化');
INSERT INTO `sx_dict_major` VALUES (59, 8, '电子科学与技术');
INSERT INTO `sx_dict_major` VALUES (60, 8, '机电设备维修与管理(专)');
INSERT INTO `sx_dict_major` VALUES (61, 8, '电气工程及其自动化');
INSERT INTO `sx_dict_major` VALUES (62, 9, '建筑学');
INSERT INTO `sx_dict_major` VALUES (63, 9, '城市规划');
INSERT INTO `sx_dict_major` VALUES (64, 9, '地理信息系统(测绘技术方向)');
INSERT INTO `sx_dict_major` VALUES (65, 9, '工程管理');
INSERT INTO `sx_dict_major` VALUES (66, 9, '工程管理(工程造价方向)');
INSERT INTO `sx_dict_major` VALUES (67, 9, '工程造价');
INSERT INTO `sx_dict_major` VALUES (68, 9, '地理信息科学(测绘工程方向)');
INSERT INTO `sx_dict_major` VALUES (69, 9, '园林技术');
INSERT INTO `sx_dict_major` VALUES (70, 10, '工商企业管理(专)');
INSERT INTO `sx_dict_major` VALUES (71, 10, '财务管理(专)');
INSERT INTO `sx_dict_major` VALUES (72, 10, '商业贸易(市场营销专)');
INSERT INTO `sx_dict_major` VALUES (73, 10, '土地资源管理(房地产经营与管理方向)');
INSERT INTO `sx_dict_major` VALUES (74, 10, '信息管理与信息系统');
INSERT INTO `sx_dict_major` VALUES (75, 10, '信息管理与信息系统(商务信息管理方向)');
INSERT INTO `sx_dict_major` VALUES (76, 10, '市场营销(专)');
INSERT INTO `sx_dict_major` VALUES (77, 11, '国际经济与贸易');
INSERT INTO `sx_dict_major` VALUES (78, 11, '国际经济与贸易(国际经济与商务方向)');
INSERT INTO `sx_dict_major` VALUES (79, 11, '金融学');
INSERT INTO `sx_dict_major` VALUES (80, 11, '经济学');
INSERT INTO `sx_dict_major` VALUES (81, 11, '投资学');
INSERT INTO `sx_dict_major` VALUES (82, 12, '化学生物学');
INSERT INTO `sx_dict_major` VALUES (83, 12, '应用化工技术(专)');
INSERT INTO `sx_dict_major` VALUES (84, 12, '信息与计算科学');
INSERT INTO `sx_dict_major` VALUES (85, 12, '应用化学');
INSERT INTO `sx_dict_major` VALUES (86, 12, '应用物理学');
INSERT INTO `sx_dict_major` VALUES (87, 13, '城市园林(专)');
INSERT INTO `sx_dict_major` VALUES (88, 13, '商品花卉(专)');
INSERT INTO `sx_dict_major` VALUES (89, 13, '室内装饰与家具设计(专)');
INSERT INTO `sx_dict_major` VALUES (90, 14, '产品设计(家具与室内设计方向)');
INSERT INTO `sx_dict_major` VALUES (91, 14, '林学');
INSERT INTO `sx_dict_major` VALUES (92, 14, '林学(本硕连读)');
INSERT INTO `sx_dict_major` VALUES (93, 14, '林学(经济林方向)');
INSERT INTO `sx_dict_major` VALUES (94, 14, '林学(特)');
INSERT INTO `sx_dict_major` VALUES (95, 14, '林学(林业生态工程方向)');
INSERT INTO `sx_dict_major` VALUES (96, 14, '林学(林业生态工程方向)');
INSERT INTO `sx_dict_major` VALUES (97, 14, '林学(森林资源管理、经济林方向)');
INSERT INTO `sx_dict_major` VALUES (98, 14, '林学(森林资源管理方向)');
INSERT INTO `sx_dict_major` VALUES (99, 14, '林学(森林资源经营管理方向)');
INSERT INTO `sx_dict_major` VALUES (100, 14, '木材科学与工程');
INSERT INTO `sx_dict_major` VALUES (101, 14, '木材科学与工程(家具与室内设计方向)');
INSERT INTO `sx_dict_major` VALUES (102, 14, '木材科学与工程(木材工业方向)');
INSERT INTO `sx_dict_major` VALUES (103, 14, '木材科学与工程(木材加工方向)');
INSERT INTO `sx_dict_major` VALUES (104, 14, '木材科学与工程(室内装饰与家具设计方向)');
INSERT INTO `sx_dict_major` VALUES (105, 14, '森林资源保护与游憩');
INSERT INTO `sx_dict_major` VALUES (106, 14, '森林资源保护与游憩(生态旅游方向)');
INSERT INTO `sx_dict_major` VALUES (107, 14, '森林保护');
INSERT INTO `sx_dict_major` VALUES (108, 14, '木材科学与工程(复合型)');
INSERT INTO `sx_dict_major` VALUES (109, 14, '水土保持与荒漠化防治');
INSERT INTO `sx_dict_major` VALUES (110, 14, '水土保持与荒漠化防治(水土保持规划设计)');
INSERT INTO `sx_dict_major` VALUES (111, 14, '艺术设计(家具与室内设计方向)');
INSERT INTO `sx_dict_major` VALUES (112, 14, '园林(园林规划设计)');
INSERT INTO `sx_dict_major` VALUES (113, 14, '园林(园林植物培育方向)');
INSERT INTO `sx_dict_major` VALUES (114, 14, '森林资源保护与游憩(森林保护方向)');
INSERT INTO `sx_dict_major` VALUES (115, 14, '产品设计');
INSERT INTO `sx_dict_major` VALUES (116, 15, '教育技术学');
INSERT INTO `sx_dict_major` VALUES (117, 15, '旅游管理');
INSERT INTO `sx_dict_major` VALUES (118, 15, '会展经济与管理');
INSERT INTO `sx_dict_major` VALUES (119, 15, '会展策划与管理(专)');
INSERT INTO `sx_dict_major` VALUES (120, 15, '森林保护(景区管理)');
INSERT INTO `sx_dict_major` VALUES (121, 15, '教育技术学教育');
INSERT INTO `sx_dict_major` VALUES (122, 15, '酒店管理');
INSERT INTO `sx_dict_major` VALUES (123, 15, '林学教育');
INSERT INTO `sx_dict_major` VALUES (124, 15, '旅游管理教育');
INSERT INTO `sx_dict_major` VALUES (125, 15, '森林资源保护与游憩(景区管理方向)');
INSERT INTO `sx_dict_major` VALUES (126, 15, '生物技术及应用');
INSERT INTO `sx_dict_major` VALUES (127, 15, '生物技术教育');
INSERT INTO `sx_dict_major` VALUES (128, 15, '酒店管理(专)');
INSERT INTO `sx_dict_major` VALUES (129, 15, '应用化工技术(专)');
INSERT INTO `sx_dict_major` VALUES (130, 15, '产品设计(旅游产品方向)');
INSERT INTO `sx_dict_major` VALUES (131, 15, '林学(教育)');
INSERT INTO `sx_dict_major` VALUES (132, 15, '旅游管理(教育)');
INSERT INTO `sx_dict_major` VALUES (133, 15, '酒店管理');
INSERT INTO `sx_dict_major` VALUES (134, 15, '旅游管理(职教)');
INSERT INTO `sx_dict_major` VALUES (135, 15, '酒店管理(教育)');
INSERT INTO `sx_dict_major` VALUES (136, 15, '酒店管理(职教)');
INSERT INTO `sx_dict_major` VALUES (137, 15, '应用化工技术');
INSERT INTO `sx_dict_major` VALUES (138, 16, '农学(农业产业化方向)');
INSERT INTO `sx_dict_major` VALUES (139, 16, '农学(药用植物方向)');
INSERT INTO `sx_dict_major` VALUES (140, 16, '农业推广(专)');
INSERT INTO `sx_dict_major` VALUES (141, 16, '种子系统工程');
INSERT INTO `sx_dict_major` VALUES (142, 16, '农学(本硕连读)');
INSERT INTO `sx_dict_major` VALUES (143, 16, '生物技术(植物方向)');
INSERT INTO `sx_dict_major` VALUES (144, 16, '农学(烟草方向)');
INSERT INTO `sx_dict_major` VALUES (145, 16, '生物技术');
INSERT INTO `sx_dict_major` VALUES (146, 16, '烟草');
INSERT INTO `sx_dict_major` VALUES (147, 16, '植物保护');
INSERT INTO `sx_dict_major` VALUES (148, 16, '植物保护(含植物检疫方向)');
INSERT INTO `sx_dict_major` VALUES (149, 16, '植物科学与技术');
INSERT INTO `sx_dict_major` VALUES (150, 16, '植物保护(农药方向)');
INSERT INTO `sx_dict_major` VALUES (151, 16, '中草药栽培与鉴定');
INSERT INTO `sx_dict_major` VALUES (152, 16, '种子科学与工程');
INSERT INTO `sx_dict_major` VALUES (153, 17, '人力资源管理(教育)');
INSERT INTO `sx_dict_major` VALUES (154, 17, '汉语言文学');
INSERT INTO `sx_dict_major` VALUES (155, 17, '人力资源管理');
INSERT INTO `sx_dict_major` VALUES (156, 17, '商务英语(专)');
INSERT INTO `sx_dict_major` VALUES (157, 17, '英语');
INSERT INTO `sx_dict_major` VALUES (158, 17, '英语(经贸英语方向)');
INSERT INTO `sx_dict_major` VALUES (159, 17, '文化产业管理');
INSERT INTO `sx_dict_major` VALUES (160, 17, '行政管理');
INSERT INTO `sx_dict_major` VALUES (161, 17, '人力资源管理(职教)');
INSERT INTO `sx_dict_major` VALUES (162, 17, '英语(旅游英语方向)');
INSERT INTO `sx_dict_major` VALUES (163, 18, '财务管理(专)');
INSERT INTO `sx_dict_major` VALUES (164, 18, '财务管理教育');
INSERT INTO `sx_dict_major` VALUES (165, 18, '电子商务');
INSERT INTO `sx_dict_major` VALUES (166, 18, '电子商务(专)');
INSERT INTO `sx_dict_major` VALUES (167, 18, '商务英语(专)');
INSERT INTO `sx_dict_major` VALUES (168, 18, '计算机科学与技术教育');
INSERT INTO `sx_dict_major` VALUES (169, 18, '商务英语');
INSERT INTO `sx_dict_major` VALUES (170, 18, '财务管理(财务会计方向)');
INSERT INTO `sx_dict_major` VALUES (171, 18, '工商企业管理');
INSERT INTO `sx_dict_major` VALUES (172, 18, '工商企业管理教育');
INSERT INTO `sx_dict_major` VALUES (173, 18, '国际经济与贸易教育');
INSERT INTO `sx_dict_major` VALUES (174, 18, '计算机科学与技术第二学位');
INSERT INTO `sx_dict_major` VALUES (175, 18, '市场营销(营销策划方向)');
INSERT INTO `sx_dict_major` VALUES (176, 18, '市场营销第二学位');
INSERT INTO `sx_dict_major` VALUES (177, 18, '市场营销(教育)');
INSERT INTO `sx_dict_major` VALUES (178, 18, '信息与计算科学(商务数据分析方向)');
INSERT INTO `sx_dict_major` VALUES (179, 18, '信息与计算科学(商务数据挖掘方向)');
INSERT INTO `sx_dict_major` VALUES (180, 18, '应用电子技术');
INSERT INTO `sx_dict_major` VALUES (181, 18, '市场营销');
INSERT INTO `sx_dict_major` VALUES (182, 18, '资产评估');
INSERT INTO `sx_dict_major` VALUES (183, 18, '财务管理(教育)');
INSERT INTO `sx_dict_major` VALUES (184, 18, '会计学');
INSERT INTO `sx_dict_major` VALUES (185, 18, '市场营销(职教)');
INSERT INTO `sx_dict_major` VALUES (186, 19, '生物工程');
INSERT INTO `sx_dict_major` VALUES (187, 19, '生物科学');
INSERT INTO `sx_dict_major` VALUES (188, 19, '生物科学(应用生物学方向)');
INSERT INTO `sx_dict_major` VALUES (189, 19, '应用生物科学');
INSERT INTO `sx_dict_major` VALUES (190, 19, '生物技术');
INSERT INTO `sx_dict_major` VALUES (191, 20, '包装工程');
INSERT INTO `sx_dict_major` VALUES (192, 20, '食品质量与安全(教育)');
INSERT INTO `sx_dict_major` VALUES (193, 20, '食品科学与工程(职教)');
INSERT INTO `sx_dict_major` VALUES (194, 20, '食品科学与工程(教育)');
INSERT INTO `sx_dict_major` VALUES (195, 20, '食品科学与工程');
INSERT INTO `sx_dict_major` VALUES (196, 20, '食品科学与工程(农畜产品贮藏与加工方向)');
INSERT INTO `sx_dict_major` VALUES (197, 20, '食品科学与工程(食品检测方向)');
INSERT INTO `sx_dict_major` VALUES (198, 20, '食品科学与工程(食品企业生产管理方向)');
INSERT INTO `sx_dict_major` VALUES (199, 20, '食品科学与工程教育');
INSERT INTO `sx_dict_major` VALUES (200, 20, '食品质量与安全');
INSERT INTO `sx_dict_major` VALUES (201, 20, '食品质量与安全(食品检测技术方向)');
INSERT INTO `sx_dict_major` VALUES (202, 20, '食品质量与安全(职教)');
INSERT INTO `sx_dict_major` VALUES (203, 21, '农业建筑环境与能源工程');
INSERT INTO `sx_dict_major` VALUES (204, 21, '农业建筑环境与能源工程教育');
INSERT INTO `sx_dict_major` VALUES (205, 21, '农业水利工程');
INSERT INTO `sx_dict_major` VALUES (206, 21, '水利水电工程');
INSERT INTO `sx_dict_major` VALUES (207, 21, '能源与动力工程');
INSERT INTO `sx_dict_major` VALUES (208, 21, '水利水电工程管理(专)');
INSERT INTO `sx_dict_major` VALUES (209, 21, '农业建筑环境与能源工程(教育)');
INSERT INTO `sx_dict_major` VALUES (210, 22, '社会体育指导与管理');
INSERT INTO `sx_dict_major` VALUES (211, 22, '体育教育');
INSERT INTO `sx_dict_major` VALUES (212, 22, '休闲体育');
INSERT INTO `sx_dict_major` VALUES (213, 24, '环境工程教育');
INSERT INTO `sx_dict_major` VALUES (214, 24, '建筑工程技术');
INSERT INTO `sx_dict_major` VALUES (215, 24, '土木工程');
INSERT INTO `sx_dict_major` VALUES (216, 24, '土木工程(房屋建筑工程方向)');
INSERT INTO `sx_dict_major` VALUES (217, 24, '土木工程(教育)');
INSERT INTO `sx_dict_major` VALUES (218, 24, '建筑工程技术(专)');
INSERT INTO `sx_dict_major` VALUES (219, 24, '给排水科学与工程');
INSERT INTO `sx_dict_major` VALUES (220, 24, '道路桥梁与渡河工程');
INSERT INTO `sx_dict_major` VALUES (221, 24, '土木工程(职教)');
INSERT INTO `sx_dict_major` VALUES (222, 25, '教育技术学(人文)');
INSERT INTO `sx_dict_major` VALUES (223, 25, '人力资源管理(公共人力资源管理方向)');
INSERT INTO `sx_dict_major` VALUES (224, 25, '英语(商务英语)专科');
INSERT INTO `sx_dict_major` VALUES (225, 25, '英语(外贸英语)专科');
INSERT INTO `sx_dict_major` VALUES (226, 25, '英语专科');
INSERT INTO `sx_dict_major` VALUES (227, 26, '计算机科学与技术(职教)');
INSERT INTO `sx_dict_major` VALUES (228, 26, '计算机科学与技术');
INSERT INTO `sx_dict_major` VALUES (229, 26, '计算机科学与技术教育');
INSERT INTO `sx_dict_major` VALUES (230, 26, '计算机科学与技术(教育)');
INSERT INTO `sx_dict_major` VALUES (231, 26, '信息管理与信息系统');
INSERT INTO `sx_dict_major` VALUES (232, 26, '物联网工程');
INSERT INTO `sx_dict_major` VALUES (233, 26, '软件开发与项目管理(专)');
INSERT INTO `sx_dict_major` VALUES (234, 26, '计算机信息管理(专)');
INSERT INTO `sx_dict_major` VALUES (235, 27, '农业电气化与自动化(机械电子工程方向)');
INSERT INTO `sx_dict_major` VALUES (236, 27, '农业电气化与自动化(计算机应用方向)');
INSERT INTO `sx_dict_major` VALUES (237, 27, '农业电气化与自动化(自动控制方向)');
INSERT INTO `sx_dict_major` VALUES (238, 27, '汽车营运与维修(专)');
INSERT INTO `sx_dict_major` VALUES (239, 28, '广告学');
INSERT INTO `sx_dict_major` VALUES (240, 28, '广告学(广告策划方向)');
INSERT INTO `sx_dict_major` VALUES (241, 28, '广告学(广告设计方向)');
INSERT INTO `sx_dict_major` VALUES (242, 28, '视觉传达设计');
INSERT INTO `sx_dict_major` VALUES (243, 28, '教育技术学');
INSERT INTO `sx_dict_major` VALUES (244, 28, '数字媒体艺术');
INSERT INTO `sx_dict_major` VALUES (245, 29, '广告(广告策划)');
INSERT INTO `sx_dict_major` VALUES (246, 29, '广告(广告设计)');
INSERT INTO `sx_dict_major` VALUES (247, 29, '社会体育');
INSERT INTO `sx_dict_major` VALUES (248, 29, '艺术设计(数码艺术设计方向)');
INSERT INTO `sx_dict_major` VALUES (249, 30, '茶学');
INSERT INTO `sx_dict_major` VALUES (250, 30, '茶学(茶文化方向)');
INSERT INTO `sx_dict_major` VALUES (251, 30, '茶学(茶叶加工与营销方向)');
INSERT INTO `sx_dict_major` VALUES (252, 30, '茶学(饮品科学与工程方向)');
INSERT INTO `sx_dict_major` VALUES (253, 30, '设施农业科学与工程');
INSERT INTO `sx_dict_major` VALUES (254, 30, '园艺(教育)');
INSERT INTO `sx_dict_major` VALUES (255, 30, '园艺');
INSERT INTO `sx_dict_major` VALUES (256, 30, '园艺(本硕连读)');
INSERT INTO `sx_dict_major` VALUES (257, 30, '园艺(观赏园艺)');
INSERT INTO `sx_dict_major` VALUES (258, 30, '园艺教育');
INSERT INTO `sx_dict_major` VALUES (259, 30, '园艺(蔬菜方向)');
INSERT INTO `sx_dict_major` VALUES (260, 30, '园艺(果树方向)');
INSERT INTO `sx_dict_major` VALUES (261, 30, '园艺(观赏园艺方向)');
INSERT INTO `sx_dict_major` VALUES (262, 31, '思想政治教育');
INSERT INTO `sx_dict_major` VALUES (263, 32, '城市园林职专');
INSERT INTO `sx_dict_major` VALUES (264, 32, '工商管理教育');
INSERT INTO `sx_dict_major` VALUES (265, 32, '工商企业管理职专');
INSERT INTO `sx_dict_major` VALUES (266, 32, '计算机应用与维护职专');
INSERT INTO `sx_dict_major` VALUES (267, 32, '农林经济管理教育');
INSERT INTO `sx_dict_major` VALUES (268, 32, '农业电气化与自动化教育');
INSERT INTO `sx_dict_major` VALUES (269, 32, '农业电气化与自动化教育(机电方向)');
INSERT INTO `sx_dict_major` VALUES (270, 32, '农业资源与环境教育');
INSERT INTO `sx_dict_major` VALUES (271, 32, '汽车营运与维修职专');
INSERT INTO `sx_dict_major` VALUES (272, 32, '土地资源管理教育');
INSERT INTO `sx_dict_major` VALUES (273, 32, '园林教育');
INSERT INTO `sx_dict_major` VALUES (274, 33, '环境工程(环境生物技术方向)');
INSERT INTO `sx_dict_major` VALUES (275, 33, '农业资源与环境(土壤与农业化学方向)');
INSERT INTO `sx_dict_major` VALUES (276, 34, '人文地理与城乡规划(城乡规划设计方向)');
INSERT INTO `sx_dict_major` VALUES (277, 34, '人文地理与城乡规划');
INSERT INTO `sx_dict_major` VALUES (278, 34, '农业资源与环境');
INSERT INTO `sx_dict_major` VALUES (279, 34, '地理信息系统');
INSERT INTO `sx_dict_major` VALUES (280, 34, '地理信息科学');
INSERT INTO `sx_dict_major` VALUES (281, 34, '农业资源与环境(本硕连读)');
INSERT INTO `sx_dict_major` VALUES (282, 34, '农业资源与环境(生态环境建设与管理方向)');
INSERT INTO `sx_dict_major` VALUES (283, 34, '农业资源与环境(生态恢复与重建方向)');
INSERT INTO `sx_dict_major` VALUES (284, 34, '土地资源管理');
INSERT INTO `sx_dict_major` VALUES (285, 34, '土地资源管理(测绘与地籍管理方向)');
INSERT INTO `sx_dict_major` VALUES (286, 34, '资源环境与城乡规划管理');
INSERT INTO `sx_dict_major` VALUES (287, 34, '资源环境与城乡规划管理(城乡规划管理方向)');
INSERT INTO `sx_dict_major` VALUES (288, 34, '资源环境与城乡规划管理(城乡规划设计方向)');
INSERT INTO `sx_dict_major` VALUES (289, 34, '自然地理与资源环境');
INSERT INTO `sx_dict_major` VALUES (290, 2, '草业科学');
INSERT INTO `sx_dict_major` VALUES (291, 2, '动物科学');
INSERT INTO `sx_dict_major` VALUES (292, 2, '动物科学(教育)');
INSERT INTO `sx_dict_major` VALUES (293, 2, '动物营养与饲料加工(专)');
INSERT INTO `sx_dict_major` VALUES (294, 2, '生物技术(动物方向)');
INSERT INTO `sx_dict_major` VALUES (295, 2, '水产养殖教育');
INSERT INTO `sx_dict_major` VALUES (296, 2, '水产养殖学');
INSERT INTO `sx_dict_major` VALUES (297, 2, '水产养殖学(水生动物营养与饲料工程、特种水产养殖)');
INSERT INTO `sx_dict_major` VALUES (298, 2, '水产养殖学(水生动物营养与饲料工程方向)');
INSERT INTO `sx_dict_major` VALUES (299, 2, '水产养殖学(特种水产养殖方向)');
INSERT INTO `sx_dict_major` VALUES (300, 2, '水产养殖学(鱼病与渔药方向)');
INSERT INTO `sx_dict_major` VALUES (301, 2, '野生动物与自然保护区管理');
INSERT INTO `sx_dict_major` VALUES (302, 2, '草业科学(草坪管理)');
INSERT INTO `sx_dict_major` VALUES (303, 2, '草业科学(草业工程与园林绿化方向)');
INSERT INTO `sx_dict_major` VALUES (304, 2, '草业科学(中美合作办学草坪管理项目)');
INSERT INTO `sx_dict_major` VALUES (305, 2, '动物科学(本硕连读)');
INSERT INTO `sx_dict_major` VALUES (306, 2, '动物科学(动物遗传与现代养殖方向)');
INSERT INTO `sx_dict_major` VALUES (307, 2, '动物科学(动物营养与饲料工程方向)');
INSERT INTO `sx_dict_major` VALUES (308, 2, '动物科学(特种经济动物养殖方向)');
INSERT INTO `sx_dict_major` VALUES (309, 2, '动物科学教育');

-- ----------------------------
-- Table structure for sx_dict_nation
-- ----------------------------
DROP TABLE IF EXISTS `sx_dict_nation`;
CREATE TABLE `sx_dict_nation`  (
  `sx_dict_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_dict_nation` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名族名称',
  PRIMARY KEY (`sx_dict_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 59 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_dict_nation
-- ----------------------------
INSERT INTO `sx_dict_nation` VALUES (1, '汉族');
INSERT INTO `sx_dict_nation` VALUES (2, '蒙族');
INSERT INTO `sx_dict_nation` VALUES (3, '回族');
INSERT INTO `sx_dict_nation` VALUES (4, '藏族');
INSERT INTO `sx_dict_nation` VALUES (5, '维族');
INSERT INTO `sx_dict_nation` VALUES (6, '苗族');
INSERT INTO `sx_dict_nation` VALUES (7, '彝族');
INSERT INTO `sx_dict_nation` VALUES (8, '壮族');
INSERT INTO `sx_dict_nation` VALUES (9, '布依族');
INSERT INTO `sx_dict_nation` VALUES (10, '朝鲜族');
INSERT INTO `sx_dict_nation` VALUES (11, '满族');
INSERT INTO `sx_dict_nation` VALUES (12, '侗族');
INSERT INTO `sx_dict_nation` VALUES (13, '瑶族');
INSERT INTO `sx_dict_nation` VALUES (14, '白族');
INSERT INTO `sx_dict_nation` VALUES (15, '土家族');
INSERT INTO `sx_dict_nation` VALUES (16, '哈尼族');
INSERT INTO `sx_dict_nation` VALUES (17, '哈萨克族');
INSERT INTO `sx_dict_nation` VALUES (18, '傣族');
INSERT INTO `sx_dict_nation` VALUES (19, '黎族');
INSERT INTO `sx_dict_nation` VALUES (20, '傈僳族');
INSERT INTO `sx_dict_nation` VALUES (21, '佤族');
INSERT INTO `sx_dict_nation` VALUES (22, '畲族');
INSERT INTO `sx_dict_nation` VALUES (23, '高山族');
INSERT INTO `sx_dict_nation` VALUES (24, '拉祜族');
INSERT INTO `sx_dict_nation` VALUES (25, '水族');
INSERT INTO `sx_dict_nation` VALUES (26, '东乡族');
INSERT INTO `sx_dict_nation` VALUES (27, '纳西族');
INSERT INTO `sx_dict_nation` VALUES (28, '景颇族');
INSERT INTO `sx_dict_nation` VALUES (29, '柯尔克孜族');
INSERT INTO `sx_dict_nation` VALUES (30, '土族');
INSERT INTO `sx_dict_nation` VALUES (31, '达斡尔族');
INSERT INTO `sx_dict_nation` VALUES (32, '仫佬族');
INSERT INTO `sx_dict_nation` VALUES (33, '羌族');
INSERT INTO `sx_dict_nation` VALUES (34, '布朗族');
INSERT INTO `sx_dict_nation` VALUES (35, '撒拉族');
INSERT INTO `sx_dict_nation` VALUES (36, '毛南族');
INSERT INTO `sx_dict_nation` VALUES (37, '仡佬族');
INSERT INTO `sx_dict_nation` VALUES (38, '锡伯族');
INSERT INTO `sx_dict_nation` VALUES (39, '阿昌族');
INSERT INTO `sx_dict_nation` VALUES (40, '普米族');
INSERT INTO `sx_dict_nation` VALUES (41, '塔吉克族');
INSERT INTO `sx_dict_nation` VALUES (42, '怒族');
INSERT INTO `sx_dict_nation` VALUES (43, '乌孜别克族');
INSERT INTO `sx_dict_nation` VALUES (44, '俄罗斯族');
INSERT INTO `sx_dict_nation` VALUES (45, '鄂温克族');
INSERT INTO `sx_dict_nation` VALUES (46, '德昂族');
INSERT INTO `sx_dict_nation` VALUES (47, '保安族');
INSERT INTO `sx_dict_nation` VALUES (48, '裕固族');
INSERT INTO `sx_dict_nation` VALUES (49, '京族');
INSERT INTO `sx_dict_nation` VALUES (50, '塔塔尔族');
INSERT INTO `sx_dict_nation` VALUES (51, '独龙族');
INSERT INTO `sx_dict_nation` VALUES (52, '鄂伦春族');
INSERT INTO `sx_dict_nation` VALUES (53, '赫哲族');
INSERT INTO `sx_dict_nation` VALUES (54, '门巴族');
INSERT INTO `sx_dict_nation` VALUES (55, '珞巴族');
INSERT INTO `sx_dict_nation` VALUES (56, '基诺族');
INSERT INTO `sx_dict_nation` VALUES (57, '*未识别');
INSERT INTO `sx_dict_nation` VALUES (58, '*外入中籍');

-- ----------------------------
-- Table structure for sx_dict_sex
-- ----------------------------
DROP TABLE IF EXISTS `sx_dict_sex`;
CREATE TABLE `sx_dict_sex`  (
  `sx_dict_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_dict_sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  PRIMARY KEY (`sx_dict_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_dict_sex
-- ----------------------------
INSERT INTO `sx_dict_sex` VALUES (1, '男');
INSERT INTO `sx_dict_sex` VALUES (2, '女');
INSERT INTO `sx_dict_sex` VALUES (3, '未知');

-- ----------------------------
-- Table structure for sx_ext_auth
-- ----------------------------
DROP TABLE IF EXISTS `sx_ext_auth`;
CREATE TABLE `sx_ext_auth`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_end_date` date NOT NULL COMMENT '结束日期',
  `sx_is_open` tinyint(4) NOT NULL COMMENT '双选是否开通',
  `sx_auth_id` int(11) NOT NULL,
  PRIMARY KEY (`sx_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_ext_auth
-- ----------------------------
INSERT INTO `sx_ext_auth` VALUES (1, '2019-09-13', 1, 0);
INSERT INTO `sx_ext_auth` VALUES (2, '2019-09-04', 0, 0);

-- ----------------------------
-- Table structure for sx_ext_comment
-- ----------------------------
DROP TABLE IF EXISTS `sx_ext_comment`;
CREATE TABLE `sx_ext_comment`  (
  `sx_ext_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_ext_practice_id` int(11) UNSIGNED NOT NULL COMMENT '被评论的practice的ID',
  `sx_ext_commenter_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论者的学号',
  `sx_ext_comment` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '评论内容',
  `sx_ext_gmt_create` datetime(0) DEFAULT NULL COMMENT '评论时间',
  `sx_ext_praise` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '赞的数量',
  `sx_ext_is_visible` tinyint(2) UNSIGNED NOT NULL DEFAULT 1 COMMENT '0-不显示 1-显示',
  PRIMARY KEY (`sx_ext_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sx_ext_follow
-- ----------------------------
DROP TABLE IF EXISTS `sx_ext_follow`;
CREATE TABLE `sx_ext_follow`  (
  `sx_ext_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sx_ext_student_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生学号',
  `sx_ext_followee_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关注的人的id',
  `sx_ext_gmt_modified` datetime(0) DEFAULT NULL,
  `sx_ext_gmt_create` datetime(0) DEFAULT NULL COMMENT '关注时间',
  `sx_ext_is_following` tinyint(2) UNSIGNED NOT NULL DEFAULT 1 COMMENT '关注状态 1在关注  0取消关注',
  PRIMARY KEY (`sx_ext_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '关注表，学生可以关注别的学生，关注了就可以看到他的动态' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sx_ext_recommend
-- ----------------------------
DROP TABLE IF EXISTS `sx_ext_recommend`;
CREATE TABLE `sx_ext_recommend`  (
  `sx_ext_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_ext_rcmd_stu_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '被推荐学生得ID',
  `sx_ext_gmt_modified` datetime(0) DEFAULT NULL COMMENT '修改时间',
  `sx_ext_gmt_create` datetime(0) DEFAULT NULL COMMENT '推荐时间',
  `sx_ext_root_id` int(11) UNSIGNED NOT NULL COMMENT '操作者ID(管理员)',
  `sx_ext_rcmder_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '推荐老师的ID',
  `sx_ext_is_visible` tinyint(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '推荐状态  0 未确认或者取消推荐  1推荐成功',
  PRIMARY KEY (`sx_ext_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sx_ext_reply
-- ----------------------------
DROP TABLE IF EXISTS `sx_ext_reply`;
CREATE TABLE `sx_ext_reply`  (
  `sx_ext_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_ext_comment_id` int(11) UNSIGNED NOT NULL COMMENT '评论的ID',
  `sx_ext_replyer_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '回复者学号',
  `sx_ext_commender_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论者的ID',
  `sx_ext_msg` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '回复信息',
  `sx_ext_gtm_create` datetime(0) DEFAULT NULL COMMENT '回复时间',
  `sx_ext_praise` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '点赞数量',
  `sx_ext_is_visible` tinyint(2) UNSIGNED NOT NULL DEFAULT 1 COMMENT '0-不可见 1-可见',
  PRIMARY KEY (`sx_ext_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '评论的回复表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sx_index_banner
-- ----------------------------
DROP TABLE IF EXISTS `sx_index_banner`;
CREATE TABLE `sx_index_banner`  (
  `sx_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sx_imgsrc` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '轮播图的图片',
  `sx_news_id` bigint(20) UNSIGNED NOT NULL COMMENT '关联到news',
  `sx_gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sx_gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `sx_is_visible` tinyint(1) UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否可见',
  PRIMARY KEY (`sx_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sx_index_news
-- ----------------------------
DROP TABLE IF EXISTS `sx_index_news`;
CREATE TABLE `sx_index_news`  (
  `sx_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sx_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `sx_gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sx_gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `sx_read` int(11) UNSIGNED NOT NULL DEFAULT 2 COMMENT '阅读次数',
  `sx_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '正文内容',
  `sx_is_visible` tinyint(1) UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否可见',
  PRIMARY KEY (`sx_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sx_practice
-- ----------------------------
DROP TABLE IF EXISTS `sx_practice`;
CREATE TABLE `sx_practice`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sx_student_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sx_student_name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生姓名',
  `sx_major` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生专业',
  `sx_title` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实习报告标题',
  `sx_report` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '报告正文',
  `sx_picture` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实习照片',
  `sx_video` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实习视频',
  `sx_gtm_modified` datetime(0) DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `sx_gtm_create` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '实习创建时间',
  `sx_praise` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '获得赞的数量',
  `sx_is_visible` tinyint(2) UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否可见(是否是草稿)',
  PRIMARY KEY (`sx_id`) USING BTREE,
  INDEX `fk_to_student`(`sx_student_id`) USING BTREE,
  CONSTRAINT `fk_to_student` FOREIGN KEY (`sx_student_id`) REFERENCES `sx_student` (`sx_student_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_practice
-- ----------------------------
INSERT INTO `sx_practice` VALUES (24, '20140161', '阮坤', '计算机科学与技术', '第一次实习', '<h1 style=\"display: inline-block;\">阮少爷的天气预报</h1>\n			<select id=\"cityId\" @change=\"weather\" >\n				<option value =\"101010200\">海淀</option>\n				<option value =\"101010300\">朝阳</option>\n				<option value =\"101010400\">顺义</option>\n				<option value =\"101010500\">怀柔</option>\n			</select>\n			<p>{{msg}}</p>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-05-31 16:43:53', '2019-05-25 14:37:18', 33, 1);
INSERT INTO `sx_practice` VALUES (25, '20180001', '牛斑斑', '园林', '第N次实习', '<h1 style=\"display: inline-block;\">阮少爷的天气预报</h1>\n			<select id=\"cityId\" @change=\"weather\" >\n				<option value =\"101010200\">海淀</option>\n				<option value =\"101010300\">朝阳</option>\n				<option value =\"101010400\">顺义</option>\n				<option value =\"101010500\">怀柔</option>\n			</select>\n			<p>{{msg}}</p>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-05-31 17:45:08', '2019-05-28 14:12:18', 0, 1);
INSERT INTO `sx_practice` VALUES (26, '20180001', '牛斑斑', '园林', NULL, '<h1 style=\"display: inline-block;\">阮少爷的天气预报</h1>\n			<select id=\"cityId\" @change=\"weather\" >\n				<option value =\"101010200\">海淀</option>\n				<option value =\"101010300\">朝阳</option>\n				<option value =\"101010400\">顺义</option>\n				<option value =\"101010500\">怀柔</option>\n			</select>\n			<p>{{msg}}</p>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-05-31 17:45:09', '2019-05-28 14:40:52', 0, 1);
INSERT INTO `sx_practice` VALUES (27, '20180001', '牛老二', '物联网工程', '5', '<h1 style=\"display: inline-block;\">阮少爷的天气预报</h1>\n			<select id=\"cityId\" @change=\"weather\" >\n				<option value =\"101010200\">海淀</option>\n				<option value =\"101010300\">朝阳</option>\n				<option value =\"101010400\">顺义</option>\n				<option value =\"101010500\">怀柔</option>\n			</select>\n			<p>{{msg}}</p>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-05-31 17:45:10', '2019-05-28 19:33:21', 0, 1);
INSERT INTO `sx_practice` VALUES (28, '20180001', '牛老二', '物联网工程', '332', '<h1 style=\"display: inline-block;\">阮少爷的天气预报</h1>\n			<select id=\"cityId\" @change=\"weather\" >\n				<option value =\"101010200\">海淀</option>\n				<option value =\"101010300\">朝阳</option>\n				<option value =\"101010400\">顺义</option>\n				<option value =\"101010500\">怀柔</option>\n			</select>\n			<p>{{msg}}</p>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-05-31 17:45:11', '2019-05-28 19:34:10', 0, 1);
INSERT INTO `sx_practice` VALUES (29, '20180001', '牛老二', '物联网工程', '354', '<h1 style=\"display: inline-block;\">阮少爷的天气预报</h1>\n			<select id=\"cityId\" @change=\"weather\" >\n				<option value =\"101010200\">海淀</option>\n				<option value =\"101010300\">朝阳</option>\n				<option value =\"101010400\">顺义</option>\n				<option value =\"101010500\">怀柔</option>\n			</select>\n			<p>{{msg}}</p>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-05-31 17:45:12', '2019-05-29 19:50:59', 0, 1);
INSERT INTO `sx_practice` VALUES (30, '20180001', '牛老二', '物联网工程', '数不清', '<h1 style=\"display: inline-block;\">阮少爷的天气预报</h1>\n			<select id=\"cityId\" @change=\"weather\" >\n				<option value =\"101010200\">海淀</option>\n				<option value =\"101010300\">朝阳</option>\n				<option value =\"101010400\">顺义</option>\n				<option value =\"101010500\">怀柔</option>\n			</select>\n			<p>{{msg}}</p>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-05-31 17:45:12', '2019-05-31 10:17:14', 0, 1);
INSERT INTO `sx_practice` VALUES (31, '20180001', '牛老二', '物联网工程', 'asas', '<font size=\"6\">​asdsdfscdssd</font>', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-06-03 15:14:40', '2019-05-31 17:38:10', 0, 1);
INSERT INTO `sx_practice` VALUES (32, '20180001', '牛老二', '物联网工程', '砂石科技', 'DVD深V的深V的深V实对称实对称第三位为为微分额外微分', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-06-03 15:14:40', '2019-06-03 11:28:40', 0, 1);
INSERT INTO `sx_practice` VALUES (33, '20140285', '郑志杰', '物联网工程', '砂石科技', 'DVD深V的深V的深V实对称实对称第三位为为微分额外微分', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', '2019-06-03 15:14:44', '2019-06-03 15:14:17', 0, 1);
INSERT INTO `sx_practice` VALUES (34, '20180002', '李三', '物联网工程', '第一次实习', '<b style=\"color: rgb(0, 0, 0); font-family: tahoma, arial, verdana, sans-serif;\"><font size=\"6\">​但是说到实习，每个人都必须经历，是的！</font></b><div style=\"color: rgb(0, 0, 0); font-family: tahoma, arial, verdana, sans-serif;\"><b><font size=\"6\"><br></font></b></div><div><ol><li><font face=\"tahoma, arial, verdana, sans-serif\" size=\"6\"><b>但是不好</b></font></li><li><font face=\"tahoma, arial, verdana, sans-serif\" size=\"6\"><b>好</b></font></li></ol><div><font face=\"tahoma, arial, verdana, sans-serif\" size=\"6\"><b><br></b></font></div></div><div><font face=\"tahoma, arial, verdana, sans-serif\" size=\"6\"><b><br></b></font></div>', NULL, NULL, '2019-06-03 15:46:00', '2019-06-03 15:46:00', 0, 1);
INSERT INTO `sx_practice` VALUES (35, '20180003', '李三', '物联网工程', '记录我的一次实习', '第三方的双丰收倒是反倒是反倒是发送到第三方人隔热额的发到地方梵蒂冈是的是 诚心出从v 热测', NULL, NULL, '2019-06-03 21:03:26', '2019-06-03 21:03:26', 0, 1);
INSERT INTO `sx_practice` VALUES (36, '20180001', '牛老二', '物联网工程', 'hjjh', 'ghjgjhgj', NULL, NULL, '2019-08-16 22:27:16', '2019-08-16 22:27:16', 0, 1);

-- ----------------------------
-- Table structure for sx_practice_score
-- ----------------------------
DROP TABLE IF EXISTS `sx_practice_score`;
CREATE TABLE `sx_practice_score`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sx_teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '指导老师教师号',
  `sx_practice_id` int(11) UNSIGNED NOT NULL COMMENT '关联每一个practice得sx_id',
  `sx_gtm_create` datetime(0) DEFAULT NULL COMMENT '评分时间',
  `sx_score` decimal(10, 0) UNSIGNED NOT NULL COMMENT '实习分数',
  `sx_remark` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '实习点评',
  `sx_gtm_modified` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`sx_id`) USING BTREE,
  INDEX `fk_to_practice`(`sx_practice_id`) USING BTREE,
  CONSTRAINT `fk_to_practice` FOREIGN KEY (`sx_practice_id`) REFERENCES `sx_practice` (`sx_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '每一个小的practice打分得表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sx_root
-- ----------------------------
DROP TABLE IF EXISTS `sx_root`;
CREATE TABLE `sx_root`  (
  `sx_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_account` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员账号',
  `sx_password` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员密码',
  `sx_is_lock` tinyint(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '1-锁定不可用',
  `sx_gtm_create` datetime(0) DEFAULT NULL,
  `sx_gtm_modified` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`sx_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_root
-- ----------------------------
INSERT INTO `sx_root` VALUES (1, 'jw001', '@Sicau211', 0, '2019-04-23 20:58:17', '2019-04-23 20:58:20');

-- ----------------------------
-- Table structure for sx_student
-- ----------------------------
DROP TABLE IF EXISTS `sx_student`;
CREATE TABLE `sx_student`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sx_student_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `sx_student_name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `sx_student_phone` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生联系电话',
  `sx_student_password` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生登录密码',
  `sx_sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `sx_nation` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sx_grade` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sx_college` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sx_major` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sx_clazz` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sx_campus` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sx_picture` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sx_is_lock` tinyint(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '1-未启用',
  `sx_gtm_create` datetime(0) DEFAULT CURRENT_TIMESTAMP,
  `sx_gtm_modified` datetime(0) DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `sx_totor_up` tinyint(3) UNSIGNED NOT NULL DEFAULT 5 COMMENT '学生最多能选择多少导师',
  PRIMARY KEY (`sx_id`) USING BTREE,
  UNIQUE INDEX `sx_student_id`(`sx_student_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_student
-- ----------------------------
INSERT INTO `sx_student` VALUES (1, '20140161', '阮坤', '18783551223', '266915', '男', '汉族', '2015', '风景园林学院', '动物医学(小动物医学方向)', '1', '雅安校区', 'http://jiaowu.sicau.edu.cn/photo/20140161.jpg', 0, '2019-04-23 21:03:17', '2019-08-22 14:21:16', 5);
INSERT INTO `sx_student` VALUES (2, '20150162', '赵舜', '18227590043', '@！#gh', '男', '汉族', '2015', '信息工程学院', '计算机科学与技术', '5', '雅安校区', 'http://jiaowu.sicau.edu.cn/photo/20140243.jpg', 0, '2019-04-23 22:24:50', '2019-05-27 15:49:52', 5);
INSERT INTO `sx_student` VALUES (3, '20190111', '少二', '18227590043', 'ruankun5820', '女', '汉族', '2018', '信息工程学院', '农业信息工程', '3', '雅安校区', 'http://jiaowu.sicau.edu.cn/photo/20140243.jpg', 0, '2019-04-25 19:03:31', '2019-05-27 15:49:53', 5);
INSERT INTO `sx_student` VALUES (4, '20140243', '李二', '18227590043', 'ruankun5820', '男', '汉族', '2014', '信息工程学院', '计算机科学与技术', '5', '雅安校区', 'http://jiaowu.sicau.edu.cn/photo/20140243.jpg', 1, '2019-04-25 19:03:02', '2019-08-15 15:19:07', 5);
INSERT INTO `sx_student` VALUES (5, '20140285', '郑知杰', '18783551223', 'ajielu', '男', '汉族', '2015', '风景园林学院', '环境设计', '5', '雅安校区', 'http://jiaowu.sicau.edu.cn/photo/20140285.jpg', 1, '2019-04-25 19:30:29', '2019-05-27 15:49:53', 5);
INSERT INTO `sx_student` VALUES (6, '20140032', '岳老', '18783551223', 'yuelaoer', '男', '汉族', '2015', '信息工程学院', '计算机科学与技术', '3', '都江堰校区', 'http://jiaowu.sicau.edu.cn/photo/20140032.jpg', 0, '2019-04-25 20:44:21', '2019-05-27 15:49:53', 5);
INSERT INTO `sx_student` VALUES (7, '20140001', '胖子', '192', '222', '女', '珞巴族', '2015', '建筑与城乡规划学院', '城市规划', '2', '成都校区', 'http://jiaowu.sicau.edu.cn/photo/20140001.jpg', 0, '2019-04-25 21:00:43', '2019-05-27 15:49:54', 5);
INSERT INTO `sx_student` VALUES (8, '20130001', '小黄', '32432432423432', '0000', '男', '蒙族', '2016', '建筑与城乡规划学院', '建筑学', '2', '成都校区', 'http://jiaowu.sicau.edu.cn/photo/20130001.jpg', 0, '2019-04-25 21:08:45', '2019-08-15 15:19:20', 5);
INSERT INTO `sx_student` VALUES (9, '23432432', '三郎', '324', '234', '男', '回族', '2016', '建筑与城乡规划学院', '城市规划', '3', '成都校区', 'http://jiaowu.sicau.edu.cn/photo/23432432.jpg', 0, '2019-04-25 21:10:15', '2019-05-27 15:49:54', 5);
INSERT INTO `sx_student` VALUES (48, '2015896832', '刘杨', '18783551223', '65456536', '女', '汉', '2015', '信息工程学院', '信息管理', '5', '雅安校区', 'http://jiaowu.sicau.edu.cn/photo/2015896832.jpg', 0, '2019-05-21 19:33:47', '2019-05-27 15:49:56', 5);
INSERT INTO `sx_student` VALUES (51, '20180001', '牛老二', '18721212342', '1234', '男', '汉族', '2018', '信息工程学院', '物联网工程', '5', '都江堰校区', 'http://jiaowu.sicau.edu.cn/photo/20180001.jpg', 0, '2019-05-27 16:11:45', '2019-05-28 16:52:16', 5);
INSERT INTO `sx_student` VALUES (52, '20180002', '李三', '', '1234', '男', '汉族', '2018', '信息工程学院', '物联网工程', '5', '都江堰校区', 'http://jiaowu.sicau.edu.cn/photo/20180002.jpg', 0, '2019-06-03 15:33:01', '2019-06-03 15:33:11', 5);
INSERT INTO `sx_student` VALUES (53, '20180003', '李三', '18783551223', '1234', '男', '汉族', '2018', '信息工程学院', '物联网工程', '5', '都江堰校区', 'http://jiaowu.sicau.edu.cn/photo/20180002.jpg', 0, '2019-06-03 15:33:01', '2019-06-03 15:33:11', 5);
INSERT INTO `sx_student` VALUES (54, '20180004', '李三', '11', '1234', '男', '汉族', '2018', '信息工程学院', '物联网工程', '5', '都江堰校区', 'http://jiaowu.sicau.edu.cn/photo/20180002.jpg', 0, '2019-06-03 15:33:01', '2019-06-03 15:33:11', 5);
INSERT INTO `sx_student` VALUES (55, '20180005', '小明', '18783551223', '65456536', '女', '蒙族', '2015', '信息工程学院', '信息管理', '5', '雅安校区', 'http://jiaowu.sicau.edu.cn/photo/20180005.jpg', 0, '2019-06-03 08:30:37', '2019-06-03 21:32:10', 10);

-- ----------------------------
-- Table structure for sx_teacher
-- ----------------------------
DROP TABLE IF EXISTS `sx_teacher`;
CREATE TABLE `sx_teacher`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sx_teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师员工号',
  `sx_teacher_name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师姓名',
  `sx_teacher_password` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师登录密码',
  `sx_college` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师所属学院',
  `sx_nation` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师民族',
  `sx_sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师性别',
  `sx_age` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师年龄',
  `sx_gtm_create` datetime(0) DEFAULT CURRENT_TIMESTAMP,
  `sx_gtm_modified` datetime(0) DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `sx_is_lock` tinyint(2) UNSIGNED DEFAULT 0 COMMENT '教师账号是否锁定',
  `sx_tutor_up` tinyint(3) UNSIGNED NOT NULL DEFAULT 30 COMMENT '同时能被多少学生选择',
  `sx_tutor` tinyint(3) UNSIGNED NOT NULL DEFAULT 10 COMMENT '最多能指导多少学生',
  PRIMARY KEY (`sx_id`) USING BTREE,
  UNIQUE INDEX `sx_teacher_id`(`sx_teacher_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_teacher
-- ----------------------------
INSERT INTO `sx_teacher` VALUES (1, '10000', '李四', '123456', '资源学院', '汉族', '男', '37', '2019-04-23 21:04:40', '2019-06-03 15:36:28', 0, 30, 10);
INSERT INTO `sx_teacher` VALUES (2, '324', '李三', '123456', '信息工程学院', '汉族', '男', '31', NULL, '2019-06-03 15:35:24', 0, 0, 10);
INSERT INTO `sx_teacher` VALUES (3, '10001', '张二娃', '123456', '信息工程学院', '回族', '男', '18', '2019-04-27 14:19:52', '2019-04-27 14:28:07', 0, 30, 10);
INSERT INTO `sx_teacher` VALUES (4, '10002', '张三', '123456', '资源学院', '汉族', '男', '37', '2019-04-23 21:04:40', '2019-06-03 15:35:59', 0, 30, 10);
INSERT INTO `sx_teacher` VALUES (5, '10003', '李辅导', '123456', '资源学院', '汉族', '男', '37', '2019-04-23 21:04:40', '2019-06-03 15:36:56', 0, 30, 10);
INSERT INTO `sx_teacher` VALUES (66, '10004', '李好', '123456', '资源学院', '汉族', '男', '37', '2019-04-23 21:04:40', '2019-06-03 15:36:50', 0, 30, 10);

-- ----------------------------
-- Table structure for sx_teacher_resume
-- ----------------------------
DROP TABLE IF EXISTS `sx_teacher_resume`;
CREATE TABLE `sx_teacher_resume`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关联教师',
  `sx_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '简历照片地址',
  `sx_gtm_modified` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `sx_gtm_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '简历更新时间',
  `sx_name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `sx_sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `sx_birth` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '出生日期',
  `sx_type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '导师类型，如学硕导师，博士导师，本科生导师等等',
  `sx_unit` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工作单位',
  `sx_admin` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '行政职务，如农学院党委副书记兼副院长',
  `sx_admin_phone` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '单位电话',
  `sx_tech_major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '招生专业',
  `sx_email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电子邮件',
  `sx_introduce` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '个人简介',
  `sx_work_exp` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '工作经历',
  `sx_edu_exp` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '教育经历',
  `sx_award` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '获奖荣誉',
  `sx_other_status` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '社会、学会及学术兼职',
  `sx_research_area` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '研究领域',
  `sx_sci_resch_project` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '科研项目',
  `sx_paper` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '发表论文',
  `sx_book` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '专著教材',
  `sx_students` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '指导学生',
  `sx_is_visible` tinyint(2) UNSIGNED NOT NULL DEFAULT 1 COMMENT '简历是否可见 1-可见',
  PRIMARY KEY (`sx_id`) USING BTREE,
  INDEX `fk_teacher`(`sx_teacher_id`) USING BTREE,
  CONSTRAINT `fk_teacher` FOREIGN KEY (`sx_teacher_id`) REFERENCES `sx_teacher` (`sx_teacher_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_teacher_resume
-- ----------------------------
INSERT INTO `sx_teacher_resume` VALUES (1, '10000', 'http://jiaowu.sicau.edu.cn/web/web/web/bmjj/pic/liu.jpg', '2019-04-28 10:25:07', '2019-04-23 21:06:06', '刘涛', '男', '1980年', '硕士生导师', '教务处', ' 教务处副处长', '0835-2883032', '学硕:0828Z1农业信息工程，专硕:095136农业工程与信息技术', 'tao666@163.com', '刘涛，男，汉族，1980年生，四川江油人，中共党员，硕士研究生，副研究员，主要从农业信息化、地理信息、教学管理相关研究。', '004.06-至今，在四川农业大学教务处从事教学、科研和管理工作。', '四川农业大学，硕士研究生。', '1.“基于大数据平台的教学质量监控保障体系研究与实践”，2017.03，校级教学成果特等奖。\r\n2.“开发教学管理综合平台，构建立体化教学管理体系”，2010.03，省级教学成果奖二等奖。\r\n3. “构建以学生为本的教学管理制度体系，促进学-教-管协同发展”，2012.12，获校级教学成果奖一等奖。\r\n4.“基于大数据平台的教学质量监控保障体系研究与实践”，2018.7，四川省教学成果一等奖。\r\n5.“设施栽培条件下土壤质量演变与调控关键技术研究及应用”,2016.12,省级科技进步三等奖。', '全国高等农林院校教学管理工作联合会理事', '农业信息：农业大数据、地理信息系统开发，如：ArcGIS Engine 开发、ArcGIS Server 开发、基于GIS的农业信息化研究：基于GIS的耕地地力评价、基于GIS的农测土配方施肥、移动iOS农田施肥专家系统、移动Android农田施肥专家系统 等。\r\n\r\n教学管理：教务管理系统设计开发、教学大数据模型构建与可视化分析等。', '1.基于WebGIS的四川省耕地质量管理信息平台的研制,四川省教育厅项目,2014.01-2016.12,结题,主持；\r\n2.《3S技术原理及其应用》课程的立体化教材研究与建设,中华农业科教基金项目,2016.01-2017.05,在研；\r\n3.数字化现代教学管理系统的创新与实践,四川省教育厅项目,2016.07,结题；\r\n4.大麦磷高效重要性状的QTL定位与遗传分析,国家自然科学基金(青年),2015.01-2017.12,在研；\r\n5.磷富集矿山生态型水蓼活化/积累磷素机理研究,国家自然科学基金(面上),2017.01-2020.12,在研；\r\n6.川中丘陵区坡耕地防蚀机理研究,国家自然科学基金(青年),2010.01-2012.12,结题；\r\n7.设施栽培条件下土壤质量演变与调控关键技术研究及应用,2016.12,省级科技进步三等奖。', '1.Effects of rainfall intensity on splash erosion and its spatial distribution under maize canopy,Natural Hazards,2016,84(SCI收录,IF=1.833),第一作者；\r\n2.不同灌水频率条件下设施土壤水盐运移特征,生态与农村环境学报,2016,32(4)(CSCD收录),第一作者；\r\n3.不同灌水频率下设施土壤盐分时空变化特征,浙江农业学报,2016,28(6)(CSCD收录),第一作者；\r\n4.低磷胁迫下大麦叶片磷素利用特征,植物学报,2016,51(4)(CSCD收录),第一作者；\r\n5.磷高效型野生大麦根系形态和根系分泌物对低水平植酸态有机磷的响应特征,植物营养与肥料学报,2016,22(6)(CSCD收录),第一作者；\r\n6.村级农田施肥专家系统设计与应用,水土保持通报,2015,35(3)(CSCD收录),第一作者；\r\n7.Establishment on information system data base of provincial-level farmland quality management,2015,124(ISTP收录),第一作者。', '1.《数据库原理及应用》，“十三五”规划教材，中国农业大学出版社，2017.08出版，副主编，第7章，约4万字。\r\n2.《资源与环境系统分析》，“十三五”规划教材，中国农业大学出版社，2017.08出版，参编，第1章，约3万字。', '主要承担本科生《SQL数据库系统》、《土地信息系统》、《3S技术原理及其应用》等课程的教学工作', 1);
INSERT INTO `sx_teacher_resume` VALUES (2, '10001', 'http://yz.sicau.edu.cn//yjsgl//dszp//10342.jpg', '2019-04-27 22:58:52', '2019-04-27 22:56:02', '汪铭书', '女', '1964年', '博士导师', '预防兽医研究所', '四川农业大学教授，预防兽医学博导', '-', '预防兽医学，兽医', 'mshwang@163.com', '汪铭书（1964-），女，博士，四川农业大学教授，预防兽医学博导', NULL, NULL, '四川省学术和技术带头人，四川省跨世纪人才、四川省青年科技奖、教育部“新世纪优秀人才支持计划”、国务院政府特殊津贴获得者和国家重点研发计划首席科学家。', NULL, '“动物重大疫病基因工程疫苗的研究和中试开发”、“水禽病原基因功能解析”、“鸭病毒性肝炎病毒基因组学及结构蛋白组功能研究”、“鸭病毒性肝炎弱毒活疫苗中试和产业化示范”、“鸭疫里默氏菌新型疫苗研究和产业化”、“水禽主要疫病快速诊断与疫苗研究”等', '先后承担了国家重点研发计划、国家自然科学基金、国家科技攻关、国家科技支撑、国家公益性科研专项、四川省学术带头人培养基金、省科技攻关、省科技支撑、教育部重大项目等20多项科研项目。在鸭肝炎、鸭传染性浆膜炎、鸭瘟病毒分子生物学、基因工程苗等方面取得良好的研究进展和成果。代表性科研项目如下：\r\n1、国家重点研发计划：“水禽重要疫病多联多价疫苗研究和应用”(2017~2020)，1883万元（首席科学家）\r\n2、国家自然科学基金：“鸭甲肝病毒复制相关的主要酶蛋白功能探究” (2015~2018)，82万元（主持）\r\n3、国家自然科学基金：“鸭瘟病毒皮层蛋白UL14在病毒成熟和免疫逃避中的作用机制” (2013~2016），82万元（主持）\r\n4、国家自然科学基金：“新定位的鸭瘟病毒UL44基因在病毒感染和致病中的作用及其功能结构域解析” (2011~2013)，35万元（主持）\r\n5、国家自然科学基金：“鸭病毒性肠炎病毒核衣壳蛋白基因功能解析” (2008~2010)，30万元（主持）	\r\n6、农业部公益性行业(农业)科研专项：“水禽主要疫病快速诊断与疫苗研制(2010~2014) ”，399万元（主持）\r\n7、国家农业科技成果转化资金项目：国家一类新兽药“鸭传染性浆膜炎灭不疫苗”工厂化生产工艺优化和产业化示范(2013~2015)，60万元（主持）\r\n8、国家农业科技成果转化资金项目：鸭病毒性肝炎弱毒活疫苗（CH60株）中试和产业化示范(2008~2012)，70万元（主持）\r\n9、四川省科技支撑计划：“鸭疫里默氏菌新型疫苗研究和产业化” (2008~2012)，20万元（主持）\r\n10、四川省国际合作项目：“鸭疫里默氏杆菌G148-1775新基因的鉴定及作用机制”(2017~2019)，30万元（主持）', '在《Frontiers in Immunology》、《Scientific Reports》、《Vaccine》、《Avian diseases》、《Acta Pharmacologica Sinica》、《高技术通讯》、《中国农业科学》、《病毒学报》等国内外重要核心期刊发表研究论文200多篇，其中SCI收录100余篇、CSCD收录100余篇，代表性论文如下：\r\n[1] Yu You(硕士生),Mingshu Wang #, et al.Duck plague virus Glycoprotein J is functional but slightly impaired in viral replication and cell-to-cell spread[J]. Scientific RepoRts, (2018) 8:4069; doi: 10.1038/s41598-018-22447-x.\r\n[2]Yu Zhang(硕士生), Mingshu Wang*, et al. The 3D protein of DHV-1 binds to a viral genomic 3′ UTR and shows RNA-dependent RNA polymerase activity[J]. Virus Genes, 2017,11262-017-1476-5.(SCI收录) \r\n[3]Yu You(硕士生), Mingshu Wang*, et al. The suppression of apoptosis by α-herpesvirus[J]. Cell Death and Disease, 2017,8:e2749.(SCI收录) \r\n[4]Qin Hu(硕士生), Mingshu Wang*, et al. A one-step duplex rRT-PCR assay for the simultaneous detection of duck hepatitis A virus genotypes 1 and 3 [J]. Journal of Virological Methods, 2016 July 18; 236: 207–214.\r\n[5] Jingyu Cao(硕士生), Mingshu Wang*, et al. The 2A2 protein of Duck hepatitis A virus type 1 induces apoptosis in primary cell culture[J]. Virus Genes, 2016 Dec; 52(6): 780-788.\r\n[6] Youlin Shen(硕士生), Mingshu Wang*, et al. Development of an indirect ELISA method based on the VP3 protein ofduck hepatitis A virus type 1 (DHAV-1) for dual detection of DHAV-1and DHAV-3 antibodies[J]. Journal of Virological Methods, 2015 Dec 1; 225: 30–34.\r\n[7] Yang He(博士生), Mingshu Wang#, et al. Cas1 and Cas2 from the type II-C CRISPR-Cas system of Riemerella anatipestifer are required for spacer acquisition[J]. Frontiers in Cellular and Infection Microbiology, 2018, 8:195, doi: 10.3389/fcimb.2018.00195\r\n[8] Xin Zhang(博士生), MingShu Wang#, et al. Contribution of RaeB, a putative RND-type transporter to aminoglycoside and detergent resistance in Riemerella anatipestifer[J]. Frontiers in Microbiology, 2017; doi: 10.3389/fmicb.2017.02435.\r\n[9] Xumin Ou(博士生), Mingshu Wang*, et al. Comparative analysis of virus-host interactions caused by a virulent and an attenuated duck hepatitis A virus genotype 1[J]. PloS One, 2017 Jun 14; 12(6): e0178993.\r\n[10]Di Sun(博士生), Ming-Shu Wang*,et al. Roles of the Picornaviral 3C proteinase in the viral life cycle and host cells[J].Viruses,2016,8:82. \r\n[11] Chaoyue Liu(博士生), Ming-Shu Wang*,et al. Characterization of nucleocytoplasmic shuttling and intracellular localization signals in Duck Enteritis Virus UL54[J]. Biochimie, 2016 August; 127: 86–94.\r\n[12]Tian Tang(博士生), Ming-Shu Wang*,et al. Development and evaluation of live attenuated Salmonella vaccines in newly hatched duckings[J]. Vaccine, 2015,33(42): 5564-5571.(SCI收录)', '-', '已招收/培养博士10余名、硕士100余名，毕业后在高校、科研院所、海关、知名企业等部门从事教学、科研、科技开发及管理等工作。\r\n(1)硕士研究生：中华人民共和国广州/河南/四川/青岛等进出口检疫局(海关)、四川/河南等省畜牧局/畜科院、卫生部成都生物制品研究所、西南大学、河南/青岛农业大学、河南科技学院、温州医学院、美国(加拿大、荷兰等)继续攻读博士以及知名企业等 \r\n(2)博士研究生：四川大学、西南科技大学、西北农林科技大学、贵州大学、云南/内蒙古农业大学、郑州中医药大学、河南科技大学、新加坡国立大学、上海兽医研究所等', 1);

-- ----------------------------
-- Table structure for sx_total_score
-- ----------------------------
DROP TABLE IF EXISTS `sx_total_score`;
CREATE TABLE `sx_total_score`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '评分教师教职工编号',
  `sx_student_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生学号',
  `sx_total_score` decimal(10, 0) UNSIGNED NOT NULL COMMENT '实习总分',
  `sx_total_remark` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '实习总评',
  `sx_gtm_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '总评时间',
  `sx_gtm_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '总评修改时间',
  PRIMARY KEY (`sx_id`) USING BTREE,
  INDEX `fk_toStudent`(`sx_student_id`) USING BTREE,
  INDEX `fk_toTeacher`(`sx_teacher_id`) USING BTREE,
  CONSTRAINT `fk_toStudent` FOREIGN KEY (`sx_student_id`) REFERENCES `sx_student` (`sx_student_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_toTeacher` FOREIGN KEY (`sx_teacher_id`) REFERENCES `sx_teacher` (`sx_teacher_id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生实习总评分表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_total_score
-- ----------------------------
INSERT INTO `sx_total_score` VALUES (2, '10000', '20180001', 99, '你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！你是一个坏学生，不过做事很认真，值得肯定！', '2019-05-28 16:36:48', '2019-05-28 18:10:15');
INSERT INTO `sx_total_score` VALUES (3, '10000', '20140161', 99, '好好学习，天天向上，多给一分，别骄傲1', '2019-06-03 12:41:48', '2019-06-03 21:19:14');
INSERT INTO `sx_total_score` VALUES (4, '10002', '20180002', 85, '少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强，少年强则国强', '2019-06-03 15:50:48', '2019-06-03 15:50:48');
INSERT INTO `sx_total_score` VALUES (5, '10000', '20180003', 88, 'sadasdsasfvfdvds \nds\n \ndsf \nsd\n s', '2019-06-03 21:20:38', '2019-06-03 21:20:38');

-- ----------------------------
-- Table structure for sx_tutor
-- ----------------------------
DROP TABLE IF EXISTS `sx_tutor`;
CREATE TABLE `sx_tutor`  (
  `sx_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `sx_student_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `sx_teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '老师教职工号',
  `sx_is_confirm` tinyint(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '老师是否同意 1 同意  0 未同意',
  `sx_is_lock` tinyint(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否锁定，没人未锁定',
  `sx_gtm_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sx_gtm_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `sx_is_visible` tinyint(2) UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否有效，比如导师确认后，其它选择自动失效',
  PRIMARY KEY (`sx_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sx_tutor
-- ----------------------------
INSERT INTO `sx_tutor` VALUES (1, '20140161', '10000', 1, 1, '2019-05-25 14:51:39', '2019-05-31 13:56:01', 1);
INSERT INTO `sx_tutor` VALUES (2, 'admin', '10000', 0, 0, '2019-05-27 17:16:18', '2019-05-31 13:55:50', 0);
INSERT INTO `sx_tutor` VALUES (14, 'admin', '10001', 0, 0, '2019-05-27 18:20:55', '2019-05-27 18:20:55', 1);
INSERT INTO `sx_tutor` VALUES (15, '20180001', '10001', 0, 0, '2019-05-28 13:12:25', '2019-05-31 13:35:32', 1);
INSERT INTO `sx_tutor` VALUES (16, '20180001', '10000', 1, 1, '2019-05-28 13:12:34', '2019-05-31 13:56:20', 1);
INSERT INTO `sx_tutor` VALUES (17, '20180002', '10000', 0, 0, '2019-06-03 15:43:31', '2019-06-03 21:13:52', 0);
INSERT INTO `sx_tutor` VALUES (18, '20180002', '10001', 0, 0, '2019-06-03 15:43:38', '2019-06-03 15:43:38', 1);
INSERT INTO `sx_tutor` VALUES (19, '20180002', '10002', 1, 1, '2019-06-03 15:43:41', '2019-06-03 15:49:26', 1);
INSERT INTO `sx_tutor` VALUES (20, '20180002', '10003', 0, 0, '2019-06-03 15:43:43', '2019-06-03 15:43:43', 1);
INSERT INTO `sx_tutor` VALUES (21, '20180002', '10004', 0, 0, '2019-06-03 15:43:46', '2019-06-03 15:43:46', 1);
INSERT INTO `sx_tutor` VALUES (22, '20180003', '10000', 1, 1, '2019-06-03 20:51:52', '2019-06-03 21:16:02', 1);
INSERT INTO `sx_tutor` VALUES (23, '20180001', '10004', 0, 0, '2019-08-16 22:26:43', '2019-08-16 22:26:43', 1);

-- ----------------------------
-- Table structure for wx_token
-- ----------------------------
DROP TABLE IF EXISTS `wx_token`;
CREATE TABLE `wx_token`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `token` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'token',
  `userid` bigint(20) NOT NULL COMMENT '用户ID',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `validity` int(11) NOT NULL COMMENT '有效期',
  `ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'IP地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '存储token用,顺便记录用户登录的信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wx_token
-- ----------------------------
INSERT INTO `wx_token` VALUES (7, '1295987d4ff4fd921c584d7d2515a781', 6, '2019-08-22 14:00:30', '2019-08-22 14:00:30', 1800, '0.0.0.0');
INSERT INTO `wx_token` VALUES (8, 'd7384b2b72c4f6e3b71f5377e770aa3d', 6, '2019-08-22 14:01:10', '2019-08-22 14:01:10', 1800, '0.0.0.0');
INSERT INTO `wx_token` VALUES (9, 'da2e659def87b0d22d738724c2af7673', 6, '2019-08-22 14:03:55', '2019-08-22 14:03:55', 1800, '0.0.0.0');
INSERT INTO `wx_token` VALUES (10, '064134775a32021ade8dc50822403bcb', 6, '2019-08-22 14:08:01', '2019-08-22 14:08:01', 1800, '0.0.0.0');
INSERT INTO `wx_token` VALUES (11, 'b680f8de4dbe15525cd34ec264dc28e5', 6, '2019-08-22 14:10:20', '2019-08-22 14:10:20', 1800, '0.0.0.0');
INSERT INTO `wx_token` VALUES (12, '1fdef0c9864aeebbaad30f7dbf618474', 6, '2019-08-22 14:13:11', '2019-08-22 14:13:11', 1800, '0.0.0.0');
INSERT INTO `wx_token` VALUES (13, 'db061ae2548d50bfc861da7a9e66d314', 6, '2019-08-22 14:15:29', '2019-08-22 14:23:09', 1800, '0.0.0.0');

-- ----------------------------
-- Table structure for wx_user
-- ----------------------------
DROP TABLE IF EXISTS `wx_user`;
CREATE TABLE `wx_user`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `openid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'openid,用户唯一标示',
  `wx_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '微信号',
  `is_black` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否是黑名单用户',
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `binding_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '绑定的学号或者教师号码',
  `binding_role` int(11) DEFAULT NULL COMMENT '绑定角色 0 学生  1 教师',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `wx_user_wx_number_uindex`(`wx_number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户的微信信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wx_user
-- ----------------------------
INSERT INTO `wx_user` VALUES (6, 'ob1oa0c8iB3lie31m3AhHYderKEA', NULL, 0, '2019-08-22 14:00:30', '2019-08-22 14:00:30', '20140161', 0);

SET FOREIGN_KEY_CHECKS = 1;
