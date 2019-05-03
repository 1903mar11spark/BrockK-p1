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
import com.revature.beans.Login;

public class LoginDaoImpl implements LoginDao {

	public LoginDaoImpl() {
		
	}
	
	@Override
	public Integer getEmpId(String username, String pass) {

		Integer empId = null;
		ResultSet rs = null;
		PreparedStatement smt = null;

		try {
			Connection con = ConnectionUtil.getConnection();
			smt = con.prepareStatement("SELECT EMP_ID FROM LOGIN WHERE USERNAME = ? AND PASS = ?");
			smt.setString(1, username);
			smt.setString(2, pass);
			
			rs = smt.executeQuery();

			if (rs.next()) {
				empId = rs.getInt("EMP_ID");
			}
		} 
		catch (SQLException e) { 
			e.printStackTrace(); 
		}
		finally {
			try { rs.close(); } catch (Exception e) { }
		}
		return empId;
	}

}
