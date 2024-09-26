package com.wipro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.entity.MedicalReport;

public interface IMedRepository extends JpaRepository<MedicalReport,Integer> {

}
