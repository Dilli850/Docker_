package com.nt.wipro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.wipro.Entity.Student;
import com.nt.wipro.repository.IStudentRepo;
@Service
public class Studentservice implements IStudentMgmtService {
@Autowired
private IStudentRepo iStudentRepo;
	@Override
	public String registerStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(("stsudent is saved with this id before"+student.getSid()));
		Student student2=iStudentRepo.save(student);
		return "student is saved with this id"+student2.getSid();
	}
	@Override
	public long studCount() {
		// TODO Auto-generated method stub
		return iStudentRepo.count();
	}
	@Override
	public boolean studIsavailble(Integer id) {
		// TODO Auto-generated method stub
		return iStudentRepo.existsById(id);
	}
	@Override
	public Iterable<Student> showAllStudent() {
		// TODO Auto-generated method stub
		return iStudentRepo.findAll();
	}
	@Override
	public Optional<Student> findByid(Integer id) {
		// TODO Auto-generated method stub
		return iStudentRepo.findById(id);
	}

}
