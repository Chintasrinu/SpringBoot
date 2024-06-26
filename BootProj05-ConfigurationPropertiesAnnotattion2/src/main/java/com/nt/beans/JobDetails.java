package com.nt.beans;

public class JobDetails {
	private String desg;
	private String Company;
	private Integer deptNo;
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "JobDetails [desg=" + desg + ", Company=" + Company + ", deptNo=" + deptNo + "]";
	}

}
