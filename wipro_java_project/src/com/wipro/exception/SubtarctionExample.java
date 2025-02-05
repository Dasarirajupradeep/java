package com.wipro.exception;

public class SubtarctionExample extends Exception {
	public static void main(String[] args) {
		
		try {
		// Define two numbers
		    
		 double num1 = 15.0;
		 double num2 = 7.0;

		 // Perform subtraction
		 double result = num1 - num2;
		 System.out.println("The result of " + num1 + " minus " + num2 + " is " + result);
		} catch(Exception e) {
         System.out.println("Error: Invalid input.");
      }
   }
}
