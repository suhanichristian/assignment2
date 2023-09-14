//Write a Java program to check whether a map contains key-value mappings (empty) 
//or not. 


package assignment;

import java.util.*;

public class containskeyvaluemappings {
	public static void main(String[] args) {
		 Map<String, String> map = new HashMap<>();

	        // Check if the map is empty
	        if (map.isEmpty()) {
	            System.out.println("The map is empty.");
	        } else {
	            System.out.println("The map is not empty.");
	        }

	        // Add some key-value mappings to the map
	        map.put("Key1", "Value1");
	        map.put("Key2", "Value2");
	        
	     // Check again if the map is empty
	        if (map.isEmpty()) {
	            System.out.println("The map is empty.");
	        } else {
	            System.out.println("The map is not empty.");
	        }
	}
}
