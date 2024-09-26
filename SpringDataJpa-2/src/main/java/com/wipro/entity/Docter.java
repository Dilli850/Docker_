package com.wipro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="Docter_Info")
public class Docter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer DoctId;
	@Column(length = 30)
	private String DoctName;
	@Column(length = 30)
	private String DoctSpe;
	

}
