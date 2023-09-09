//Write a Java program to retrieve an element (at a specified index) from a given array 
//list. 


package assignment;

import java.util.ArrayList;

public class retrivearrayatindex {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("Lady-finger");
		arraylist.add("Potato");
		arraylist.add("Onion");
		arraylist.add("Tomato");
		
		int indexToRetrieve = 2;

		if (indexToRetrieve >= 0 && indexToRetrieve < arraylist.size()) {
            String element = arraylist.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.err.println("Index is out of bounds.");
        }
    }
}
		

