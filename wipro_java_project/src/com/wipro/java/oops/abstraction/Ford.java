package com.wipro.java.oops.abstraction;

public class Ford extends car {
		
	@Override
	void fuel() {
		// TODO Auto-generated constructor stub
		System.out.println("petrol");
	}
    public static void main(String args[]) {
    	Ford ford=new Ford();
    	ford.Bodytype();
    	ford.fuel();
    	}

	@Override
	void Bodytype() {
		// TODO Auto-generated method stub
		
	}
}
	