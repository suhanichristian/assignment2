//Create a class named 'Member' having the following members: 
//1. Data members 
//2. Name 
//3. Age 
//4. Phone number 
//5. Address 
//6. Salary 
//It also has a method named 'printSalary' which prints the salary of the members

package assignment;

class member {
	String name;
	int age;
	String phonenumber;
	String address;
	double salary;
	
	public member(String name, int age, String phonenumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.address = address;
		this.salary = salary;
	}
	
	public void printsalary() {
		System.out.println("Salary of "+name+ " is: "+salary);
	}
}

public class membersalary {
	public static void main(String[] args) {
//		member m1 = new member("Christian suhani", 20, "1234567890", "50000");
	}

}
