package com.javacourse.learnspringboot.courses.repository;

import com.javacourse.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
