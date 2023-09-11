//Write a Java program to copy one array list into another.


package assignment;

import java.util.ArrayList;

public class onearraycopyanother {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("Lady-finger");
		arraylist.add("Potato");
		arraylist.add("Onion");
		arraylist.add("Tomato");
		arraylist.add("Chilli");
		
		ArrayList<String> copylist = new ArrayList<>();
		
		copylist.addAll(arraylist);
		
		System.out.println("Contents of another arraylist:- ");
		for(String el : copylist) {
			System.out.println(el + " ");
		}
	}
}
