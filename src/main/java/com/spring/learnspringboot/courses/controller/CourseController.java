package com.spring.learnspringboot.courses.controller;

import com.spring.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return List.of(new Course(11, "Learn Microservices", "spring"), new Course(2, "Learn Full Stack with React", "spring"));
    }

    @GetMapping("/courses/1")
    public Course getCourseDetails(){
        return new Course(21, "Learn Microservices1", "spring2");
    }

}
