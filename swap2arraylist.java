//Write a Java program of swap two elements in an array list. 


package assignment;

import java.util.*;

public class swap2arraylist {
	public static void main(String[] args) {
		 ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("Element 1");
	        arrayList.add("Element 2");
	        arrayList.add("Element 3");
	        arrayList.add("Element 4");

	        System.out.println("ArrayList before swapping: " + arrayList);
	      
	        int index1 = 1; 
	        int index2 = 3; 

	        if (index1 >= 0 && index1 < arrayList.size() && index2 >= 0 && index2 < arrayList.size()) {
	            Collections.swap(arrayList, index1, index2);

	            System.out.println("ArrayList after swapping: " + arrayList);
	        } else {
	            System.out.println("Invalid indices. Elements not swapped.");
	        }
		}
}
