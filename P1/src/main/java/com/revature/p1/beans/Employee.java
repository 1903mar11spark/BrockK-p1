package com.revature.p1.beans;




public class Employee {
	
	private int deptId;
	private String fname;
	private String lname;
	private int mgrId;
	private String email;
	private int empId;
	private String username;
	private String pass;
	
	//default no-arg constructor
	public Employee() {
		super();
	}
	//full constructor
	//Should get args from user input??
	public Employee(int deptId, String fname, String lname, int mgrId, String empEmail, int empId) {
		super();
		this.deptId = deptId;
		this.fname = fname;
		this.lname = lname;
		this.mgrId = mgrId;
		this.email = empEmail;
		this.empId = empId;
	}
	
	//Employee ID only
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	//last&first
	public Employee(String lname, String fname) {
		super();
		this.lname = lname;
		this.fname = fname;
	}
		
	public void setUsername(String username) {
		this.username = username;
		
		
	}
	public void setPass(String pass) {
		this.pass = pass;
		
	}
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [deptId=" + deptId + ", fname=" + fname + ", lname=" + lname + ", mgrId=" + mgrId + ", email="
				+ email + ", empId=" + empId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + empId;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + mgrId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (deptId != other.deptId) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (empId != other.empId) {
			return false;
		}
		if (fname == null) {
			if (other.fname != null) {
				return false;
			}
		} else if (!fname.equals(other.fname)) {
			return false;
		}
		if (lname == null) {
			if (other.lname != null) {
				return false;
			}
		} else if (!lname.equals(other.lname)) {
			return false;
		}
		if (mgrId != other.mgrId) {
			return false;
		}
		return true;
	}



}
