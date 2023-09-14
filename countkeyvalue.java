//Write a Java program to count the number of key-value (size) mappings in a map.


package assignment;

import java.util.*;

public class countkeyvalue {
	public static void main(String[] args) {
		 Map<String, Integer> map = new HashMap<>();
		 
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);
	        map.put("D", 4);
	        map.put("E", 5);

	        int size = map.size();
	        
	        System.out.println("Number of key-value mappings in the map: " + size);
	}
}
