//Write a Java program to extract a portion of an array list. 


package assignment;

import java.util.*;

public class extractportionarraylist {
	public static void main(String[] args) {
		 ArrayList<String> arrayList = new ArrayList<>();
		 
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        arrayList.add("Date");
	        arrayList.add("Fig");

	        int startIndex = 1; 
	        int endIndex = 4; 

	        List<String> extractedList = arrayList.subList(startIndex, endIndex);

	        System.out.println("Extracted Portion of ArrayList: " + extractedList);
	    }
	}

