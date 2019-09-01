package xyz.ruankun.sxsicau.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ruankun.sxsicau.entity.*;
import xyz.ruankun.sxsicau.repository.*;
import xyz.ruankun.sxsicau.service.UserInfoService;
import xyz.ruankun.sxsicau.util.EntityUtil;
import xyz.ruankun.sxsicau.vo.fvo.FollowStudentVO;

import java.util.*;

/**
 *  详细信息请参照 interface UserInfoService
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    WxUserRepository wxUserRepository;
    @Autowired
    WxTokenRepository wxTokenRepository;
    @Autowired
    ResumeRepository resumeRepository;
    @Autowired
    FollowRepository followRepository;
    @Autowired
    PracticeRepository practiceRepository;

    @Override
    public Student findStudentInfo(Integer studentId) {
        if (studentId == null){
            logger.error("findStudentInfo: 输入的studentId为null,不能执行查询操作");
            return null;
        }
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (!optionalStudent.isPresent()){
            //如果option中没有值
            logger.error("findStudentInfo: 没有从数据库中查询到student的信息,输入的ID为{}", studentId);
            return null;
        }
        return optionalStudent.get();
    }

    @Override
    public Student findStudentInfo(String studentNumber) {
        if (studentNumber == null){
            logger.error("findStudentInfo: 输入的studentId为null,不能执行查询操作");
            return null;
        }
        Student student = studentRepository.findBySxStudentId(studentNumber);
        if (student == null){
            logger.error("findStudentInfo: 没有从数据库中查询到student的信息,输入的studentId为{}", studentNumber);
            return null;
        }
        return student;
    }

    @Override
    public Student updateStudentInfo(Student student) {
        if (student.getSxId() == null){
            logger.error("ID为空，无法完成更新学生信息请求");
            return null;
        }
        //重要的字段不能修改
//        student.setSxCampus(null);
//        student.setSxClazz(null);
//        student.setSxCollege(null);
//        student.setSxGtmCreate(null);
//        student.setSxGtmModified(new Date());
//        student.setSxIsLock(null);
//        student.setSxMajor(null);
//        student.setSxStudentId(null);
//        student.setSxTotorUp(null);
        try {
            return studentRepository.saveAndFlush(student);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("更新学生信息失败：" + student.toString());
            return null;
        }
    }

    @Override
    public Teacher findTeacherInfo(Integer teacherId) {
        if (teacherId == null){
            logger.error("findTeacherInfo: 输入的teacherId为null,不能执行查询操作");
            return null;
        }
        Optional<Teacher> optionalTeacher = teacherRepository.findById(teacherId);
        if (!optionalTeacher.isPresent()){
            //如果option中没有值
            logger.error("findTeacherInfo: 没有从数据库中查询到teacher的信息,输入的ID为{}", teacherId);
            return null;
        }
        return optionalTeacher.get();
    }

    @Override
    public Teacher findTeacherInfo(String teacherNumber) {
        if (teacherNumber == null){
            logger.error("findTeacherInfo: 输入的teacherId为null,不能执行查询操作");
            return null;
        }
        Teacher teacher = teacherRepository.findBySxTeacherId(teacherNumber);
        if (teacher == null){
            logger.error("findStudentInfo: 没有从数据库中查询到teacher的信息,输入的teacherId为{}", teacherNumber);
            return null;
        }
        return teacher;
    }

    @Override
    public Teacher updateTeacherInfo(Teacher teacher) {
        if (teacher.getSxId() == null){
            logger.error("ID为空，无法完成更新教师信息请求");
            return null;
        }
        //重要的字段不能修改
        //.....略
        try {
            return teacherRepository.saveAndFlush(teacher);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("更新教师信息失败：" + teacher.toString());
            return null;
        }
    }

    @Override
    public List<Resume> getResumeList() {
        List<Resume> rs;
        try {
            rs = resumeRepository.findAll();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("数据库获取或有简历信息时失败了！");
            return null;
        }
    }

    @Override
    public Resume getOneResume(String teacherNumber) {
        if (teacherNumber == null){
            logger.error("传入的teacherNumber为空");
            return null;
        }
        Resume resume;
        try {
            resume = resumeRepository.findBySxTeacherId(teacherNumber);
            return resume;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("通过工号查询简历时失败,工号是：" + teacherNumber);
            return null;
        }

    }

    @Override
    public Resume getOneResume(Integer resumeId) {
        if (resumeId == null){
            logger.error("传入的resumeId为空");
            return null;
        }
        Resume resume;
        try {
            resume = resumeRepository.findBySxId(resumeId.intValue());
            return resume;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("通过ID查询简历时失败,ID是：" + resumeId);
            return null;
        }
    }

    @Override
    public Resume updateResume(Resume resume) {
        if (resume == null){
          logger.error("传入的resume为空，无法完成更新操作");
            return null;
        }
        if (resume != null && resume.getSxId() == null){
            logger.error("简历信息的ID为空,无法完成更新操作,传入的对象是" + resume.toString());
        }

        Resume resOld = resumeRepository.findBySxId(resume.getSxId());
        if (resOld == null){
            logger.error("没有找到简历信息，请放弃,ID是" + resume.getSxId());
            return null;
        }
        resume.setSxGtmCreate(null);
        resume.setSxIsVisible(null);
        resume.setSxGtmModified(new Date());
        EntityUtil.update(resume,resOld);

        try {
            return resumeRepository.saveAndFlush(resume);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("尝试保存简历时失败,保存的对象是：" + resume.toString());
            return null;
        }

    }

    @Override
    public Resume deleteResume(Integer resumeId) {
        try {
            Resume resume = resumeRepository.findById(resumeId).get();
            resumeRepository.deleteById(resumeId);
            return resume;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("deleteResume遇到错误信息！ID是 " + resumeId);
            return null;
        }
    }

    @Override
    public Resume saveOneResume(Resume resume) {
        if (resume == null || resume.getSxId() != null){
            logger.error("这样的简历无法更新,要么是空，要么有ID：" + resume.toString());
            return null;
        }
        try {
            return resumeRepository.save(resume);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("保存简历失败,简历信息：" + resume.toString());
            return null;
        }
    }

    @Override
    public Map<String, Object> followHer0rHim(String sxStudentId, Integer wxUserId) {
        Map<String, Object> map = new HashMap<>();
        if (sxStudentId == null || wxUserId == null){
            map.put("ERROR", " 不能为空,sxStudentId:" + sxStudentId + ", wxUserId:" + wxUserId);
            return map;

        }
        Follow follow = null;
        String wxUserIdStr = String.valueOf(wxUserId);
        // 先验证之前是否关注
        if ((follow = followRepository.findBySxExtStudentIdAndSxExtFolloweeId(sxStudentId, wxUserIdStr)) != null){
            //之前关注过
            follow.setSxExtIsFollowing(true);
            map.put("SUCCESS",followRepository.saveAndFlush(follow));
            return map;

        }
        // 之前未关注
        follow = new Follow();
        follow.setSxExtFolloweeId(wxUserIdStr);
        follow.setSxExtGmtCreate(new Date());
        follow.setSxExtGmtModified(new Date());
        follow.setSxExtIsFollowing(true);
        follow.setSxExtStudentId(sxStudentId);
        try {
            follow = followRepository.save(follow);
            map.put("SUCCESS", follow);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("保存失败,无法保存follow:" + follow.toString());
            map.put("ERROR", "保存失败,无法保存follow:" + follow.toString());
        }
        return map;
    }

    @Override
    public Map<String, Object> cancelFollow(String sxStudentId, Integer wxUserId) {
        Map<String, Object> map = new HashMap<>();
        Follow follow = null;
        if (sxStudentId == null || wxUserId == null){
            map.put("ERROR", " 不能为空,sxStudentId:" + sxStudentId + ", wxUserId:" + wxUserId);
            return map;
        }
        try {
            follow = followRepository.findBySxExtStudentIdAndSxExtFolloweeId(sxStudentId, String.valueOf(wxUserId));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("找不到follow,学号:" + sxStudentId + ", wxUserId:" + wxUserId);
            map.put("ERROR", "找不到follow,学号:" + sxStudentId + ", wxUserId:" + wxUserId);
            return map;
        }
        follow.setSxExtIsFollowing(false);
        map.put("SUCCESS", followRepository.saveAndFlush(follow));
        return map;
    }

    @Override
    public Map<String, Object> getMyAttention(Integer wxUserId) {
        Map<String, Object> map = new HashMap<>();
        List<Follow> rs;
        try {
            rs = followRepository.findAllBySxExtFolloweeId(String.valueOf(wxUserId));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("错误，按照此ID查询出错了:" + wxUserId);
            map.put("ERROR", "错误，按照此ID查询出错了:" + wxUserId);
            return map;
        }
        //拿到了follow list,还要去拿学生的信息列表
        List<FollowStudentVO> students = new ArrayList<>();
        for (Follow f:
             rs) {
            try {
                students.add(new FollowStudentVO(studentRepository.findBySxStudentId(f.getSxExtStudentId())));
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("循环查找students时出现问题,f:" + f.toString());
                map.put("ERROR", "循环查找students时出现问题,f:" + f.toString());
                return map;
            }
        }
        map.put("SUCCESS", students);
        return map;

    }

    @Override
    public List<FollowStudentVO> getPractices(List<FollowStudentVO> success) {
        for (FollowStudentVO f :
                success) {
            List<Practice> practices = practiceRepository.findAllBySxStudentId(f.getSxStudentId());
            List<Practice> practices2 = new ArrayList<>();
            // 需要过滤掉is Visible == false的内容
            for (Practice p :
                    practices) {
                if (p.getSxIsVisible() != false)
                    practices2.add(p);
            }
            f.setPractices(practices2);
        }
        return success;
    }

    @Override
    public List<Practice> findPracticesOfHerOrHim(Integer wxUserId, String sxStudentId) {
        Follow follow = followRepository.findBySxExtStudentIdAndSxExtFolloweeId(sxStudentId, String.valueOf(wxUserId));
        if (follow == null || follow.getSxExtIsFollowing() == false) {
            // 没有这个关注
            logger.info("没有这个关注");
            return null;
        } else {
            return practiceRepository.findAllBySxStudentId(sxStudentId);
        }
    }
}
