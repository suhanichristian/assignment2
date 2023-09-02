//Write a program to print the area and perimeter of a triangle having sides of 3 4 and 
//5 units by creating a class named 'Triangle' without any parameter in its constructor. 


package assignment;

class traingle{
	private double side1;
	private double side2;
	private double side3;
	
	public traingle() {
		// default constructor with sides 3, 4, and 5 unite
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}
	
	public double calculatearea() {
		double s = (side1 + side2 + side3) /2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double calculateperimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
}

public class traingleap {
	public static void main(String[] args) {
		traingle t = new traingle();
		
		double area = t.calculatearea();
		double perimeter = t.calculateperimeter();
		
		System.out.println("Area of the traingle: " +area);
		System.out.println("Perimeter of the traingle: " +perimeter);
	}
}
