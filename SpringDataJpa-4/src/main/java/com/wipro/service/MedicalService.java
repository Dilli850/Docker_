package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Repository.IMedRepository;
import com.wipro.entity.MedicalReport;
@Service
public class MedicalService implements IMedServiceMgmt {
@Autowired
private IMedRepository repository;
	@Override
	public String registermedicalReport(MedicalReport report) {
		// TODO Auto-generated method stub
		MedicalReport report2=repository.save(report);
		return "medical report with this id"+report2.getMedId();
	}
	@Override
	public boolean medplanisAvalornot(Integer id) {
		// TODO Auto-generated method stub
		
		return repository.existsById(id);
	}

}
