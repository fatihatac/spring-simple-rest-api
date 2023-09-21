package com.javacourse.learnspringboot.courses.controller;

import com.javacourse.learnspringboot.courses.bean.Course;
import com.javacourse.learnspringboot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    private final CourseRepository repository;

    public CourseController(CourseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return repository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseDetails(@PathVariable long id){
        Optional<Course> course = repository.findById(id);
        if (course.isEmpty()){
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course);
    }

    @PutMapping("/courses{id}")
    public void updateCourse(@PathVariable long id,  @RequestBody Course course){
        repository.save(course);
    }
    @DeleteMapping("/courses{id}")
    public void deleteCourse(@PathVariable long id){
        repository.deleteById(id);
    }
}
