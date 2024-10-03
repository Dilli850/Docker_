package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entity.Employee;
import com.wipro.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> registerEmployee(@RequestBody Employee emp)
	{
		String msg=service.RegisterEmployee(emp);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/Count")
	public ResponseEntity<?> stuentCount()
	{
		Long ct=service.StudentCount();
		return new ResponseEntity<>(ct,HttpStatus.OK);
	}
	
	

}
