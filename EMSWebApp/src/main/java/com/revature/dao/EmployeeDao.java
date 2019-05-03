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
	
	public void updateEmployee(Employee emp, String User);
	public void createNewEmployee(int deptId, String fname, String lname, int mgrId, String username, String pass);

	public void apprExp(Integer apprInt);
	public void denyExp(Integer denyInt);
	
	public Employee getEmpById(int empId);
	public Employee getEmp(String email);
	
	public List<Employee> getAllEmployees();
	
	public List<EmployeeExpenseType> getAllExpenses();
	
}
