package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    /**
     *  通过学生的学号和密码找到学生
     *  这是一个验证方法
     * @param sxStudentId 学号
     * @param sxStudentPassword 密码,默认身份证后6位
     * @return
     */
    Student findBySxStudentIdAndSxStudentPassword(String sxStudentId, String sxStudentPassword);

    Student findBySxStudentId(String studentId);
}
