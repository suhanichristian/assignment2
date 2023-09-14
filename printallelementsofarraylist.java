//Write a Java program to print all the elements of an Array List using the position of 
//the elements. 


package assignment;

import java.util.*;

public class printallelementsofarraylist {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");

        // Print all elements with their positions
        for (int i = 0; i < arrayList.size(); i++) {
            String element = arrayList.get(i);
            System.out.println("Position " + i + ": " + element);
        }
	}
}
