package com.tienlh.studentsystem.service;

import com.tienlh.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    List<Student> getAllStudents();
}
