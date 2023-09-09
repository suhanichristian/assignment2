//Write a Java program to insert an element into the array list at the first position. 


package assignment;

import java.util.ArrayList;

public class insertarraylistelement {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Banana");
		al.add("Cherry");
		al.add("Date");
		
		al.add(0, "Apple");
		
		System.out.println("Updated ArrayList:- ");
		for (String element : al) {
			System.out.println(element);
		}
	}
}
