//Write a Java program to search an element in an array list.


package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class searcharray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to search:- ");
		int elementToSearch = sc.nextInt();
		
		int index = searchElement(al, elementToSearch);
		
		if(index !=-1) {
			System.out.println("Element found at index: " +index);
		}else {
			System.err.println("Element not found in the arraylist.");
		}
	}
	
	public static int searchElement(ArrayList<Integer>list, int element) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == element) {
				return i;
			}
		}
		return -1;
	}
}
