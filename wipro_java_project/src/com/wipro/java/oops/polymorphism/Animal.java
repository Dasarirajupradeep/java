package com.wipro.java.oops.polymorphism;

public class Animal {
	
	private String name;
	private String Sound;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return Sound;
	}

	public void setSound(String sound) {
		Sound = sound;
	}
    public void AnimalDetails() {
    	System.out.println("Name : "+name);
    	System.out.println("Sound : "+Sound);
    	
    }
    
		
	}




