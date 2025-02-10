package com.wipro.java.usecase2;

class PrintedBook extends Book {
private double weight;  // Specific attribute for printed books
private int numberOfPages;  // Specific attribute for printed books

// Constructor for PrintedBook
public PrintedBook(String title, String author, double price, double weight) {
    super(title, author, price);
    this.weight = weight;
    this.numberOfPages = numberOfPages;
}

// Getters and Setters for additional properties
public double getWeight() {
    return weight;
}

public void setWeight(double weight) {
    this.weight = weight;
}

public int getNumberOfPages() {
    return numberOfPages;
}

public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
}

// Overriding the displayBookInfo method to display more information for printed books
@Override
public void displayBookInfo() {
    // Super refers to the parent class's method to display basic information
    super.displayBookInfo();
    System.out.println("Weight: " + weight + "kg, Pages: " + numberOfPages);
}
}