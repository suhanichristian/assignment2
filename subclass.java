//Create a class with a method that prints "This is a parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of 
//the class and call 1 - method of parent class by object of parent class 2 - method of 
//child class by object of child class 3 - method of parent class by object of child class


package assignment;

	class parentclass{
		public void printparent() {
			System.out.println("This is parent class");
		}
	}
	
	class childclass extends parentclass{
		public void printchild() {
			System.out.println("This is child class");
		}
	}

public class subclass {
	public static void main(String[] args) {
		parentclass po = new parentclass();
		childclass co = new childclass();
		
		po.printparent();
		co.printchild();
		co.printparent();
	}

}
