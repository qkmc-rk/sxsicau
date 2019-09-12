package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.PracticeScore;

public interface PracticeScoreRepository extends JpaRepository<PracticeScore, Integer> {

    PracticeScore findBySxPracticeId(Integer sxId);
}
