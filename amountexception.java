//• W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
//than account balance then program will show custom exception otherwise amount 
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
//2500 


package assignment;

import java.util.Scanner;

class balanceexception extends Exception {
	public balanceexception(String message) {
	super (message);
	}
}

class bankaccount {
	private double balance;
	
	public bankaccount(double firstbalance) {
		balance = firstbalance;
	}
	
	public void withdraw(double amount) throws balanceexception {
		if (amount > balance) {
			throw new balanceexception("insufficient balance in the account.");
		}
		balance -= amount;
		System.out.println( +amount+ "Withdraw successfully. Remaining balance is :- " +balance);
	}
}

public class amountexception {
	public static void main(String[] args) {
		bankaccount account = new bankaccount(2000);
		
		try {
			Scanner sr = new Scanner(System.in); 
            System.out.print("Enter withdraw amount: ");
           double withdrawamount = sr.nextDouble();
           account.withdraw(withdrawamount);
        } 
		catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric amount.");
        } 
		catch (balanceexception e) {
            System.out.println(e.getMessage());
		}
	}
}