/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
method by creating an object of each of the three classes.*/


package assignment;

abstract class Bank {
	abstract int getBalance();
}

class BankA extends Bank {
	private int balance = 100;
	
	@Override
	int getBalance() {
		return balance;
	}
}

class BankB extends Bank {
	private int balance = 150;
	
	@Override
	int getBalance() {
		return balance;
	}
}

class BankC extends Bank {
	private int balance = 200;
	
	@Override
	int getBalance() {
		return balance;
	}
}
public class subclassbank {
	public static void main(String[] args) {
		BankA ba = new BankA();
		BankB bb = new BankB();
		BankC bc = new BankC();
		
		System.out.println("Balance in bank A:- " +ba.getBalance());
		System.out.println("Balance in bank B:- " +bb.getBalance());
		System.out.println("Balance in bank C:- " +bc.getBalance());
	}

}
