package com.wipro.java.oops.inheritance;

/**
 * 
 */
public class Employee {
   
	private int empid; // This is employee id
	private String name; // This is employee name
	private String Designation;// This is employees job designation
	private double salary;// This is employees salary
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
