package com.revature.beans;

import java.time.LocalDate;
import java.io.InputStream;
import java.text.NumberFormat;

public class EmployeeExpenseType {
	
	private int expId;
	private int empId;
	private String img;
	private int apprMgrId;
	private LocalDate expDt;
	private long expAmt;
	private String expName;
	
	public EmployeeExpenseType() {
		super();
	}
	
	public EmployeeExpenseType(int expId, int empId, int apprMgrId, LocalDate expDt, long expAmt, String expName) {
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

	public LocalDate getExpDt() {
		return expDt;
	}

	public void setExpDt(LocalDate expDt) {
		this.expDt = expDt;
	}

	public long getExpAmt() {
		return expAmt;
	}

	public void setExpAmt(long expAmt) {
		this.expAmt = expAmt;
	}

	public String getExpName() {
		return expName;
	}

	public void setExpName(String expName) {
		this.expName = expName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + apprMgrId;
		result = prime * result + empId;
		result = prime * result + (int) (expAmt ^ (expAmt >>> 32));
		result = prime * result + ((expDt == null) ? 0 : expDt.hashCode());
		result = prime * result + expId;
		result = prime * result + ((expName == null) ? 0 : expName.hashCode());
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeExpenseType other = (EmployeeExpenseType) obj;
		if (apprMgrId != other.apprMgrId)
			return false;
		if (empId != other.empId)
			return false;
		if (expAmt != other.expAmt)
			return false;
		if (expDt == null) {
			if (other.expDt != null)
				return false;
		} else if (!expDt.equals(other.expDt))
			return false;
		if (expId != other.expId)
			return false;
		if (expName == null) {
			if (other.expName != null)
				return false;
		} else if (!expName.equals(other.expName))
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeExpenseType [expId=" + expId + ", empId=" + empId + ", img=" + img + ", apprMgrId=" + apprMgrId
				+ ", expDt=" + expDt + ", expAmt=" + expAmt + ", expName=" + expName + "]";
	}
}
