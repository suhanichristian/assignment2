//Write a Java program to increase the size of an array list.


package assignment;

import java.util.*;

public class increasesizeofarraylist {
	public static void main(String[] args) {
		 ArrayList<String> arrayList = new ArrayList<>();

	        // Add some elements to the ArrayList
	        arrayList.add("Element 1");
	        arrayList.add("Element 2");
	        arrayList.add("Element 3");

	        System.out.println("Current size of ArrayList: " + arrayList.size());

	        // Increase the capacity of the ArrayList by adding more elements
	        arrayList.add("Element 4");
	        arrayList.add("Element 5");

	        // Print the updated size of the ArrayList
	        System.out.println("Updated size of ArrayList: " + arrayList.size());
	}      
}

