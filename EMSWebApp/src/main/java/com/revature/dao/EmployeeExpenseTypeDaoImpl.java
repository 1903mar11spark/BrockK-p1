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
import com.revature.beans.EmployeeExpenseType;
import com.revature.beans.ExpenseType;
import com.revature.model.ExpenseStatus;

public class EmployeeExpenseTypeDaoImpl implements EmployeeExpenseTypeDao {

	public EmployeeExpenseTypeDaoImpl() {
		
	}
	

	@Override
	public List<EmployeeExpenseType> getEmployeeExpenses(int empId, ExpenseStatus status) {
		List<EmployeeExpenseType> expenses = new ArrayList();
		ResultSet rs = null;
		PreparedStatement smt = null;
		EmployeeExpenseType exp;

		String statusFilter = "";
		if (status != null) {
			statusFilter = " AND ee.status = ? ";
		}
		
		try {
			Connection con = ConnectionUtil.getConnection();
			smt = con.prepareStatement("SELECT ee.exp_dt, ee.exp_amt, ee.status, et.exp_name, e.fname, e.lname, e.emp_id, e.emp_mgr_id " + 
					"FROM employee_expensetype ee " + 
					"JOIN expensetype et ON ee.exp_id = et.exp_id " + 
					"JOIN employee e ON ee.emp_id = e.emp_id " + 
					"WHERE e.emp_id = ? " + statusFilter);
			smt.setInt(1, empId);
			if (status != null) {
				smt.setInt(2, status.ordinal());
			}
			rs = smt.executeQuery();
			
			while (rs.next()) {
				exp = parseExpe(rs);
				expenses.add(exp);
			}
		} 
		catch (SQLException e) { 
			e.printStackTrace(); 
		}
		finally {
			try { rs.close(); } catch (Exception e) { }
		}
		return expenses;
	}

	@Override
	public List<EmployeeExpenseType> getEmployeeExpensesForManager(int managerId) {
		List<EmployeeExpenseType> expenses = new ArrayList();
		ResultSet rs = null;
		PreparedStatement smt = null;
		EmployeeExpenseType exp;

		try {
			Connection con = ConnectionUtil.getConnection();
			smt = con.prepareStatement("SELECT ee.exp_dt, ee.exp_amt, ee.status, et.exp_name, e.fname, e.lname, e.emp_id, e.emp_mgr_id\r\n" + 
					"FROM employee_expensetype ee \r\n" + 
					"JOIN expensetype et ON ee.exp_id = et.exp_id\r\n" + 
					"JOIN employee e ON ee.emp_id = e.emp_id\r\n" + 
					"WHERE e.emp_mgr_id = ?");
			smt.setInt(1, managerId);
			rs = smt.executeQuery();
			
			while (rs.next()) {
				exp = parseExpe(rs);
				expenses.add(exp);
			}
		} 
		catch (SQLException e) { 
			e.printStackTrace(); 
		}
		finally {
			try { rs.close(); } catch (Exception e) { }
		}
		return expenses;
	}

	public EmployeeExpenseType parseExpe(ResultSet rs) throws SQLException {
		EmployeeExpenseType result = new EmployeeExpenseType();
		
		result.setExpDt(rs.getDate(1));
		result.setExpAmt(rs.getDouble(2));
		result.setStatus(ExpenseStatus.values()[rs.getInt(3)]);
		ExpenseType et = new ExpenseType();
		result.setExpenseType(et);
		et.setExpName(rs.getString(4));
		Employee emp = new Employee();
		result.setEmployee(emp);
		emp.setFname(rs.getString(5));
		emp.setLname(rs.getString(6));
		result.setEmpId(rs.getInt(7));
		emp.setEmpId(rs.getInt(7));
		result.setApprMgrId(rs.getInt(8));
		
		return result;
	}

	public static void main(String[] args) {
		EmployeeExpenseTypeDaoImpl dao = new EmployeeExpenseTypeDaoImpl();
		List<EmployeeExpenseType> exps = dao.getEmployeeExpenses(1, ExpenseStatus.NEW);
		for (EmployeeExpenseType e: exps) {
			System.out.println(e);
		}
	}

}
