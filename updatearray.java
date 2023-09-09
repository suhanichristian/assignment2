//Write a Java program to update specific array element by given element. 


package assignment;

import java.util.ArrayList;

public class updatearray {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("Potato");
		arraylist.add("Onion");
		arraylist.add("Tomato");
		arraylist.add("Chilli");
		
		String elementToUpdate = "Chilli";
		String newvalue = "Peas";
		
		int indexToUpdate = arraylist.indexOf(elementToUpdate);
		
		if (indexToUpdate != -1) {
			arraylist.set(indexToUpdate, newvalue);
			System.out.println("Update ArrayList: ");
			for (String element : arraylist ) {
				System.out.println(element);
			}
		} else {
			System.err.println("Element not found in the ArrayList");
		}	
	}
}
