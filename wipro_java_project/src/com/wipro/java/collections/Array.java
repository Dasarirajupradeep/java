package com.wipro.java.collections;

public class Array {


	public static void main(String[] args) {
		
		int []arr;
	
	//Allocatating MEmory For 5 Integers
		arr = new int[5];
		arr[0] = 30;
		arr[1] = 40;
		arr[2] = 50;
		arr[3] = 60;
		arr[4] = 70;
		
  // Accesing Elements from the specified array
	for(int i = 0; i < arr.length;i++) {
		System.out.println("Elements at index " + i + ":" + arr[i]);
	}
		}
}
