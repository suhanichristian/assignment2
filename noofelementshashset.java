//Write a Java program to get the number of elements in a hash set.


package assignment;

import java.util.*;

public class noofelementshashset {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

        hashSet.add("Potato");
        hashSet.add("Onion");
        hashSet.add("Cherry");
        hashSet.add("Tomato");
       
        int size = hashSet.size();

        System.out.println("Number of elements in the HashSet: " + size);
	}

}
