//Write a Java program that reads a positive integer and count the number of digits the 
//number. 

package assignment;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = src.nextInt();
        
        if (n < 0) {
            System.err.println("Please enter a positive integer.");
            return;
        }
        
        int count = 0;
        
        while (n > 0) {
            n = n / 10; 
            count++; 
        }
        System.out.println("Number of digits: " + count);
    }
}
