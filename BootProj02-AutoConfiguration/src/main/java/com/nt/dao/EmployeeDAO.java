package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empdao")
public class EmployeeDAO {
	private static final String GET_EMPP_COUNT = "SELECT COUNT(*)FROM CORONA";
	@Autowired
	private DataSource ds; // has a properties
	
	// method with persistance logic
	public int getEmpsCount()throws Exception{
		// get pooled jdbc con object
		Connection con = ds.getConnection();
		// create preparedSatement object having sql query
		PreparedStatement ps = con.prepareStatement(GET_EMPP_COUNT);
		// execute the Query 
		ResultSet rs = ps.executeQuery();
		// process the resultSet
		rs.next();
		int count = rs.getInt(1);
		// close jdbc object
		rs.close();
		ps.close();
		con.close();
		return count;
	}
}
