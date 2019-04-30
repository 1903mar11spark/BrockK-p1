package com.revature.dao;

import java.util.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.util.ConnectionUtil;
import com.revature.beans.Employee;

public class ManagerDaoImpl implements ManagerDao {

	public ManagerDaoImpl() {
		
	}
	
	@Override
	public boolean getEmp(String username, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateEmployee(Employee emp, String User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void denyExp(Integer denyInt) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmp(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmps = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement smt = null;
		
		 try {
			 Connection con = ConnectionUtil.getConnection();
			smt = con.prepareStatement("SELECT EMP_ID, FNAME, LNAME, EMAIL, MGR_ID FROM EMPLOYEE");
		    rs = smt.executeQuery();
		   
				while (rs.next()) {
					int deptId = rs.getInt("DEPT_ID");
					int empId = rs.getInt("EMP_ID");
					int mgrId = rs.getInt("MGR_ID");
					String fname = rs.getString("FNAME");
					String lname = rs.getString("LNAME");
					String email = rs.getString("EMAIL");
					
					allEmps.add(new Employee(deptId, fname, lname, mgrId, email, empId));
			  }
		  } catch (SQLException e) 
		  { 
			  e.printStackTrace(); 
		  }finally {
			    try { rs.close(); } catch (Exception e) { 
			    }
			}
		return allEmps;
	}

	

	@Override
	public void apprExp(Integer apprInt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createNewEmployee(int deptId, String fname, String lname, int mgrId, String username, String pass) {
		// TODO Auto-generated method stub
		
	}

}
