//Take two numbers from the user and perform the division operation and handle 
//Arithmetic Exception. O/P- Enter two numbers: 10 0 
//Exception in thread main java.lang.ArithmeticException:/ by zero



package assignment;

import java.util.Scanner;

public class userexception {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two numbers :- ");
		int numerator = s.nextInt();
		int denominator = s.nextInt();
		
		try { 
			int result = divide(10,0);
			System.out.println("Result "+ result);
			
		} catch (ArithmeticException e) {
			System.err.println(" Exception in thread main :- " + e.getMessage());
		}
//		finally {
//			System.out.println("Finally block executed.");
		}
//	}
	
	public static int divide(int numerator, int denominator) {
		return numerator / denominator;
	}
}
