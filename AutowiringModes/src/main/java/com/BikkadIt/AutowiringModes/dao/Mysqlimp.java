package com.BikkadIt.AutowiringModes.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Mysqlimp implements Dao{

	@Override
	public void GenerateReport() {
System.out.println("Report Generated using Mysql database");
		
	}

}
