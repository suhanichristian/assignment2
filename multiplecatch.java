//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
//exception and another one is to handle 
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;


package assignment;

public class multiplecatch {
	public static void main(String[] args) {
		int[] a = new int[5];
		try {
			a[5] = 30/0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException : "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("ArrayIndexOutOfBoundException : "+e.getMessage());
		}
	}
}
