//Write a Java program to convert a hash set to a List/Array List.


package assignment;

import java.util.*;

public class converthashsettoarraylist {
	public static void main(String[] args) {
		 HashSet<String> hashSet = new HashSet<>();

	        // Add elements to the HashSet
	        hashSet.add("Element 1");
	        hashSet.add("Element 2");
	        hashSet.add("Element 3");

	        // Convert the HashSet to an ArrayList
	        ArrayList<String> arrayList = new ArrayList<>(hashSet);

	        // Convert the HashSet to a List (if you specifically want a List)
	        List<String> list = new ArrayList<>(hashSet);

	        // Print the ArrayList
	        System.out.println("ArrayList from HashSet: " + arrayList);

	        // Print the List (optional)
	        System.out.println("List from HashSet: " + list);
	}
}
