package com.code.restController;

import com.code.model.Student;
import com.code.model.StudentDetailed;
import com.code.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    @Autowired
    StudentService studentService;


    @GetMapping
    public List<Student>getAllList(){
        return studentService.getAllStudents();
    }

    @GetMapping("/id")
    public StudentDetailed getStudentDetailedWithCourse(@RequestParam int id){
        return studentService.getStudentDetailed(id);
    }
}
