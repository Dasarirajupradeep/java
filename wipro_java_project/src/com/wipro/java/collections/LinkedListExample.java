package com.wipro.java.collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int n = 10; 

        // Adding elements to the linked list
        for (int i = 1; i <= n; i++)
            ll.add(i);

        // Printing elements
        System.out.println("Original List: " + ll);

        // Remove element at index 3
        ll.remove(3);

        // Displaying the list after deletion
        System.out.println("After removing element at index 3: " + ll);

        // Printing elements one by one
        System.out.print("Elements: ");
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}