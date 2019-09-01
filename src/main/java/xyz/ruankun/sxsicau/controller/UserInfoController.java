package xyz.ruankun.sxsicau.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.ruankun.sxsicau.annotation.Authentication;
import xyz.ruankun.sxsicau.entity.Student;
import xyz.ruankun.sxsicau.entity.Teacher;
import xyz.ruankun.sxsicau.entity.WxToken;
import xyz.ruankun.sxsicau.entity.WxUser;
import xyz.ruankun.sxsicau.service.UserInfoService;
import xyz.ruankun.sxsicau.service.UserService;
import xyz.ruankun.sxsicau.util.EntityUtil;
import xyz.ruankun.sxsicau.util.constant.AuthAopConstant;
import xyz.ruankun.sxsicau.vo.ResponseEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 该控制器主要职责是：
 *  1. 学生个人信息查看以及部分修改
 *  2. 教师个人信息查看以及部分修改
 */

@RestController
@RequestMapping("/user")
public class UserInfoController {

    Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    UserService userService;

    @Autowired
    UserInfoService userInfoService;

    // 1. 学生教师信息查看
    @GetMapping({"/student/info", "/teacher/info", "/info"})
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity studentOrTeacherInfo(@RequestHeader String token){

        Map<String, Object> map = new ControllerUtil().youGetUserByToken(token);
        if (map.get("ERROR") != null){
            return ControllerUtil.getFalseResultMsgBySelf((String) map.get("ERROR"));
        }
        WxUser wxUser = (WxUser) map.get("SUCCESS");
        String bindingNumber = wxUser.getBindingNumber();
        if (wxUser.getBindingRole() == 0){
            //学生
            Student student = userInfoService.findStudentInfo(bindingNumber);
            return ControllerUtil.getDataResult(student);
        }else if (wxUser.getBindingRole() == 1){
            //教师
            Teacher teacher = userInfoService.findTeacherInfo(bindingNumber);
            return ControllerUtil.getDataResult(teacher);
        }else{
            return ControllerUtil.getFalseResultMsgBySelf("绑定的角色有误,roleId: " + wxUser.getBindingRole() + ",学生(0)教师(1).");
        }

    }

    // 2. 学生教师信息修改综合方法

    @PostMapping("/student/info")
    @Authentication(role = AuthAopConstant.STUDENT)
    @ApiOperation(value = "学生可以修改字段:姓名 电话 密码 性别 民族 头像。")
    public ResponseEntity changeStudentInfo(@RequestBody Student student, @RequestHeader String token){
        return changeStudentOrTeacherInfo(student,null, token);
    }
    @PostMapping("/teacher/info")
    @Authentication(role = AuthAopConstant.TEACHER)
    @ApiOperation(value = "教师可以修改字段:姓名 密码 民族 性别 年龄")
    public ResponseEntity changeTeacherInfo(@RequestBody Teacher teacher, @RequestHeader String token){
        return changeStudentOrTeacherInfo(null,teacher,token);
    }

    /**
     * 封装学生教师修改自己的信息
     * @param student 学生信息
     * @param teacher 教师信息
     * @param token 令牌
     * @return 结果
     */
    public ResponseEntity changeStudentOrTeacherInfo(Student student, Teacher teacher, String token){
        if (student == null && teacher == null){
            return ControllerUtil.getFalseResultMsgBySelf("teacher和student对象不能同时为空");
        }

        Map<String, Object> map = new ControllerUtil().youGetUserByToken(token);
        if (map.get("ERROR") != null){
            return ControllerUtil.getFalseResultMsgBySelf((String) map.get("ERROR"));
        }
        WxUser wxUser = (WxUser) map.get("SUCCESS");
        Integer role = wxUser.getBindingRole();
        String number = wxUser.getBindingNumber();
        if (role == 0){
            //学生信息
            if (student == null)
                return ControllerUtil.getFalseResultMsgBySelf("student为空,无法更新");
            Student stuOld = userInfoService.findStudentInfo(number);
            //去除学生中不能修改的信息
            student.setSxTotorUp(null);
            student.setSxStudentId(null);
            student.setSxMajor(null);
            student.setSxIsLock(null);
            student.setSxGtmModified(new Date());
            student.setSxCollege(null);
            student.setSxClazz(null);
            student.setSxGrade(null);
            student.setSxId(null);
            student.setSxGtmCreate(null);
            student.setSxCampus(null);
            //logger.info("新的学生 + " + student.toString());
            //logger.info("老的学生" + stuOld.toString());
            EntityUtil.update(student, stuOld);
            //logger.info("更新后新的" + student.toString());
            //logger.info("更新后老的：" + stuOld.toString());


            Student rs = userInfoService.updateStudentInfo(student);
            return ControllerUtil.getDataResult(rs);
        }else if (role == 1){
            //教师信息
            Teacher techOld = userInfoService.findTeacherInfo(number);
            //去除敏感信息
            teacher.setSxCollege(null);
            teacher.setSxGtmCreate(null);
            teacher.setSxGtmModified(new Date());
            teacher.setSxId(null);
            teacher.setSxIsLock(null);
            teacher.setSxTeacherId(null);
            teacher.setSxTutor(null);
            teacher.setSxTutorUp(null);

            EntityUtil.update(teacher, techOld);
            Teacher rs = userInfoService.updateTeacherInfo(teacher);
            return ControllerUtil.getDataResult(rs);
        }else {
            return ControllerUtil.getFalseResultMsgBySelf("绑定的角色有误,roleId: " + wxUser.getBindingRole() + ",学生(0)教师(1).");
        }


    }

}
