package com.wipro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.Student;
import com.wipro.repository.IStudentRepositoy;

import io.swagger.v3.oas.models.security.SecurityScheme.In;
@Service
public class StudentMgmtService implements StudentService {
@Autowired
private IStudentRepositoy repositoy;
	@Override
	public String RegisterStudent(Student student) {
		// TODO Auto-generated method stub
		Student student2=repositoy.save(student);
		return "student is saved with this id"+student2.getSid();
	}
	@Override
	public Optional<Student> getByStudentId(Integer id) {
		// TODO Auto-generated method stub
		
		return repositoy.findById(id);
	}
	@Override
	public Long studentcount() {
		// TODO Auto-generated method stub
		return repositoy.count();
	}
	@Override
	public Iterable<Student> allStudents() {
		// TODO Auto-generated method stub
		return repositoy.findAll();
	}
	@Override
	public Iterable<Student> studentByIds(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return repositoy.findAllById(ids);
	}

}
