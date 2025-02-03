package com.wipro.java.oops.inheritance;

/**
 * Parent Class = Employee
 * Child Class = Manager
 * Extends = a Keyword
 */

public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[])
    {
    //	 ProjectLead  ProjectLead= new  ProjectLead(); 
    //   ProjectLead ProjectLead1=(ProjectLead) new Employee();
    	
         Employee employee=new Manager();
         employee.setEmpid(7464);
         employee.setName("Pradeep");
         employee.setSalary(23000f);
      
         System.out.println( employee.getEmpid());
         System.out.println( employee.getName());
         System.out.println( employee.getSalary());
    }
}


