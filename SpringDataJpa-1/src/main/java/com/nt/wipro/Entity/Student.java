package com.nt.wipro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Student_info")
@Data
public class Student {
	@Id
	private Integer sid;
	@Column
	private String sname;
	@Column
	private double sfee;

}
