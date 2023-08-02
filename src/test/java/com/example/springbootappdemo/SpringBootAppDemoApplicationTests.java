package com.example.springbootappdemo;

import com.example.springbootappdemo.entity.Course;
import com.example.springbootappdemo.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.SqlConfig;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
@DataJpaTest //no initialize all context only the beans necessary
@TestPropertySource(properties = "spring.sql.init.mode=never") //avoid execute the scheme.sql and data.sql for test
class SpringBootAppDemoApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	public void whenCountAllCoursesThenExpectFiveCourses() throws SQLException{
		ResultSet rs = null;
		int noOfCourses = 0;
		try(PreparedStatement ps = dataSource.getConnection().prepareStatement("SELECT COUNT(1) FROM COURSES")){
			rs = ps.executeQuery();
			while(rs.next()){
				noOfCourses = rs.getInt(1);
			}
			assertThat(noOfCourses).isEqualTo(5L);
		}
		finally{
			if(rs != null){
				rs.close();
			}
		}
	}

	@Autowired
	private CourseRepository courseRepository;

	//trying the save
	@Test
	public void givenCreateCourseWhenLoadTheCourseeThenEExpectSameCourse(){
		Course course = new Course("Rapid Spring boot Application Development", "Spring",4,"" +
				"Spring Boot gives all the power of the Spring Framework withou all of the complexities");
		Course savedCourse = courseRepository.save(course);
		assertThat(courseRepository.findById(savedCourse.getId()).get()).isEqualTo(course);
	}

	//provando los query methods
	@Test
	public void givenCreateCourseWhenLoadTheCourseThenExpectSameCourse(){
		//saving a list of courses
		//courseRepository.saveAll(getCourseList());
		assertThat(courseRepository.findAllByCategory("Spring")).hasSize(3);
		assertThat(courseRepository.existsByName("javaScript for all")).isTrue();
		assertThat(courseRepository.existsByName("Mastering JavaScript")).isFalse();
		assertThat(courseRepository.countByCategory("Python")).isEqualTo(2);
		assertThat(courseRepository.findByNameStartsWith("Getting Started")).hasSize(3);
	}

	private List<Course> getCourseList(){
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("javaScript for all","Spring",4,"prueba spring "));
		return courses;
	}

	@Test
	void contextLoads() {
	}

}
