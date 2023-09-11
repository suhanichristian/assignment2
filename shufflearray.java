//Write a Java program to shuffle elements in an array list.


package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class shufflearray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Apple");
		al.add("Banana");
		al.add("Watermelon");
		al.add("Pineapple");
		al.add("Mango");
		
		Collections.shuffle(al);
		
		System.out.println("Shuffled arraylist:- ");
		for(String element : al ) {
			System.out.println(element);
		}
	}
}
