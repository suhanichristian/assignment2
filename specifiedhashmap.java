//Write a Java program to associate the specified value with the specified key in a 
//Hash Map.


package assignment;

import java.util.*;

public class specifiedhashmap {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        System.out.println("HashMap: " + hashMap);

        String keyToUpdate = "Two";
        int newValue = 21;
        hashMap.put(keyToUpdate, newValue);

        System.out.println("Updated HashMap: " + hashMap);
	}
}
