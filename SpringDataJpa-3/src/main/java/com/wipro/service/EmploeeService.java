package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Repository.IEmployeeRepository;
import com.wipro.entity.Employee;

@Service
public  class EmploeeService implements IEmployeeServiceMgmt {
@Autowired
private IEmployeeRepository  repository;
	


	@Override
	public String EmployeeRegister(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2=repository.save(employee);
		return "employee is saved with this id"+employee2.getEmpId();
	}



	@Override
	public String registerEmployeeGroup(List<Employee> employees) {
		// TODO Auto-generated method stub
		List<Employee> emps=(List<Employee>)repository.saveAll(employees);
		return "multiple employes are registred"+emps.size();
	}



	@Override
	public long employeecout() {
		// TODO Auto-generated method stub
		return repository.count();
	}



	@Override
	public boolean employeeisAvailablrorNot(Integer id) {
		// TODO Auto-generated method stub
		return repository.existsById(id);
	}



	@Override
	public Iterable<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}



	@Override
	public Iterable<Employee> showEmployeeByid(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return repository.findAllById(ids);
	}}
