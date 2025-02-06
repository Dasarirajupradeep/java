package com.wipro.java.java8;



//Interface1 with a default method
interface Interface1 {
 default void show() {
     System.out.println("Inside Interface1 - show() method");
 }
}

//Interface2 with a default method
interface Interface2 {
 default void show() {
     System.out.println("Inside Interface2 - show() method");
 }
}

//Class implementing both interfaces
public class DefaultUseCase implements Interface1, Interface2 {

 // Overriding show() to resolve conflict
 @Override
 public void show() {
     System.out.println("Inside DefaultMethodExample - Overriding show()");

     // Calling Interface1's show()
     Interface1.super.show();

     // Calling Interface2's show()
     Interface2.super.show();
 }

 public static void main(String[] args) {
     DefaultUseCase example = new DefaultUseCase();
     example.show(); // Calls overridden show() method
 }
}	
