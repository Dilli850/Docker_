package com.wipro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Employee_Data")
public class Employee {
	@Id
	@SequenceGenerator(name="gen1",sequenceName  ="Emp_Info",initialValue = 1000,allocationSize = 100)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer Emp_Id;
	@Column(length=30)
private String Emp_Name;
	private double Emp_Sal;
}
