//Create an abstract class 'Parent' with a method 'message'.It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass. 


package assignment;
 abstract class parent {
	 abstract void message();
 }
 
 class firstsubclass extends parent {
	 void message() {
		 System.out.println("this is first subclass");
	 }
 }
 
 class secondsubclass extends parent {
	 void message() {
		 System.out.println("this is second subclass");
	 }
 }

public class twosubclasses {
	public static void main(String[] args) {
		firstsubclass fsc = new firstsubclass();
		secondsubclass ssc = new secondsubclass();
		
		fsc.message();
		ssc.message();
	}

}
