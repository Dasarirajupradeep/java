package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Creating two lists
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);

        // Using addAll() to insert elements of l2 into l1 at index 1
        l1.addAll(1, l2);

        System.out.println("After addAll: " + l1);

        // Using remove() to remove element at index 1
        l1.remove(1);

        System.out.println("After remove: " + l1);

        // Using set() to update the element at index 0
        l1.set(0, 5);

        System.out.println("After set: " + l1);
    }
}