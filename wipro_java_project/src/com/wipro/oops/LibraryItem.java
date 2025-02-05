package com.wipro.oops;

public abstract class LibraryItem {
	private String title; // Encapsulation: private field
	
	// constructor to initialize the title
	public LibraryItem(String title) {
		this.title=title;
	}
	// Getter for the title (Encapsulation)
	public String getTitle() {
		return title;
	}
	// Abstract method to be implemented by subclasses (Abstraction)
	public abstract void displayDetails();
	public void dispalyDetails() {
		// TODO Auto-generated method stub
		
	}
}
// Inheritance: Book extends LibraryItem
class Book extends LibraryItem {
 private String author;
 
 // Constructor for Book Class
 public Book(String title, String author) {
	 super(title);
	 this.author = author;
 }
 
 // Implementing The abstract method (Polymorphism)
 @Override
 public void displayDetails() {
	 System.out.println("Book Title: " + getTitle() + ", Author: " + author);
	 
 }
 
}
 
 class Magazine extends LibraryItem {
	 private String author;
	 private int j;
	 
	 // Constructor for Magazine Class
	 public Magazine(String title, int i) {
		 super(title);
		 this.j = i;
	 }
	 
	 // Implementing The abstract method (Polymorphism)
	 @Override
	 public void displayDetails() {
		 System.out.println("Book Title: " + getTitle() + ", Author: " + author);
		 
	 }
}

	