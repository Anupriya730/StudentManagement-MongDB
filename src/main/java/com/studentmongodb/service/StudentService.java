package com.studentmongodb.service;

import com.studentmongodb.entity.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(String id);
    Student updateStudent(String id, Student student);
    void deleteStudent(String id);
}

