package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    Teacher findBySxTeacherIdAndSxTeacherPassword(String account, String password);

    Teacher findBySxTeacherId(String teacherNumber);
}
