package com.example.springbootappdemo.repository;

import com.example.springbootappdemo.entity.Course;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursePageRepository extends PagingAndSortingRepository<Course,Long> {

}
