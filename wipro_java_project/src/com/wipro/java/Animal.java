package com.wipro.java;

/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fields
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/

public class Animal {
	    
	   // private properties=structure
	private String name;
	private String species;
	private int age;
	private float weight;
	
	// Default constructor
	public Animal () {
	}
	
	// Getter for name
	   public String getName() {
	       return name;//example:fish
	}
	 // Setter for name
	public void setName(String name) {
		this.name = "fish";
	}
	//Getter for Species
	public String getspecies() {
		return species;
	}
	//setter for species
	public void setspecies(String species) {
		this.species = species;
	}
	// Getter for age
	public int getage() {
		return age;
	}
	//setter for age
	public void setage(int age) {
		this.age = 5;
	}
	// Getter for weight
	public float Getweight() {
		return weight;
	}
	// setter for weight
	public void setWeight (float weight) {
		this.weight = 25f;
	}
	// toString method for easy printing
	@Override
	public String toString() {
		return "Animal name=" + name + ", species=" + species +", age=" + age + ", weight="+weight;
	}
	
		
		
	}

