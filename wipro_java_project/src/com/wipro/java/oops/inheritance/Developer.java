package com.wipro.java.oops.inheritance;

/**
 * Parent Class = Employee
 * Child Class = Developer
 * Extends = a Keyword
 */

public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	  public static void main(String a[])
	    {
	    //	 ProjectLead  ProjectLead= new  ProjectLead(); 
	    //   ProjectLead ProjectLead1=(ProjectLead) new Employee();
	    	
	         Employee employee=new Developer();
	         employee.setEmpid(8987);
	         employee.setName("Pradeep");
	         employee.setSalary(25000f);
	      
	         System.out.println(employee.getEmpid());
	         System.out.println(employee.getName());
	         System.out.println(employee.getSalary());
	    }
	}


