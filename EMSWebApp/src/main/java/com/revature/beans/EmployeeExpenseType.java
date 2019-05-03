package com.revature.beans;


import java.util.Date;

import com.revature.model.ExpenseStatus;

public class EmployeeExpenseType {
	
	private int expId;
	private int empId;
	private String img;
	private int apprMgrId;
	private Date expDt;
	private double expAmt;
	private String expName;
	private ExpenseStatus status;
	private Employee employee;
	private ExpenseType expenseType;
	
	public EmployeeExpenseType() {
		super();
	}
	
	public EmployeeExpenseType(int expId, int empId, int apprMgrId, Date expDt, double expAmt, String expName) {
		super();
		this.expId = expId;
		this.empId = empId;
		this.apprMgrId = apprMgrId;
		this.expDt = expDt;
		this.expAmt = expAmt;
		this.expName = expName;
	}

	public int getExpId() {
		return expId;
	}

	public void setExpId(int expId) {
		this.expId = expId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getApprMgrId() {
		return apprMgrId;
	}

	public void setApprMgrId(int apprMgrId) {
		this.apprMgrId = apprMgrId;
	}

	public Date getExpDt() {
		return expDt;
	}

	public void setExpDt(Date expDt) {
		this.expDt = expDt;
	}

	public double getExpAmt() {
		return expAmt;
	}

	public void setExpAmt(double expAmt) {
		this.expAmt = expAmt;
	}

	public String getExpName() {
		return expName;
	}

	public void setExpName(String expName) {
		this.expName = expName;
	}


	
	public ExpenseStatus getStatus() {
		return status;
	}

	public void setStatus(ExpenseStatus status) {
		this.status = status;
	}

	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}

	@Override
	public String toString() {
		return "EmployeeExpenseType [expId=" + expId + ", empId=" + empId + ", img=" + img + ", apprMgrId=" + apprMgrId
				+ ", expDt=" + expDt + ", expAmt=" + expAmt + ", expName=" + expName + "]";
	}
}
