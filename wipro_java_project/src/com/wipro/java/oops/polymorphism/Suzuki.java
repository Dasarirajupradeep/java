package com.wipro.java.oops.polymorphism;

public class Suzuki extends Car {
	
	@Override
	     public void showCarDetails() {
		     System.out.println("This is a Suzuki: " + getBrand() + " " + getModel() + " from year " + getYear());
	}

	public static void main(String[] args) {
		// creating Suzuki object
		Car SuzukiCar = new Suzuki();
		SuzukiCar.setBrand("Suzuki");
		SuzukiCar.setModel("Wagonr");
		SuzukiCar.setYear(2011);
		SuzukiCar.showCarDetails();
	    }

}
