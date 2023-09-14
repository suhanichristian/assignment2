//Write a Java program to join two array lists.


package assignment;

import java.util.*;

public class join2arraylist {
	public static void main(String[] args) {
		 ArrayList<String> arrayList1 = new ArrayList<>();
	        ArrayList<String> arrayList2 = new ArrayList<>();

	        arrayList1.add("Element 1");
	        arrayList1.add("Element 2");
	        arrayList1.add("Element 3");

	        arrayList2.add("Element 4");
	        arrayList2.add("Element 5");
	        
	        arrayList1.addAll(arrayList2);

	        System.out.println("Joined ArrayList: " + arrayList1);
	}
}
