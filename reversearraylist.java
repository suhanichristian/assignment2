//Write a Java program to reverse elements in an array list. 


package assignment;

import java.util.*;

public class reversearraylist {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");

        System.out.println("Original ArrayList: " + arrayList);

        Collections.reverse(arrayList);

        System.out.println("Reversed ArrayList: " + arrayList);
    }
}

