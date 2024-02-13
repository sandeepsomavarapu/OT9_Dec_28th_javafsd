package com.ot9.streamio;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empId;
	private String empName;
	private transient float empSal;
	private String empDesg;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, float empSal, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesg = empDesg;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDesg=" + empDesg
				+ "]";
	}

	
}
