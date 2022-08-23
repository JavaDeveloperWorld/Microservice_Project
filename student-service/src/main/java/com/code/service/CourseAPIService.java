package com.code.service;

import com.code.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CourseAPIService {
       @Autowired
        RestTemplate restTemplate;

        private static final String courseMicroservice= "http://course-service";

        public Course getCourse(int courseId){
            Course course=restTemplate.getForObject(courseMicroservice+"/course/id?id={courseId}",Course.class,courseId);
            return course;
        }

}
