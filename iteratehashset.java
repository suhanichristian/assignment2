//Write a Java program to iterate through all elements in a hash list.


package assignment;

import java.util.*;

public class iteratehashset {
	public static void main(String[] args) {
	List<String> hashList = new ArrayList<>();
	
	 hashList.add("Apple");
     hashList.add("Banana");
     hashList.add("Cherry");
     hashList.add("Date");
     hashList.add("Fig");
     
     Iterator<String> iterator = hashList.iterator();
     
     System.out.println("Iterating through the hash list:");
     while (iterator.hasNext()) {
         String element = iterator.next();
         System.out.println(element);
     }
	}
}
