package com.wipro.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wipro.entity.MedicalReport;
import com.wipro.service.IMedServiceMgmt;
@Component
public class MedRunner implements CommandLineRunner {
@Autowired
private IMedServiceMgmt serviceMgmt;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		MedicalReport medicalReport=new MedicalReport();
		medicalReport.setMedName("Arogya");
		String msg=serviceMgmt.registermedicalReport(medicalReport);
		System.out.println(msg);
		
		System.out.println(serviceMgmt.medplanisAvalornot(1));
				

	}

}
