package com.revature.p1.dao;

import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.p1.beans.*;
import com.revature.p1.util.ConnectionUtility;

public class EmpExpTypeDaoImpl implements EmpExpTypeDao {


		public Employee getByCredentials(String username, String pass) {
			
			Employee user = new Employee();
			
			//try/catch block (connection) 
			try(Connection conn = ConnectionUtility.getConnectionFromFile()) {
				
				//create sql string for prepared statement
				String sql = "SELECT * FROM EMPLOYEE_EXPENSETYPE";
				
				PreparedStatement pstmt =  conn.prepareStatement(sql);
				//pstmt.setString(1, username);
				//pstmt.setString(2, pass);
							
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) 
				{
					user.setEmpId(rs.getInt("EMP_ID"));
					user.setFname(rs.getString("FNAME"));
					user.setLname(rs.getString("LNAME"));
					
					user.setUsername(rs.getString("USERNAME"));
					user.setPass(rs.getString("PASS"));
					user.setEmail(rs.getString("EMAIL"));
					

					
					//user.setRole(rs.getString("JOB_ROLE"));
					//System.out.println(user);
				}
			} 		
			catch (SQLException e) {
				e.printStackTrace();
			}	
			catch (IOException e) {
				e.printStackTrace();
			}
			return user;
	}

	public List<ExpenseType> getAllExpenseTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getAllEmpExpTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getRecordsByEmpId(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getAllPending() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getPendingByEmpId(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getAllApproved() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getApprovedByEmpId(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getAllDenied() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmpExpType> getDeniedById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
