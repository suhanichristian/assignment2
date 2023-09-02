//Print the sum, difference and product of two complex numbers by creating a class 
//named 'Complex' with separate methods for each operation whose real and 
//imaginary parts are entered by user. 


package assignment;

import java.util.Scanner;

class Complex27{
	private double real;
	private double imaginary;
	
	public Complex27(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	 public Complex27 add(Complex27 other) {
	        double sumReal = this.real + other.real;
	        double sumImaginary = this.imaginary + other.imaginary;
	        return new Complex27(sumReal, sumImaginary);
	 }
	 
	 public Complex27 subtract(Complex27 other) {
	        double diffReal = this.real - other.real;
	        double diffImaginary = this.imaginary - other.imaginary;
	        return new Complex27(diffReal, diffImaginary);
	 }
	 
	 public Complex27 multiply(Complex27 other) {
	        double productReal = (this.real * other.real) - (this.imaginary * other.imaginary);
	        double productImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
	        return new Complex27(productReal, productImaginary);
	    }
	 
	 @Override
	 public String toString() {
	        if (imaginary < 0) {
	            return real + " - " + (-imaginary) + "i";
	        } else {
	            return real + " + " + imaginary + "i";
	        }
	    }
	}

public class prog27 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		 System.out.println("Enter the real part of the first complex number:");
	     double real1 = sr.nextDouble();

	     System.out.println("Enter the imaginary part of the first complex number:");
	     double imaginary1 = sr.nextDouble();

	     System.out.println("Enter the real part of the second complex number:");
	     double real2 = sr.nextDouble();

	     System.out.println("Enter the imaginary part of the second complex number:");
	     double imaginary2 = sr.nextDouble();
	     
	     Complex27 c1 = new Complex27(real1, imaginary1);
	     Complex27 c2 = new Complex27(real2, imaginary2);
	     
	     Complex27 sum = c1.add(c2);
	     Complex27 difference = c1.subtract(c2);
	     Complex27 product = c1.multiply(c2);
	     
	     System.out.println("Sum: " + sum);
	     System.out.println("Difference: " + difference);
	     System.out.println("Product: " + product);
	}
}
