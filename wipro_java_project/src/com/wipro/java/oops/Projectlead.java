package com.wipro.java.oops;
/**
 * Parent class= Employee
 * child class = ProjectLead
 * Extend is a keyword
 */

public class Projectlead extends Employee {

	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String a[])
    {
    //	 ProjectLead  ProjectLead= new  ProjectLead(); 
    //   ProjectLead ProjectLead1=(ProjectLead) new Employee();
    	
         Employee employee=new Projectlead();
         employee.setEmpid(675);
         employee.setName("Pradeep");
         employee.setSalary(13000f);
      
         System.out.println( employee.getEmpid());
         System.out.println( employee.getName());
         System.out.println( employee.getSalary());
    }
}
