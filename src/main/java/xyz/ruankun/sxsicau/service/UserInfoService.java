package xyz.ruankun.sxsicau.service;

import xyz.ruankun.sxsicau.entity.Resume;
import xyz.ruankun.sxsicau.entity.Student;
import xyz.ruankun.sxsicau.entity.Teacher;

import java.util.List;

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
}
