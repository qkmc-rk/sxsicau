package xyz.ruankun.sxsicau.controller;

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

    UserService userService;

    UserInfoService userInfoService;

    // 1. 学生教师信息查看
    @GetMapping({"/student/info", "/teacher/info", "/info"})
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity studentOrTeacherInfo(@RequestHeader String token){

        Map<String, Object> map = youGetUserByToken(token);
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

    // 2. 学生教师信息修改
    @PostMapping({"/student/info", "/teacher/info", "/info"})
    @Authentication(role = AuthAopConstant.BOTH)
    public ResponseEntity changeStudentOrTeacherInfo(@RequestBody(required = false) Student student,
                                            @RequestBody(required = false) Teacher teacher,
                                            @RequestHeader String token){
        if (student == null && teacher == null){
            return ControllerUtil.getFalseResultMsgBySelf("teacher和student对象不能同时为空");
        }

        Map<String, Object> map = youGetUserByToken(token);
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

            EntityUtil.update(student, stuOld);
            Student rs = userInfoService.updateStudentInfo(stuOld);
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
            Teacher rs = userInfoService.updateTeacherInfo(techOld);
            return ControllerUtil.getDataResult(rs);
        }else {
            return ControllerUtil.getFalseResultMsgBySelf("绑定的角色有误,roleId: " + wxUser.getBindingRole() + ",学生(0)教师(1).");
        }


    }

    /**
     * 封装让代码看起来不是屎
     * @param token 令牌信息
     * @return 返回🔨
     */
    public Map<String, Object> youGetUserByToken(String token){
        HashMap<String, Object> map = new HashMap<>();
        if (token == null){
            map.put("ERROR", "token不能为空");
            return map;
        }
        WxToken wxToken = userService.gotWxTokenByToken(token);
        if (wxToken == null){
            map.put("ERROR","token信息查不到或者token已经过期");
            return map;
        }
        Integer userId = wxToken.getUserId();
        if (userId == null){
            map.put("ERROR","wxToken对象有误，查不到userId信息: " + wxToken.toString());
            return map;
        }
        WxUser wxUser = userService.getUser(userId);
        if (wxUser == null){
            map.put("ERROR","该userId是错误的值对象，数据库查不到该ID的user：" + userId);
            return map;
        }
        map.put("SUCCESS", wxUser);
        return map;

    }

}
