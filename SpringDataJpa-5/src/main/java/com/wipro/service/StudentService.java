package com.wipro.service;

import java.util.Optional;

import com.wipro.entity.Student;

public interface StudentService {
public String RegisterStudent(Student student);
public Optional<Student> getByStudentId(Integer id);
public Long studentcount();
public Iterable<Student> allStudents();
public Iterable<Student> studentByIds(Iterable<Integer> ids);
}
