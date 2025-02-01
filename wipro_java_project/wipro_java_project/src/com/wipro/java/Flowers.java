/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flowers {
	String name;
	String color;
	

	/**
	 * 
	 */
	public Flowers(String fname,String fcolor)
	
	{
		this.name=fname;
		this.color=fcolor;
		
		
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("flower name"+name+"flower color"+color);
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Flowers f1=new Flowers("rose","pink");
		Flowers f2=new Flowers("lotus","pink");
		f1.display();
		f2.display();
		// TODO Auto-generated method stub

	}

}
