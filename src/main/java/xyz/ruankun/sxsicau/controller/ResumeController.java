package xyz.ruankun.sxsicau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.ruankun.sxsicau.annotation.Authentication;
import xyz.ruankun.sxsicau.entity.Resume;
import xyz.ruankun.sxsicau.entity.WxToken;
import xyz.ruankun.sxsicau.entity.WxUser;
import xyz.ruankun.sxsicau.service.UserInfoService;
import xyz.ruankun.sxsicau.service.UserService;
import xyz.ruankun.sxsicau.util.constant.AuthAopConstant;
import xyz.ruankun.sxsicau.vo.ResponseEntity;

import java.util.Date;

/**
 * 简历控制器,查询简历
 * 1. 查询教师简历列表
 * 2. 查询简历详细信息
 * 3. 修改简历信息
 * 4. 删除简历信息
 * 5. 添加一份儿简历(不存在时才能添加，否则不能添加)
 */

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserService userService;

    /**
     * 匿名方法
     * 获取所有教师简历信息
     * 一个列表
     * @return 教师简历列表
     */
    @GetMapping("")
    public ResponseEntity getResumeList(){
        return ControllerUtil.getDataResult(userInfoService.getResumeList());
    }

    @GetMapping("/{teacherNumber}")
    public ResponseEntity getOneResume(@PathVariable String teacherNumber){
        return ControllerUtil.getDataResult(userInfoService.getOneResume(teacherNumber));
    }


    /**
     *  根据resumeId来修改一份儿resume
     * @param resume
     * @param token
     * @param resumeId
     * @return
     */
    @PostMapping("/{resumeId}")
    @Authentication(role = AuthAopConstant.TEACHER)
    public ResponseEntity editResume(@RequestBody Resume resume,
                                     @RequestHeader String token,
                                     @PathVariable Integer resumeId){
        resume.setSxId(resumeId);
        WxToken wxToken = userService.gotWxTokenByToken(token);
        WxUser wxUser = userService.getUser(wxToken.getUserId());

        Resume rs = userInfoService.getOneResume(wxUser.getBindingNumber());
        if (rs == null){
            return ControllerUtil.getFalseResultMsgBySelf("你还没有简历信息");
        }
        if (rs !=null && rs.getSxId() != resumeId){
            return ControllerUtil.getFalseResultMsgBySelf("请问你要修改谁的简历信息?你的ID不是" + rs.getSxId() + "吗？？");
        }
        if (resume.getSxId() == null){
            //无法更新
            return ControllerUtil.getFalseResultMsgBySelf("没有ID，不知道更新哪个");
        }
        Resume resume1 = userInfoService.updateResume(resume);
        return ControllerUtil.getDataResult(resume1);
    }

    @DeleteMapping("/{resumeId}")
    @Authentication(role = AuthAopConstant.TEACHER)
    public ResponseEntity deleteResume(@RequestHeader String token,
                                     @PathVariable Integer resumeId){
        WxToken wxToken = userService.gotWxTokenByToken(token);
        WxUser wxUser = userService.getUser(wxToken.getUserId());

        Resume rs = userInfoService.getOneResume(wxUser.getBindingNumber());
        if (rs == null){
            return ControllerUtil.getFalseResultMsgBySelf("你还没有简历信息");
        }else {
            Resume resume = userInfoService.deleteResume(resumeId);
            return ControllerUtil.getDataResult(resume);
        }
    }

    @PutMapping("")
    @Authentication(role = AuthAopConstant.TEACHER)
    public ResponseEntity addResume(@RequestBody Resume resume,
                                    @RequestHeader String token){
        WxToken wxToken = userService.gotWxTokenByToken(token);
        WxUser wxUser = userService.getUser(wxToken.getUserId());
        resume.setSxTeacherId(wxUser.getBindingNumber());   // 简历与人绑定关系
        resume.setSxGtmCreate(new Date());
        resume.setSxGtmModified(new Date());
        resume.setSxIsVisible(true);
        resume.setSxId(null);
        Resume resume1 = userInfoService.saveOneResume(resume);
        return ControllerUtil.getDataResult(resume1);
    }


}
