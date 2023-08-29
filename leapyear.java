//Write a Java program that takes a year from user and print whether that year is a leap 
//year or not.

package assignment;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		int i;
		Scanner y = new Scanner(System.in);
		System.out.println("Enter the Year:-");
		i = y.nextInt();
		
		if(i % 4==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}
}
