package com.nt.Runner;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.dialect.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
@Component
public class PL_SQLFuncationCallRunner implements CommandLineRunner {
	@Autowired
	private EntityManager manager;
	@Override
	public void run(String... args) throws Exception {
// unwrap session  object from entitymanager object
		Session ses = manager.unwrap(Session.class);
		// work with ResultWork<T> callback based callback method
		Object results[] = ses.doReturningWork(con-> {
			// write callbackStatement based logic to call PL/SQL funcation
			CallableStatement cs = con.prepareCall("{?=call FX_GET_MOVIES_BY_RATING(?,?,?)}");
			// register return(1), OutParam(4) with jdbc types
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.registerOutParameter(4,Types.INTEGER);
			cs.setFloat(2, 4.0f);
			cs.setFloat(3,5.5f);
			// CALL PL/SQL FUNCTION
			cs.execute();
			// gather result from outpu parameters
			ResultSet rs = (ResultSet)cs.getObject(1);  // return values;
			List<Object[]> list = new ArrayList();
			while(rs.next()) {
				Object record[] = new Object[3];
				record[0] = rs.getString(1);
				record[1] = rs.getString(2);
				record[2] = rs.getString(3);
				list.add(record);
			} // while
			Object data[] = new Object[2];
		data[0] = list;
		data[1] = cs.getInt(4); // out param cnt value
		return data;
		});
		// process that result[]
		System.out.println("Movies in rating range are::");
		List<Object[]> ratingList = (List<Object[]>)results[0];
		ratingList.forEach(md-> {
			for(Object val:md)
				System.out.print(val+" ");
			System.out.println();
		});
		// get count of records
		int count = (int)results[1];
		System.out.println("records count::"+count);
}// run(-)
}	//class