/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods.*/


package assignment;

abstract class Shape{
	abstract double RectangleArea(double length, double breadth);
	abstract double SquareArea(double side);
	abstract double CircleArea(double radius);
}

class Area extends Shape {
	
	@Override
	double RectangleArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of rectangle:- " + area);
		return area;
	}
	
	@Override
	double SquareArea(double side) {
		double area = side * side;
		System.out.println("Area of square:- " + area);
		return area;
	}
	
	@Override
	double CircleArea(double radius) {
		double area = Math.PI * radius * radius; 
		System.out.println("Area of circle:- " + area);
		return area;
	}
}

public class rscarea {
	public static void main(String[] args) {
		Area calculatearea = new Area();
		
		calculatearea.RectangleArea(5, 7);
		calculatearea.SquareArea(4);
		calculatearea.CircleArea(3);
	}
}
