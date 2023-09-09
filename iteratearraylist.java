//Write a Java program to iterate through all elements in an array list. 


package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratearraylist {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>(); {
		
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add("Cherry");
		arraylist.add("Date");
		
		Iterator<String> iterator = arraylist.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
	       }
	    }
	}
}
