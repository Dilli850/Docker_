package com.nt.wipro.service;

import java.util.Optional;

import com.nt.wipro.Entity.Student;

public interface IStudentMgmtService {
public String registerStudent(Student student);
public long studCount();


public boolean studIsavailble(Integer id);

public Iterable<Student> showAllStudent();

public Optional<Student> findByid(Integer id);


}
