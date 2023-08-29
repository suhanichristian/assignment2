//Write a Java program that takes the user to provide a single character from the 
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
//message. 

package assignment;

import java.util.Scanner;
	
public class letter {
    public static void main(String[] args) {
	Scanner i = new Scanner(System.in);

	  System.out.print("Enter a single character: ");
	  String p = i.nextLine();

	        // Check if the input is a single character
	   if (p.length() != 1) {
	   System.err.println("Error: Please enter only a single character.");
	   } else {
	        char ch = p.charAt(0);
	        // returns the char value at a specific index

	            // Check if the character is a letter
	   if (Character.isLetter(ch)) {
	                // Convert the character to lowercase for easier comparison
	       ch = Character.toLowerCase(ch);

	                // Check if it's a vowel or a consonant
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	    System.out.println(ch + " is a vowel.");
	    } else {
	        System.out.println(ch + " is a consonant.");
	        }
	    } else {
	        System.err.println("Error: The input is not a letter.");
	           }
	   }
	}
}
