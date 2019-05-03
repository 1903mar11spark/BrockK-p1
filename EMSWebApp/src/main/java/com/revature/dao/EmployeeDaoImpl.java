package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.beans.EmployeeExpenseType;
import com.revature.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void login(String username, String pass) {
		// TODO Auto-generated method stub

	}

	@Override
		public Employee getEmp(String username, String pass) {
			return null;
		}

	@Override
	public void updateEmp(String fname, String lname, String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void expReq(int empId, double amt, LocalDate expDt, int apprMgrId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void expReq(int expId, int empId, double amt, LocalDate expDt, int apprMgrId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getExpenses(int empId) {
		// TODO Auto-generated method stub

	}
	// TODO Auto-generated constructor stub

	@Override
	public void updateEmployee(Employee emp, String User) {
		// TODO Auto-generated method stub

	}
	//THIS TOO:: CREATE NEW EMPLOYEE
	@Override
	public void createNewEmployee(int deptId, String fname, String lname, int mgrId, String username, String pass) {
		// TODO Auto-generated method stub

	}


		//WORKING ON: HOW TO SELECT BASED ON USER INPUT AND FIND 
		@Override
	public void apprExp(Integer apprInt) {
//			try {
//				 Connection con = ConnectionUtil.getConnection();
//				smt = con.prepareStatement("SELECT FNAME, LNAME FROM EMPLOYEE WHERE");
//			    rs = smt.executeQuery();
//			    
//			    ResultSetMetaData rsmd = rs.getMetaData();
//			    System.out.println("SELECT FNAME, LNAME FROM EMPLOYEE WHERE EMP_ID = ?");
//			    
//			}catch(Exception e) {}
			
		}

	@Override
	public void denyExp(Integer denyInt) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmpById(int empId) {
		Employee emp = null;
		ResultSet rs = null;
		PreparedStatement smt = null;

		try {
			Connection con = ConnectionUtil.getConnection();
			smt = con.prepareStatement(
					"SELECT EMP_ID, FNAME, LNAME, EMP_EMAIL, EMP_MGR_ID FROM EMPLOYEE WHERE EMP_ID = ?");
			smt.setInt(1, empId);
			rs = smt.executeQuery();

			while (rs.next()) {

				int mgrId = rs.getInt("EMP_MGR_ID");
				String fname = rs.getString("FNAME");
				String lname = rs.getString("LNAME");
				String email = rs.getString("EMP_EMAIL");
				// set empId to 0 for user input
				emp = new Employee(0, fname, lname, mgrId, email, empId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
		}
		return emp;
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
			smt = con.prepareStatement("SELECT EMP_ID, FNAME, LNAME, EMAIL, MGR_ID FROM EMPLOYEE WHERE EMP_ID = ?");
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
		}
		return allEmps;
	}

	@Override
	public List<EmployeeExpenseType> getAllExpenses() {
		// TODO Auto-generated method stub
		return null;
	}

}
