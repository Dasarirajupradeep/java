package com.wipro.java.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest { 
     private Calculator calculator = new Calculator(); // Create a new Calculator object before each test
    
    // Test method for the add() method
    @Test
    public void testAdd() {
        int result = calculator.add1(5, 4); // Perform the addition
        assertEquals(9, result); // Check if the result is 9
    }
}