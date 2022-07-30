/*
 Navicat Premium Data Transfer

 Source Server         : hr
 Source Server Type    : MySQL
 Source Server Version : 50625
 Source Host           : localhost:3306
 Source Schema         : school

 Target Server Type    : MySQL
 Target Server Version : 50625
 File Encoding         : 65001

 Date: 20/11/2020 10:09:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hand_course
-- ----------------------------
DROP TABLE IF EXISTS `hand_course`;
CREATE TABLE `hand_course`  (
  `COURSE_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程号',
  `COURSE_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `TEACHER_NO` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师编号',
  PRIMARY KEY (`COURSE_NO`, `TEACHER_NO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hand_course
-- ----------------------------
INSERT INTO `hand_course` VALUES ('c001', 'J2SE', 't002');
INSERT INTO `hand_course` VALUES ('c002', 'Java Web', 't002');
INSERT INTO `hand_course` VALUES ('c003', 'SSH', 't001');
INSERT INTO `hand_course` VALUES ('c004', 'Oracle', 't001');
INSERT INTO `hand_course` VALUES ('c005', 'SQL SERVER 2005', 't003');
INSERT INTO `hand_course` VALUES ('c006', 'C#', 't003');
INSERT INTO `hand_course` VALUES ('c007', 'JavaScript', 't002');
INSERT INTO `hand_course` VALUES ('c008', 'DIV+CSS', 't001');
INSERT INTO `hand_course` VALUES ('c009', 'PHP', 't003');
INSERT INTO `hand_course` VALUES ('c010', 'EJB3.0', 't002');

-- ----------------------------
-- Table structure for hand_student
-- ----------------------------
DROP TABLE IF EXISTS `hand_student`;
CREATE TABLE `hand_student`  (
  `STUDENT_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `STUDENT_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `STUDENT_AGE` decimal(2, 0) NULL DEFAULT NULL COMMENT '年龄',
  `STUDENT_GENDER` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`STUDENT_NO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hand_student
-- ----------------------------
INSERT INTO `hand_student` VALUES ('s001', '张三', 23, '男');
INSERT INTO `hand_student` VALUES ('s002', '李四', 23, '男');
INSERT INTO `hand_student` VALUES ('s003', '吴鹏', 25, '男');
INSERT INTO `hand_student` VALUES ('s004', '琴沁', 20, '女');
INSERT INTO `hand_student` VALUES ('s005', '王丽', 20, '女');
INSERT INTO `hand_student` VALUES ('s006', '李波', 21, '男');
INSERT INTO `hand_student` VALUES ('s007', '刘玉', 21, '男');
INSERT INTO `hand_student` VALUES ('s008', '萧蓉', 21, '女');
INSERT INTO `hand_student` VALUES ('s009', '陈萧晓', 23, '女');
INSERT INTO `hand_student` VALUES ('s010', '陈美', 22, '女');

-- ----------------------------
-- Table structure for hand_student_core
-- ----------------------------
DROP TABLE IF EXISTS `hand_student_core`;
CREATE TABLE `hand_student_core`  (
  `STUDENT_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `COURSE_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程号',
  `CORE` decimal(4, 2) NULL DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`STUDENT_NO`, `COURSE_NO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生成绩表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hand_student_core
-- ----------------------------
INSERT INTO `hand_student_core` VALUES ('s001', 'c001', 58.90);
INSERT INTO `hand_student_core` VALUES ('s001', 'c002', 82.90);
INSERT INTO `hand_student_core` VALUES ('s001', 'c003', 59.00);
INSERT INTO `hand_student_core` VALUES ('s002', 'c001', 80.90);
INSERT INTO `hand_student_core` VALUES ('s002', 'c002', 72.90);
INSERT INTO `hand_student_core` VALUES ('s003', 'c001', 81.90);
INSERT INTO `hand_student_core` VALUES ('s003', 'c002', 81.90);
INSERT INTO `hand_student_core` VALUES ('s004', 'c001', 60.90);

-- ----------------------------
-- Table structure for hand_teacher
-- ----------------------------
DROP TABLE IF EXISTS `hand_teacher`;
CREATE TABLE `hand_teacher`  (
  `TEACHER_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师编号',
  `TEACHER_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师名称',
  `MANAGER_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上级编号',
  PRIMARY KEY (`TEACHER_NO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hand_teacher
-- ----------------------------
INSERT INTO `hand_teacher` VALUES ('t001', '刘阳', NULL);
INSERT INTO `hand_teacher` VALUES ('t002', '谌燕', 't001');
INSERT INTO `hand_teacher` VALUES ('t003', '胡明星', 't002');

-- ----------------------------
-- Table structure for hand_teacher_emp
-- ----------------------------
DROP TABLE IF EXISTS `hand_teacher_emp`;
CREATE TABLE `hand_teacher_emp`  (
  `EMP_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工编码',
  `TEACHER_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师编码',
  `MANAGER_NO` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理者编码',
  PRIMARY KEY (`EMP_NO`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师员工信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hand_teacher_emp
-- ----------------------------
INSERT INTO `hand_teacher_emp` VALUES ('e0001001', 't001', NULL);
INSERT INTO `hand_teacher_emp` VALUES ('e0001002', 't002', 't001');
INSERT INTO `hand_teacher_emp` VALUES ('e0001003', 't003', 't002');

SET FOREIGN_KEY_CHECKS = 1;
