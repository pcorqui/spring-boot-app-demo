package com.example.springbootappdemo.service;

import com.example.springbootappdemo.entity.Course;
import com.example.springbootappdemo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Long addCourse(){

        Course course = new Course("prueba","libro",3,"prueba para save");
        return courseRepository.save(course).getId();
    }
}
