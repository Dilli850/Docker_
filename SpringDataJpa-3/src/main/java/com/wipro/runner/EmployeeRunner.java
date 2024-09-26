package com.wipro.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wipro.entity.Employee;
import com.wipro.service.IEmployeeServiceMgmt;
@Component
public class EmployeeRunner implements CommandLineRunner {
@Autowired
private IEmployeeServiceMgmt employeeServiceMgmt;
	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
//		Employee employee=new Employee();
//		employee.setEmpName("rakesh rahul");
//		employee.setEmpDept("admin");
//		employee.setEmpSal(2235.5);
//		Employee emp2=new Employee();
//		emp2.setEmpName("megha");
//		emp2.setEmpSal(5632.5);
//		emp2.setEmpDept("dba");
//		Employee employee2=new Employee();
//		employee2.setEmpName("varshka");
//		employee2.setEmpDept("team lead");
//		employee2.setEmpSal(53335.55);
//		String msg=employeeServiceMgmt.registerEmployeeGroup(List.of(emp2,employee,employee2));
//		System.out.println(msg);
		
		
		long count=employeeServiceMgmt.employeecout();
		System.out.println(count);
		
		System.out.println(employeeServiceMgmt.employeeisAvailablrorNot(1));
		
		System.out.println(employeeServiceMgmt.showAllEmployees());
        System.out.println(employeeServiceMgmt.showEmployeeByid(List.of(1,2,3)));

	}

}
