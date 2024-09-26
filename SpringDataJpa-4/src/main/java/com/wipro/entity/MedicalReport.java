package com.wipro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="report_medical")
@Data
@Entity
public class MedicalReport {
	
	@Id
	@SequenceGenerator(sequenceName = "gen1",initialValue = 1000,allocationSize = 100, name = "report")
@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer medId;
	@Column(length = 10)
	private String medName;
}
