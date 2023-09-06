/*Write a program to print the factorial of a number by defining a method named 
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. 
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24 
3! = 3*2*1 = 6 
2! = 2*1 = 2 
Also, 1! = 1 
0! = 0 */

package assignment;

public class printfactorialno {
	public static void main(String[] args) {
		int number = 4;
		long factorial = Factorial(number);
		System.out.println(number+ "! = " + factorial );
	}
	
	public static long Factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			long result = 1;
			for(int i = 2; i <= n; i++) {
				result *= i;
			}
			return result; 
		}
	}
}
