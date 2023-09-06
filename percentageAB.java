/*We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects as its parameters for student 
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.*/


package assignment;

abstract class Marks {
	abstract double getPercentage();
}

class A extends Marks {
	private int sub1marks;
	private int sub2marks;
	private int sub3marks;
	
	public A(int sub1marks, int sub2marks, int sub3marks) {
		this.sub1marks = sub1marks;
		this.sub2marks = sub2marks;
		this.sub3marks = sub3marks;
	}
	
	@Override
	double getPercentage() {
		double totalmarks = sub1marks + sub2marks + sub3marks;
		return(totalmarks/300.0)*100;
	}
}

class B extends Marks {
	private int sub1marks;
	private int sub2marks;
	private int sub3marks;
	private int sub4marks;
	
	public B(int sub1marks, int sub2marks, int sub3marks, int sub4marks) {
		this.sub1marks = sub1marks;
		this.sub2marks = sub2marks;
		this.sub3marks = sub3marks;
		this.sub4marks = sub4marks;
	}
	
	@Override
	double getPercentage() {
		double totalmarks = sub1marks + sub2marks + sub3marks + sub4marks;
		return(totalmarks/400.0)*100;
	}
}

public class percentageAB {
	public static void main(String[] args) {
		A sa = new A(85, 90, 78);
		B sb = new B(92, 88, 76, 94);
		
		System.out.println("Percentage for student A:- " +sa.getPercentage() + "%");
		System.out.println("Percentage for student B:- " +sb.getPercentage() + "%");
	}

}
