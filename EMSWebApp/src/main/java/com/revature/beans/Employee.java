package com.revature.beans;

public class Employee {
	
	private int isManager;
	private String fname;
	private String lname;
	private int mgrId;
	private String username;
	private String pass;
	
	
	public Employee(int deptId, String fname, String lname, int mgrId, String empEmail, int empId) {
		super();
		this.isManager = deptId;
		this.fname = fname;
		this.lname = lname;
		this.mgrId = mgrId;
		this.empEmail = empEmail;
		this.empId = empId;
	}
	
	public Employee(String fname, String lname, String empEmail, int empId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.empEmail = empEmail;
		this.empId = empId;
	}
	
	public Employee(int deptId, String fname, String lname, int mgrId, String empEmail, int empId, String username, String pass) {
		super();
		this.isManager = deptId;
		this.fname = fname;
		this.lname = lname;
		this.mgrId = mgrId;
		this.empEmail = empEmail;
		this.empId = empId;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isManager() {
		return isManager == 1;
	}
	public void setIsManager(boolean isMngr) {
		if (isMngr) {
			this.isManager = 1;
		} else {
			this.isManager = 0;
		}
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	private String empEmail;
	private int empId;
	
	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [Department ID: " + isManager + ", First Name: " + fname + ", Last Name: " + lname + ", Manager ID: " + mgrId
				+ ", Email: " + empEmail + ", Employee ID: " + empId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isManager;
		result = prime * result + ((empEmail == null) ? 0 : empEmail.hashCode());
		result = prime * result + empId;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + mgrId;
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

}