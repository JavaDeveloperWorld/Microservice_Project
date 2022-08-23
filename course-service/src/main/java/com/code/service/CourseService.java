package com.code.service;

import com.code.model.Course;

import java.util.List;

public interface CourseService {

    List<Course>getAllCourse();

    Course getCourse(int id);
}
