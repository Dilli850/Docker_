package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.entity.Student;

public interface IStudentRepositoy extends JpaRepository<Student, Integer> {

}
