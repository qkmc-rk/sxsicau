package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.Practice;

import java.util.List;

public interface PracticeRepository extends JpaRepository<Practice, Integer> {

    List<Practice> findAllBySxStudentId(String sxStudentId);
}
