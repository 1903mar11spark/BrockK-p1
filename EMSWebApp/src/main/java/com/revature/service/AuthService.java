package com.revature.service;

import com.revature.beans.Employee;
import com.revature.dao.*;
import com.revature.model.Credentials;

public class AuthService {
	
	LoginDao ldao = new LoginDaoImpl();
	EmployeeDao mdao = new EmployeeDaoImpl();

	public Employee checkLogin(Credentials cred) {
		Integer empId = ldao.getEmpId(cred.getUsername(), cred.getPassword());
		
		if (empId == null) return null;
		
		Employee emp = mdao.getEmpById(empId);
		
		return emp;
		
	}
	
	public boolean isManager(int id) {
//		int x =pd.myEmployees(id).size();
//		
//		if(x>0) {
//			return true;
//		}else return false;
		return true;
	}


	
	
	
}
