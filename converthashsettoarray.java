//Write a Java program to convert a hash set to an array


package assignment;

import java.util.*;

public class converthashsettoarray {
	public static void main(String[] args) {
		 HashSet<String> hashSet = new HashSet<>();

	        hashSet.add("Element 1");
	        hashSet.add("Element 2");
	        hashSet.add("Element 3");

	        String[] array = new String[hashSet.size()];
	        hashSet.toArray(array);

	        System.out.println("Array from HashSet: " + Arrays.toString(array));
	}
}
