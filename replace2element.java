//Write a Java program to replace the second element of an Array List with the 
//specified element.


package assignment;

import java.util.*;

public class replace2element {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Specify the element to replace the second element
        String replacement = "Five";

        // Check if the ArrayList has at least 2 elements
        if (arrayList.size() >= 2) {
        	 // Replace the second element with the specified element
            arrayList.set(1, replacement);

            // Print the modified ArrayList
            System.out.println("Modified ArrayList: " + arrayList);
        } else {
            System.out.println("ArrayList does not have at least 2 elements.");
        }
     }
}
