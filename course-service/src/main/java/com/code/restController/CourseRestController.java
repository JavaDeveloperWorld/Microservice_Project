package com.code.restController;

import com.code.model.Course;
import com.code.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")

public class CourseRestController {
    @Autowired
    CourseService courseService;

    @GetMapping
    public List<Course>getAllCourse(){
        return  courseService.getAllCourse();
    }
    @GetMapping("/id")
    public Course getCourse(@RequestParam int id){
        return  courseService.getCourse(id);
    }
}
