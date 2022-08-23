package com.code.service;

import com.code.model.Course;
import com.code.model.Student;
import com.code.model.StudentDetailed;
import com.code.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseAPIService courseAPIService;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentDetailed getStudentDetailed(int id) {

        Student st=studentRepository.findById(id).orElse(null);

        Course course=courseAPIService.getCourse(st.getCourse_id());

        StudentDetailed std=new StudentDetailed();

        BeanUtils.copyProperties(st,std);

        std.setCourse(course);

        return std;
    }
}
