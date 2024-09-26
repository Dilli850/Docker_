package com.wipro.service;

import com.wipro.entity.MedicalReport;

public interface IMedServiceMgmt {
public String registermedicalReport(MedicalReport report);
public boolean medplanisAvalornot(Integer id);
}
