package br.com.javalearn.collections;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements
        System.out.println("First name: " + names.get(0)); // Alice

        // Modify an element
        names.set(1, "Bobby"); 

        // Remove an element
        names.remove("Charlie");

        // Loop through the list
        System.out.println("All names:");
        
        for (String name : names) {
            System.out.println(name);
        }

        // Size of the list
        System.out.println("List size: " + names.size());
    }
}
