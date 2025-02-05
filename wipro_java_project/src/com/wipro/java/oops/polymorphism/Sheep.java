package com.wipro.java.oops.polymorphism;


public class Sheep extends Animal {
	public void AnimalDeatils() {
		System.out.println("Name : "+getName());
		System.out.println("Sound : "+getSound());
	}
	
public static void main(String[] args) {
	
	Animal animal=new Sheep();
	animal.setName("Sheep");
    animal.setSound("Baa Baa");
    animal.AnimalDetails();
}

}
