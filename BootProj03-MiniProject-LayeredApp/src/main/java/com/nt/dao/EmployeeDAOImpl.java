package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empdao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMPP WHERE JOB IN(?,?,?)ORDER BY JOB";
@Autowired
	private DataSource ds;

	@Override
	public List<Employee>  getEmpsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listEmps = null;
		// get pooled jdbc connection obj
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESG)){
			// set query param values 
			ps.setString(1, desg1);
			ps.setString(2,desg2);
			ps.setString(3,desg3);
			// execute the query 
			try(ResultSet rs = ps.executeQuery()){
				// copy Result object record to list collection as Employee as employee class object
				listEmps = new ArrayList();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
					listEmps.add(emp);
				}// while
			}// try2
		}// try 1
		catch(SQLException se) {
			se.printStackTrace();
			throw se; // 
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e; // 
		}
		return listEmps;
	}
}