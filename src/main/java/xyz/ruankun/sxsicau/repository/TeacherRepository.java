package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    Teacher findBySx_teacher_idAndSx_teacher_password(String account, String password);
}
