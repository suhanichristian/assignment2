//W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not in 
//between 15 and 21 then generate user defined exception 
//"AgeNotWithinRangeException". If name contains numbers or special symbols 
//raise exception "NameNotValidException". Define the two exception classes. 


package assignment;

class agenotwithinrangeexception extends Exception {
	public agenotwithinrangeexception(String message) {
		super(message);
	}
}

class namenotvalidexception extends Exception {
	public namenotvalidexception(String message) {
		super(message);
	}
}

class student {
	private int rollno;
	private String name;
	private int age;
	private String course;
	
	public student(int rollno, String name, int age, String course)
		throws agenotwithinrangeexception, namenotvalidexception {
	
	this.rollno = rollno;
	if (age < 15 || age > 21) {
		throw new agenotwithinrangeexception("Age is not within the range of 15 to 21.");
	}
	
	this.age = age;
	if (!name.matches("^[a-zA-Z]+$")) {
		throw new namenotvalidexception("Name contains numbers or special symbols");
	}
	
	this.name = name;
	
	this.course = course;
	}
	
	@Override
	public String toString() {
		 return "Roll No: " + rollno + "\nName: " + name + "\nAge: " + age + "\nCourse: " + course;
	}
	
}

public class studentageexception {
	public static void main(String[] args) {
		try {
			student s1 = new student(1, "CR", 18 , "security");
			System.out.println("Student 1:- " +s1);
			
			//student with invalid age
			student s2 = new student(2, "CS", 14 , "technology");
			
			//student with invalid name
			student s3 = new student(3, "Ss123", 20 , "CA");
		} 
		catch (agenotwithinrangeexception e) {
			System.out.println("Error:- " +e.getMessage());
		}catch (namenotvalidexception e) {
			System.out.println("Error:- " +e.getMessage());
		}
	}
}
