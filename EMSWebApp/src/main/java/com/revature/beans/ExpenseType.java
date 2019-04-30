package com.revature.beans;


public class ExpenseType {

	private int expId;
	private String expName;
	
	
	public ExpenseType(int expId,String expName) {
		super();
		this.expId = expId;
		this.expName = expName;
	}
	
	public int getExpId() {
		return expId;
	}

	public void setExpId(int expId) {
		this.expId = expId;
	}

	public String getExpName() {
		return expName;
	}

	public void setExpName(String expName) {
		this.expName = expName;
	}

	public ExpenseType() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + expId;
		result = prime * result + ((expName == null) ? 0 : expName.hashCode());
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
		ExpenseType other = (ExpenseType) obj;
		if (expId != other.expId)
			return false;
		if (expName == null) {
			if (other.expName != null)
				return false;
		} else if (!expName.equals(other.expName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExpenseType [expId=" + expId + ", expName=" + expName + "]";
	}
	


}
