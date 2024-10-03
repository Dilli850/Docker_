package com.wipro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "student_1")
public class Student {
	@Id
	@Column(length = 30)
	private Integer sid;
	@Column
	private String sname;

}
