package com.javaex.jdbc.dao;

public class HREmpVO {

	private String empName;
	private String manName;
	
	public HREmpVO() {
		
	}

	public HREmpVO(String empName, String manName) {
		super();
		this.empName = empName;
		this.manName = manName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}
	
	@Override
	public String toString() {
		return "HRAuthorVO [empName=" + empName + ", manName=" + manName + "]";
	}
}
