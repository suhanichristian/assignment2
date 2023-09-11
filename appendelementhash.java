//Write a Java program to append the specified element to the end of a hash set.


package assignment;

import java.util.HashSet;

public class appendelementhash {
	public static void main(String[] args) {
		HashSet<String> ap = new HashSet<>();
		
		ap.add("Apple");
		ap.add("Banana");
		ap.add("Pinapple");
		
		System.out.println("Hashset befor appending:- " +ap);
		
		String elementToAppend = "Watermelon";
		ap.add(elementToAppend);
		
		System.out.println("Hashset after appending:- " +ap);
	}
}
