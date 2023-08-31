//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
//two methods to print the area and perimeter of the rectangle respectively. Its 
//constructor having parameters for length and breadth is used to initialize the length 
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
//constructor having a parameter for its side (suppose s) calling the constructor of its 
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

package assignment;

class rectangle {
		private double length;
		private double breadth;
		
		public rectangle(double length, double breadth) {
			this.length = length;
			this.breadth = breadth;
		}
		
		public double calculatearea() {
			return length * breadth;
		}
		
		public double calculateperimeter() {
			return 2 * (length + breadth);
		}
}
class square extends rectangle {
	public square(double side) {
		super(side , side);
		}
	}
public class inherit {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle(5.0, 4.0);
        square square = new square(5.0);

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculatearea());
        System.out.println("Perimeter: " + rectangle.calculateperimeter());

        System.out.println("Square:");
        System.out.println("Area: " + square.calculatearea());
        System.out.println("Perimeter: " + square.calculateperimeter());
    	}
	}

