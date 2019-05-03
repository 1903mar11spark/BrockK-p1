package com.revature.dao;

import java.util.List;

import com.revature.beans.EmployeeExpenseType;
import com.revature.model.ExpenseStatus;

public interface EmployeeExpenseTypeDao {

	public List<EmployeeExpenseType> getEmployeeExpenses(int empId, ExpenseStatus status);
	
	public List<EmployeeExpenseType> getEmployeeExpensesForManager(int managerId);
}
