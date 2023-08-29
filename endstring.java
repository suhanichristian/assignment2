//W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 


package assignment;

public class endstring {
	public static void main(String[] args) {
		String a = "Java Exercises";
		String endstring = "se";
		
		String b = "Java Exercise";
		String endstring1 = "se";
		
		boolean result = a.endsWith(endstring);
		boolean result1 = b.endsWith(endstring1);
		
		System.out.println("Does " + a + " ends with " + endstring + " ? :- " + result);
		System.out.println("Does " + b + " ends with " + endstring1 + " ? :- " + result1);
	}

}
