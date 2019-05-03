package com.revature.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.util.ConnectionUtil;


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
