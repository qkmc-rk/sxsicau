package xyz.ruankun.sxsicau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import xyz.ruankun.sxsicau.annotation.Authentication;
import xyz.ruankun.sxsicau.service.GradeService;
import xyz.ruankun.sxsicau.util.constant.AuthAopConstant;
import xyz.ruankun.sxsicau.vo.ResponseEntity;
import xyz.ruankun.sxsicau.vo.fvo.ScoreVO;

/**
 * 成绩管理控制器
 * 功能如下：
 *  1. 学生查看自己的成绩
 *      1.1 查看自己所有的成绩
 *      1.2 查看自己的总成绩
 *      1.3 查看自己某个实习报告的详细成绩
 *  2. 教师查看自己学生的成绩
 *      2.1 查看某个学生的某个成绩
 *      2.2 查看某个学生的所有成绩
 *      2.3 查看所有学生的所有成绩
 *      2.4 查看所有学生的总成绩
 *  3. 教师对自己学生的实习报告进行打分
 *      3.1 对某个学生的某份儿成绩进行评分
 *      3.2 对某个学生进行总评
 *  4. 教师修改自己学生的成绩
 *      4.1 修改某个学生某次的分数
 *      4.2 修改某个学生某次实习的分数
 */
@RestController
public class GradeController{

    @Autowired
    GradeService gradeService;

    /**
     * 学生查询自己的成绩
     * @param token
     * @return 学生自己的成绩，包括所有实习的成绩，总成绩等。
     */
    @GetMapping("/grades")
    @Authentication(role = AuthAopConstant.STUDENT)
    public ResponseEntity seekOwnGrade(@RequestHeader String token){
        Integer wxUserId = new ControllerUtil().getWxUserId(token);
        ScoreVO scoreVO = gradeService.findScoreByWxUserId(wxUserId);
        if (scoreVO != null){
            return ControllerUtil.getDataResult(scoreVO);
        }else {
            return ControllerUtil.getFalseResultMsgBySelf("没有找到成绩信息，详细信息请查看后台错误日志");
        }
    }

    /**
     *  教师查询自己学生的成绩
     * @param token
     * @return 2.3 教师的所有学生的所有成绩
     */
    @GetMapping("/students/grades")
    @Deprecated
    public ResponseEntity seekMyStudentsGrade(@RequestHeader String token){

        return null;
    }

}
