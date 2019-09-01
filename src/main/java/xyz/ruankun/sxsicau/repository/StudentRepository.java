package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.Student;

import java.util.Iterator;
import java.util.List;

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

    List<Student> findAllBySxStudentId(Iterator<String> stuIds);
}
