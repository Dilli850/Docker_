package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.Employee;
import com.wipro.repository.IEmployeeRepository;
@Service
public class EmployeeMgmtService implements IEmployeeService {
@Autowired
private IEmployeeRepository repository;
	@Override
	public String RegisterEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2=repository.save(employee);
		return "Employee is registred with this id"+employee2.getEmp_Id();
	}
	@Override
	public Long StudentCount() {
		// TODO Auto-generated method stub
		return repository.count();
	}

}
