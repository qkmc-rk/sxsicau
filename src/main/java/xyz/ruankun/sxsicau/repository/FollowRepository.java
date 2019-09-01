package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.Follow;

import java.util.List;

public interface FollowRepository extends JpaRepository<Follow, Integer> {

    /**
     *  查找跟随
     * @return
     * @param sxStudentId
     * @param s
     */
    Follow findBySxExtStudentIdAndSxExtFolloweeId(String sxStudentId, String s);


    List<Follow> findAllBySxExtFolloweeId(String sxExtFolloweeId);
}
