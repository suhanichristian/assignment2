//Write a Java program to sort a given array list. 


package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class sortarray {
	public static void main(String[] args) {
	ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(100);
		arraylist.add(600);
		arraylist.add(350);
		arraylist.add(140);
		arraylist.add(50);
		
		Collections.sort(arraylist);
		
		System.out.println("Sorted Arraylist in ascending order:- ");
		for(Integer element : arraylist) {
			System.out.println(element + " ");
		}
	}
}
