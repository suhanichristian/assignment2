//W.A.J.P to check whether a given string starts with the contents of another string. 
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False


package assignment;

public class color {
	public static void main(String[] args) {
		 String first = "Red is favorite color";
	        String startString1 = "Red";

	        String second = "Orange is also my favorite color";
	        String startString2 = "Red";

	        boolean result1 = first.startsWith(startString1);
	        boolean result2 = second.startsWith(startString2);

	        System.out.println("Does this sentance " + first + " starts with " + startString1 + " ? :- " + result1);
	        System.out.println("Does this sentance  " + second + " starts with " + startString2 + " ? :- " + result2);
	}

}
