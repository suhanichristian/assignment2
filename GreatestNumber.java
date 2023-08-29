//Write a Java program to Take three numbers from the user and print the greatest 
//number.

package assignment;

import java.util.Scanner;

public class GreatestNumber {
	 public static void main(String[] args) {
		 int n1;
		 int n2;
		 int n3;
		 Scanner r = new Scanner(System.in);
	     System.out.println("Enter 1st number: ");
	     n1 = r.nextInt();
	     System.out.println("Enter 2nd number: ");
	     n2 = r.nextInt();
	     System.out.println("Enter 3rd number: ");
	     n3 = r.nextInt();
	     if(n1>n2 && n1>n3) {
				System.out.println("1st number is the Greatest number");
	     }
	     else if(n2>n3 && n2>n1) {
	            System.out.println("2nd number is the Greatest number");
	     }
	     else  {
	    	 System.out.println("3rd number is the Greatest number");
	     }
	 }
}
	     
	     /* 
	         Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter total number of values: ");
	        int n = scanner.nextInt();

	        int greatest = Integer.MIN_VALUE;
	        // minimum or least interger value repersentation

	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter value: ");
	            int num = scanner.nextInt();
	            
	            if (num > greatest) {
	                greatest = num;
	            }
	        }
	            System.out.println("The greatest number is: " + greatest);
	        }
	    */

