package com.wipro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="Employee_Info")
@RequiredArgsConstructor
//@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emp_seq",initialValue = 3,allocationSize = 1000)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.AUTO)

	private Integer EmpId;
	@Column(length = 30)
	private String EmpName;
	@Column(length = 30)
	private String EmpDept;
	
	private Double EmpSal;

}
