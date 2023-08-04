package com.example.springbootappdemo.repository;

import com.example.springbootappdemo.entity.Course;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CoursePageRepositoryTest {

    @Autowired
    CoursePageRepository coursePageRepository;

    @Test
    void givenDataAvailableWhenLoadFirstPageThenGetFiveRecords(){
        Pageable pageable = PageRequest.of(0,5);
        Page<Course> pagina = coursePageRepository.findAll(pageable);

        List<Course> content = pagina.getContent();
        for(Course c : pagina){
            System.out.println(c.getId());
            System.out.println(c.getNombre());
        }

        assertThat(coursePageRepository.findAll(pageable)).hasSize(5);
        Pageable nextPageable = pageable.next();
        assertThat (coursePageRepository.findAll(nextPageable)).hasSize(4);
        assertThat(nextPageable.getPageNumber()).isEqualTo(1);
    }
}