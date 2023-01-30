package com.BikkadIt.AutowiringModes.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class Oracleimpl  implements Dao{

	@Override
	public void GenerateReport() {
		System.out.println("Report generated using Oracle Database");
		
	}

}
