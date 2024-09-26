package com.wipro.service;

import java.util.List;

import com.wipro.entity.Employee;

public interface IEmployeeServiceMgmt {
public String EmployeeRegister(Employee employee);

public String registerEmployeeGroup(List<Employee> list);

public long employeecout();
public boolean employeeisAvailablrorNot(Integer id);
public Iterable<Employee> showAllEmployees();

public Iterable<Employee> showEmployeeByid(Iterable<Integer> ids );
}
