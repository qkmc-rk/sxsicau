package xyz.ruankun.sxsicau.service;

import xyz.ruankun.sxsicau.vo.fvo.ScoreVO;

/**
 *  定义成绩相关的操作方法
 */
public interface GradeService {

    /**
     * 通过微信用户的ID找到对应用户的成绩信息
     * 需要注意的是传入的ID必须是学生的账号ID，教师的就不行
     * @param wxUserId 微信用户的ID
     * @return 学生的成绩信息
     */
    ScoreVO findScoreByWxUserId(Integer wxUserId);



}
