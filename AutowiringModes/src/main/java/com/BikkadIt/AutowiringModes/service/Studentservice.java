package com.BikkadIt.AutowiringModes.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.BikkadIt.AutowiringModes.dao.Dao;
import com.BikkadIt.AutowiringModes.dao.Mysqlimp;
import com.BikkadIt.AutowiringModes.dao.Oracleimpl;

@Service
public class Studentservice {
	
	
 //private  Oracleimpl  oracleimp;

	//private  Mysqlimp mysqlimpl;
	@Autowired
	private Dao dao;
 
 public void report() {
	
	 dao.GenerateReport();
 }
	

}
