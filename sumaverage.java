//Write a program in Java to input 5 numbers from keyboard and find their sum and 
//average using for loop.


package assignment;

import java.util.Scanner;

public class sumaverage {
	public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int j = 5;
        int c = 0;

        for (int i = 1; i <= j; i++) {
            System.out.print("Enter number: ");
            int num = sr.nextInt();
            c += num;
        }
        double a = (double) c / j;

        System.out.println("Sum: " + c);
        System.out.println("Average: " + a);
    }
}