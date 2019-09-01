package xyz.ruankun.sxsicau.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ruankun.sxsicau.entity.Follow;
import xyz.ruankun.sxsicau.entity.Practice;
import xyz.ruankun.sxsicau.entity.Student;
import xyz.ruankun.sxsicau.repository.FollowRepository;
import xyz.ruankun.sxsicau.repository.StudentRepository;
import xyz.ruankun.sxsicau.repository.TeacherRepository;
import xyz.ruankun.sxsicau.service.AttentionService;

import java.util.List;

@Service
public class AttentionServiceImpl implements AttentionService {

    Logger logger = LoggerFactory.getLogger(AttentionServiceImpl.class);

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    FollowRepository followRepository;


    @Override
    public Follow followHimOrHer(String sxStudentId, Integer wxUserId) {
        if (sxStudentId == null || wxUserId == null) {
            logger.error("传入的字段为空:{},{}", sxStudentId, wxUserId);
            return null;
        }
        if (studentRepository.findBySxStudentId(sxStudentId) == null){
            logger.error("数据库找不到student信息,无法关注不存在得人,学号为{}", sxStudentId);
        }
        return null;
    }

    @Override
    public Follow cancelFollow(String sxStudentId, Integer wxUserId) {
        return null;
    }

    @Override
    public List<Student> getPeopleWhoIamFollowing(Integer wxUserId) {
        return null;
    }

    @Override
    public List<Practice> getPracticeOfHerHim(String sxStudentId) {
        return null;
    }

}
