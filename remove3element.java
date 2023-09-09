//Write a Java program to remove the third element from an array list.


package assignment;

import java.util.ArrayList;

public class remove3element {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("Lady-finger");
		arraylist.add("Potato");
		arraylist.add("Onion");
		arraylist.add("Tomato");
		
		if (arraylist.size() >= 3) {
            arraylist.remove(2);
            System.out.println("Updated ArrayList:");
            for (String element : arraylist) {
                System.out.println(element);
            }
        } else {
            System.err.println("ArrayList does not have enough elements to remove the third element.");
        }
    }
}
