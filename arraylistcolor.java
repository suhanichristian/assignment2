/*Write a Java program to create a new array list, add some colors (string) and print out 
the collection. */


package assignment;

import java.util.ArrayList;

public class arraylistcolor {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		
		System.out.println("Colors in the ArrayList:- ");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
