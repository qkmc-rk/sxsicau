package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Integer> {

    /**
     * 重构了一下，没有Optional了
     * @param resumeId
     * @return
     */
    Resume findBySxId(int resumeId);

    Resume findBySxTeacherId(String sxTeacherId);

}
