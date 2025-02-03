package com.wipro.java.oops.polymorphism;

public class Fortuner extends Car {
	
	@Override
	     public void showCarDetails() {
		     System.out.println("This is a Fortuner: " + getBrand() + " " + getModel() + " from year " + getYear());
	}

	public static void main(String[] args) {
		// creating Fortuner object
		Car FortunerCar = new Fortuner();
		FortunerCar.setBrand("Fortuner");
		FortunerCar.setModel("Sport utility vehicle");
	    FortunerCar.setYear(2019);
	    FortunerCar.showCarDetails();
	    }

}
