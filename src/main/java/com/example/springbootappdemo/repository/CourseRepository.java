package com.example.springbootappdemo.repository;

import com.example.springbootappdemo.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long> {
    //Query methods
    //it are methods in the repository interface with speecific naming patterns
    Iterable<Course> findAllByCategory(String category);
    Iterable<Course> findAllByCategoryOrderByName(String category);
    boolean existsByName(String name);
    long countByCategory(String category);
    Iterable<Course> findByNameOrCategory(String name, String category);
    Iterable<Course> findByNameStartsWith(String name);
    Stream<Course> streamAllByCategory(String category);
}
