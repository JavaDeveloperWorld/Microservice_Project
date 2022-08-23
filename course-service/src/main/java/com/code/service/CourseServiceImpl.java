package com.code.service;

import com.code.model.Course;
import com.code.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(int id) {
        return courseRepository.findById(id).orElse(null);
    }
}
