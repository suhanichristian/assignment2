//W.A.J.P to create the validate method that takes integer value as a parameter. If the
//age is less than 18, then throw an Arithmetic Exception otherwise print a message 
//welcome to vote. 


package assignment;

public class ageexception {
	public static void main(String[] args) {
	int age = 16;

	try {
        validate(age);
        System.out.println("Welcome to vote.");
    }
	catch (ArithmeticException e) {
        System.out.println("ArithmeticException: Age is less than 18. You cannot vote.");
    }
}
	public static void validate(int age) {
		if (age<18);
		throw new ArithmeticException();		
	}
}
