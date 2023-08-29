//Write a Java program to count the letters, spaces, numbers and other characters of 
//an input string.

package assignment;

import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		int l=0;
		int n=0;
		int s=0;
	//	int o=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a String:-");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		for (int k = 0; k<str.length(); k++) {
		      ch[k] = str.charAt(k);
		    }
		for (int i = 0; i < str.length(); i++) {
		if(Character.isLetter(ch[i])) {
				l++;
			}

			else if (Character.isDigit(ch[i])){
				n++;
			}
			else if (Character.isSpaceChar(ch[i])) {
				s++;
			}
			else {
				//o++;
			}
	}
		System.out.println("Letters:"+l);
		System.out.println("Digit:"+n);
		System.out.println("Spaces:"+s);
	//	System.out.println("Other:"+o);
		
	}
}