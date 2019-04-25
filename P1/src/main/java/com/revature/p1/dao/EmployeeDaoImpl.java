package com.revature.p1.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.p1.beans.Employee;
import com.revature.p1.util.ConnectionUtility;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	private Employee emp;

	public Employee getEmpById(int empId) {
		emp = new Employee();
		
		//retrieve record by ID using prepared statement
		//connect to DB:
		try(Connection conn = ConnectionUtility.getConnectionFromFile()){
			
			String sql = "SELECT * FROM EMPLOYEE";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,empId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int empId1 = rs.getInt("EMP_ID");
				String fname1 = rs.getString("FNAME");
				String lname1 = rs.getString("LNAME");
				int mgrId1 = rs.getInt("EMP_MGR_ID");
				String empEmail1 = rs.getString("EMP_EMAIL");
				int deptId1 = rs.getInt("DEPT_ID");
				
				emp = new Employee(empId1, fname1, lname1, mgrId1, empEmail1, deptId1);
			}
			
			
			
		}catch(IOException eIO) {
			eIO.printStackTrace();
		}catch(SQLException eSQL) {
			eSQL.printStackTrace();
		}

		return emp;
		
		
	
	
	}
	
	public Employee getEmpByName(String fname, String lname) {
		
				Employee user = new Employee();
				
				try{
					Connection conn = ConnectionUtility.getConnectionFromFile(); {
				
					// JOIN LOGIN TABLE WITH EMPLOYEE TABLE ON EMPLOYEE ID 
					String sql = "SELECT * FROM EMPLOYEES WHERE EMP_ID = ?"
							+ "JOIN LOGIN "
							+ "ON EMPLOYEE.EMP_ID = LOGIN.EMP_ID "
							+ "WHERE USERNAME = ? AND PASS = ?";
					
					PreparedStatement pstmt =  conn.prepareStatement(sql);
					pstmt.setString(1,"");
								
					ResultSet rs = pstmt.executeQuery();
					
					if(rs.next()) 
					{
						user.setEmpId(rs.getInt("EMP_ID"));
						user.setFname(rs.getString("FNAME"));
						user.setLname(rs.getString("LNAME"));
						
						user.setUsername(rs.getString("USERNAME"));
						user.setPass(rs.getString("PASS"));
						user.setEmail(rs.getString("EMAIL"));
					}

						
						//user.setRole(rs.getString("JOB_ROLE"));
						//System.out.println(user);
					}
				} 		
				catch (SQLException e1) {
					e1.printStackTrace();
				}	
				catch (IOException e2) {
					e2.printStackTrace();
				}
				return user;
	
			
			
			
		}
		
		
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees(int empId) {
		// TODO Auto-generated method stub
		return null;
	}}

