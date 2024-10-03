package com.wipro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entity.Student;
import com.wipro.service.StudentService;

import jakarta.validation.ReportAsSingleViolation;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	@PostMapping("/register")
	public ResponseEntity<String> RegisterStudent(@RequestBody Student st)
	{
		String result=service.RegisterStudent(st);
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}

//	@GetMapping("/report/{id}")
//	public String getByStudentId(@RequestParam("sid") Integer id) 
//	{
//		return "student id"+id;
//	}
	@GetMapping("/report/{id}")
    public ResponseEntity<String> getByStudentId(@PathVariable("id") Integer id) {
        Optional<Student> studentOptional = service.getByStudentId(id);
        
        
            return new ResponseEntity<>("std info"+studentOptional,HttpStatus.OK);
        
    }
	@GetMapping("/all")
	public ResponseEntity<String> studentcoount()
	{
		Long st=service.studentcount();
		return new ResponseEntity<>("ntudents count"+st,HttpStatus.OK);
		
	}
	@GetMapping("/allf")
	public ResponseEntity<String> allstudents()W
	{
		Iterable<Student> all=service.allStudents();
		return new ResponseEntity<String>("all students"+all,HttpStatus.OK);
	}
	@GetMapping("/repost{ids}")
	public ResponseEntity<String> findids(@PathVariable("ids") Iterable<Integer> ids)
	{
		Iterable<Student> its=service.studentByIds(ids);
		return new ResponseEntity<String>("students"+its,HttpStatus.OK);
	}
}

