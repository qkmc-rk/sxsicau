package xyz.ruankun.sxsicau.vo.fvo;

import xyz.ruankun.sxsicau.entity.PracticeScore;
import xyz.ruankun.sxsicau.entity.TotalScore;

import java.util.List;

/**
 * 学生分数的VO
 *
 */
public class ScoreVO {

    private List<PracticeScore> practiceScore;

    private TotalScore totalScore;

    public List<PracticeScore> getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(List<PracticeScore> practiceScore) {
        this.practiceScore = practiceScore;
    }

    public TotalScore getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(TotalScore totalScore) {
        this.totalScore = totalScore;
    }
}
