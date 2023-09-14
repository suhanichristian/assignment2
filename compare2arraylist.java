//Write a Java program to compare two array lists. 


package assignment;

import java.util.*;

public class compare2arraylist {
	public static void main(String[] args) {
		 ArrayList<Integer> list1 = new ArrayList<>();
	        ArrayList<Integer> list2 = new ArrayList<>();

	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        list2.add(1);
	        list2.add(2);
	        list2.add(4);
	        
	        boolean areEqual = compareArrayLists(list1, list2);

	        if (areEqual) {
	            System.out.println("The ArrayLists are equal.");
	        } else {
	            System.out.println("The ArrayLists are not equal.");
	        }
	    }
	 public static boolean compareArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	        if (list1.size() != list2.size()) {
	            return false;
	        }

	        for (int i = 0; i < list1.size(); i++) {
	            if (!list1.get(i).equals(list2.get(i))) {
	                return false;
	            }
	        }
	        //if all the elements are equal, return true
	        return true;
	    }
	}
