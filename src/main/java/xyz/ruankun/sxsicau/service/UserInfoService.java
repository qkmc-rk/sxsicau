package xyz.ruankun.sxsicau.service;

import xyz.ruankun.sxsicau.entity.Practice;
import xyz.ruankun.sxsicau.entity.Resume;
import xyz.ruankun.sxsicau.entity.Student;
import xyz.ruankun.sxsicau.entity.Teacher;
import xyz.ruankun.sxsicau.vo.fvo.FollowStudentVO;

import java.util.List;
import java.util.Map;

/**
 * 该服务提供：
 *  1. 学生个人信息查询,修改
 *  2. 教师个人信息查询,修改
 */

public interface UserInfoService {

    /**
     * 根据学生信息的ID查询学生的信息
     * 其中有些字段不能外漏的，必须置空
     * <b><i style="color:red;">该方法没有进行隐私字段处理</i></b>
     * @param studentId 学生信息的ID,并不是学号
     * @return student实体
     */
    Student findStudentInfo(Integer studentId);

    /**
     * 重载
     * @param studentNumber
     * @return
     */
    Student findStudentInfo(String studentNumber);

    /**
     * 更新学生的相关信息,必须包含student的ID
     * @param student 学生信息的实体对象
     * @return student实体,出错时返回null
     */
    Student updateStudentInfo(Student student);

    /**
     * 根据教师信息的ID查询教师的信息
     * 其中有些字段不能外漏的，必须置空
     * <b><i style="color:red;">该方法没有进行隐私字段处理</i></b>
     * @param teacherId 教师信息的ID,并不是教职工号
     * @return teacher实体
     */
    Teacher findTeacherInfo(Integer teacherId);

    /**
     *
     * @param teacherNumber
     * @return
     */
    Teacher findTeacherInfo(String teacherNumber);

    List<Teacher> findAllTeachers();

    /**
     * 更新教师的相关信息,必须包含teacher的ID
     * @param teacher 教师信息的实体对象
     * @return teacher实体,出错时返回null
     */
    Teacher updateTeacherInfo(Teacher teacher);

    /**
     *  获取数据库中教师简历的列表信息
     * @return
     */
    List<Resume> getResumeList();

    Resume getOneResume(String teacherNumber);

    Resume getOneResume(Integer resumeId);

    /**
     * 根据ID来更新教师的简历信息
     * 如果其中ID没有的话就会抛出异常
     * @param resume
     * @return
     */
    Resume updateResume(Resume resume);

    /**
     * 删除简历信息
     * @param resumeId
     * @return
     */
    Resume deleteResume(Integer resumeId);

    /**
     * 保存一份儿新的简历
     * @param resume
     * @return
     */
    Resume saveOneResume(Resume resume);

    /**
     * 关注你的他(她)
     * @param sxStudentId 你关注的学生的学号
     * @param wxUserId 你的微信账号ID
     * @return
     */
    Map<String, Object> followHer0rHim(String sxStudentId, Integer wxUserId);

    /**
     *  取消关注
     * @param sxStudentId 你关注的学生的学号
     * @param wxUserId 你的微信账号ID
     * @return map\<String, Object[String/Follow]\>
     */
    Map<String, Object> cancelFollow(String sxStudentId, Integer wxUserId);

    /**
     *  获取我关注的用户(学生)的信息
     *
     * @param wxUserId
     * @return
     */
    Map<String, Object> getMyAttention(Integer wxUserId);

    /**
     * 为他插上梦想的翅膀
     * @param success 关注的人的列表
     * @return 带着实习信息的关注的人的列表
     */
    List<FollowStudentVO> getPractices(List<FollowStudentVO> success);

    List<Practice> findPracticesOfHerOrHim(Integer wxUserId, String sxStudentId);
}
