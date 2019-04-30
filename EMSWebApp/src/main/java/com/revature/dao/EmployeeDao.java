package com.revature.dao;
import java.util.List;
import com.revature.beans.*;
import java.time.*;

public interface EmployeeDao {
	
	public void login(String username, String pass);
	
	public Employee getEmp(String username, String pass);
	
	public void updateEmp(String fname, String lname, String email);
	
	public void expReq(int empId, double amt, LocalDate expDt, int apprMgrId);
	
	public void expReq(int expId, int empId, double amt, LocalDate expDt, int apprMgrId);
	
	public void getExpenses(int empId);
}
