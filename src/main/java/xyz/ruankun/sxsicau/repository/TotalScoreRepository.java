package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.TotalScore;

public interface TotalScoreRepository extends JpaRepository<TotalScore, Integer> {

    TotalScore findBySxStudentId(String studentNumber);
}
