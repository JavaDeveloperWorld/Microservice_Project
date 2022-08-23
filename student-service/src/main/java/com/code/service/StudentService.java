package com.code.service;

import com.code.model.Student;
import com.code.model.StudentDetailed;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    StudentDetailed getStudentDetailed(int id);
}
