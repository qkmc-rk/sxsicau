package xyz.ruankun.sxsicau.service;

import xyz.ruankun.sxsicau.entity.Follow;
import xyz.ruankun.sxsicau.entity.Practice;
import xyz.ruankun.sxsicau.entity.Student;

import java.util.List;

/**
 * 该接口装了关注相关的方法
 */
public interface AttentionService {

    /**
     * 关注一个人(这个人是一个学生)
     * @param sxStudentId 学生的ID
     * @param wxUserId 关注者的ID，关注着是一个WxUser
     * @return
     */
    Follow followHimOrHer(String sxStudentId, Integer wxUserId);

    /**
     * 取消关注
     * @param sxStudentId
     * @param wxUserId
     * @return
     */
    Follow cancelFollow(String sxStudentId, Integer wxUserId);

    /**
     * 获取我关注的人的信息
     * @param wxUserId 我的wxUser Id
     * @return 关注者信息列表
     */
    List<Student> getPeopleWhoIamFollowing(Integer wxUserId);

    /**
     * 拿到他(我关注的他(她))的实习信息
     * @param sxStudentId
     * @return 实习信息的列表
     */
    List<Practice> getPracticeOfHerHim(String sxStudentId);
}
