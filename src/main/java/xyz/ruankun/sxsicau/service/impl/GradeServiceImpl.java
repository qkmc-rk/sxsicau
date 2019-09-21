package xyz.ruankun.sxsicau.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ruankun.sxsicau.entity.*;
import xyz.ruankun.sxsicau.repository.PracticeRepository;
import xyz.ruankun.sxsicau.repository.PracticeScoreRepository;
import xyz.ruankun.sxsicau.repository.TotalScoreRepository;
import xyz.ruankun.sxsicau.repository.WxUserRepository;
import xyz.ruankun.sxsicau.service.GradeService;
import xyz.ruankun.sxsicau.vo.fvo.ScoreVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GradeServiceImpl implements GradeService {

    Logger logger = LoggerFactory.getLogger(GradeServiceImpl.class);
    @Autowired
    PracticeScoreRepository practiceScoreRepository;
    @Autowired
    TotalScoreRepository totalScoreRepository;
    @Autowired
    WxUserRepository wxUserRepository;
    @Autowired
    PracticeRepository practiceRepository;

    @Override
    public ScoreVO findScoreByWxUserId(Integer wxUserId) {
        if (wxUserId == null){
            logger.error("传入的wxUserId为空");
            return null;
        }
        //通过wxUserId去查询学生的分数
        WxUser wxUser = wxUserRepository.findById(wxUserId.intValue());
        if (wxUser != null && wxUser.getBindingRole() == 1){
            logger.error("传入的是教师的ID或者非学生的ID，无法操作!信息是:{}", wxUser.toString());
            return null;
        }
        String studentNumber = wxUser.getBindingNumber();
        if (studentNumber == null){
            logger.error("没有绑定学号：{}", wxUser.toString());
            return null;
        }

        List<Practice> practices = practiceRepository.findAllBySxStudentId(studentNumber);
        List<PracticeScore> practiceScores = new ArrayList<>();
        PracticeScore practiceScore;
        for (Practice p :
                practices) {
            practiceScore
                    = practiceScoreRepository.findBySxPracticeId(p.getSxId());
            if (practiceScore != null){
                practiceScores.add(practiceScore);
            }
        }
        //找总成绩
        TotalScore totalScore
                = totalScoreRepository.findBySxStudentId(studentNumber);
        ScoreVO scoreVO = new ScoreVO();
        scoreVO.setPracticeScore(practiceScores);
        scoreVO.setTotalScore(totalScore);
        return scoreVO;
    }


    /**
     * 该方法可以获取所有学生的成绩信息，然后后面根据条件在结果中筛选即可
     * 虽然效率有点慢，但是方便啊
     * @return 学生所有的成绩
     */
    private Map<String, Object> getAllStudentScore(){

    }

}
