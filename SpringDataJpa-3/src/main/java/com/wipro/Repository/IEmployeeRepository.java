package com.wipro.Repository;

import org.springframework.data.repository.CrudRepository;

import com.wipro.entity.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
