package xyz.ruankun.sxsicau;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.ruankun.sxsicau.entity.Student;
import xyz.ruankun.sxsicau.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SxsicauApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public  void testStuRepo(){
		List<String> stuIds = new ArrayList<>();
		stuIds.add("20140161");
		stuIds.add("20140162");
		stuIds.add("20140285");
		List<Student> students = studentRepository.findAllBySxStudentId(stuIds.iterator());
		System.out.println(students.toString());
	}

}
