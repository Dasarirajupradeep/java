package com.wipro.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // 1. Adding elements using put()
        map.put(1, "Pomogranate");
        map.put(2, "Coconut");
        map.put(3, "PineApple");
        map.put(4, "Orange");

        // Printing the map
        System.out.println("Original Map: " + map);

        // 2. Retrieving an element using get()
        System.out.println("Value for key 2: " + map.get(2));

        // 3. Removing an element using remove()
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 4. Iterating over the map
        System.out.println("Iterating over Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}