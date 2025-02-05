package com.wipro.exception;

import java.io.IOException;

public class Exceptiondemo {
	public static void main(String[] args) {
        // Checked Exception Example
        try {
            // Simulate a checked exception (IOException)
            throwIOException();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }
        

        // Unchecked Exception Example
        try {
            // Simulate an unchecked exception (ArithmeticException)
            int result = divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }
    }

    // Method that throws a checked exception (IOException)
    public static void throwIOException() throws IOException {
        throw new IOException("This is a checked exception.");
    }

    // Method that throws an unchecked exception (ArithmeticException)
    public static int divideByZero() {
        return 50 / 0;  // This will throw ArithmeticException
    }
}