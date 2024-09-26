package com.nt.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.wipro.Entity.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
