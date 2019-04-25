package com.revature.p1.beans;

import java.util.Date;

//class for the reimbursement requests
public class EmpExpType {
	
	private int expId;
	private int empId;
	private String img;
	private int apprMgr = 1;
	private Date expDt;
	
//constructors
	public EmpExpType() {
		super();
	}
//with image
public EmpExpType(int expId, int empId, String img, int apprMgr, Date expDt) {
	super();
	this.expId = expId;
	this.empId = empId;
	this.img = img;
	this.apprMgr = apprMgr;
	this.expDt = expDt;
}
//without image
public EmpExpType(int expId, int empId, int apprMgr, Date expDt) {
	super();
	this.expId = expId;
	this.empId = empId;
	this.apprMgr = apprMgr;
	this.expDt = expDt;
}


	//get-set methods
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


	public int getApprMgr() {
		return apprMgr;
	}


	public void setApprMgr(int apprMgr) {
		this.apprMgr = apprMgr;
	}


	public Date getExpDt() {
		return expDt;
	}


	public void setExpDt(Date expDt) {
		this.expDt = expDt;
	}
	
	//toString, hashCode & equals override methods
	@Override
	public String toString() {
		return "EmpExpType [expId=" + expId + ", empId=" + empId + ", img=" + img + ", apprMgr=" + apprMgr + ", expDt="
				+ expDt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + apprMgr;
		result = prime * result + empId;
		result = prime * result + ((expDt == null) ? 0 : expDt.hashCode());
		result = prime * result + expId;
		result = prime * result + ((img == null) ? 0 : img.hashCode());
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
		EmpExpType other = (EmpExpType) obj;
		if (apprMgr != other.apprMgr) {
			return false;
		}
		if (empId != other.empId) {
			return false;
		}
		if (expDt == null) {
			if (other.expDt != null) {
				return false;
			}
		} else if (!expDt.equals(other.expDt)) {
			return false;
		}
		if (expId != other.expId) {
			return false;
		}
		if (img == null) {
			if (other.img != null) {
				return false;
			}
		} else if (!img.equals(other.img)) {
			return false;
		}
		return true;
	}
	
}
