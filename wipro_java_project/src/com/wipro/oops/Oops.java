package com.wipro.oops;

public class Oops {
	public static void main(String[] args) {
		
		//Polymorphism: Both Book Magazine objects are treated as LibraryItem
		LibraryItem book = new Book("Java Programming", "King Carl");
		LibraryItem magazine =new Magazine("Take Monthly", 50);
	    
		// calling the displayDetails() method (Demonstrating Polymorphism)
		book.displayDetails();
		magazine.dispalyDetails();
	}
}
