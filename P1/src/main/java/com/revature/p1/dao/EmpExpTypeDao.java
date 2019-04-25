package com.revature.p1.dao;

import java.util.List;
import com.revature.p1.beans.*;

public interface EmpExpTypeDao {
	
//get whole Employee list
	public List<Employee> getAllEmployees();
	
//get whole exptype list
	public List<ExpenseType> getAllExpenseTypes();
	
//get whole emp_exptype list
	public List<EmpExpType> getAllEmpExpTypes();

//get employee expensetype records by employee id
	//this is for employees - 
	// Only David Higgins can view all --
	//	Employees can only view their own records
	public List<EmpExpType> getRecordsByEmpId(int empId);
	
//get ALL pending reimbursement requests
	public List<EmpExpType> getAllPending();
	
//get EMPLOYEE pending reimbursement requests
	public List<EmpExpType> getPendingByEmpId(int empId);
	
//get ALL approved reimbursements
	public List<EmpExpType> getAllApproved();

//get EMPLOYEE's approved reimbursements
	public List<EmpExpType> getApprovedByEmpId(int empId);

//get ALL denied
	public List<EmpExpType> getAllDenied();
	
//get EMPLOYEE's denied
	public List<EmpExpType> getDeniedById(int empId);

}
