//Write a Java program that accepts an integer (n) and computes the value of 
//n+nn+nnn. Input number: 5 
//5 + 55 + 555

package assignment;

import java.util.Scanner;

public class inputnumber {
	public static void main(String[] args) {
		int n;
		  char s1, s2, s3;
		  Scanner in = new Scanner(System.in);
		  System.out.print("Input number: ");
		  n = in .nextInt();
		  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		  // %d = decimal integer
		  // \n = new line
	}
}
